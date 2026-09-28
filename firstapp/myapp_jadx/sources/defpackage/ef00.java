package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ef00<K, V> extends f4<V> {
    public final se00<K, V> a;

    public ef00(se00<K, V> se00Var) {
        this.a = se00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f4
    public final int b() {
        return this.a.f;
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
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new mwg0();
        }
        return new gf00(this.a, dwg0VarArr);
    }
}
