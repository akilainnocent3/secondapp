package cj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class q5<K, V> extends w5 implements Map<K, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class a extends n8.s<K, V> {
        public a() {
        }

        @Override // cj.n8.s
        public Map<K, V> h() {
            return q5.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends n8.b0<K, V> {
        public b() {
            super(q5.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends n8.q0<K, V> {
        public c() {
            super(q5.this);
        }
    }

    public void clear() {
        g2().clear();
    }

    public boolean containsKey(@zq.a Object key) {
        return g2().containsKey(key);
    }

    public boolean containsValue(@zq.a Object value) {
        return g2().containsValue(value);
    }

    @Override // cj.w5
    /* JADX INFO: renamed from: delegate */
    public abstract Map<K, V> g2();

    public Set<Map.Entry<K, V>> entrySet() {
        return g2().entrySet();
    }

    public boolean equals(@zq.a Object object) {
        return object == this || g2().equals(object);
    }

    @zq.a
    public V get(@zq.a Object key) {
        return g2().get(key);
    }

    public int hashCode() {
        return g2().hashCode();
    }

    public boolean isEmpty() {
        return g2().isEmpty();
    }

    public Set<K> keySet() {
        return g2().keySet();
    }

    @qj.a
    @zq.a
    public V put(@n9 K key, @n9 V value) {
        return g2().put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        g2().putAll(map);
    }

    @qj.a
    @zq.a
    public V remove(@zq.a Object key) {
        return g2().remove(key);
    }

    public int size() {
        return g2().size();
    }

    public void standardClear() {
        a8.g(entrySet().iterator());
    }

    public boolean standardContainsKey(@zq.a Object key) {
        return n8.q(this, key);
    }

    public boolean standardContainsValue(@zq.a Object value) {
        return n8.r(this, value);
    }

    public boolean standardEquals(@zq.a Object object) {
        return n8.w(this, object);
    }

    public int standardHashCode() {
        return na.k(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        n8.j0(this, map);
    }

    @zq.a
    public V standardRemove(@zq.a Object key) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zi.f0.a(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return n8.y0(this);
    }

    public Collection<V> values() {
        return g2().values();
    }
}
