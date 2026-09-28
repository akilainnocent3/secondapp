package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ixd0 implements Map.Entry<Object, Object>, ghp.a {
    public final Object a;
    public Object b;
    public final /* synthetic */ jxd0<Object, Object> c;

    public ixd0(jxd0<Object, Object> jxd0Var) {
        this.c = jxd0Var;
        Map.Entry<? extends Object, ? extends Object> entry = jxd0Var.d;
        entry.getClass();
        this.a = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = jxd0Var.d;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        jxd0<Object, Object> jxd0Var = this.c;
        m6a0<Object, Object> m6a0Var = jxd0Var.a;
        if (m6a0Var.c().d != jxd0Var.c) {
            sx0.a();
            return null;
        }
        Object obj2 = this.b;
        m6a0Var.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
