package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public abstract class q<T extends FieldSet.FieldDescriptorLite<T>> {
    public abstract int extensionNumber(Map.Entry<?, ?> extension);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistry, MessageLite defaultInstance, int number);

    public abstract FieldSet<T> getExtensions(Object message);

    public abstract FieldSet<T> getMutableExtensions(Object message);

    public abstract boolean hasExtensions(MessageLite prototype);

    public abstract void makeImmutable(Object message);

    public abstract <UT, UB> UB parseExtension(Object containerMessage, z0 reader, Object extension, ExtensionRegistryLite extensionRegistry, FieldSet<T> extensions, UB unknownFields, g1<UT, UB> unknownFieldSchema) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(z0 reader, Object extension, ExtensionRegistryLite extensionRegistry, FieldSet<T> extensions) throws IOException;

    public abstract void parseMessageSetItem(ByteString data, Object extension, ExtensionRegistryLite extensionRegistry, FieldSet<T> extensions) throws IOException;

    public abstract void serializeExtension(Writer writer, Map.Entry<?, ?> extension) throws IOException;

    public abstract void setExtensions(Object message, FieldSet<T> extensions);
}
