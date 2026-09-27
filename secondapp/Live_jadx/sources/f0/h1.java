package f0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h1<K, V> implements Map.Entry<K, V>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f81922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f81923c;

    public h1(K k10, V v10) {
        this.f81922b = k10;
        this.f81923c = v10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f81922b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f81923c;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
