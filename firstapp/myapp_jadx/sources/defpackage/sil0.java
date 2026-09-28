package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class sil0 implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((wil0) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof lkl0)) {
            hb5.a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        wil0 wil0Var = (wil0) this.a.getValue();
        lkl0 lkl0Var = wil0Var.a;
        wil0Var.b = null;
        wil0Var.a = (lkl0) obj;
        return lkl0Var;
    }
}
