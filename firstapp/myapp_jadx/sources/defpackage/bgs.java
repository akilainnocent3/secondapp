package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class bgs<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a w = new a();
    public bgs<K, V>.c i;
    public bgs<K, V>.d v;
    public int d = 0;
    public int e = 0;
    public final Comparator<? super K> a = w;
    public final f<K, V> c = new f<>();
    public f<K, V>[] b = new f[16];
    public int f = 12;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {
        public f<K, V> a;
        public int b;
        public int c;
        public int d;

        public final void a(f<K, V> fVar) {
            fVar.c = null;
            fVar.a = null;
            fVar.b = null;
            fVar.w = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    i--;
                    this.b = i;
                    this.c++;
                }
            }
            fVar.a = this.a;
            this.a = fVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            if (i > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i - 1;
                this.c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.d & i6) != i6) {
                    return;
                }
                int i7 = this.c;
                if (i7 == 0) {
                    f<K, V> fVar2 = this.a;
                    f<K, V> fVar3 = fVar2.a;
                    f<K, V> fVar4 = fVar3.a;
                    fVar3.a = fVar4.a;
                    this.a = fVar3;
                    fVar3.b = fVar4;
                    fVar3.c = fVar2;
                    fVar3.w = fVar2.w + 1;
                    fVar4.a = fVar3;
                    fVar2.a = fVar3;
                } else if (i7 == 1) {
                    f<K, V> fVar5 = this.a;
                    f<K, V> fVar6 = fVar5.a;
                    this.a = fVar6;
                    fVar6.c = fVar5;
                    fVar6.w = fVar5.w + 1;
                    fVar5.a = fVar6;
                    this.c = 0;
                } else if (i7 == 2) {
                    this.c = 0;
                }
                i5 *= 2;
            }
        }
    }

    public final class c extends AbstractSet<Map.Entry<K, V>> {

        public class a extends bgs<K, V>.e<Map.Entry<K, V>> {
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            bgs.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            f fVarB;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                bgs bgsVar = bgs.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                f fVar = null;
                if (key != null) {
                    try {
                        fVarB = bgsVar.b(key, false);
                    } catch (ClassCastException unused) {
                        fVarB = null;
                    }
                } else {
                    fVarB = null;
                }
                if (fVarB != null && ((v = fVarB.v) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                    fVar = fVarB;
                }
                if (fVar != null) {
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
            f fVarB;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                bgs bgsVar = bgs.this;
                f fVar = null;
                if (key != null) {
                    try {
                        fVarB = bgsVar.b(key, false);
                    } catch (ClassCastException unused) {
                        fVarB = null;
                    }
                } else {
                    fVarB = null;
                }
                if (fVarB != null && ((v = fVarB.v) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                    fVar = fVarB;
                }
                if (fVar != null) {
                    bgsVar.d(fVar, true);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return bgs.this.d;
        }
    }

    public final class d extends AbstractSet<K> {

        public class a extends bgs<K, V>.e<K> {
            @Override // bgs.e, java.util.Iterator
            public final K next() {
                return a().f;
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            bgs.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return bgs.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            bgs bgsVar = bgs.this;
            f<K, V> fVarB = null;
            if (obj != null) {
                try {
                    fVarB = bgsVar.b(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (fVarB != null) {
                bgsVar.d(fVarB, true);
            }
            return fVarB != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return bgs.this.d;
        }
    }

    public abstract class e<T> implements Iterator<T> {
        public f<K, V> a;
        public f<K, V> b = null;
        public int c;

        public e() {
            this.a = bgs.this.c.d;
            this.c = bgs.this.e;
        }

        public final f<K, V> a() {
            f<K, V> fVar = this.a;
            bgs bgsVar = bgs.this;
            if (fVar == bgsVar.c) {
                lrh0.a();
                return null;
            }
            if (bgsVar.e != this.c) {
                sx0.a();
                return null;
            }
            this.a = fVar.d;
            this.b = fVar;
            return fVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != bgs.this.c;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            f<K, V> fVar = this.b;
            if (fVar == null) {
                fm20.a();
                return;
            }
            bgs bgsVar = bgs.this;
            bgsVar.d(fVar, true);
            this.b = null;
            this.c = bgsVar.e;
        }
    }

    public final f<K, V> b(K k, boolean z) {
        int iCompareTo;
        f<K, V> fVar;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V> fVar4;
        f<K, V> fVar5;
        f<K, V> fVar6;
        f<K, V>[] fVarArr = this.b;
        int iHashCode = k.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z2 = true;
        int length = i2 & (fVarArr.length - 1);
        f<K, V> fVar7 = fVarArr[length];
        a aVar = w;
        f<K, V> fVar8 = null;
        Comparator<? super K> comparator = this.a;
        if (fVar7 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k : null;
            while (true) {
                K k2 = fVar7.f;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return fVar7;
                }
                f<K, V> fVar9 = iCompareTo < 0 ? fVar7.b : fVar7.c;
                if (fVar9 == null) {
                    break;
                }
                fVar7 = fVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        f<K, V> fVar10 = this.c;
        if (fVar7 != null) {
            f<K, V> fVar11 = fVar7;
            fVar = new f<>(fVar11, k, i2, fVar10, fVar10.e);
            if (iCompareTo < 0) {
                fVar11.b = fVar;
            } else {
                fVar11.c = fVar;
            }
            c(fVar11, true);
        } else {
            if (comparator == aVar && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            fVar = new f<>(fVar7, k, i2, fVar10, fVar10.e);
            fVarArr[length] = fVar;
        }
        int i3 = this.d;
        this.d = i3 + 1;
        if (i3 > this.f) {
            f<K, V>[] fVarArr2 = this.b;
            int length2 = fVarArr2.length;
            int i4 = length2 * 2;
            f<K, V>[] fVarArr3 = new f[i4];
            b bVar = new b();
            b bVar2 = new b();
            int i5 = 0;
            while (i5 < length2) {
                f<K, V> fVar12 = fVarArr2[i5];
                if (fVar12 == null) {
                    z2 = z2;
                    fVar3 = fVar8;
                } else {
                    f<K, V> fVar13 = fVar8;
                    for (f<K, V> fVar14 = fVar12; fVar14 != null; fVar14 = fVar14.b) {
                        fVar14.a = fVar13;
                        fVar13 = fVar14;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (fVar13 != null) {
                            f<K, V> fVar15 = fVar13.a;
                            fVar13.a = fVar8;
                            f<K, V> fVar16 = fVar13.c;
                            while (true) {
                                f<K, V> fVar17 = fVar16;
                                fVar2 = fVar15;
                                fVar15 = fVar17;
                                if (fVar15 == null) {
                                    break;
                                }
                                fVar15.a = fVar2;
                                fVar16 = fVar15.b;
                            }
                        } else {
                            f<K, V> fVar18 = fVar13;
                            fVar13 = fVar8;
                            fVar2 = fVar18;
                        }
                        if (fVar13 == null) {
                            break;
                        }
                        if ((fVar13.i & length2) == 0) {
                            i6++;
                        } else {
                            i7++;
                        }
                        fVar13 = fVar2;
                        z2 = z2;
                        fVar8 = null;
                    }
                    bVar.b = ((Integer.highestOneBit(i6) * 2) - 1) - i6;
                    bVar.d = 0;
                    bVar.c = 0;
                    f<K, V> fVar19 = null;
                    bVar.a = null;
                    bVar2.b = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    bVar2.d = 0;
                    bVar2.c = 0;
                    bVar2.a = null;
                    f<K, V> fVar20 = null;
                    while (fVar12 != null) {
                        fVar12.a = fVar20;
                        f<K, V> fVar21 = fVar12;
                        fVar12 = fVar12.b;
                        fVar20 = fVar21;
                    }
                    while (true) {
                        if (fVar20 != null) {
                            f<K, V> fVar22 = fVar20.a;
                            fVar20.a = fVar19;
                            f<K, V> fVar23 = fVar20.c;
                            while (true) {
                                fVar6 = fVar22;
                                fVar22 = fVar23;
                                if (fVar22 == null) {
                                    break;
                                }
                                fVar22.a = fVar6;
                                fVar23 = fVar22.b;
                            }
                            f<K, V> fVar24 = fVar20;
                            fVar20 = fVar6;
                            fVar19 = fVar24;
                        }
                        if (fVar19 == null) {
                            break;
                        }
                        if ((fVar19.i & length2) == 0) {
                            bVar.a(fVar19);
                        } else {
                            bVar2.a(fVar19);
                        }
                        fVar19 = null;
                    }
                    if (i6 > 0) {
                        fVar4 = bVar.a;
                        if (fVar4.a != null) {
                            fm20.a();
                            return null;
                        }
                        fVar3 = null;
                    } else {
                        fVar3 = null;
                        fVar4 = null;
                    }
                    fVarArr3[i5] = fVar4;
                    int i8 = i5 + length2;
                    if (i7 > 0) {
                        fVar5 = bVar2.a;
                        if (fVar5.a != null) {
                            fm20.a();
                            return fVar3;
                        }
                    } else {
                        fVar5 = fVar3;
                    }
                    fVarArr3[i8] = fVar5;
                }
                i5++;
                z2 = z2;
                fVar8 = fVar3;
            }
            this.b = fVarArr3;
            this.f = (i4 / 4) + (i4 / 2);
        }
        this.e++;
        return fVar;
    }

    public final void c(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.b;
            f<K, V> fVar3 = fVar.c;
            int i = fVar2 != null ? fVar2.w : 0;
            int i2 = fVar3 != null ? fVar3.w : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                f<K, V> fVar4 = fVar3.b;
                f<K, V> fVar5 = fVar3.c;
                int i4 = (fVar4 != null ? fVar4.w : 0) - (fVar5 != null ? fVar5.w : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    g(fVar3);
                }
                f(fVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                f<K, V> fVar6 = fVar2.b;
                f<K, V> fVar7 = fVar2.c;
                int i5 = (fVar6 != null ? fVar6.w : 0) - (fVar7 != null ? fVar7.w : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    f(fVar2);
                }
                g(fVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                fVar.w = i + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.w = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.b, (Object) null);
        this.d = 0;
        this.e++;
        f<K, V> fVar = this.c;
        f<K, V> fVar2 = fVar.d;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.d;
            fVar2.e = null;
            fVar2.d = null;
            fVar2 = fVar3;
        }
        fVar.e = fVar;
        fVar.d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        f<K, V> fVarB = null;
        if (obj != 0) {
            try {
                fVarB = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return fVarB != null;
    }

    public final void d(f<K, V> fVar, boolean z) {
        f<K, V> fVar2;
        f<K, V> fVar3;
        int i;
        if (z) {
            f<K, V> fVar4 = fVar.e;
            fVar4.d = fVar.d;
            fVar.d.e = fVar4;
            fVar.e = null;
            fVar.d = null;
        }
        f<K, V> fVar5 = fVar.b;
        f<K, V> fVar6 = fVar.c;
        f<K, V> fVar7 = fVar.a;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                e(fVar, fVar5);
                fVar.b = null;
            } else if (fVar6 != null) {
                e(fVar, fVar6);
                fVar.c = null;
            } else {
                e(fVar, null);
            }
            c(fVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (fVar5.w > fVar6.w) {
            f<K, V> fVar8 = fVar5.c;
            while (true) {
                f<K, V> fVar9 = fVar8;
                fVar3 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                } else {
                    fVar8 = fVar5.c;
                }
            }
        } else {
            f<K, V> fVar10 = fVar6.b;
            while (true) {
                fVar2 = fVar6;
                fVar6 = fVar10;
                if (fVar6 == null) {
                    break;
                } else {
                    fVar10 = fVar6.b;
                }
            }
            fVar3 = fVar2;
        }
        d(fVar3, false);
        f<K, V> fVar11 = fVar.b;
        if (fVar11 != null) {
            i = fVar11.w;
            fVar3.b = fVar11;
            fVar11.a = fVar3;
            fVar.b = null;
        } else {
            i = 0;
        }
        f<K, V> fVar12 = fVar.c;
        if (fVar12 != null) {
            i2 = fVar12.w;
            fVar3.c = fVar12;
            fVar12.a = fVar3;
            fVar.c = null;
        }
        fVar3.w = Math.max(i, i2) + 1;
        e(fVar, fVar3);
    }

    public final void e(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.a;
        fVar.a = null;
        if (fVar2 != null) {
            fVar2.a = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.i;
            f<K, V>[] fVarArr = this.b;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.b == fVar) {
            fVar3.b = fVar2;
        } else {
            fVar3.c = fVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        bgs<K, V>.c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        bgs<K, V>.c cVar2 = new c();
        this.i = cVar2;
        return cVar2;
    }

    public final void f(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.b;
        f<K, V> fVar3 = fVar.c;
        f<K, V> fVar4 = fVar3.b;
        f<K, V> fVar5 = fVar3.c;
        fVar.c = fVar4;
        if (fVar4 != null) {
            fVar4.a = fVar;
        }
        e(fVar, fVar3);
        fVar3.b = fVar;
        fVar.a = fVar3;
        int iMax = Math.max(fVar2 != null ? fVar2.w : 0, fVar4 != null ? fVar4.w : 0) + 1;
        fVar.w = iMax;
        fVar3.w = Math.max(iMax, fVar5 != null ? fVar5.w : 0) + 1;
    }

    public final void g(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.b;
        f<K, V> fVar3 = fVar.c;
        f<K, V> fVar4 = fVar2.b;
        f<K, V> fVar5 = fVar2.c;
        fVar.b = fVar5;
        if (fVar5 != null) {
            fVar5.a = fVar;
        }
        e(fVar, fVar2);
        fVar2.c = fVar;
        fVar.a = fVar2;
        int iMax = Math.max(fVar3 != null ? fVar3.w : 0, fVar5 != null ? fVar5.w : 0) + 1;
        fVar.w = iMax;
        fVar2.w = Math.max(iMax, fVar4 != null ? fVar4.w : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        f<K, V> fVarB;
        if (obj != 0) {
            try {
                fVarB = b(obj, false);
            } catch (ClassCastException unused) {
                fVarB = null;
            }
        } else {
            fVarB = null;
        }
        if (fVarB != null) {
            return fVarB.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        bgs<K, V>.d dVar = this.v;
        if (dVar != null) {
            return dVar;
        }
        bgs<K, V>.d dVar2 = new d();
        this.v = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            bmy.a("key == null");
            return null;
        }
        f<K, V> fVarB = b(k, true);
        V v2 = fVarB.v;
        fVarB.v = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f<K, V> fVarB;
        if (obj != 0) {
            try {
                fVarB = b(obj, false);
            } catch (ClassCastException unused) {
                fVarB = null;
            }
        } else {
            fVarB = null;
        }
        if (fVarB != null) {
            d(fVarB, true);
        }
        if (fVarB != null) {
            return fVarB.v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public static final class f<K, V> implements Map.Entry<K, V> {
        public f<K, V> a;
        public f<K, V> b;
        public f<K, V> c;
        public f<K, V> d;
        public f<K, V> e;
        public final K f;
        public final int i;
        public V v;
        public int w;

        public f(f<K, V> fVar, K k, int i, f<K, V> fVar2, f<K, V> fVar3) {
            this.a = fVar;
            this.f = k;
            this.i = i;
            this.w = 1;
            this.d = fVar2;
            this.e = fVar3;
            fVar3.d = this;
            fVar2.e = this;
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
            V v2 = this.v;
            this.v = v;
            return v2;
        }

        public final String toString() {
            return this.f + "=" + this.v;
        }

        public f() {
            this.f = null;
            this.i = -1;
            this.e = this;
            this.d = this;
        }
    }
}
