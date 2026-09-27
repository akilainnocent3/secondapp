package cj;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class h<K, V> implements w8<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient Collection<Map.Entry<K, V>> f23871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient Set<K> f23872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient c9<K> f23873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient Collection<V> f23874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient Map<K, Collection<V>> f23875f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends z8.f<K, V> {
        public a() {
        }

        @Override // cj.z8.f
        public w8<K, V> d() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends h<K, V>.a implements Set<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@zq.a Object obj) {
            return na.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return na.k(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zq.a Object o10) {
            return h.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return h.this.o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    @Override // cj.w8
    public c9<K> R0() {
        c9<K> c9Var = this.f23873d;
        if (c9Var != null) {
            return c9Var;
        }
        c9<K> c9VarK = k();
        this.f23873d = c9VarK;
        return c9VarK;
    }

    @Override // cj.w8
    public boolean R1(@zq.a Object key, @zq.a Object value) {
        Collection<V> collection = d().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // cj.w8
    @qj.a
    public Collection<V> b(@n9 K key, Iterable<? extends V> values) {
        zi.l0.E(values);
        Collection<V> collectionA = a(key);
        l1(key, values);
        return collectionA;
    }

    @Override // cj.w8
    public boolean containsValue(@zq.a Object value) {
        Iterator<Collection<V>> it = d().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // cj.w8
    public Map<K, Collection<V>> d() {
        Map<K, Collection<V>> map = this.f23875f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapG = g();
        this.f23875f = mapG;
        return mapG;
    }

    @Override // cj.w8
    public boolean equals(@zq.a Object object) {
        return z8.g(this, object);
    }

    public abstract Map<K, Collection<V>> g();

    @Override // cj.w8
    public int hashCode() {
        return d().hashCode();
    }

    public abstract Collection<Map.Entry<K, V>> i();

    @Override // cj.w8
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Set<K> j();

    public abstract c9<K> k();

    @Override // cj.w8
    public Set<K> keySet() {
        Set<K> set = this.f23872c;
        if (set != null) {
            return set;
        }
        Set<K> setJ = j();
        this.f23872c = setJ;
        return setJ;
    }

    public abstract Collection<V> l();

    @Override // cj.w8
    @qj.a
    public boolean l1(@n9 K key, Iterable<? extends V> values) {
        zi.l0.E(values);
        if (values instanceof Collection) {
            Collection<? extends V> collection = (Collection) values;
            return !collection.isEmpty() && get(key).addAll(collection);
        }
        Iterator<? extends V> it = values.iterator();
        return it.hasNext() && a8.a(get(key), it);
    }

    @Override // cj.w8
    public Collection<Map.Entry<K, V>> m() {
        Collection<Map.Entry<K, V>> collection = this.f23871b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionI = i();
        this.f23871b = collectionI;
        return collectionI;
    }

    public abstract Iterator<Map.Entry<K, V>> n();

    public Iterator<V> o() {
        return n8.R0(m().iterator());
    }

    @Override // cj.w8
    @qj.a
    public boolean o1(w8<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.m()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // cj.w8
    @qj.a
    public boolean put(@n9 K key, @n9 V value) {
        return get(key).add(value);
    }

    @Override // cj.w8
    @qj.a
    public boolean remove(@zq.a Object key, @zq.a Object value) {
        Collection<V> collection = d().get(key);
        return collection != null && collection.remove(value);
    }

    public String toString() {
        return d().toString();
    }

    @Override // cj.w8
    public Collection<V> values() {
        Collection<V> collection = this.f23874e;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionL = l();
        this.f23874e = collectionL;
        return collectionL;
    }
}
