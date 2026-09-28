package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ynu<K, V> extends a4<Map.Entry<K, V>, K, V> {
    public final xnu<K, V> a;

    public ynu(xnu<K, V> xnuVar) {
        this.a = xnuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i4
    public final int b() {
        return this.a.w;
    }

    @Override // defpackage.a4
    public final boolean c(Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        xnu<K, V> xnuVar = this.a;
        int i = xnuVar.i(key);
        if (i < 0) {
            return false;
        }
        V[] vArr = xnuVar.b;
        vArr.getClass();
        return Intrinsics.g(vArr[i], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.a.f(collection);
    }

    @Override // defpackage.a4
    public final boolean d(Map.Entry<K, V> entry) {
        xnu<K, V> xnuVar = this.a;
        xnuVar.d();
        int i = xnuVar.i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = xnuVar.b;
        vArr.getClass();
        if (!Intrinsics.g(vArr[i], entry.getValue())) {
            return false;
        }
        xnuVar.m(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new xnu.b(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.a.d();
        return super.retainAll(collection);
    }
}
