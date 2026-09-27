package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public interface MessageLite extends MessageLiteOrBuilder {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @j
        Builder clear();

        /* JADX INFO: renamed from: clone */
        Builder mo168clone();

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        boolean mergeDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @j
        Builder mergeFrom(ByteString data) throws InvalidProtocolBufferException;

        @j
        Builder mergeFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;

        @j
        Builder mergeFrom(CodedInputStream input) throws IOException;

        @j
        Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @j
        Builder mergeFrom(MessageLite other);

        @j
        Builder mergeFrom(InputStream input) throws IOException;

        @j
        Builder mergeFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @j
        Builder mergeFrom(byte[] data) throws InvalidProtocolBufferException;

        @j
        Builder mergeFrom(byte[] data, int off, int len) throws InvalidProtocolBufferException;

        @j
        Builder mergeFrom(byte[] data, int off, int len, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;

        @j
        Builder mergeFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(CodedOutputStream output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
