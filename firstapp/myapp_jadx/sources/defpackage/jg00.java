package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class jg00<K, V> implements Iterator<K>, dhp {
    public final kg00<K, V> a;

    public jg00(xf00<K, V> xf00Var) {
        this.a = new kg00<>(xf00Var.d, xf00Var.f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        kg00<K, V> kg00Var = this.a;
        K k = (K) kg00Var.a;
        kg00Var.next();
        return k;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
