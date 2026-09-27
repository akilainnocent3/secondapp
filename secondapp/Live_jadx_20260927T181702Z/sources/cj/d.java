package cj;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class d<K, V> extends e<K, V> implements i8<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f23490j = 6588350623831699109L;

    public d(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // cj.e
    public <E> Collection<E> I(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // cj.e
    public Collection<V> J(@n9 K key, Collection<V> collection) {
        return K(key, (List) collection, null);
    }

    @Override // cj.e
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract List<V> x();

    @Override // cj.e
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public List<V> B() {
        return Collections.EMPTY_LIST;
    }

    @Override // cj.h, cj.w8
    public Map<K, Collection<V>> d() {
        return super.d();
    }

    @Override // cj.h, cj.w8
    public boolean equals(@zq.a Object object) {
        return super.equals(object);
    }

    @Override // cj.e, cj.h, cj.w8
    @qj.a
    public boolean put(@n9 K key, @n9 V value) {
        return super.put(key, value);
    }

    @Override // cj.e, cj.w8
    @qj.a
    public List<V> a(@zq.a Object key) {
        return (List) super.a(key);
    }

    @Override // cj.e, cj.h, cj.w8
    @qj.a
    public List<V> b(@n9 K key, Iterable<? extends V> values) {
        return (List) super.b((Object) key, (Iterable) values);
    }

    @Override // cj.e, cj.w8
    public List<V> get(@n9 K key) {
        return (List) super.get((Object) key);
    }
}
