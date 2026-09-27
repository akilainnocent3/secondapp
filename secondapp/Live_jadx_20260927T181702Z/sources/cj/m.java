package cj;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class m<K, V> extends e<K, V> implements ma<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f24125j = 7431625294878419160L;

    public m(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // cj.e
    public <E> Collection<E> I(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // cj.e
    public Collection<V> J(@n9 K key, Collection<V> collection) {
        return new e.n(key, (Set) collection);
    }

    @Override // cj.e
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> x();

    @Override // cj.e
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Set<V> B() {
        return Collections.EMPTY_SET;
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
    public Set<V> a(@zq.a Object key) {
        return (Set) super.a(key);
    }

    @Override // cj.e, cj.h, cj.w8
    @qj.a
    public Set<V> b(@n9 K key, Iterable<? extends V> values) {
        return (Set) super.b((Object) key, (Iterable) values);
    }

    @Override // cj.e, cj.w8
    public Set<V> get(@n9 K key) {
        return (Set) super.get((Object) key);
    }

    @Override // cj.e, cj.h, cj.w8
    public Set<Map.Entry<K, V>> m() {
        return (Set) super.m();
    }
}
