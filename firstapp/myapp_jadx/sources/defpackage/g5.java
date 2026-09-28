package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g5<K, V, L> extends ReferenceQueue<K> implements Runnable, Iterable<Map.Entry<K, V>> {
    public final ConcurrentHashMap a;

    public class a implements Iterator<Map.Entry<K, V>> {
        public final Iterator<Map.Entry<c<K>, V>> a;
        public Map.Entry<c<K>, V> b;
        public K c;

        public a(g5 g5Var, Iterator<Map.Entry<c<K>, V>> it) {
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
                return new b(k, this.b);
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

        public c(Object obj, g5 g5Var) {
            super(obj, g5Var);
            this.a = System.identityHashCode(obj);
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

    public g5(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public V a(K k) {
        k.getClass();
        gyi0.b bVarB = b(k);
        try {
            V v = (V) this.a.get(bVarB);
            c(bVarB);
            if (v == null) {
                return null;
            }
            return v;
        } catch (Throwable th) {
            c(bVarB);
            throw th;
        }
    }

    public abstract gyi0.b b(Object obj);

    public abstract void c(L l);

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(this, this.a.entrySet().iterator());
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.a.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
