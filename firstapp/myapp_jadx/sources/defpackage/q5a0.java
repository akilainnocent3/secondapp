package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class q5a0<K, V, E> implements Set<E>, jhp {
    public final m6a0<K, V> a;

    public q5a0(m6a0<K, V> m6a0Var) {
        this.a = m6a0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) e48.b(this, tArr);
    }
}
