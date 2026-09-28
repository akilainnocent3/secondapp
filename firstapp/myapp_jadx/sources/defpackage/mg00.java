package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class mg00<K, V> implements Iterator<V>, dhp {
    public final kg00<K, V> a;

    public mg00(xf00<K, V> xf00Var) {
        this.a = new kg00<>(xf00Var.d, xf00Var.f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return this.a.next().a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
