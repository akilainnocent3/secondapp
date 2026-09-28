package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zf00<K, V> extends y3<Map.Entry<K, V>, K, V> {
    public final yf00<K, V> a;

    public zf00(yf00<K, V> yf00Var) {
        this.a = yf00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i4
    public final int b() {
        return this.a.d.d();
    }

    @Override // defpackage.y3
    public final boolean c(Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        yf00<K, V> yf00Var = this.a;
        V v = yf00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            return yf00Var.d.containsKey(entry.getKey());
        }
        return false;
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
        return new ag00(this.a);
    }
}
