// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor.proto

package krpc.monitor.proto;

/**
 * Protobuf type {@code ReportRpcStatRes}
 */
public  final class ReportRpcStatRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReportRpcStatRes)
    ReportRpcStatResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportRpcStatRes.newBuilder() to construct.
  private ReportRpcStatRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportRpcStatRes() {
    retCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportRpcStatRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            retCode_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return krpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return krpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            krpc.monitor.proto.ReportRpcStatRes.class, krpc.monitor.proto.ReportRpcStatRes.Builder.class);
  }

  public static final int RETCODE_FIELD_NUMBER = 1;
  private int retCode_;
  /**
   * <code>int32 retCode = 1;</code>
   */
  public int getRetCode() {
    return retCode_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (retCode_ != 0) {
      output.writeInt32(1, retCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, retCode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof krpc.monitor.proto.ReportRpcStatRes)) {
      return super.equals(obj);
    }
    krpc.monitor.proto.ReportRpcStatRes other = (krpc.monitor.proto.ReportRpcStatRes) obj;

    boolean result = true;
    result = result && (getRetCode()
        == other.getRetCode());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static krpc.monitor.proto.ReportRpcStatRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(krpc.monitor.proto.ReportRpcStatRes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ReportRpcStatRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReportRpcStatRes)
      krpc.monitor.proto.ReportRpcStatResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return krpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return krpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              krpc.monitor.proto.ReportRpcStatRes.class, krpc.monitor.proto.ReportRpcStatRes.Builder.class);
    }

    // Construct using krpc.monitor.proto.ReportRpcStatRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      retCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return krpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatRes_descriptor;
    }

    @java.lang.Override
    public krpc.monitor.proto.ReportRpcStatRes getDefaultInstanceForType() {
      return krpc.monitor.proto.ReportRpcStatRes.getDefaultInstance();
    }

    @java.lang.Override
    public krpc.monitor.proto.ReportRpcStatRes build() {
      krpc.monitor.proto.ReportRpcStatRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public krpc.monitor.proto.ReportRpcStatRes buildPartial() {
      krpc.monitor.proto.ReportRpcStatRes result = new krpc.monitor.proto.ReportRpcStatRes(this);
      result.retCode_ = retCode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof krpc.monitor.proto.ReportRpcStatRes) {
        return mergeFrom((krpc.monitor.proto.ReportRpcStatRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(krpc.monitor.proto.ReportRpcStatRes other) {
      if (other == krpc.monitor.proto.ReportRpcStatRes.getDefaultInstance()) return this;
      if (other.getRetCode() != 0) {
        setRetCode(other.getRetCode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      krpc.monitor.proto.ReportRpcStatRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (krpc.monitor.proto.ReportRpcStatRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int retCode_ ;
    /**
     * <code>int32 retCode = 1;</code>
     */
    public int getRetCode() {
      return retCode_;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder setRetCode(int value) {
      
      retCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retCode = 1;</code>
     */
    public Builder clearRetCode() {
      
      retCode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReportRpcStatRes)
  }

  // @@protoc_insertion_point(class_scope:ReportRpcStatRes)
  private static final krpc.monitor.proto.ReportRpcStatRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new krpc.monitor.proto.ReportRpcStatRes();
  }

  public static krpc.monitor.proto.ReportRpcStatRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportRpcStatRes>
      PARSER = new com.google.protobuf.AbstractParser<ReportRpcStatRes>() {
    @java.lang.Override
    public ReportRpcStatRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportRpcStatRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportRpcStatRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportRpcStatRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public krpc.monitor.proto.ReportRpcStatRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
