// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

/**
 * Protobuf type {@code HttpPluginTestRes}
 */
public  final class HttpPluginTestRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HttpPluginTestRes)
    HttpPluginTestResOrBuilder {
private static final long serialVersionUID = 0L;
public static final HttpPluginTestRes ok() { return HttpPluginTestRes.newBuilder().build(); } ;
public static final HttpPluginTestRes failed(int retCode) { return HttpPluginTestRes.newBuilder().setRetCode(retCode).build(); } ;
public static final HttpPluginTestRes failed(int retCode,java.lang.String retMsg) { return HttpPluginTestRes.newBuilder().setRetCode(retCode).setRetMsg(retMsg).build(); } ;
  // Use HttpPluginTestRes.newBuilder() to construct.
  private HttpPluginTestRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpPluginTestRes() {
    retCode_ = 0;
    retMsg_ = "";
    plainText_ = "";
    redirectUrl_ = "";
    gender_ = "";
    mobile_ = "";
    email_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HttpPluginTestRes(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            retMsg_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            plainText_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            redirectUrl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            gender_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            mobile_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
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
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_HttpPluginTestRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_HttpPluginTestRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxx.userservice.proto.HttpPluginTestRes.class, com.xxx.userservice.proto.HttpPluginTestRes.Builder.class);
  }

  public static final int RETCODE_FIELD_NUMBER = 1;
  private int retCode_;
  /**
   * <code>int32 retCode = 1;</code>
   */
  public int getRetCode() {
    return retCode_;
  }

  public static final int RETMSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object retMsg_;
  /**
   * <code>string retMsg = 2;</code>
   */
  public java.lang.String getRetMsg() {
    java.lang.Object ref = retMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      retMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string retMsg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRetMsgBytes() {
    java.lang.Object ref = retMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      retMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAINTEXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object plainText_;
  /**
   * <code>string plainText = 3;</code>
   */
  public java.lang.String getPlainText() {
    java.lang.Object ref = plainText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plainText_ = s;
      return s;
    }
  }
  /**
   * <code>string plainText = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPlainTextBytes() {
    java.lang.Object ref = plainText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plainText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REDIRECTURL_FIELD_NUMBER = 4;
  private volatile java.lang.Object redirectUrl_;
  /**
   * <code>string redirectUrl = 4;</code>
   */
  public java.lang.String getRedirectUrl() {
    java.lang.Object ref = redirectUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redirectUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string redirectUrl = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRedirectUrlBytes() {
    java.lang.Object ref = redirectUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      redirectUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENDER_FIELD_NUMBER = 5;
  private volatile java.lang.Object gender_;
  /**
   * <code>string gender = 5;</code>
   */
  public java.lang.String getGender() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gender_ = s;
      return s;
    }
  }
  /**
   * <code>string gender = 5;</code>
   */
  public com.google.protobuf.ByteString
      getGenderBytes() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOBILE_FIELD_NUMBER = 6;
  private volatile java.lang.Object mobile_;
  /**
   * <code>string mobile = 6;</code>
   */
  public java.lang.String getMobile() {
    java.lang.Object ref = mobile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mobile_ = s;
      return s;
    }
  }
  /**
   * <code>string mobile = 6;</code>
   */
  public com.google.protobuf.ByteString
      getMobileBytes() {
    java.lang.Object ref = mobile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mobile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 7;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 7;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 7;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getRetMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, retMsg_);
    }
    if (!getPlainTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plainText_);
    }
    if (!getRedirectUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, redirectUrl_);
    }
    if (!getGenderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gender_);
    }
    if (!getMobileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, mobile_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, email_);
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
    if (!getRetMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, retMsg_);
    }
    if (!getPlainTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plainText_);
    }
    if (!getRedirectUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, redirectUrl_);
    }
    if (!getGenderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gender_);
    }
    if (!getMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, mobile_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, email_);
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
    if (!(obj instanceof com.xxx.userservice.proto.HttpPluginTestRes)) {
      return super.equals(obj);
    }
    com.xxx.userservice.proto.HttpPluginTestRes other = (com.xxx.userservice.proto.HttpPluginTestRes) obj;

    boolean result = true;
    result = result && (getRetCode()
        == other.getRetCode());
    result = result && getRetMsg()
        .equals(other.getRetMsg());
    result = result && getPlainText()
        .equals(other.getPlainText());
    result = result && getRedirectUrl()
        .equals(other.getRedirectUrl());
    result = result && getGender()
        .equals(other.getGender());
    result = result && getMobile()
        .equals(other.getMobile());
    result = result && getEmail()
        .equals(other.getEmail());
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
    hash = (37 * hash) + RETMSG_FIELD_NUMBER;
    hash = (53 * hash) + getRetMsg().hashCode();
    hash = (37 * hash) + PLAINTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getPlainText().hashCode();
    hash = (37 * hash) + REDIRECTURL_FIELD_NUMBER;
    hash = (53 * hash) + getRedirectUrl().hashCode();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + getGender().hashCode();
    hash = (37 * hash) + MOBILE_FIELD_NUMBER;
    hash = (53 * hash) + getMobile().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.HttpPluginTestRes parseFrom(
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
  public static Builder newBuilder(com.xxx.userservice.proto.HttpPluginTestRes prototype) {
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
   * Protobuf type {@code HttpPluginTestRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HttpPluginTestRes)
      com.xxx.userservice.proto.HttpPluginTestResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_HttpPluginTestRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_HttpPluginTestRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxx.userservice.proto.HttpPluginTestRes.class, com.xxx.userservice.proto.HttpPluginTestRes.Builder.class);
    }

    // Construct using com.xxx.userservice.proto.HttpPluginTestRes.newBuilder()
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

      retMsg_ = "";

      plainText_ = "";

      redirectUrl_ = "";

      gender_ = "";

      mobile_ = "";

      email_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_HttpPluginTestRes_descriptor;
    }

    @java.lang.Override
    public com.xxx.userservice.proto.HttpPluginTestRes getDefaultInstanceForType() {
      return com.xxx.userservice.proto.HttpPluginTestRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.xxx.userservice.proto.HttpPluginTestRes build() {
      com.xxx.userservice.proto.HttpPluginTestRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xxx.userservice.proto.HttpPluginTestRes buildPartial() {
      com.xxx.userservice.proto.HttpPluginTestRes result = new com.xxx.userservice.proto.HttpPluginTestRes(this);
      result.retCode_ = retCode_;
      result.retMsg_ = retMsg_;
      result.plainText_ = plainText_;
      result.redirectUrl_ = redirectUrl_;
      result.gender_ = gender_;
      result.mobile_ = mobile_;
      result.email_ = email_;
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
      if (other instanceof com.xxx.userservice.proto.HttpPluginTestRes) {
        return mergeFrom((com.xxx.userservice.proto.HttpPluginTestRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxx.userservice.proto.HttpPluginTestRes other) {
      if (other == com.xxx.userservice.proto.HttpPluginTestRes.getDefaultInstance()) return this;
      if (other.getRetCode() != 0) {
        setRetCode(other.getRetCode());
      }
      if (!other.getRetMsg().isEmpty()) {
        retMsg_ = other.retMsg_;
        onChanged();
      }
      if (!other.getPlainText().isEmpty()) {
        plainText_ = other.plainText_;
        onChanged();
      }
      if (!other.getRedirectUrl().isEmpty()) {
        redirectUrl_ = other.redirectUrl_;
        onChanged();
      }
      if (!other.getGender().isEmpty()) {
        gender_ = other.gender_;
        onChanged();
      }
      if (!other.getMobile().isEmpty()) {
        mobile_ = other.mobile_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
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
      com.xxx.userservice.proto.HttpPluginTestRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxx.userservice.proto.HttpPluginTestRes) e.getUnfinishedMessage();
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

    private java.lang.Object retMsg_ = "";
    /**
     * <code>string retMsg = 2;</code>
     */
    public java.lang.String getRetMsg() {
      java.lang.Object ref = retMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        retMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRetMsgBytes() {
      java.lang.Object ref = retMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        retMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsg(
        java.lang.String value) {
      if (value == null) value = "";
  
      retMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder clearRetMsg() {
      
      retMsg_ = getDefaultInstance().getRetMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string retMsg = 2;</code>
     */
    public Builder setRetMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      retMsg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plainText_ = "";
    /**
     * <code>string plainText = 3;</code>
     */
    public java.lang.String getPlainText() {
      java.lang.Object ref = plainText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plainText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plainText = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPlainTextBytes() {
      java.lang.Object ref = plainText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plainText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plainText = 3;</code>
     */
    public Builder setPlainText(
        java.lang.String value) {
      if (value == null) value = "";
  
      plainText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plainText = 3;</code>
     */
    public Builder clearPlainText() {
      
      plainText_ = getDefaultInstance().getPlainText();
      onChanged();
      return this;
    }
    /**
     * <code>string plainText = 3;</code>
     */
    public Builder setPlainTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plainText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object redirectUrl_ = "";
    /**
     * <code>string redirectUrl = 4;</code>
     */
    public java.lang.String getRedirectUrl() {
      java.lang.Object ref = redirectUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redirectUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string redirectUrl = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRedirectUrlBytes() {
      java.lang.Object ref = redirectUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        redirectUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string redirectUrl = 4;</code>
     */
    public Builder setRedirectUrl(
        java.lang.String value) {
      if (value == null) value = "";
  
      redirectUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string redirectUrl = 4;</code>
     */
    public Builder clearRedirectUrl() {
      
      redirectUrl_ = getDefaultInstance().getRedirectUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string redirectUrl = 4;</code>
     */
    public Builder setRedirectUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      redirectUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gender_ = "";
    /**
     * <code>string gender = 5;</code>
     */
    public java.lang.String getGender() {
      java.lang.Object ref = gender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gender = 5;</code>
     */
    public com.google.protobuf.ByteString
        getGenderBytes() {
      java.lang.Object ref = gender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gender = 5;</code>
     */
    public Builder setGender(
        java.lang.String value) {
      if (value == null) value = "";
  
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gender = 5;</code>
     */
    public Builder clearGender() {
      
      gender_ = getDefaultInstance().getGender();
      onChanged();
      return this;
    }
    /**
     * <code>string gender = 5;</code>
     */
    public Builder setGenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gender_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mobile_ = "";
    /**
     * <code>string mobile = 6;</code>
     */
    public java.lang.String getMobile() {
      java.lang.Object ref = mobile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mobile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mobile = 6;</code>
     */
    public com.google.protobuf.ByteString
        getMobileBytes() {
      java.lang.Object ref = mobile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mobile = 6;</code>
     */
    public Builder setMobile(
        java.lang.String value) {
      if (value == null) value = "";
  
      mobile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mobile = 6;</code>
     */
    public Builder clearMobile() {
      
      mobile_ = getDefaultInstance().getMobile();
      onChanged();
      return this;
    }
    /**
     * <code>string mobile = 6;</code>
     */
    public Builder setMobileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mobile_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 7;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 7;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 7;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) value = "";
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 7;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 7;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
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


    // @@protoc_insertion_point(builder_scope:HttpPluginTestRes)
  }

  // @@protoc_insertion_point(class_scope:HttpPluginTestRes)
  private static final com.xxx.userservice.proto.HttpPluginTestRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxx.userservice.proto.HttpPluginTestRes();
  }

  public static com.xxx.userservice.proto.HttpPluginTestRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpPluginTestRes>
      PARSER = new com.google.protobuf.AbstractParser<HttpPluginTestRes>() {
    @java.lang.Override
    public HttpPluginTestRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HttpPluginTestRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HttpPluginTestRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpPluginTestRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxx.userservice.proto.HttpPluginTestRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

