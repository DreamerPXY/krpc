// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface Login3ReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Login3Req)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; kvs = 1;</code>
   */
  int getKvsCount();
  /**
   * <code>map&lt;string, string&gt; kvs = 1;</code>
   */
  boolean containsKvs(
      java.lang.String key);
  /**
   * Use {@link #getKvsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getKvs();
  /**
   * <code>map&lt;string, string&gt; kvs = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getKvsMap();
  /**
   * <code>map&lt;string, string&gt; kvs = 1;</code>
   */

  java.lang.String getKvsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; kvs = 1;</code>
   */

  java.lang.String getKvsOrThrow(
      java.lang.String key);

  /**
   * <code>string userName = 2;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>string userName = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>map&lt;string, int32&gt; kvs2 = 3;</code>
   */
  int getKvs2Count();
  /**
   * <code>map&lt;string, int32&gt; kvs2 = 3;</code>
   */
  boolean containsKvs2(
      java.lang.String key);
  /**
   * Use {@link #getKvs2Map()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getKvs2();
  /**
   * <code>map&lt;string, int32&gt; kvs2 = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getKvs2Map();
  /**
   * <code>map&lt;string, int32&gt; kvs2 = 3;</code>
   */

  int getKvs2OrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; kvs2 = 3;</code>
   */

  int getKvs2OrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;int32, string&gt; kvs3 = 4;</code>
   */
  int getKvs3Count();
  /**
   * <code>map&lt;int32, string&gt; kvs3 = 4;</code>
   */
  boolean containsKvs3(
      int key);
  /**
   * Use {@link #getKvs3Map()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.String>
  getKvs3();
  /**
   * <code>map&lt;int32, string&gt; kvs3 = 4;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.String>
  getKvs3Map();
  /**
   * <code>map&lt;int32, string&gt; kvs3 = 4;</code>
   */

  java.lang.String getKvs3OrDefault(
      int key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;int32, string&gt; kvs3 = 4;</code>
   */

  java.lang.String getKvs3OrThrow(
      int key);

  /**
   * <code>map&lt;string, .Apple&gt; apples = 5;</code>
   */
  int getApplesCount();
  /**
   * <code>map&lt;string, .Apple&gt; apples = 5;</code>
   */
  boolean containsApples(
      java.lang.String key);
  /**
   * Use {@link #getApplesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.xxx.userservice.proto.Apple>
  getApples();
  /**
   * <code>map&lt;string, .Apple&gt; apples = 5;</code>
   */
  java.util.Map<java.lang.String, com.xxx.userservice.proto.Apple>
  getApplesMap();
  /**
   * <code>map&lt;string, .Apple&gt; apples = 5;</code>
   */

  com.xxx.userservice.proto.Apple getApplesOrDefault(
      java.lang.String key,
      com.xxx.userservice.proto.Apple defaultValue);
  /**
   * <code>map&lt;string, .Apple&gt; apples = 5;</code>
   */

  com.xxx.userservice.proto.Apple getApplesOrThrow(
      java.lang.String key);
}
