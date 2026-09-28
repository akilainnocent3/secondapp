package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mou {
    kou a();

    kou forMapData(Object obj);

    fou.a<?, ?> forMapMetadata(Object obj);

    kou forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    kou mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
