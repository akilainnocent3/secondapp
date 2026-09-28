package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class bg00<K, V> extends i4<K> {
    public final yf00<K, V> a;

    public bg00(yf00<K, V> yf00Var) {
        this.a = yf00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i4
    public final int b() {
        return this.a.d.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new cg00(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        yf00<K, V> yf00Var = this.a;
        if (!yf00Var.d.containsKey(obj)) {
            return false;
        }
        yf00Var.remove(obj);
        return true;
    }
}
