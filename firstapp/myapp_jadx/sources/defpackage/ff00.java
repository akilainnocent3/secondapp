package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ff00<K, V> extends f4<V> {
    public final te00<K, V> a;

    public ff00(te00<K, V> te00Var) {
        this.a = te00Var;
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
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new nwg0();
        }
        return new hf00(this.a, ewg0VarArr);
    }
}
