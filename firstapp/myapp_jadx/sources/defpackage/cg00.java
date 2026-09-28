package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class cg00<K, V> implements Iterator<K>, dhp {
    public final dg00<K, V> a;

    public cg00(yf00<K, V> yf00Var) {
        this.a = new dg00<>(yf00Var.b, yf00Var);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        dg00<K, V> dg00Var = this.a;
        dg00Var.next();
        return (K) dg00Var.c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
