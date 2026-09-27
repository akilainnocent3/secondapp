package fj;

import cj.gc;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public class e1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, V> f84568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public volatile transient Map.Entry<K, V> f84569b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AbstractSet<K> {

        /* JADX INFO: renamed from: fj.e1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0831a extends gc<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f84571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f84572c;

            public C0831a(final a this$1, final Iterator val$entryIterator) {
                this.f84571b = val$entryIterator;
                this.f84572c = this$1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f84571b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f84571b.next();
                e1.this.f84569b = entry;
                return (K) entry.getKey();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zq.a Object key) {
            return e1.this.e(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public gc<K> iterator() {
            return new C0831a(this, e1.this.f84568a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e1.this.f84568a.size();
        }
    }

    public e1(Map<K, V> backingMap) {
        this.f84568a = (Map) zi.l0.E(backingMap);
    }

    public final void c() {
        d();
        this.f84568a.clear();
    }

    public void d() {
        this.f84569b = null;
    }

    public final boolean e(@zq.a Object key) {
        return g(key) != null || this.f84568a.containsKey(key);
    }

    @zq.a
    public V f(Object key) {
        zi.l0.E(key);
        V vG = g(key);
        return vG == null ? h(key) : vG;
    }

    @zq.a
    public V g(@zq.a Object key) {
        Map.Entry<K, V> entry = this.f84569b;
        if (entry == null || entry.getKey() != key) {
            return null;
        }
        return entry.getValue();
    }

    @zq.a
    public final V h(Object key) {
        zi.l0.E(key);
        return this.f84568a.get(key);
    }

    @qj.a
    @zq.a
    public final V i(K key, V value) {
        zi.l0.E(key);
        zi.l0.E(value);
        d();
        return this.f84568a.put(key, value);
    }

    @qj.a
    @zq.a
    public final V j(Object key) {
        zi.l0.E(key);
        d();
        return this.f84568a.remove(key);
    }

    public final Set<K> k() {
        return new a();
    }
}
