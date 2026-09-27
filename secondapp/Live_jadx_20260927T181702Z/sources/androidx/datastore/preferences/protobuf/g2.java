package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface g2 extends r3 {
    void P0(int index, u element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c10);

    boolean addAllByteString(Collection<? extends u> c10);

    List<byte[]> asByteArrayList();

    void d1(g2 other);

    byte[] getByteArray(int index);

    u getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    g2 getUnmodifiableView();

    void o0(u element);

    void set(int index, byte[] element);
}
