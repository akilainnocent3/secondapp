package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h5<K, V, L> implements Iterable<Map.Entry<K, V>> {
    public static final ReferenceQueue<Object> c = new ReferenceQueue<>();
    public final ConcurrentHashMap a;
    public final WeakReference<ConcurrentMap<c<K>, ?>> b;

    public class a implements Iterator<Map.Entry<K, V>> {
        public final Iterator<Map.Entry<c<K>, V>> a;
        public Map.Entry<c<K>, V> b;
        public K c;

        public a(h5 h5Var, Iterator<Map.Entry<c<K>, V>> it) {
            this.a = it;
            a();
        }

        public final void a() {
            K k;
            do {
                Iterator<Map.Entry<c<K>, V>> it = this.a;
                if (!it.hasNext()) {
                    this.b = null;
                    this.c = null;
                    return;
                } else {
                    Map.Entry<c<K>, V> next = it.next();
                    this.b = next;
                    k = next.getKey().get();
                    this.c = k;
                }
            } while (k == null);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            K k = this.c;
            if (k == null) {
                lrh0.a();
                return null;
            }
            try {
                Map.Entry<c<K>, V> entry = this.b;
                Objects.requireNonNull(entry);
                return new b(k, entry);
            } finally {
                a();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Map.Entry<K, V> {
        public final K a;
        public final Map.Entry<c<K>, V> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, Map.Entry entry) {
            this.a = obj;
            this.b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b.getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            v.getClass();
            return this.b.setValue(v);
        }
    }

    public static final class c<K> extends WeakReference<K> {
        public final int a;
        public final WeakReference<ConcurrentMap<c<K>, ?>> b;

        public c(K k, WeakReference<ConcurrentMap<c<K>, ?>> weakReference) {
            super(k, h5.c);
            this.a = System.identityHashCode(k);
            this.b = weakReference;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return ((c) obj).get() == get();
            }
            return obj.equals(this);
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return String.valueOf(get());
        }
    }

    public h5(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
        this.b = new WeakReference<>(concurrentHashMap);
    }

    public static void a() {
        while (true) {
            Reference<? extends Object> referencePoll = c.poll();
            if (referencePoll == null) {
                return;
            }
            c cVar = (c) referencePoll;
            ConcurrentMap<c<K>, ?> concurrentMap = cVar.b.get();
            if (concurrentMap != null) {
                concurrentMap.remove(cVar);
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(this, this.a.entrySet().iterator());
    }

    public final String toString() {
        return this.a.toString();
    }
}
