package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ox0<K, V> extends nj90<K, V> implements Map<K, V> {
    public ox0<K, V>.a d;
    public ox0<K, V>.c e;
    public ox0<K, V>.e f;

    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ox0.this.c;
        }
    }

    public final class b extends dfn<K> {
        public b() {
            super(ox0.this.c);
        }

        @Override // defpackage.dfn
        public final K b(int i) {
            return ox0.this.g(i);
        }

        @Override // defpackage.dfn
        public final void c(int i) {
            ox0.this.i(i);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int a;
        public int b = -1;
        public boolean c;

        public d() {
            this.a = ox0.this.c - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.c) {
                ib5.a("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.b;
                ox0 ox0Var = ox0.this;
                if (Intrinsics.g(key, ox0Var.g(i)) && Intrinsics.g(entry.getValue(), ox0Var.k(this.b))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.c) {
                return ox0.this.g(this.b);
            }
            ib5.a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.c) {
                return ox0.this.k(this.b);
            }
            ib5.a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.c) {
                ib5.a("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i = this.b;
            ox0 ox0Var = ox0.this;
            K kG = ox0Var.g(i);
            V vK = ox0Var.k(this.b);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                lrh0.a();
                return null;
            }
            this.b++;
            this.c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                fm20.a();
                return;
            }
            ox0.this.i(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.c) {
                return ox0.this.j(this.b, v);
            }
            ib5.a("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends dfn<V> {
        public f() {
            super(ox0.this.c);
        }

        @Override // defpackage.dfn
        public final V b(int i) {
            return ox0.this.k(i);
        }

        @Override // defpackage.dfn
        public final void c(int i) {
            ox0.this.i(i);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ox0<K, V>.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        ox0<K, V>.a aVar2 = new a();
        this.d = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        ox0<K, V>.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        ox0<K, V>.c cVar2 = new c();
        this.e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(Collection<?> collection) {
        int i = this.c;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean n(Collection<?> collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(g(i2))) {
                i(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ox0<K, V>.e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        ox0<K, V>.e eVar2 = new e();
        this.f = eVar2;
        return eVar2;
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ox0.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ox0.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return ox0.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            ox0 ox0Var = ox0.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                return ox0Var.c == set.size() && ox0Var.l(set);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ox0 ox0Var = ox0.this;
            int iHashCode = 0;
            for (int i = ox0Var.c - 1; i >= 0; i--) {
                K kG = ox0Var.g(i);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ox0.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ox0 ox0Var = ox0.this;
            int iE = ox0Var.e(obj);
            if (iE < 0) {
                return false;
            }
            ox0Var.i(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return ox0.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return ox0.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ox0.this.c;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = ox0Var.g(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ox0Var.g(i2);
            }
            return objArr;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ox0.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ox0.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ox0.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ox0 ox0Var = ox0.this;
            int iB = ox0Var.b(obj);
            if (iB < 0) {
                return false;
            }
            ox0Var.i(iB);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(ox0Var.k(i2))) {
                    ox0Var.i(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(ox0Var.k(i2))) {
                    ox0Var.i(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return ox0.this.c;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = ox0Var.k(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ox0 ox0Var = ox0.this;
            int i = ox0Var.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ox0Var.k(i2);
            }
            return objArr;
        }
    }
}
