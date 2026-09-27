package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface m3<MessageType> {
    MessageType a(byte[] data, v0 extensionRegistry) throws y1;

    MessageType b(byte[] data, v0 extensionRegistry) throws y1;

    MessageType c(z input) throws y1;

    MessageType d(z input, v0 extensionRegistry) throws y1;

    MessageType e(byte[] data, int off, int len, v0 extensionRegistry) throws y1;

    MessageType f(u data) throws y1;

    MessageType g(u data) throws y1;

    MessageType h(InputStream input, v0 extensionRegistry) throws y1;

    MessageType i(z input, v0 extensionRegistry) throws y1;

    MessageType j(InputStream input, v0 extensionRegistry) throws y1;

    MessageType k(InputStream input, v0 extensionRegistry) throws y1;

    MessageType l(u data, v0 extensionRegistry) throws y1;

    MessageType m(byte[] data, int off, int len, v0 extensionRegistry) throws y1;

    MessageType n(u data, v0 extensionRegistry) throws y1;

    MessageType o(InputStream input, v0 extensionRegistry) throws y1;

    MessageType p(ByteBuffer data, v0 extensionRegistry) throws y1;

    MessageType parseDelimitedFrom(InputStream input) throws y1;

    MessageType parseFrom(InputStream input) throws y1;

    MessageType parseFrom(ByteBuffer data) throws y1;

    MessageType parseFrom(byte[] data) throws y1;

    MessageType parseFrom(byte[] data, int off, int len) throws y1;

    MessageType parsePartialDelimitedFrom(InputStream input) throws y1;

    MessageType parsePartialFrom(InputStream input) throws y1;

    MessageType parsePartialFrom(byte[] data) throws y1;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws y1;

    MessageType q(z input) throws y1;
}
