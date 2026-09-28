package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface lou {
    jou a();

    jou forMapData(Object obj);

    void forMapMetadata(Object obj);

    jou forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    jou mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
