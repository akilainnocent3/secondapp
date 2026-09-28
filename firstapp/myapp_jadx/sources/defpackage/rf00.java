package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rf00<K, V> extends q2<V> {
    public final pe00<K, V> a;

    public rf00(pe00<K, V> pe00Var) {
        this.a = pe00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        bwg0<K, V> bwg0Var = this.a.d;
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new nwg0();
        }
        return new tf00(bwg0Var, ewg0VarArr);
    }
}
