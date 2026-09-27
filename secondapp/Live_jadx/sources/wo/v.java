package wo;

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
/* JADX INFO: loaded from: classes7.dex */
public final class v<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<Comparable> f143613j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ boolean f143614k = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<? super K> f143615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g<K, V>[] f143616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<K, V> f143617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f143618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f143619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f143620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v<K, V>.d f143621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v<K, V>.e f143622i;

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
        public g<K, V> f143623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f143624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f143625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f143626d;

        public void a(g<K, V> gVar) {
            gVar.f143638d = null;
            gVar.f143636b = null;
            gVar.f143637c = null;
            gVar.f143644j = 1;
            int i10 = this.f143624b;
            if (i10 > 0) {
                int i11 = this.f143626d;
                if ((i11 & 1) == 0) {
                    this.f143626d = i11 + 1;
                    this.f143624b = i10 - 1;
                    this.f143625c++;
                }
            }
            gVar.f143636b = this.f143623a;
            this.f143623a = gVar;
            int i12 = this.f143626d;
            int i13 = i12 + 1;
            this.f143626d = i13;
            int i14 = this.f143624b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f143626d = i12 + 2;
                this.f143624b = i14 - 1;
                this.f143625c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f143626d & i16) != i16) {
                    return;
                }
                int i17 = this.f143625c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f143623a;
                    g<K, V> gVar3 = gVar2.f143636b;
                    g<K, V> gVar4 = gVar3.f143636b;
                    gVar3.f143636b = gVar4.f143636b;
                    this.f143623a = gVar3;
                    gVar3.f143637c = gVar4;
                    gVar3.f143638d = gVar2;
                    gVar3.f143644j = gVar2.f143644j + 1;
                    gVar4.f143636b = gVar3;
                    gVar2.f143636b = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f143623a;
                    g<K, V> gVar6 = gVar5.f143636b;
                    this.f143623a = gVar6;
                    gVar6.f143638d = gVar5;
                    gVar6.f143644j = gVar5.f143644j + 1;
                    gVar5.f143636b = gVar6;
                    this.f143625c = 0;
                } else if (i17 == 2) {
                    this.f143625c = 0;
                }
                i15 *= 2;
            }
        }

        public void b(int i10) {
            this.f143624b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f143626d = 0;
            this.f143625c = 0;
            this.f143623a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f143623a;
            if (gVar.f143636b == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f143627a;

        public g<K, V> a() {
            g<K, V> gVar = this.f143627a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f143636b;
            gVar.f143636b = null;
            g<K, V> gVar3 = gVar.f143638d;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f143627a = gVar4;
                    return gVar;
                }
                gVar2.f143636b = gVar4;
                gVar3 = gVar2.f143637c;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f143636b = gVar2;
                gVar2 = gVar;
                gVar = gVar.f143637c;
            }
            this.f143627a = gVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends v<K, V>.f<Map.Entry<K, V>> {
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
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && v.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarH;
            if (!(obj instanceof Map.Entry) || (gVarH = v.this.h((Map.Entry) obj)) == null) {
                return false;
            }
            v.this.l(gVarH, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f143618e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class e extends AbstractSet<K> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends v<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f143641g;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return v.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return v.this.m(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f143618e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f143632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f143633c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f143634d;

        public f() {
            this.f143632b = v.this.f143617d.f143639e;
            this.f143634d = v.this.f143619f;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.f143632b;
            v vVar = v.this;
            if (gVar == vVar.f143617d) {
                throw new NoSuchElementException();
            }
            if (vVar.f143619f != this.f143634d) {
                throw new ConcurrentModificationException();
            }
            this.f143632b = gVar.f143639e;
            this.f143633c = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f143632b != v.this.f143617d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f143633c;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            v.this.l(gVar, true);
            this.f143633c = null;
            this.f143634d = v.this.f143619f;
        }
    }

    public v() {
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
                    if ((gVarA.f143642h & length) == 0) {
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
                    if ((gVarA2.f143642h & length) == 0) {
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
        Arrays.fill(this.f143616c, (Object) null);
        this.f143618e = 0;
        this.f143619f++;
        g<K, V> gVar = this.f143617d;
        g<K, V> gVar2 = gVar.f143639e;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f143639e;
            gVar2.f143640f = null;
            gVar2.f143639e = null;
            gVar2 = gVar3;
        }
        gVar.f143640f = gVar;
        gVar.f143639e = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    public final void d() {
        g<K, V>[] gVarArrE = e(this.f143616c);
        this.f143616c = gVarArrE;
        this.f143620g = (gVarArrE.length / 2) + (gVarArrE.length / 4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        v<K, V>.d dVar = this.f143621h;
        if (dVar != null) {
            return dVar;
        }
        v<K, V>.d dVar2 = new d();
        this.f143621h = dVar2;
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
        Comparator<? super K> comparator = this.f143615b;
        g<K, V>[] gVarArr = this.f143616c;
        int iS = s(k10.hashCode());
        int length = (gVarArr.length - 1) & iS;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f143613j ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f143641g) : comparator.compare(k10, gVar2.f143641g);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f143637c : gVar2.f143638d;
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
        g<K, V> gVar4 = this.f143617d;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iS, gVar4, gVar4.f143640f);
            if (i10 < 0) {
                gVar5.f143637c = gVar;
            } else {
                gVar5.f143638d = gVar;
            }
            k(gVar5, true);
        } else {
            if (comparator == f143613j && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iS, gVar4, gVar4.f143640f);
            gVarArr[length] = gVar;
        }
        int i11 = this.f143618e;
        this.f143618e = i11 + 1;
        if (i11 > this.f143620g) {
            d();
        }
        this.f143619f++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarJ = j(obj);
        if (gVarJ != null) {
            return gVarJ.f143643i;
        }
        return null;
    }

    public g<K, V> h(Map.Entry<?, ?> entry) {
        g<K, V> gVarJ = j(entry.getKey());
        if (gVarJ == null || !f(gVarJ.f143643i, entry.getValue())) {
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
            g<K, V> gVar2 = gVar.f143637c;
            g<K, V> gVar3 = gVar.f143638d;
            int i10 = gVar2 != null ? gVar2.f143644j : 0;
            int i11 = gVar3 != null ? gVar3.f143644j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f143637c;
                g<K, V> gVar5 = gVar3.f143638d;
                int i13 = (gVar4 != null ? gVar4.f143644j : 0) - (gVar5 != null ? gVar5.f143644j : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    r(gVar3);
                }
                p(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f143637c;
                g<K, V> gVar7 = gVar2.f143638d;
                int i14 = (gVar6 != null ? gVar6.f143644j : 0) - (gVar7 != null ? gVar7.f143644j : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    p(gVar2);
                }
                r(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f143644j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f143644j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f143636b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        v<K, V>.e eVar = this.f143622i;
        if (eVar != null) {
            return eVar;
        }
        v<K, V>.e eVar2 = new e();
        this.f143622i = eVar2;
        return eVar2;
    }

    public void l(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f143640f;
            gVar2.f143639e = gVar.f143639e;
            gVar.f143639e.f143640f = gVar2;
            gVar.f143640f = null;
            gVar.f143639e = null;
        }
        g<K, V> gVar3 = gVar.f143637c;
        g<K, V> gVar4 = gVar.f143638d;
        g<K, V> gVar5 = gVar.f143636b;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                n(gVar, gVar3);
                gVar.f143637c = null;
            } else if (gVar4 != null) {
                n(gVar, gVar4);
                gVar.f143638d = null;
            } else {
                n(gVar, null);
            }
            k(gVar5, false);
            this.f143618e--;
            this.f143619f++;
            return;
        }
        g<K, V> gVarB = gVar3.f143644j > gVar4.f143644j ? gVar3.b() : gVar4.a();
        l(gVarB, false);
        g<K, V> gVar6 = gVar.f143637c;
        if (gVar6 != null) {
            i10 = gVar6.f143644j;
            gVarB.f143637c = gVar6;
            gVar6.f143636b = gVarB;
            gVar.f143637c = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f143638d;
        if (gVar7 != null) {
            i11 = gVar7.f143644j;
            gVarB.f143638d = gVar7;
            gVar7.f143636b = gVarB;
            gVar.f143638d = null;
        }
        gVarB.f143644j = Math.max(i10, i11) + 1;
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
        g<K, V> gVar3 = gVar.f143636b;
        gVar.f143636b = null;
        if (gVar2 != null) {
            gVar2.f143636b = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f143642h;
            g<K, V>[] gVarArr = this.f143616c;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f143637c == gVar) {
            gVar3.f143637c = gVar2;
        } else {
            gVar3.f143638d = gVar2;
        }
    }

    public final void p(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f143637c;
        g<K, V> gVar3 = gVar.f143638d;
        g<K, V> gVar4 = gVar3.f143637c;
        g<K, V> gVar5 = gVar3.f143638d;
        gVar.f143638d = gVar4;
        if (gVar4 != null) {
            gVar4.f143636b = gVar;
        }
        n(gVar, gVar3);
        gVar3.f143637c = gVar;
        gVar.f143636b = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f143644j : 0, gVar4 != null ? gVar4.f143644j : 0) + 1;
        gVar.f143644j = iMax;
        gVar3.f143644j = Math.max(iMax, gVar5 != null ? gVar5.f143644j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarG = g(k10, true);
        V v11 = gVarG.f143643i;
        gVarG.f143643i = v10;
        return v11;
    }

    public final void r(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f143637c;
        g<K, V> gVar3 = gVar.f143638d;
        g<K, V> gVar4 = gVar2.f143637c;
        g<K, V> gVar5 = gVar2.f143638d;
        gVar.f143637c = gVar5;
        if (gVar5 != null) {
            gVar5.f143636b = gVar;
        }
        n(gVar, gVar2);
        gVar2.f143638d = gVar;
        gVar.f143636b = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f143644j : 0, gVar5 != null ? gVar5.f143644j : 0) + 1;
        gVar.f143644j = iMax;
        gVar2.f143644j = Math.max(iMax, gVar4 != null ? gVar4.f143644j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarM = m(obj);
        if (gVarM != null) {
            return gVarM.f143643i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f143618e;
    }

    public final Object t() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public v(Comparator<? super K> comparator) {
        this.f143618e = 0;
        this.f143619f = 0;
        this.f143615b = comparator == null ? f143613j : comparator;
        this.f143617d = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f143616c = gVarArr;
        this.f143620g = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g<K, V> f143636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f143637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g<K, V> f143638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g<K, V> f143639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g<K, V> f143640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f143641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f143642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public V f143643i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f143644j;

        public g() {
            this.f143641g = null;
            this.f143642h = -1;
            this.f143640f = this;
            this.f143639e = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f143637c; gVar2 != null; gVar2 = gVar2.f143637c) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f143638d; gVar2 != null; gVar2 = gVar2.f143638d) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f143641g;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f143643i;
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
            return this.f143641g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f143643i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f143641g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f143643i;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f143643i;
            this.f143643i = v10;
            return v11;
        }

        public String toString() {
            return this.f143641g + C4235d4.j.f61456b + this.f143643i;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f143636b = gVar;
            this.f143641g = k10;
            this.f143642h = i10;
            this.f143644j = 1;
            this.f143639e = gVar2;
            this.f143640f = gVar3;
            gVar3.f143639e = this;
            gVar2.f143640f = this;
        }
    }
}
