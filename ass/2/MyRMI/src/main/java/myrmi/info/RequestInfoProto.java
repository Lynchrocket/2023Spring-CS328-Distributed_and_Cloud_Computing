// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestInfo.proto

package myrmi.info;

public final class RequestInfoProto {
  private RequestInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:myrmi.Info.RequestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string method_name = 1;</code>
     * @return The methodName.
     */
    java.lang.String getMethodName();
    /**
     * <code>string method_name = 1;</code>
     * @return The bytes for methodName.
     */
    com.google.protobuf.ByteString
        getMethodNameBytes();

    /**
     * <code>repeated bytes args = 2;</code>
     * @return A list containing the args.
     */
    java.util.List<com.google.protobuf.ByteString> getArgsList();
    /**
     * <code>repeated bytes args = 2;</code>
     * @return The count of args.
     */
    int getArgsCount();
    /**
     * <code>repeated bytes args = 2;</code>
     * @param index The index of the element to return.
     * @return The args at the given index.
     */
    com.google.protobuf.ByteString getArgs(int index);

    /**
     * <code>repeated string arg_types = 3;</code>
     * @return A list containing the argTypes.
     */
    java.util.List<java.lang.String>
        getArgTypesList();
    /**
     * <code>repeated string arg_types = 3;</code>
     * @return The count of argTypes.
     */
    int getArgTypesCount();
    /**
     * <code>repeated string arg_types = 3;</code>
     * @param index The index of the element to return.
     * @return The argTypes at the given index.
     */
    java.lang.String getArgTypes(int index);
    /**
     * <code>repeated string arg_types = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the argTypes at the given index.
     */
    com.google.protobuf.ByteString
        getArgTypesBytes(int index);

