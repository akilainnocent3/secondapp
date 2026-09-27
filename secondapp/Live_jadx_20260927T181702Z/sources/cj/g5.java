package cj;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class g5<K, V> extends q5<K, V> implements ConcurrentMap<K, V> {
    @Override // cj.q5, cj.w5
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> g2();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @qj.a
    @zq.a
    public V putIfAbsent(K key, V value) {
        return g2().putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @qj.a
    public boolean remove(@zq.a Object key, @zq.a Object value) {
        return g2().remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @qj.a
    @zq.a
    public V replace(K key, V value) {
        return g2().replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @qj.a
    public boolean replace(K key, V oldValue, V newValue) {
        return g2().replace(key, oldValue, newValue);
    }
}
