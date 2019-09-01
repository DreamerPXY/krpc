// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

public interface RpcStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RpcStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 type = 1;</code>
   */
  int getType();

  /**
   * <code>int64 time = 2;</code>
   */
  long getTime();

  /**
   * <code>int32 serviceId = 3;</code>
   */
  int getServiceId();

  /**
   * <code>int32 msgId = 4;</code>
   */
  int getMsgId();

  /**
   * <code>int32 success = 5;</code>
   */
  int getSuccess();

  /**
   * <code>int32 failed = 6;</code>
   */
  int getFailed();

  /**
   * <code>int32 timeout = 7;</code>
   */
  int getTimeout();

  /**
   * <code>repeated int32 timeUsed = 8;</code>
   */
  java.util.List<Integer> getTimeUsedList();
  /**
   * <code>repeated int32 timeUsed = 8;</code>
   */
  int getTimeUsedCount();
  /**
   * <code>repeated int32 timeUsed = 8;</code>
   */
  int getTimeUsed(int index);

  /**
   * <code>repeated .RetCodeStat retCodeStat = 9;</code>
   */
  java.util.List<RetCodeStat>
      getRetCodeStatList();
  /**
   * <code>repeated .RetCodeStat retCodeStat = 9;</code>
   */
  RetCodeStat getRetCodeStat(int index);
  /**
   * <code>repeated .RetCodeStat retCodeStat = 9;</code>
   */
  int getRetCodeStatCount();
  /**
   * <code>repeated .RetCodeStat retCodeStat = 9;</code>
   */
  java.util.List<? extends RetCodeStatOrBuilder>
      getRetCodeStatOrBuilderList();
  /**
   * <code>repeated .RetCodeStat retCodeStat = 9;</code>
   */
  RetCodeStatOrBuilder getRetCodeStatOrBuilder(
          int index);
}
