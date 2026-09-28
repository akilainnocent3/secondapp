package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rcn<K, V> implements Map<K, V>, Serializable {
    public transient tcn<Map.Entry<K, V>> a;
    public transient tcn<K> b;
    public transient jcn<V> c;

    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public C1047a c;

        /* JADX INFO: renamed from: rcn$a$a, reason: collision with other inner class name */
        public static final class C1047a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C1047a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.a = new Object[i * 2];
        }

        public final d150 a() {
            C1047a c1047a = this.c;
            if (c1047a != null) {
                throw c1047a.a();
            }
            d150 d150VarG = d150.g(this.b, this.a, this);
            C1047a c1047a2 = this.c;
            if (c1047a2 == null) {
                return d150VarG;
            }
            throw c1047a2.a();
        }

        public final void b(Object obj, Object obj2) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, jcn.b.b(objArr.length, i));
            }
            s38.a(obj, obj2);
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.b = i2 + 1;
        }

        public final void c(Iterable iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.b) * 2;
                Object[] objArr = this.a;
                if (size > objArr.length) {
                    this.a = Arrays.copyOf(objArr, jcn.b.b(objArr.length, size));
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b(entry.getKey(), entry.getValue());
            }
        }
    }

    public static <K, V> a<K, V> b(int i) {
        s38.b(i, "expectedSize");
        return new a<>(i);
    }

    public static <K, V> rcn<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof rcn) && !(map instanceof SortedMap)) {
            return (rcn) map;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        a aVar = new a(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        aVar.c(setEntrySet);
        return aVar.a();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        jcn jcnVarF = this.c;
        if (jcnVarF == null) {
            jcnVarF = f();
            this.c = jcnVarF;
        }
        return jcnVarF.contains(obj);
    }

    public abstract d150.a d();

    public abstract d150.b e();

    @Override // java.util.Map
    public final Set entrySet() {
        tcn<Map.Entry<K, V>> tcnVar = this.a;
        if (tcnVar != null) {
            return tcnVar;
        }
        d150.a aVarD = d();
        this.a = aVarD;
        return aVarD;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return hpu.a(obj, this);
    }

    public abstract d150.c f();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        d150.a aVarD = this.a;
        if (aVarD == null) {
            aVarD = d();
            this.a = aVarD;
        }
        return vi80.c(aVarD);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        tcn<K> tcnVar = this.b;
        if (tcnVar != null) {
            return tcnVar;
        }
        d150.b bVarE = e();
        this.b = bVarE;
        return bVarE;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        s38.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        jcn<V> jcnVar = this.c;
        if (jcnVar != null) {
            return jcnVar;
        }
        d150.c cVarF = f();
        this.c = cVarF;
        return cVarF;
    }
}
