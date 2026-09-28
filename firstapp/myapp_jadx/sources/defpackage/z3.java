package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: loaded from: classes.dex */
public abstract class z3<E extends Map.Entry<? extends K, ? extends V>, K, V> extends i4<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        te00<K, V> te00Var = ((xe00) this).a;
        V v = te00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && te00Var.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((xe00) this).a.remove(entry.getKey(), entry.getValue());
    }
}
