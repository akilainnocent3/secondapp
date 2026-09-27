package cj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class s5<K, V> extends w5 implements w8<K, V> {
    @Override // cj.w8
    public c9<K> R0() {
        return g2().R0();
    }

    @Override // cj.w8
    public boolean R1(@zq.a Object key, @zq.a Object value) {
        return g2().R1(key, value);
    }

    @Override // cj.w5
    /* JADX INFO: renamed from: X1 */
    public abstract w8<K, V> g2();

    @qj.a
    public Collection<V> a(@zq.a Object key) {
        return g2().a(key);
    }

    @qj.a
    public Collection<V> b(@n9 K key, Iterable<? extends V> values) {
        return g2().b(key, values);
    }

    @Override // cj.w8
    public void clear() {
        g2().clear();
    }

    @Override // cj.w8
    public boolean containsKey(@zq.a Object key) {
        return g2().containsKey(key);
    }

    @Override // cj.w8
    public boolean containsValue(@zq.a Object value) {
        return g2().containsValue(value);
    }

    @Override // cj.w8
    public Map<K, Collection<V>> d() {
        return g2().d();
    }

    @Override // cj.w8
    public boolean equals(@zq.a Object object) {
        return object == this || g2().equals(object);
    }

    public Collection<V> get(@n9 K key) {
        return g2().get(key);
    }

    @Override // cj.w8
    public int hashCode() {
        return g2().hashCode();
    }

    @Override // cj.w8
    public boolean isEmpty() {
        return g2().isEmpty();
    }

    @Override // cj.w8
    public Set<K> keySet() {
        return g2().keySet();
    }

    @Override // cj.w8
    @qj.a
    public boolean l1(@n9 K key, Iterable<? extends V> values) {
        return g2().l1(key, values);
    }

    @Override // cj.w8
    public Collection<Map.Entry<K, V>> m() {
        return g2().m();
    }

    @Override // cj.w8
    @qj.a
    public boolean o1(w8<? extends K, ? extends V> multimap) {
        return g2().o1(multimap);
    }

    @Override // cj.w8
    @qj.a
    public boolean put(@n9 K key, @n9 V value) {
        return g2().put(key, value);
    }

    @Override // cj.w8
    @qj.a
    public boolean remove(@zq.a Object key, @zq.a Object value) {
        return g2().remove(key, value);
    }

    @Override // cj.w8
    public int size() {
        return g2().size();
    }

    @Override // cj.w8
    public Collection<V> values() {
        return g2().values();
    }
}
