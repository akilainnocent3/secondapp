package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class gui<K, V> extends b3 implements Map<K, V> {
    @Override // java.util.Map
    public final void clear() {
        ((idd.b) this).c.clear();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) ((idd.b) this).c.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((idd.b) this).c.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return (Set<K>) ((idd.b) this).c.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) ((idd.b) this).c.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((idd.b) this).c.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) ((idd.b) this).c.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((idd.b) this).c.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) ((idd.b) this).c.values();
    }
}
