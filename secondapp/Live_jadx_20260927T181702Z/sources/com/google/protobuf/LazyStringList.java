package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c10);

    boolean addAllByteString(Collection<? extends ByteString> c10);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    ByteString getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList other);

    void set(int index, ByteString element);

    void set(int index, byte[] element);
}
