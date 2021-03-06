package krpc.test.rpc.reversecall;

import com.xxx.userservice.proto.*;
import krpc.rpc.bootstrap.Bootstrap;
import krpc.rpc.bootstrap.RpcApp;
import krpc.rpc.core.ClientContext;
import krpc.rpc.core.RpcContextData;
import krpc.rpc.core.ServerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RpcServer {

    static Logger log = LoggerFactory.getLogger(RpcServer.class);


    public static void main(String[] args) throws Exception {

        UserServiceImpl impl = new UserServiceImpl(); // user code is here

        RpcApp app = new Bootstrap()
                .addService(UserService.class, impl)
                .addReverseReferer("push", PushService.class) // !!!
                .build();

        UserServiceImpl.ps = app.getReferer("push");

        app.initAndStart();

        Thread.sleep(30000);

        app.stopAndClose();
    }

}

class UserServiceImpl implements UserService {

    static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    public static PushService ps;

    int i = 0;

    public LoginRes login(LoginReq req) {
        i++;

        PushReq.Builder pushReqBuilder = PushReq.newBuilder().setClientId("123").setMessage("I like you");
        ;
        RpcContextData ctx = ServerContext.get(); // got current connId, the connId can be saved in anywhere (memory or db)

        ClientContext.setConnId(ctx.getConnId()); // set the target connection
        ps.push(pushReqBuilder.build()); // do push 1
        ClientContext.setConnId(ctx.getConnId()); // set the target connection
        ps.push(pushReqBuilder.build()); // do push 2

        return LoginRes.newBuilder().setRetCode(0).setRetMsg("hello, friend. receive req#" + i).build();
    }
    public Login2Res login2(Login2Req req) {
        return Login2Res.ok();
    }
    public UpdateProfileRes updateProfile(UpdateProfileReq req) {
        i++;
        return UpdateProfileRes.newBuilder().setRetCode(0).setRetMsg("hello, friend. receive req#" + i).build();
    }

}
