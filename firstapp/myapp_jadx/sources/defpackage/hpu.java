package defpackage;

import com.google.protobuf.Reader;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x3.a.C1271a;

/* JADX INFO: loaded from: classes4.dex */
public final class hpu {

    public static abstract class a<K, V> extends vi80.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            x3.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return x3.a.this.isEmpty();
        }

        @Override // vi80.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
                return zRemove;
            }
        }

        @Override // vi80.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int iCeil;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    s38.b(size, "expectedSize");
                    iCeil = size + 1;
                } else {
                    iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Reader.READ_DONE;
                }
                HashSet hashSet = new HashSet(iCeil);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return x3.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return x3.a.this.c.size();
        }
    }

    public static class b<K, V> extends vi80.c<K> {
        public final Map<K, V> a;

        public b(Map<K, V> map) {
            map.getClass();
            this.a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.a.size();
        }
    }

    public static class c<K, V> extends AbstractCollection<V> {
        public final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((x3.a) this.a).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new gpu(this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (sgp.a(obj, entry.getValue())) {
                        ((x3.a) dVar).remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((x3.a) this.a).c.size();
        }
    }

    public static abstract class d<K, V> extends AbstractMap<K, V> {
        public transient x3.a.C1271a a;
        public transient c b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            x3.a.C1271a c1271a = this.a;
            if (c1271a != null) {
                return c1271a;
            }
            x3.a.C1271a c1271a2 = ((x3.a) this).new C1271a();
            this.a = c1271a2;
            return c1271a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            c cVar = this.b;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(this);
            this.b = cVar2;
            return cVar2;
        }
    }

    public static boolean a(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
