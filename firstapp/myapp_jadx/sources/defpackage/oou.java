package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oou implements mou {
    @Override // defpackage.mou
    public final kou a() {
        return kou.b.d();
    }

    @Override // defpackage.mou
    public final kou forMapData(Object obj) {
        return (kou) obj;
    }

    @Override // defpackage.mou
    public final fou.a<?, ?> forMapMetadata(Object obj) {
        return ((fou) obj).a;
    }

    @Override // defpackage.mou
    public final kou forMutableMapData(Object obj) {
        return (kou) obj;
    }

    @Override // defpackage.mou
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        kou kouVar = (kou) obj;
        fou fouVar = (fou) obj2;
        int iN0 = 0;
        if (kouVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : kouVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            fouVar.getClass();
            int iM0 = q08.m0(i);
            int iA = fou.a(fouVar.a, key, value);
            iN0 += q08.n0(iA) + iA + iM0;
        }
        return iN0;
    }

    @Override // defpackage.mou
    public final boolean isImmutable(Object obj) {
        return !((kou) obj).a;
    }

    @Override // defpackage.mou
    public final kou mergeFrom(Object obj, Object obj2) {
        kou kouVarD = (kou) obj;
        kou kouVar = (kou) obj2;
        if (!kouVar.isEmpty()) {
            if (!kouVarD.a) {
                kouVarD = kouVarD.d();
            }
            kouVarD.c();
            if (!kouVar.isEmpty()) {
                kouVarD.putAll(kouVar);
            }
        }
        return kouVarD;
    }

    @Override // defpackage.mou
    public final Object toImmutable(Object obj) {
        ((kou) obj).a = false;
        return obj;
    }
}
