// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DatanodeLifelineProtocol.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class DatanodeLifelineProtocolProtos {
  private DatanodeLifelineProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LifelineResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.datanodelifeline.LifelineResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Unlike heartbeats, the response is empty. There is no command dispatch.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.datanodelifeline.LifelineResponseProto}
   */
  public  static final class LifelineResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.datanodelifeline.LifelineResponseProto)
      LifelineResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LifelineResponseProto.newBuilder() to construct.
    private LifelineResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LifelineResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LifelineResponseProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.Builder.class);
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
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Unlike heartbeats, the response is empty. There is no command dispatch.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.datanodelifeline.LifelineResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.datanodelifeline.LifelineResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance()) return this;
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
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.datanodelifeline.LifelineResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.datanodelifeline.LifelineResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<LifelineResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<LifelineResponseProto>() {
      @java.lang.Override
      public LifelineResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new LifelineResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<LifelineResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<LifelineResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * Protobuf service {@code hadoop.hdfs.datanodelifeline.DatanodeLifelineProtocolService}
   */
  public static abstract class DatanodeLifelineProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected DatanodeLifelineProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc sendLifeline(.hadoop.hdfs.datanode.HeartbeatRequestProto) returns (.hadoop.hdfs.datanodelifeline.LifelineResponseProto);</code>
       */
      public abstract void sendLifeline(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new DatanodeLifelineProtocolService() {
        @java.lang.Override
        public  void sendLifeline(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto> done) {
          impl.sendLifeline(controller, request, done);
        }

      };
    }

    public static org.apache.hadoop.thirdparty.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new org.apache.hadoop.thirdparty.protobuf.BlockingService() {
        public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message callBlockingMethod(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.thirdparty.protobuf.Message request)
            throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.sendLifeline(controller, (org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
            getRequestPrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
            getResponsePrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc sendLifeline(.hadoop.hdfs.datanode.HeartbeatRequestProto) returns (.hadoop.hdfs.datanodelifeline.LifelineResponseProto);</code>
     */
    public abstract void sendLifeline(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.getDescriptor().getServices().get(0);
    }
    public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.thirdparty.protobuf.Message request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<
          org.apache.hadoop.thirdparty.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.sendLifeline(controller, (org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
        getRequestPrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
        getResponsePrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.DatanodeLifelineProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void sendLifeline(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto sendLifeline(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto sendLifeline(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.datanodelifeline.DatanodeLifelineProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036DatanodeLifelineProtocol.proto\022\034hadoop" +
      ".hdfs.datanodelifeline\032\026DatanodeProtocol" +
      ".proto\"\027\n\025LifelineResponseProto2\223\001\n\037Data" +
      "nodeLifelineProtocolService\022p\n\014sendLifel" +
      "ine\022+.hadoop.hdfs.datanode.HeartbeatRequ" +
      "estProto\0323.hadoop.hdfs.datanodelifeline." +
      "LifelineResponseProtoBM\n%org.apache.hado" +
      "op.hdfs.protocol.protoB\036DatanodeLifeline" +
      "ProtocolProtos\210\001\001\240\001\001"
    };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_datanodelifeline_LifelineResponseProto_descriptor,
        new java.lang.String[] { });
    org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
