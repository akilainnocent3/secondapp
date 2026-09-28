package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hgs<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a w = new a();
    public final Comparator<? super K> a;
    public final boolean b;
    public e<K, V> c;
    public int d;
    public int e;
    public final e<K, V> f;
    public hgs<K, V>.b i;
    public hgs<K, V>.c v;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends hgs<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            hgs.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            e eVarB;
            if (obj instanceof Map.Entry) {
                hgs hgsVar = hgs.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        eVarB = hgsVar.b(key, false);
                    } catch (ClassCastException unused) {
                        eVarB = null;
                    }
                } else {
                    eVarB = null;
                }
                if (eVarB != null && Objects.equals(eVarB.v, entry.getValue())) {
                    eVar = eVarB;
                }
                if (eVar != null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e eVarB;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                hgs hgsVar = hgs.this;
                e eVar = null;
                if (key != null) {
                    try {
                        eVarB = hgsVar.b(key, false);
                    } catch (ClassCastException unused) {
                        eVarB = null;
                    }
                } else {
                    eVarB = null;
                }
                if (eVarB != null && Objects.equals(eVarB.v, entry.getValue())) {
                    eVar = eVarB;
                }
                if (eVar != null) {
                    hgsVar.d(eVar, true);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return hgs.this.d;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends hgs<K, V>.d<K> {
            @Override // hgs.d, java.util.Iterator
            public final K next() {
                return a().f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            hgs.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return hgs.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            hgs hgsVar = hgs.this;
            e<K, V> eVarB = null;
            if (obj != null) {
                try {
                    eVarB = hgsVar.b(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarB != null) {
                hgsVar.d(eVarB, true);
            }
            return eVarB != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return hgs.this.d;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> a;
        public e<K, V> b = null;
        public int c;

        public d() {
            this.a = hgs.this.f.d;
            this.c = hgs.this.e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.a;
            hgs hgsVar = hgs.this;
            if (eVar == hgsVar.f) {
                lrh0.a();
                return null;
            }
            if (hgsVar.e != this.c) {
                sx0.a();
                return null;
            }
            this.a = eVar.d;
            this.b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != hgs.this.f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar == null) {
                fm20.a();
                return;
            }
            hgs hgsVar = hgs.this;
            hgsVar.d(eVar, true);
            this.b = null;
            this.c = hgsVar.e;
        }
    }

    public hgs(boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = w;
        this.b = z;
        this.f = new e<>(z);
    }

    public final e<K, V> b(K k, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        e<K, V> eVar2 = this.c;
        a aVar = w;
        Comparator<? super K> comparator = this.a;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z) {
            return null;
        }
        e<K, V> eVar5 = this.f;
        if (eVar4 != null) {
            eVar = new e<>(this.b, eVar4, k, eVar5, eVar5.e);
            if (iCompareTo < 0) {
                eVar4.b = eVar;
            } else {
                eVar4.c = eVar;
            }
            c(eVar4, true);
        } else {
            if (comparator == aVar && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.b, eVar4, k, eVar5, eVar5.e);
            this.c = eVar;
        }
        this.d++;
        this.e++;
        return eVar;
    }

    public final void c(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i = eVar2 != null ? eVar2.w : 0;
            int i2 = eVar3 != null ? eVar3.w : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                int i4 = (eVar4 != null ? eVar4.w : 0) - (eVar5 != null ? eVar5.w : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(eVar);
                } else {
                    g(eVar3);
                    f(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                int i5 = (eVar6 != null ? eVar6.w : 0) - (eVar7 != null ? eVar7.w : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(eVar);
                } else {
                    f(eVar2);
                    g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.w = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.w = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        e<K, V> eVar = this.f;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVarB = null;
        if (obj != 0) {
            try {
                eVarB = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVarB != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.e;
            eVar4.d = eVar.d;
            eVar.d.e = eVar4;
        }
        e<K, V> eVar5 = eVar.b;
        e<K, V> eVar6 = eVar.c;
        e<K, V> eVar7 = eVar.a;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.b = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.c = null;
            } else {
                e(eVar, null);
            }
            c(eVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (eVar5.w > eVar6.w) {
            e<K, V> eVar8 = eVar5.c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.c;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.b;
                }
            }
            eVar3 = eVar2;
        }
        d(eVar3, false);
        e<K, V> eVar11 = eVar.b;
        if (eVar11 != null) {
            i = eVar11.w;
            eVar3.b = eVar11;
            eVar11.a = eVar3;
            eVar.b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar12 = eVar.c;
        if (eVar12 != null) {
            i2 = eVar12.w;
            eVar3.c = eVar12;
            eVar12.a = eVar3;
            eVar.c = null;
        }
        eVar3.w = Math.max(i, i2) + 1;
        e(eVar, eVar3);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.c = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.c = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        hgs<K, V>.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        hgs<K, V>.b bVar2 = new b();
        this.i = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        e(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.w : 0, eVar4 != null ? eVar4.w : 0) + 1;
        eVar.w = iMax;
        eVar3.w = Math.max(iMax, eVar5 != null ? eVar5.w : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        e(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.w : 0, eVar5 != null ? eVar5.w : 0) + 1;
        eVar.w = iMax;
        eVar2.w = Math.max(iMax, eVar4 != null ? eVar4.w : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> eVarB;
        if (obj != 0) {
            try {
                eVarB = b(obj, false);
            } catch (ClassCastException unused) {
                eVarB = null;
            }
        } else {
            eVarB = null;
        }
        if (eVarB != null) {
            return eVarB.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        hgs<K, V>.c cVar = this.v;
        if (cVar != null) {
            return cVar;
        }
        hgs<K, V>.c cVar2 = new c();
        this.v = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            bmy.a("key == null");
            return null;
        }
        if (v == null && !this.b) {
            bmy.a("value == null");
            return null;
        }
        e<K, V> eVarB = b(k, true);
        V v2 = eVarB.v;
        eVarB.v = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarB;
        if (obj != 0) {
            try {
                eVarB = b(obj, false);
            } catch (ClassCastException unused) {
                eVarB = null;
            }
        } else {
            eVarB = null;
        }
        if (eVarB != null) {
            d(eVarB, true);
        }
        if (eVarB != null) {
            return eVarB.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> a;
        public e<K, V> b;
        public e<K, V> c;
        public e<K, V> d;
        public e<K, V> e;
        public final K f;
        public final boolean i;
        public V v;
        public int w;

        public e(boolean z, e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f = k;
            this.i = z;
            this.w = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.v;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.v;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.v;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null && !this.i) {
                bmy.a("value == null");
                return null;
            }
            V v2 = this.v;
            this.v = v;
            return v2;
        }

        public final String toString() {
            return this.f + "=" + this.v;
        }

        public e(boolean z) {
            this.f = null;
            this.i = z;
            this.e = this;
            this.d = this;
        }
    }

    public hgs() {
        this(true);
    }
}
