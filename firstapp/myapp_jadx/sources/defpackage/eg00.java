package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class eg00<K, V> extends f4<V> {
    public final yf00<K, V> a;

    public eg00(yf00<K, V> yf00Var) {
        this.a = yf00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f4
    public final int b() {
        return this.a.d.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new fg00(this.a);
    }
}
