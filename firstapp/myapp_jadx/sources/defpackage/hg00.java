package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class hg00<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, dhp {
    public final kg00<K, V> a;

    public hg00(xf00<K, V> xf00Var) {
        this.a = new kg00<>(xf00Var.d, xf00Var.f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        kg00<K, V> kg00Var = this.a;
        return new dou(kg00Var.a, kg00Var.next().a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
