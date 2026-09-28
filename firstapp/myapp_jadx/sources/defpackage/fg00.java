package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class fg00<K, V> implements Iterator<V>, dhp {
    public final dg00<K, V> a;

    public fg00(yf00<K, V> yf00Var) {
        this.a = new dg00<>(yf00Var.b, yf00Var);
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
        this.a.remove();
    }
}
