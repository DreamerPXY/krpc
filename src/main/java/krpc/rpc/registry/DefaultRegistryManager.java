package krpc.rpc.registry;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import krpc.common.InitClose;
import krpc.common.InitCloseUtils;
import krpc.common.Json;
import krpc.rpc.core.Registry;
import krpc.rpc.core.RegistryManager;
import krpc.rpc.core.RegistryManagerCallback;
import krpc.rpc.core.ServiceMetas;
import krpc.rpc.core.StartStop;

public class DefaultRegistryManager implements RegistryManager,InitClose,StartStop {
	
	static Logger log = LoggerFactory.getLogger(DefaultRegistryManager.class);
	
	Map<String,Registry> registries = new HashMap<String,Registry>();
	Map<Integer,String> serviceAddrs = new HashMap<Integer,String>();
	Map<Integer,RegistryManagerCallback> serviceCallback = new HashMap<Integer,RegistryManagerCallback>();
	List<Bind> binds = new ArrayList<Bind>();
	List<RegisterItem> registerItems = new ArrayList<RegisterItem>();
	List<DiscoverItem> discoverItems = new ArrayList<DiscoverItem>();
	
	private String dataDir;
	private String localFile = "krpc.registry.local";
	Map<String,String> localData = new HashMap<>();
	
	private int startInterval = 1000;
	private int checkInterval = 30000; // todo doc
	
	ServiceMetas serviceMetas;

	Timer timer;

	public DefaultRegistryManager(String dataDir) {
		this.dataDir = dataDir;
	}
	
	public void addRegistry(String registryName, Registry impl) {
		registries.put(registryName,impl);
	}

	void addBind(RegistryManagerCallback callback,int serviceId) {
		for(Bind b:binds) {
			if( b.callback == callback) {
				b.serviceIds.add(serviceId);
				return;
			}
		}
		binds.add( new Bind(callback,serviceId) );
	}

    public void register(int serviceId,String registryName,String group,String addr) {
    	registerItems.add(new RegisterItem(serviceId,registryName,group,addr));
    }

    public void addDiscover(int serviceId,String registryName,String group,RegistryManagerCallback callback) {
    	discoverItems.add(new DiscoverItem(serviceId,registryName,group));
    	serviceAddrs.put(serviceId,"");
    	serviceCallback.put(serviceId,callback);
    	addBind(callback,serviceId);
    }
    
    public void addDirect(int serviceId,String direct,RegistryManagerCallback callback) {
    	serviceAddrs.put(serviceId,direct);
    	serviceCallback.put(serviceId,callback);
    	addBind(callback,serviceId);
    }

    public void init() {

		for(Registry r:registries.values()) {
			InitCloseUtils.init(r);
		}	
		
		loadFromLocal();
    	
		timer = new Timer();
    }
    
    public void start() {
		for(Registry r:registries.values()) {
			InitCloseUtils.start(r);
		}		    	
		
		boolean changed = discover();
		
		notifyAddrChanged();

    	if( changed ) {
    		saveToLocal();
    	}		
		
    	timer.schedule( new TimerTask() {
            public void run() {
            	heartBeat();
            }
        },  startInterval, checkInterval );				
    }
    
    public void stop() {
    	
    	timer.cancel();
    	
		unregister();

		for(Registry r:registries.values()) {
			InitCloseUtils.stop(r);
		}
    }
    
    public void close() {

		for(Registry r:registries.values()) {
			InitCloseUtils.close(r);
		}		    	
    }

    void notifyAddrChanged() {
    	for(Bind b:binds) {
        	HashMap<Integer,String> results = new HashMap<Integer,String>();
    		for(int serviceId:b.serviceIds) {
    			String addrs = serviceAddrs.get(serviceId);
    			if( addrs != null && !addrs.isEmpty() )
    				results.put(serviceId, addrs );
    		}
    		b.callback.addrChanged(results);
    	}
    }

