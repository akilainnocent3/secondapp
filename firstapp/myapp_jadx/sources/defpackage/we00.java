package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class we00<K, V> extends y3<Map.Entry<K, V>, K, V> {
    public final se00<K, V> a;

    public we00(se00<K, V> se00Var) {
        this.a = se00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i4
    public final int b() {
        return this.a.f;
    }

    @Override // defpackage.y3
    public final boolean c(Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        se00<K, V> se00Var = this.a;
        V v = se00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && se00Var.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.y3
    public final boolean d(Map.Entry<? extends K, ? extends V> entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ye00(this.a);
    }
}
