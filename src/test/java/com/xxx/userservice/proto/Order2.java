// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

/**
 * Protobuf type {@code Order2}
 */
public  final class Order2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Order2)
    Order2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order2.newBuilder() to construct.
  private Order2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order2() {
    orderId_ = "";
    amount_ = 0;
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order2(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 16: {

            amount_ = input.readInt32();
            break;
          }
          case 26: {
            com.xxx.userservice.proto.Session2.Builder subBuilder = null;
            if (session_ != null) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(com.xxx.userservice.proto.Session2.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              items_ = new java.util.ArrayList<com.xxx.userservice.proto.OrderItem2>();
              mutable_bitField0_ |= 0x00000008;
            }
            items_.add(
                input.readMessage(com.xxx.userservice.proto.OrderItem2.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_Order2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xxx.userservice.proto.UserServiceMetas.internal_static_Order2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xxx.userservice.proto.Order2.class, com.xxx.userservice.proto.Order2.Builder.class);
  }

  private int bitField0_;
  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string orderId = 1;</code>
   */
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string orderId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private int amount_;
  /**
   * <code>int32 amount = 2;</code>
   */
  public int getAmount() {
    return amount_;
  }

  public static final int SESSION_FIELD_NUMBER = 3;
  private com.xxx.userservice.proto.Session2 session_;
  /**
   * <code>.Session2 session = 3;</code>
   */
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <code>.Session2 session = 3;</code>
   */
  public com.xxx.userservice.proto.Session2 getSession() {
    return session_ == null ? com.xxx.userservice.proto.Session2.getDefaultInstance() : session_;
  }
  /**
   * <code>.Session2 session = 3;</code>
   */
  public com.xxx.userservice.proto.Session2OrBuilder getSessionOrBuilder() {
    return getSession();
  }

  public static final int ITEMS_FIELD_NUMBER = 4;
  private java.util.List<com.xxx.userservice.proto.OrderItem2> items_;
  /**
   * <code>repeated .OrderItem2 items = 4;</code>
   */
  public java.util.List<com.xxx.userservice.proto.OrderItem2> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .OrderItem2 items = 4;</code>
   */
  public java.util.List<? extends com.xxx.userservice.proto.OrderItem2OrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .OrderItem2 items = 4;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .OrderItem2 items = 4;</code>
   */
  public com.xxx.userservice.proto.OrderItem2 getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .OrderItem2 items = 4;</code>
   */
  public com.xxx.userservice.proto.OrderItem2OrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (amount_ != 0) {
      output.writeInt32(2, amount_);
    }
    if (session_ != null) {
      output.writeMessage(3, getSession());
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(4, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, amount_);
    }
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSession());
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, items_.get(i));
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
    if (!(obj instanceof com.xxx.userservice.proto.Order2)) {
      return super.equals(obj);
    }
    com.xxx.userservice.proto.Order2 other = (com.xxx.userservice.proto.Order2) obj;

    boolean result = true;
    result = result && getOrderId()
        .equals(other.getOrderId());
    result = result && (getAmount()
        == other.getAmount());
    result = result && (hasSession() == other.hasSession());
    if (hasSession()) {
      result = result && getSession()
          .equals(other.getSession());
    }
    result = result && getItemsList()
        .equals(other.getItemsList());
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
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xxx.userservice.proto.Order2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Order2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Order2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xxx.userservice.proto.Order2 parseFrom(
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
  public static Builder newBuilder(com.xxx.userservice.proto.Order2 prototype) {
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
   * Protobuf type {@code Order2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Order2)
      com.xxx.userservice.proto.Order2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Order2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Order2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xxx.userservice.proto.Order2.class, com.xxx.userservice.proto.Order2.Builder.class);
    }

    // Construct using com.xxx.userservice.proto.Order2.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderId_ = "";

      amount_ = 0;

      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xxx.userservice.proto.UserServiceMetas.internal_static_Order2_descriptor;
    }

    @java.lang.Override
    public com.xxx.userservice.proto.Order2 getDefaultInstanceForType() {
      return com.xxx.userservice.proto.Order2.getDefaultInstance();
    }

    @java.lang.Override
    public com.xxx.userservice.proto.Order2 build() {
      com.xxx.userservice.proto.Order2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xxx.userservice.proto.Order2 buildPartial() {
      com.xxx.userservice.proto.Order2 result = new com.xxx.userservice.proto.Order2(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.orderId_ = orderId_;
      result.amount_ = amount_;
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
      }
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.xxx.userservice.proto.Order2) {
        return mergeFrom((com.xxx.userservice.proto.Order2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xxx.userservice.proto.Order2 other) {
      if (other == com.xxx.userservice.proto.Order2.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (other.hasSession()) {
        mergeSession(other.getSession());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000008);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
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
      com.xxx.userservice.proto.Order2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xxx.userservice.proto.Order2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object orderId_ = "";
    /**
     * <code>string orderId = 1;</code>
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) value = "";
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>int32 amount = 2;</code>
     */
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>int32 amount = 2;</code>
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }

    private com.xxx.userservice.proto.Session2 session_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xxx.userservice.proto.Session2, com.xxx.userservice.proto.Session2.Builder, com.xxx.userservice.proto.Session2OrBuilder> sessionBuilder_;
    /**
     * <code>.Session2 session = 3;</code>
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public com.xxx.userservice.proto.Session2 getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? com.xxx.userservice.proto.Session2.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public Builder setSession(com.xxx.userservice.proto.Session2 value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public Builder setSession(
        com.xxx.userservice.proto.Session2.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public Builder mergeSession(com.xxx.userservice.proto.Session2 value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
            com.xxx.userservice.proto.Session2.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public com.xxx.userservice.proto.Session2.Builder getSessionBuilder() {
      
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    public com.xxx.userservice.proto.Session2OrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            com.xxx.userservice.proto.Session2.getDefaultInstance() : session_;
      }
    }
    /**
     * <code>.Session2 session = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xxx.userservice.proto.Session2, com.xxx.userservice.proto.Session2.Builder, com.xxx.userservice.proto.Session2OrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xxx.userservice.proto.Session2, com.xxx.userservice.proto.Session2.Builder, com.xxx.userservice.proto.Session2OrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }

    private java.util.List<com.xxx.userservice.proto.OrderItem2> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        items_ = new java.util.ArrayList<com.xxx.userservice.proto.OrderItem2>(items_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xxx.userservice.proto.OrderItem2, com.xxx.userservice.proto.OrderItem2.Builder, com.xxx.userservice.proto.OrderItem2OrBuilder> itemsBuilder_;

    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public java.util.List<com.xxx.userservice.proto.OrderItem2> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public com.xxx.userservice.proto.OrderItem2 getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder setItems(
        int index, com.xxx.userservice.proto.OrderItem2 value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder setItems(
        int index, com.xxx.userservice.proto.OrderItem2.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder addItems(com.xxx.userservice.proto.OrderItem2 value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder addItems(
        int index, com.xxx.userservice.proto.OrderItem2 value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder addItems(
        com.xxx.userservice.proto.OrderItem2.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder addItems(
        int index, com.xxx.userservice.proto.OrderItem2.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.xxx.userservice.proto.OrderItem2> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public com.xxx.userservice.proto.OrderItem2.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public com.xxx.userservice.proto.OrderItem2OrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public java.util.List<? extends com.xxx.userservice.proto.OrderItem2OrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public com.xxx.userservice.proto.OrderItem2.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.xxx.userservice.proto.OrderItem2.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public com.xxx.userservice.proto.OrderItem2.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.xxx.userservice.proto.OrderItem2.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderItem2 items = 4;</code>
     */
    public java.util.List<com.xxx.userservice.proto.OrderItem2.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xxx.userservice.proto.OrderItem2, com.xxx.userservice.proto.OrderItem2.Builder, com.xxx.userservice.proto.OrderItem2OrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xxx.userservice.proto.OrderItem2, com.xxx.userservice.proto.OrderItem2.Builder, com.xxx.userservice.proto.OrderItem2OrBuilder>(
                items_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Order2)
  }

  // @@protoc_insertion_point(class_scope:Order2)
  private static final com.xxx.userservice.proto.Order2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xxx.userservice.proto.Order2();
  }

  public static com.xxx.userservice.proto.Order2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order2>
      PARSER = new com.google.protobuf.AbstractParser<Order2>() {
    @java.lang.Override
    public Order2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xxx.userservice.proto.Order2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

