package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nf00<K, V> extends x4<K> implements vcn<K> {
    public final pe00<K, V> b;

    public nf00(pe00<K, V> pe00Var) {
        this.b = pe00Var;
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
        bwg0<K, V> bwg0Var = this.b.d;
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new iwg0();
        }
        return new pf00(bwg0Var, ewg0VarArr);
    }
}
