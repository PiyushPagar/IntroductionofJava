// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: film.proto

package org.akhq.utils;

public final class FilmProto {
  private FilmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FilmOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.akhq.utils.Film)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string producer = 2;</code>
     * @return The producer.
     */
    java.lang.String getProducer();
    /**
     * <code>string producer = 2;</code>
     * @return The bytes for producer.
     */
    com.google.protobuf.ByteString
        getProducerBytes();

    /**
     * <code>int32 release_year = 3;</code>
     * @return The releaseYear.
     */
    int getReleaseYear();

    /**
     * <code>int32 duration = 4;</code>
     * @return The duration.
     */
    int getDuration();

    /**
     * <code>repeated string starring = 5;</code>
     * @return A list containing the starring.
     */
    java.util.List<java.lang.String>
        getStarringList();
    /**
     * <code>repeated string starring = 5;</code>
     * @return The count of starring.
     */
    int getStarringCount();
    /**
     * <code>repeated string starring = 5;</code>
     * @param index The index of the element to return.
     * @return The starring at the given index.
     */
    java.lang.String getStarring(int index);
    /**
     * <code>repeated string starring = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the starring at the given index.
     */
    com.google.protobuf.ByteString
        getStarringBytes(int index);
  }
  /**
   * Protobuf type {@code org.akhq.utils.Film}
   */
  public  static final class Film extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.akhq.utils.Film)
      FilmOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Film.newBuilder() to construct.
    private Film(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Film() {
      name_ = "";
      producer_ = "";
      starring_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Film();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Film(
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

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              producer_ = s;
              break;
            }
            case 24: {

              releaseYear_ = input.readInt32();
              break;
            }
            case 32: {

              duration_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                starring_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              starring_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          starring_ = starring_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.akhq.utils.FilmProto.internal_static_org_akhq_utils_Film_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.akhq.utils.FilmProto.internal_static_org_akhq_utils_Film_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.akhq.utils.FilmProto.Film.class, org.akhq.utils.FilmProto.Film.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRODUCER_FIELD_NUMBER = 2;
    private volatile java.lang.Object producer_;
    /**
     * <code>string producer = 2;</code>
     * @return The producer.
     */
    public java.lang.String getProducer() {
      java.lang.Object ref = producer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        producer_ = s;
        return s;
      }
    }
    /**
     * <code>string producer = 2;</code>
     * @return The bytes for producer.
     */
    public com.google.protobuf.ByteString
        getProducerBytes() {
      java.lang.Object ref = producer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        producer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RELEASE_YEAR_FIELD_NUMBER = 3;
    private int releaseYear_;
    /**
     * <code>int32 release_year = 3;</code>
     * @return The releaseYear.
     */
    public int getReleaseYear() {
      return releaseYear_;
    }

    public static final int DURATION_FIELD_NUMBER = 4;
    private int duration_;
    /**
     * <code>int32 duration = 4;</code>
     * @return The duration.
     */
    public int getDuration() {
      return duration_;
    }

    public static final int STARRING_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList starring_;
    /**
     * <code>repeated string starring = 5;</code>
     * @return A list containing the starring.
     */
    public com.google.protobuf.ProtocolStringList
        getStarringList() {
      return starring_;
    }
    /**
     * <code>repeated string starring = 5;</code>
     * @return The count of starring.
     */
    public int getStarringCount() {
      return starring_.size();
    }
    /**
     * <code>repeated string starring = 5;</code>
     * @param index The index of the element to return.
     * @return The starring at the given index.
     */
    public java.lang.String getStarring(int index) {
      return starring_.get(index);
    }
    /**
     * <code>repeated string starring = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the starring at the given index.
     */
    public com.google.protobuf.ByteString
        getStarringBytes(int index) {
      return starring_.getByteString(index);
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getProducerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, producer_);
      }
      if (releaseYear_ != 0) {
        output.writeInt32(3, releaseYear_);
      }
      if (duration_ != 0) {
        output.writeInt32(4, duration_);
      }
      for (int i = 0; i < starring_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, starring_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getProducerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, producer_);
      }
      if (releaseYear_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, releaseYear_);
      }
      if (duration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, duration_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < starring_.size(); i++) {
          dataSize += computeStringSizeNoTag(starring_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getStarringList().size();
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
      if (!(obj instanceof org.akhq.utils.FilmProto.Film)) {
        return super.equals(obj);
      }
      org.akhq.utils.FilmProto.Film other = (org.akhq.utils.FilmProto.Film) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getProducer()
          .equals(other.getProducer())) return false;
      if (getReleaseYear()
          != other.getReleaseYear()) return false;
      if (getDuration()
          != other.getDuration()) return false;
      if (!getStarringList()
          .equals(other.getStarringList())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + PRODUCER_FIELD_NUMBER;
      hash = (53 * hash) + getProducer().hashCode();
      hash = (37 * hash) + RELEASE_YEAR_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseYear();
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration();
      if (getStarringCount() > 0) {
        hash = (37 * hash) + STARRING_FIELD_NUMBER;
        hash = (53 * hash) + getStarringList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.akhq.utils.FilmProto.Film parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.akhq.utils.FilmProto.Film parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.akhq.utils.FilmProto.Film parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.akhq.utils.FilmProto.Film parseFrom(
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
    public static Builder newBuilder(org.akhq.utils.FilmProto.Film prototype) {
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
     * Protobuf type {@code org.akhq.utils.Film}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.akhq.utils.Film)
        org.akhq.utils.FilmProto.FilmOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.akhq.utils.FilmProto.internal_static_org_akhq_utils_Film_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.akhq.utils.FilmProto.internal_static_org_akhq_utils_Film_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.akhq.utils.FilmProto.Film.class, org.akhq.utils.FilmProto.Film.Builder.class);
      }

      // Construct using org.akhq.utils.FilmProto.Film.newBuilder()
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
        name_ = "";

        producer_ = "";

        releaseYear_ = 0;

        duration_ = 0;

        starring_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.akhq.utils.FilmProto.internal_static_org_akhq_utils_Film_descriptor;
      }

      @java.lang.Override
      public org.akhq.utils.FilmProto.Film getDefaultInstanceForType() {
        return org.akhq.utils.FilmProto.Film.getDefaultInstance();
      }

      @java.lang.Override
      public org.akhq.utils.FilmProto.Film build() {
        org.akhq.utils.FilmProto.Film result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.akhq.utils.FilmProto.Film buildPartial() {
        org.akhq.utils.FilmProto.Film result = new org.akhq.utils.FilmProto.Film(this);
        int from_bitField0_ = bitField0_;
        result.name_ = name_;
        result.producer_ = producer_;
        result.releaseYear_ = releaseYear_;
        result.duration_ = duration_;
        if (((bitField0_ & 0x00000001) != 0)) {
          starring_ = starring_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.starring_ = starring_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.akhq.utils.FilmProto.Film) {
          return mergeFrom((org.akhq.utils.FilmProto.Film)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.akhq.utils.FilmProto.Film other) {
        if (other == org.akhq.utils.FilmProto.Film.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getProducer().isEmpty()) {
          producer_ = other.producer_;
          onChanged();
        }
        if (other.getReleaseYear() != 0) {
          setReleaseYear(other.getReleaseYear());
        }
        if (other.getDuration() != 0) {
          setDuration(other.getDuration());
        }
        if (!other.starring_.isEmpty()) {
          if (starring_.isEmpty()) {
            starring_ = other.starring_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStarringIsMutable();
            starring_.addAll(other.starring_);
          }
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
        org.akhq.utils.FilmProto.Film parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.akhq.utils.FilmProto.Film) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object producer_ = "";
      /**
       * <code>string producer = 2;</code>
       * @return The producer.
       */
      public java.lang.String getProducer() {
        java.lang.Object ref = producer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          producer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string producer = 2;</code>
       * @return The bytes for producer.
       */
      public com.google.protobuf.ByteString
          getProducerBytes() {
        java.lang.Object ref = producer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          producer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string producer = 2;</code>
       * @param value The producer to set.
       * @return This builder for chaining.
       */
      public Builder setProducer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        producer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string producer = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProducer() {
        
        producer_ = getDefaultInstance().getProducer();
        onChanged();
        return this;
      }
      /**
       * <code>string producer = 2;</code>
       * @param value The bytes for producer to set.
       * @return This builder for chaining.
       */
      public Builder setProducerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        producer_ = value;
        onChanged();
        return this;
      }

      private int releaseYear_ ;
      /**
       * <code>int32 release_year = 3;</code>
       * @return The releaseYear.
       */
      public int getReleaseYear() {
        return releaseYear_;
      }
      /**
       * <code>int32 release_year = 3;</code>
       * @param value The releaseYear to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseYear(int value) {
        
        releaseYear_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 release_year = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReleaseYear() {
        
        releaseYear_ = 0;
        onChanged();
        return this;
      }

      private int duration_ ;
      /**
       * <code>int32 duration = 4;</code>
       * @return The duration.
       */
      public int getDuration() {
        return duration_;
      }
      /**
       * <code>int32 duration = 4;</code>
       * @param value The duration to set.
       * @return This builder for chaining.
       */
      public Builder setDuration(int value) {
        
        duration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 duration = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDuration() {
        
        duration_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList starring_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureStarringIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          starring_ = new com.google.protobuf.LazyStringArrayList(starring_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @return A list containing the starring.
       */
      public com.google.protobuf.ProtocolStringList
          getStarringList() {
        return starring_.getUnmodifiableView();
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @return The count of starring.
       */
      public int getStarringCount() {
        return starring_.size();
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param index The index of the element to return.
       * @return The starring at the given index.
       */
      public java.lang.String getStarring(int index) {
        return starring_.get(index);
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the starring at the given index.
       */
      public com.google.protobuf.ByteString
          getStarringBytes(int index) {
        return starring_.getByteString(index);
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param index The index to set the value at.
       * @param value The starring to set.
       * @return This builder for chaining.
       */
      public Builder setStarring(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStarringIsMutable();
        starring_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param value The starring to add.
       * @return This builder for chaining.
       */
      public Builder addStarring(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStarringIsMutable();
        starring_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param values The starring to add.
       * @return This builder for chaining.
       */
      public Builder addAllStarring(
          java.lang.Iterable<java.lang.String> values) {
        ensureStarringIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, starring_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearStarring() {
        starring_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string starring = 5;</code>
       * @param value The bytes of the starring to add.
       * @return This builder for chaining.
       */
      public Builder addStarringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureStarringIsMutable();
        starring_.add(value);
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


      // @@protoc_insertion_point(builder_scope:org.akhq.utils.Film)
    }

    // @@protoc_insertion_point(class_scope:org.akhq.utils.Film)
    private static final org.akhq.utils.FilmProto.Film DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.akhq.utils.FilmProto.Film();
    }

    public static org.akhq.utils.FilmProto.Film getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Film>
        PARSER = new com.google.protobuf.AbstractParser<Film>() {
      @java.lang.Override
      public Film parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Film(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Film> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Film> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.akhq.utils.FilmProto.Film getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_akhq_utils_Film_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_akhq_utils_Film_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nfilm.proto\022\016org.akhq.utils\"`\n\004Film\022\014\n\004" +
      "name\030\001 \001(\t\022\020\n\010producer\030\002 \001(\t\022\024\n\014release_" +
      "year\030\003 \001(\005\022\020\n\010duration\030\004 \001(\005\022\020\n\010starring" +
      "\030\005 \003(\tB\033\n\016org.akhq.utilsB\tFilmProtob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_akhq_utils_Film_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_akhq_utils_Film_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_akhq_utils_Film_descriptor,
        new java.lang.String[] { "Name", "Producer", "ReleaseYear", "Duration", "Starring", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