    void heartBeat() {
    	register();
    	boolean changed = discover();
    	if( changed ) {
    		notifyAddrChanged();
    		saveToLocal();
    	}
    }
    
    void register() {
    	for(RegisterItem item:registerItems) {
    		Registry r = registries.get(item.registryName);
    		String serviceName = serviceMetas.getServiceName(item.serviceId);
    		r.register(item.serviceId, serviceName, item.group, item.addr);
    	}
    }
    
    void unregister() {
    	for(RegisterItem item:registerItems) {
    		Registry r = registries.get(item.registryName);
    		String serviceName = serviceMetas.getServiceName(item.serviceId);
    		r.deregister(item.serviceId, serviceName, item.group);
    	}
    }
    
    boolean discover() {
    	boolean changed = false;
    	for(DiscoverItem item:discoverItems) {
    		Registry r = registries.get(item.registryName);
    		String serviceName = serviceMetas.getServiceName(item.serviceId);
    		String addr = r.discover(item.serviceId, serviceName, item.group);
    		if( addr != null ) { // null is failed, not null is success
    			String oldAddr = serviceAddrs.get(item.serviceId);
    			if( !addr.equals(oldAddr) ) {
    				serviceAddrs.put(item.serviceId,addr);
    		    	localData.put(localKey(item.serviceId,item.group),addr);    				
    				changed = true;
    			}
    		}
    	}
    	return changed;
    }
    
    String localKey(int serviceId,String group) {
    	return serviceId+"#"+group;
    }
    
    String loadAddrLocal(int serviceId,String group) {
    	String key = localKey(serviceId,group);
    	String value = localData.get(key);
    	if( value == null ) value = "";
    	return value;
    }
    
    void loadFromLocal() {
    	Path path = Paths.get(dataDir, localFile);
    	try {
    		byte[] bytes = Files.readAllBytes(path);
	    	String json = new String(bytes);
	    	Map<String,Object> m = Json.toMap(json);
	    	for(Map.Entry<String, Object> entry:m.entrySet()) {
	    		localData.put(entry.getKey(),entry.getValue().toString());
	    	}
    	} catch(Exception e) {
    		log.error("cannot load from file, path="+path);
    	}    	
		
    	for(DiscoverItem item:discoverItems) {
    		String addr = localData.get(localKey(item.serviceId,item.group));
    		if( addr == null ) addr = "";
    		serviceAddrs.put(item.serviceId,addr);
    	}    	
    }
    
    void saveToLocal() {
    	Path path = Paths.get(dataDir,localFile);
    	try {
	    	String json = Json.toJson(localData);
	    	byte[] bytes = json.getBytes();
	    	Files.write(path, bytes);
    	} catch(Exception e) {
    		log.error("cannot write to file, path="+path);
    	}
    }
    
	public ServiceMetas getServiceMetas() {
		return serviceMetas;
	}

	public void setServiceMetas(ServiceMetas serviceMetas) {
		this.serviceMetas = serviceMetas;
	}

	
	static class Bind {
		RegistryManagerCallback callback;
		HashSet<Integer> serviceIds = new HashSet<Integer>();
		Bind(RegistryManagerCallback callback,int serviceId) {
			this.callback = callback;
			serviceIds.add(serviceId);
		}
	}
	
	static class RegisterItem {
		int serviceId;
		String registryName;
		String group;
		String addr;
		
		RegisterItem(int serviceId,String registryName,String group,String addr) {
			this.serviceId = serviceId;
			this.registryName = registryName;
			this.group = group;
			this.addr = addr;
		}
	}	
	
	static class DiscoverItem {
		int serviceId;
		String registryName;
		String group;
		
		DiscoverItem(int serviceId,String registryName,String group) {
			this.serviceId = serviceId;
			this.registryName = registryName;
			this.group = group;
		}
	}

	public int getCheckInterval() {
		return checkInterval;
	}

	public void setCheckInterval(int checkInterval) {
		this.checkInterval = checkInterval;
	}

}

