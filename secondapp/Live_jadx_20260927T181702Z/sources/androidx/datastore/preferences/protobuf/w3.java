package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public interface w3<T> {
    void a(T message, h5 writer) throws IOException;

    void b(T message, t3 reader, v0 extensionRegistry) throws IOException;

    void c(T message, byte[] data, int position, int limit, l.b registers) throws IOException;

    boolean equals(T message, T other);

    int getSerializedSize(T message);

    int hashCode(T message);

    boolean isInitialized(T message);

    void makeImmutable(T message);

    void mergeFrom(T message, T other);

    T newInstance();
}