    /**
     * <code>int32 object_key = 4;</code>
     * @return The objectKey.
     */
    int getObjectKey();
  }
  /**
   * Protobuf type {@code myrmi.Info.RequestInfo}
   */
  public static final class RequestInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:myrmi.Info.RequestInfo)
      RequestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestInfo.newBuilder() to construct.
    private RequestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestInfo() {
      methodName_ = "";
      args_ = java.util.Collections.emptyList();
      argTypes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return myrmi.info.RequestInfoProto.internal_static_myrmi_Info_RequestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return myrmi.info.RequestInfoProto.internal_static_myrmi_Info_RequestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              myrmi.info.RequestInfoProto.RequestInfo.class, myrmi.info.RequestInfoProto.RequestInfo.Builder.class);
    }

    public static final int METHOD_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object methodName_ = "";
    /**
     * <code>string method_name = 1;</code>
     * @return The methodName.
     */
    @java.lang.Override
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      }
    }
    /**
     * <code>string method_name = 1;</code>
     * @return The bytes for methodName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ARGS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<com.google.protobuf.ByteString> args_;
    /**
     * <code>repeated bytes args = 2;</code>
     * @return A list containing the args.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getArgsList() {
      return args_;
    }
    /**
     * <code>repeated bytes args = 2;</code>
     * @return The count of args.
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated bytes args = 2;</code>
     * @param index The index of the element to return.
     * @return The args at the given index.
     */
    public com.google.protobuf.ByteString getArgs(int index) {
      return args_.get(index);
    }

    public static final int ARG_TYPES_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList argTypes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string arg_types = 3;</code>
     * @return A list containing the argTypes.
     */
    public com.google.protobuf.ProtocolStringList
        getArgTypesList() {
      return argTypes_;
    }
    /**
     * <code>repeated string arg_types = 3;</code>
     * @return The count of argTypes.
     */
    public int getArgTypesCount() {
      return argTypes_.size();
    }
    /**
     * <code>repeated string arg_types = 3;</code>
     * @param index The index of the element to return.
     * @return The argTypes at the given index.
     */
    public java.lang.String getArgTypes(int index) {
      return argTypes_.get(index);
    }
    /**
     * <code>repeated string arg_types = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the argTypes at the given index.
     */
    public com.google.protobuf.ByteString
        getArgTypesBytes(int index) {
      return argTypes_.getByteString(index);
    }

    public static final int OBJECT_KEY_FIELD_NUMBER = 4;
    private int objectKey_ = 0;
    /**
     * <code>int32 object_key = 4;</code>
     * @return The objectKey.
     */
    @java.lang.Override
    public int getObjectKey() {
      return objectKey_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(methodName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, methodName_);
      }
      for (int i = 0; i < args_.size(); i++) {
        output.writeBytes(2, args_.get(i));
      }
      for (int i = 0; i < argTypes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, argTypes_.getRaw(i));
      }
      if (objectKey_ != 0) {
        output.writeInt32(4, objectKey_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(methodName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, methodName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < args_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(args_.get(i));
        }
        size += dataSize;
        size += 1 * getArgsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < argTypes_.size(); i++) {
          dataSize += computeStringSizeNoTag(argTypes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getArgTypesList().size();
      }
      if (objectKey_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, objectKey_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof myrmi.info.RequestInfoProto.RequestInfo)) {
        return super.equals(obj);
      }
      myrmi.info.RequestInfoProto.RequestInfo other = (myrmi.info.RequestInfoProto.RequestInfo) obj;

      if (!getMethodName()
          .equals(other.getMethodName())) return false;
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
      if (!getArgTypesList()
          .equals(other.getArgTypesList())) return false;
      if (getObjectKey()
          != other.getObjectKey()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + METHOD_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMethodName().hashCode();
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      if (getArgTypesCount() > 0) {
        hash = (37 * hash) + ARG_TYPES_FIELD_NUMBER;
        hash = (53 * hash) + getArgTypesList().hashCode();
      }
      hash = (37 * hash) + OBJECT_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getObjectKey();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static myrmi.info.RequestInfoProto.RequestInfo parseFrom(
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
    public static Builder newBuilder(myrmi.info.RequestInfoProto.RequestInfo prototype) {
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
     * Protobuf type {@code myrmi.Info.RequestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:myrmi.Info.RequestInfo)
        myrmi.info.RequestInfoProto.RequestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return myrmi.info.RequestInfoProto.internal_static_myrmi_Info_RequestInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return myrmi.info.RequestInfoProto.internal_static_myrmi_Info_RequestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                myrmi.info.RequestInfoProto.RequestInfo.class, myrmi.info.RequestInfoProto.RequestInfo.Builder.class);
      }

      // Construct using myrmi.Info.RequestInfoProto.RequestInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        methodName_ = "";
        args_ = java.util.Collections.emptyList();
        argTypes_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        objectKey_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return myrmi.info.RequestInfoProto.internal_static_myrmi_Info_RequestInfo_descriptor;
      }

      @java.lang.Override
      public myrmi.info.RequestInfoProto.RequestInfo getDefaultInstanceForType() {
        return myrmi.info.RequestInfoProto.RequestInfo.getDefaultInstance();
      }

      @java.lang.Override
      public myrmi.info.RequestInfoProto.RequestInfo build() {
        myrmi.info.RequestInfoProto.RequestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public myrmi.info.RequestInfoProto.RequestInfo buildPartial() {
        myrmi.info.RequestInfoProto.RequestInfo result = new myrmi.info.RequestInfoProto.RequestInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(myrmi.info.RequestInfoProto.RequestInfo result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.args_ = args_;
      }

      private void buildPartial0(myrmi.info.RequestInfoProto.RequestInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.methodName_ = methodName_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          argTypes_.makeImmutable();
          result.argTypes_ = argTypes_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.objectKey_ = objectKey_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof myrmi.info.RequestInfoProto.RequestInfo) {
          return mergeFrom((myrmi.info.RequestInfoProto.RequestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(myrmi.info.RequestInfoProto.RequestInfo other) {
        if (other == myrmi.info.RequestInfoProto.RequestInfo.getDefaultInstance()) return this;
        if (!other.getMethodName().isEmpty()) {
          methodName_ = other.methodName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
        if (!other.argTypes_.isEmpty()) {
          if (argTypes_.isEmpty()) {
            argTypes_ = other.argTypes_;
            bitField0_ |= 0x00000004;
          } else {
            ensureArgTypesIsMutable();
            argTypes_.addAll(other.argTypes_);
          }
          onChanged();
        }
        if (other.getObjectKey() != 0) {
          setObjectKey(other.getObjectKey());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                methodName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                com.google.protobuf.ByteString v = input.readBytes();
                ensureArgsIsMutable();
                args_.add(v);
                break;
              } // case 18
              case 26: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureArgTypesIsMutable();
                argTypes_.add(s);
                break;
              } // case 26
              case 32: {
                objectKey_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object methodName_ = "";
      /**
       * <code>string method_name = 1;</code>
       * @return The methodName.
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          methodName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string method_name = 1;</code>
       * @return The bytes for methodName.
       */
      public com.google.protobuf.ByteString
          getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string method_name = 1;</code>
       * @param value The methodName to set.
       * @return This builder for chaining.
       */
      public Builder setMethodName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        methodName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string method_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMethodName() {
        methodName_ = getDefaultInstance().getMethodName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string method_name = 1;</code>
       * @param value The bytes for methodName to set.
       * @return This builder for chaining.
       */
      public Builder setMethodNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        methodName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> args_ = java.util.Collections.emptyList();
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          args_ = new java.util.ArrayList<com.google.protobuf.ByteString>(args_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @return A list containing the args.
       */
      public java.util.List<com.google.protobuf.ByteString>
          getArgsList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(args_) : args_;
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @return The count of args.
       */
      public int getArgsCount() {
        return args_.size();
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @param index The index of the element to return.
       * @return The args at the given index.
       */
      public com.google.protobuf.ByteString getArgs(int index) {
        return args_.get(index);
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @param index The index to set the value at.
       * @param value The args to set.
       * @return This builder for chaining.
       */
      public Builder setArgs(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @param value The args to add.
       * @return This builder for chaining.
       */
      public Builder addArgs(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @param values The args to add.
       * @return This builder for chaining.
       */
      public Builder addAllArgs(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes args = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgs() {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList argTypes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureArgTypesIsMutable() {
        if (!argTypes_.isModifiable()) {
          argTypes_ = new com.google.protobuf.LazyStringArrayList(argTypes_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @return A list containing the argTypes.
       */
      public com.google.protobuf.ProtocolStringList
          getArgTypesList() {
        argTypes_.makeImmutable();
        return argTypes_;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @return The count of argTypes.
       */
      public int getArgTypesCount() {
        return argTypes_.size();
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param index The index of the element to return.
       * @return The argTypes at the given index.
       */
      public java.lang.String getArgTypes(int index) {
        return argTypes_.get(index);
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param index The index of the value to return.
       * @return The bytes of the argTypes at the given index.
       */
      public com.google.protobuf.ByteString
          getArgTypesBytes(int index) {
        return argTypes_.getByteString(index);
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param index The index to set the value at.
       * @param value The argTypes to set.
       * @return This builder for chaining.
       */
      public Builder setArgTypes(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureArgTypesIsMutable();
        argTypes_.set(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param value The argTypes to add.
       * @return This builder for chaining.
       */
      public Builder addArgTypes(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureArgTypesIsMutable();
        argTypes_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param values The argTypes to add.
       * @return This builder for chaining.
       */
      public Builder addAllArgTypes(
          java.lang.Iterable<java.lang.String> values) {
        ensureArgTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, argTypes_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgTypes() {
        argTypes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string arg_types = 3;</code>
       * @param value The bytes of the argTypes to add.
       * @return This builder for chaining.
       */
      public Builder addArgTypesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureArgTypesIsMutable();
        argTypes_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int objectKey_ ;
      /**
       * <code>int32 object_key = 4;</code>
       * @return The objectKey.
       */
      @java.lang.Override
      public int getObjectKey() {
        return objectKey_;
      }
      /**
       * <code>int32 object_key = 4;</code>
       * @param value The objectKey to set.
       * @return This builder for chaining.
       */
      public Builder setObjectKey(int value) {

        objectKey_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 object_key = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        objectKey_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:myrmi.Info.RequestInfo)
    }

    // @@protoc_insertion_point(class_scope:myrmi.Info.RequestInfo)
    private static final myrmi.info.RequestInfoProto.RequestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new myrmi.info.RequestInfoProto.RequestInfo();
    }

    public static myrmi.info.RequestInfoProto.RequestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestInfo>
        PARSER = new com.google.protobuf.AbstractParser<RequestInfo>() {
      @java.lang.Override
      public RequestInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<RequestInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public myrmi.info.RequestInfoProto.RequestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myrmi_Info_RequestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myrmi_Info_RequestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RequestInfo.proto\022\nmyrmi.Info\"W\n\013Reque" +
      "stInfo\022\023\n\013method_name\030\001 \001(\t\022\014\n\004args\030\002 \003(" +
      "\014\022\021\n\targ_types\030\003 \003(\t\022\022\n\nobject_key\030\004 \001(\005" +
      "B\036\n\nmyrmi.InfoB\020RequestInfoProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_myrmi_Info_RequestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_myrmi_Info_RequestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myrmi_Info_RequestInfo_descriptor,
        new java.lang.String[] { "MethodName", "Args", "ArgTypes", "ObjectKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
