package yt;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class l extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f159923e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map.Entry<K, l> f159924b;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f159924b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            l value = this.f159924b.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q) {
                return this.f159924b.getValue().d((q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, l> entry) {
            this.f159924b = entry;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f159925b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f159925b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f159925b.next();
            return next.getValue() instanceof l ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159925b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f159925b.remove();
        }
    }

    public q e() {
        return c(this.f159923e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
