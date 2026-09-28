package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class qf00<K, V> extends q2<V> {
    public final oe00<K, V> a;

    public qf00(oe00<K, V> oe00Var) {
        this.a = oe00Var;
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
        cwg0<K, V> cwg0Var = this.a.d;
        cwg0Var.getClass();
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new mwg0();
        }
        return new sf00(cwg0Var, dwg0VarArr);
    }
}
