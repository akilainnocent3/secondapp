package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements h2 {
    public static <E> t1.l<E> d(Object message, long offset) {
        return (t1.l) b5.Q(message, offset);
    }

    @Override // androidx.datastore.preferences.protobuf.h2
    public <E> void a(Object msg, Object otherMsg, long offset) {
        t1.l lVarD = d(msg, offset);
        t1.l lVarD2 = d(otherMsg, offset);
        int size = lVarD.size();
        int size2 = lVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!lVarD.isModifiable()) {
                lVarD = lVarD.mutableCopyWithCapacity2(size2 + size);
            }
            lVarD.addAll(lVarD2);
        }
        if (size > 0) {
            lVarD2 = lVarD;
        }
        b5.t0(msg, offset, lVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.h2
    public void b(Object message, long offset) {
        d(message, offset).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.h2
    public <L> List<L> c(Object message, long offset) {
        t1.l lVarD = d(message, offset);
        if (lVarD.isModifiable()) {
            return lVarD;
        }
        int size = lVarD.size();
        t1.l lVarMutableCopyWithCapacity2 = lVarD.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        b5.t0(message, offset, lVarMutableCopyWithCapacity2);
        return lVarMutableCopyWithCapacity2;
    }
}
