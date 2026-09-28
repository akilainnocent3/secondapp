package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b'\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lv3;", "K", "V", "", "<init>", "()V", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class v3<K, V> implements Map<K, V>, dhp {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public volatile b a;
    public volatile c b;

    /* JADX INFO: renamed from: v3$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends x4<K> {
        public final /* synthetic */ v3<K, V> b;

        public static final class a implements Iterator<K>, dhp {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return this.a.next().getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(v3<K, ? extends V> v3Var) {
            this.b = v3Var;
        }

        @Override // defpackage.q2
        public final int b() {
            return this.b.e();
        }

        @Override // defpackage.q2, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.b.containsKey(obj);
        }

        @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.b.c().iterator());
        }
    }

    public static final class c extends q2<V> {
        public final /* synthetic */ v3<K, V> a;

        public static final class a implements Iterator<V>, dhp {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.a.next().getValue();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(v3<K, ? extends V> v3Var) {
            this.a = v3Var;
        }

        @Override // defpackage.q2
        public final int b() {
            return this.a.e();
        }

        @Override // defpackage.q2, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(this.a.c().iterator());
        }
    }

    public abstract Set<Map.Entry<K, V>> c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setC = c();
        if (setC.isEmpty()) {
            return false;
        }
        Iterator<T> it = setC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<K> d() {
        if (this.a == null) {
            this.a = new b(this);
        }
        b bVar = this.a;
        bVar.getClass();
        return bVar;
    }

    public int e() {
        return c().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (e() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            V v = get(key);
            if (!Intrinsics.g(value, v)) {
                return false;
            }
            if (v == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    public Collection<V> f() {
        if (this.b == null) {
            this.b = new c(this);
        }
        c cVar = this.b;
        cVar.getClass();
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> entryH = h(obj);
        if (entryH != null) {
            return entryH.getValue();
        }
        return null;
    }

    public final Map.Entry<K, V> h(K k) {
        Object next;
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g(((Map.Entry) next).getKey(), k)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return d();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    public final String toString() {
        return CollectionsKt.a0(c(), ", ", "{", "}", new u3(this, 0), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return f();
    }
}
