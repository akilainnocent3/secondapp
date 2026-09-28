package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class mf00<K, V> extends x4<K> implements ucn<K> {
    public final oe00<K, V> b;

    public mf00(oe00<K, V> oe00Var) {
        this.b = oe00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.e;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        cwg0<K, V> cwg0Var = this.b.d;
        cwg0Var.getClass();
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new hwg0();
        }
        return new of00(cwg0Var, dwg0VarArr);
    }
}
