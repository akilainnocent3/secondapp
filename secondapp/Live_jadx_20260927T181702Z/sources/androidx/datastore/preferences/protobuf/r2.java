package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class r2 implements q2 {
    public static <K, V> int a(int fieldNumber, Object mapField, Object defaultEntry) {
        p2 p2Var = (p2) mapField;
        o2 o2Var = (o2) defaultEntry;
        int iA = 0;
        if (p2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : p2Var.entrySet()) {
            iA += o2Var.a(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static <K, V> p2<K, V> b(Object destMapField, Object srcMapField) {
        p2<K, V> p2VarR = (p2) destMapField;
        p2<K, V> p2Var = (p2) srcMapField;
        if (!p2Var.isEmpty()) {
            if (!p2VarR.m()) {
                p2VarR = p2VarR.r();
            }
            p2VarR.p(p2Var);
        }
        return p2VarR;
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public Map<?, ?> forMapData(Object mapField) {
        return (p2) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public o2.b<?, ?> forMapMetadata(Object mapDefaultEntry) {
        return ((o2) mapDefaultEntry).d();
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public Map<?, ?> forMutableMapData(Object mapField) {
        return (p2) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return a(fieldNumber, mapField, mapDefaultEntry);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public boolean isImmutable(Object mapField) {
        return !((p2) mapField).m();
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public Object mergeFrom(Object destMapField, Object srcMapField) {
        return b(destMapField, srcMapField);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public Object newMapField(Object unused) {
        return p2.g().r();
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public Object toImmutable(Object mapField) {
        ((p2) mapField).n();
        return mapField;
    }
}
