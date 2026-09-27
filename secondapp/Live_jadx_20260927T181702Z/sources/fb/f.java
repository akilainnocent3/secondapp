package fb;

import com.ironsource.C4235d4;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<Comparable> f83845j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ boolean f83846k = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Comparator<? super K> f83847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g<K, V>[] f83848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<K, V> f83849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f<K, V>.d f83853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f<K, V>.e f83854i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f83855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83858d;

        public void a(g<K, V> gVar) {
            gVar.f83870d = null;
            gVar.f83868b = null;
            gVar.f83869c = null;
            gVar.f83876j = 1;
            int i10 = this.f83856b;
            if (i10 > 0) {
                int i11 = this.f83858d;
                if ((i11 & 1) == 0) {
                    this.f83858d = i11 + 1;
                    this.f83856b = i10 - 1;
                    this.f83857c++;
                }
            }
            gVar.f83868b = this.f83855a;
            this.f83855a = gVar;
            int i12 = this.f83858d;
            int i13 = i12 + 1;
            this.f83858d = i13;
            int i14 = this.f83856b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f83858d = i12 + 2;
                this.f83856b = i14 - 1;
                this.f83857c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f83858d & i16) != i16) {
                    return;
                }
                int i17 = this.f83857c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f83855a;
                    g<K, V> gVar3 = gVar2.f83868b;
                    g<K, V> gVar4 = gVar3.f83868b;
                    gVar3.f83868b = gVar4.f83868b;
                    this.f83855a = gVar3;
                    gVar3.f83869c = gVar4;
                    gVar3.f83870d = gVar2;
                    gVar3.f83876j = gVar2.f83876j + 1;
                    gVar4.f83868b = gVar3;
                    gVar2.f83868b = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f83855a;
                    g<K, V> gVar6 = gVar5.f83868b;
                    this.f83855a = gVar6;
                    gVar6.f83870d = gVar5;
                    gVar6.f83876j = gVar5.f83876j + 1;
                    gVar5.f83868b = gVar6;
                    this.f83857c = 0;
                } else if (i17 == 2) {
                    this.f83857c = 0;
                }
                i15 *= 2;
            }
        }

        public void b(int i10) {
            this.f83856b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f83858d = 0;
            this.f83857c = 0;
            this.f83855a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f83855a;
            if (gVar.f83868b == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f83859a;

        public g<K, V> a() {
            g<K, V> gVar = this.f83859a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f83868b;
            gVar.f83868b = null;
            g<K, V> gVar3 = gVar.f83870d;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f83859a = gVar4;
                    return gVar;
                }
                gVar2.f83868b = gVar4;
                gVar3 = gVar2.f83869c;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f83868b = gVar2;
                gVar2 = gVar;
                gVar = gVar.f83869c;
            }
            this.f83859a = gVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends f<K, V>.AbstractC0827f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarH;
            if (!(obj instanceof Map.Entry) || (gVarH = f.this.h((Map.Entry) obj)) == null) {
                return false;
            }
            f.this.l(gVarH, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f83850e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class e extends AbstractSet<K> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends f<K, V>.AbstractC0827f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f83873g;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return f.this.m(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f83850e;
        }
    }

    /* JADX INFO: renamed from: fb.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class AbstractC0827f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f83864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f83865c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83866d;

        public AbstractC0827f() {
            this.f83864b = f.this.f83849d.f83871e;
            this.f83866d = f.this.f83851f;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.f83864b;
            f fVar = f.this;
            if (gVar == fVar.f83849d) {
                throw new NoSuchElementException();
            }
            if (fVar.f83851f != this.f83866d) {
                throw new ConcurrentModificationException();
            }
            this.f83864b = gVar.f83871e;
            this.f83865c = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f83864b != f.this.f83849d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f83865c;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            f.this.l(gVar, true);
            this.f83865c = null;
            this.f83866d = f.this.f83851f;
        }
    }

    public f() {
        this(null);
    }

    public static <K, V> g<K, V>[] e(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f83874h & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f83874h & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    public static int s(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f83848c, (Object) null);
        this.f83850e = 0;
        this.f83851f++;
        g<K, V> gVar = this.f83849d;
        g<K, V> gVar2 = gVar.f83871e;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f83871e;
            gVar2.f83872f = null;
            gVar2.f83871e = null;
            gVar2 = gVar3;
        }
        gVar.f83872f = gVar;
        gVar.f83871e = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    public final void d() {
        g<K, V>[] gVarArrE = e(this.f83848c);
        this.f83848c = gVarArrE;
        this.f83852g = (gVarArrE.length / 2) + (gVarArrE.length / 4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.d dVar = this.f83853h;
        if (dVar != null) {
            return dVar;
        }
        f<K, V>.d dVar2 = new d();
        this.f83853h = dVar2;
        return dVar2;
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public g<K, V> g(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f83847b;
        g<K, V>[] gVarArr = this.f83848c;
        int iS = s(k10.hashCode());
        int length = (gVarArr.length - 1) & iS;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f83845j ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f83873g) : comparator.compare(k10, gVar2.f83873g);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f83869c : gVar2.f83870d;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g<K, V> gVar4 = this.f83849d;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iS, gVar4, gVar4.f83872f);
            if (i10 < 0) {
                gVar5.f83869c = gVar;
            } else {
                gVar5.f83870d = gVar;
            }
            k(gVar5, true);
        } else {
            if (comparator == f83845j && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iS, gVar4, gVar4.f83872f);
            gVarArr[length] = gVar;
        }
        int i11 = this.f83850e;
        this.f83850e = i11 + 1;
        if (i11 > this.f83852g) {
            d();
        }
        this.f83851f++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarJ = j(obj);
        if (gVarJ != null) {
            return gVarJ.f83875i;
        }
        return null;
    }

    public g<K, V> h(Map.Entry<?, ?> entry) {
        g<K, V> gVarJ = j(entry.getKey());
        if (gVarJ == null || !f(gVarJ.f83875i, entry.getValue())) {
            return null;
        }
        return gVarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> j(Object obj) {
        if (obj != 0) {
            try {
                return g(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void k(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f83869c;
            g<K, V> gVar3 = gVar.f83870d;
            int i10 = gVar2 != null ? gVar2.f83876j : 0;
            int i11 = gVar3 != null ? gVar3.f83876j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f83869c;
                g<K, V> gVar5 = gVar3.f83870d;
                int i13 = (gVar4 != null ? gVar4.f83876j : 0) - (gVar5 != null ? gVar5.f83876j : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    p(gVar);
                } else {
                    r(gVar3);
                    p(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f83869c;
                g<K, V> gVar7 = gVar2.f83870d;
                int i14 = (gVar6 != null ? gVar6.f83876j : 0) - (gVar7 != null ? gVar7.f83876j : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    r(gVar);
                } else {
                    p(gVar2);
                    r(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f83876j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f83876j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f83868b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        f<K, V>.e eVar = this.f83854i;
        if (eVar != null) {
            return eVar;
        }
        f<K, V>.e eVar2 = new e();
        this.f83854i = eVar2;
        return eVar2;
    }

    public void l(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f83872f;
            gVar2.f83871e = gVar.f83871e;
            gVar.f83871e.f83872f = gVar2;
            gVar.f83872f = null;
            gVar.f83871e = null;
        }
        g<K, V> gVar3 = gVar.f83869c;
        g<K, V> gVar4 = gVar.f83870d;
        g<K, V> gVar5 = gVar.f83868b;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                n(gVar, gVar3);
                gVar.f83869c = null;
            } else if (gVar4 != null) {
                n(gVar, gVar4);
                gVar.f83870d = null;
            } else {
                n(gVar, null);
            }
            k(gVar5, false);
            this.f83850e--;
            this.f83851f++;
            return;
        }
        g<K, V> gVarB = gVar3.f83876j > gVar4.f83876j ? gVar3.b() : gVar4.a();
        l(gVarB, false);
        g<K, V> gVar6 = gVar.f83869c;
        if (gVar6 != null) {
            i10 = gVar6.f83876j;
            gVarB.f83869c = gVar6;
            gVar6.f83868b = gVarB;
            gVar.f83869c = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f83870d;
        if (gVar7 != null) {
            i11 = gVar7.f83876j;
            gVarB.f83870d = gVar7;
            gVar7.f83868b = gVarB;
            gVar.f83870d = null;
        }
        gVarB.f83876j = Math.max(i10, i11) + 1;
        n(gVar, gVarB);
    }

    public g<K, V> m(Object obj) {
        g<K, V> gVarJ = j(obj);
        if (gVarJ != null) {
            l(gVarJ, true);
        }
        return gVarJ;
    }

    public final void n(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f83868b;
        gVar.f83868b = null;
        if (gVar2 != null) {
            gVar2.f83868b = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f83874h;
            g<K, V>[] gVarArr = this.f83848c;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f83869c == gVar) {
            gVar3.f83869c = gVar2;
        } else {
            gVar3.f83870d = gVar2;
        }
    }

    public final void p(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f83869c;
        g<K, V> gVar3 = gVar.f83870d;
        g<K, V> gVar4 = gVar3.f83869c;
        g<K, V> gVar5 = gVar3.f83870d;
        gVar.f83870d = gVar4;
        if (gVar4 != null) {
            gVar4.f83868b = gVar;
        }
        n(gVar, gVar3);
        gVar3.f83869c = gVar;
        gVar.f83868b = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f83876j : 0, gVar4 != null ? gVar4.f83876j : 0) + 1;
        gVar.f83876j = iMax;
        gVar3.f83876j = Math.max(iMax, gVar5 != null ? gVar5.f83876j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarG = g(k10, true);
        V v11 = gVarG.f83875i;
        gVarG.f83875i = v10;
        return v11;
    }

    public final void r(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f83869c;
        g<K, V> gVar3 = gVar.f83870d;
        g<K, V> gVar4 = gVar2.f83869c;
        g<K, V> gVar5 = gVar2.f83870d;
        gVar.f83869c = gVar5;
        if (gVar5 != null) {
            gVar5.f83868b = gVar;
        }
        n(gVar, gVar2);
        gVar2.f83870d = gVar;
        gVar.f83868b = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f83876j : 0, gVar5 != null ? gVar5.f83876j : 0) + 1;
        gVar.f83876j = iMax;
        gVar2.f83876j = Math.max(iMax, gVar4 != null ? gVar4.f83876j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarM = m(obj);
        if (gVarM != null) {
            return gVarM.f83875i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f83850e;
    }

    public final Object t() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public f(Comparator<? super K> comparator) {
        this.f83850e = 0;
        this.f83851f = 0;
        this.f83847b = comparator == null ? f83845j : comparator;
        this.f83849d = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f83848c = gVarArr;
        this.f83852g = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f83868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f83869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g<K, V> f83870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g<K, V> f83871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g<K, V> f83872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f83873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f83874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public V f83875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f83876j;

        public g() {
            this.f83873g = null;
            this.f83874h = -1;
            this.f83872f = this;
            this.f83871e = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f83869c; gVar2 != null; gVar2 = gVar2.f83869c) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f83870d; gVar2 != null; gVar2 = gVar2.f83870d) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f83873g;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f83875i;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f83873g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f83875i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f83873g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f83875i;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f83875i;
            this.f83875i = v10;
            return v11;
        }

        public String toString() {
            return this.f83873g + C4235d4.j.f61456b + this.f83875i;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f83868b = gVar;
            this.f83873g = k10;
            this.f83874h = i10;
            this.f83876j = 1;
            this.f83871e = gVar2;
            this.f83872f = gVar3;
            gVar3.f83871e = this;
            gVar2.f83872f = this;
        }
    }
}
