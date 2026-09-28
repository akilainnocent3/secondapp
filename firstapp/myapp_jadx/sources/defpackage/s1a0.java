package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class s1a0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int i = 0;
    public final int a;
    public List<s1a0<K, V>.b> b = Collections.EMPTY_LIST;
    public Map<K, V> c;
    public boolean d;
    public volatile s1a0<K, V>.d e;
    public Map<K, V> f;

    public static class a {
        public static final C1072a a = new C1072a();
        public static final b b = new b();

        /* JADX INFO: renamed from: s1a0$a$a, reason: collision with other inner class name */
        public class C1072a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<s1a0<K, V>.b> {
        public final K a;
        public V b;

        public b() {
            throw null;
        }

        public b(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a.compareTo(((b) obj).a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.a;
                    if (k == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k.equals(key);
                    }
                    if (zEquals) {
                        V v = this.b;
                        Object value = entry.getValue();
                        if (v == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = s1a0.i;
            s1a0.this.c();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {
        public int a = -1;
        public boolean b;
        public Iterator<Map.Entry<K, V>> c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            Iterator<Map.Entry<K, V>> it = this.c;
            if (it != null) {
                return it;
            }
            Iterator<Map.Entry<K, V>> it2 = s1a0.this.c.entrySet().iterator();
            this.c = it2;
            return it2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.a + 1;
            s1a0 s1a0Var = s1a0.this;
            return i < s1a0Var.b.size() || (!s1a0Var.c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            s1a0 s1a0Var = s1a0.this;
            return i < s1a0Var.b.size() ? s1a0Var.b.get(this.a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                ib5.a("remove() was called before next()");
                return;
            }
            this.b = false;
            int i = s1a0.i;
            s1a0 s1a0Var = s1a0.this;
            s1a0Var.c();
            if (this.a >= s1a0Var.b.size()) {
                a().remove();
                return;
            }
            int i2 = this.a;
            this.a = i2 - 1;
            s1a0Var.i(i2);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            s1a0.this.h((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            s1a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s1a0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s1a0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return s1a0.this.size();
        }
    }

    public s1a0(int i2) {
        this.a = i2;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int b(K k) {
        int i2;
        int i3;
        int i4;
        int iCompareTo;
        int size = this.b.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                i4 = (i2 + i5) / 2;
                iCompareTo = k.compareTo(this.b.get(i4).a);
                if (iCompareTo < 0) {
                    i5 = i4 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i4;
                    }
                    i2 = i4 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.b.get(i5).a);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                    i4 = (i2 + i5) / 2;
                    iCompareTo = k.compareTo(this.b.get(i4).a);
                    if (iCompareTo < 0) {
                        i5 = i4 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i4;
                        }
                        i2 = i4 + 1;
                    }
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    public final void c() {
        if (this.d) {
            bl0.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i2) {
        return this.b.get(i2);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.c.isEmpty() ? a.b : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1a0)) {
            return super.equals(obj);
        }
        s1a0 s1a0Var = (s1a0) obj;
        int size = size();
        if (size == s1a0Var.size()) {
            int size2 = this.b.size();
            if (size2 != s1a0Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(s1a0Var.entrySet());
            }
            for (int i2 = 0; i2 < size2; i2++) {
                if (d(i2).equals(s1a0Var.d(i2))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(s1a0Var.c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public void g() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? this.b.get(iB).b : this.c.get(comparable);
    }

    public final V h(K k, V v) {
        c();
        int iB = b(k);
        if (iB >= 0) {
            return this.b.get(iB).setValue(v);
        }
        c();
        boolean zIsEmpty = this.b.isEmpty();
        int i2 = this.a;
        if (zIsEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i2);
        }
        int i3 = -(iB + 1);
        if (i3 >= i2) {
            return f().put(k, v);
        }
        if (this.b.size() == i2) {
            s1a0<K, V>.b bVarRemove = this.b.remove(i2 - 1);
            f().put(bVarRemove.a, bVarRemove.b);
        }
        this.b.add(i3, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int i2) {
        c();
        V v = this.b.remove(i2).b;
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<s1a0<K, V>.b> list = this.b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return i(iB);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
