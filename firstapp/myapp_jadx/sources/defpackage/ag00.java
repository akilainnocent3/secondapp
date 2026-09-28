package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ag00<K, V> implements Iterator<Map.Entry<K, V>>, dhp {
    public final dg00<K, V> a;

    public ag00(yf00<K, V> yf00Var) {
        this.a = new dg00<>(yf00Var.b, yf00Var);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        dg00<K, V> dg00Var = this.a;
        return new zsw(dg00Var.b.d, dg00Var.c, dg00Var.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
