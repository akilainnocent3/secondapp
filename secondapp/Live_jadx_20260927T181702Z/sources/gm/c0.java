package gm;

import com.ironsource.C4235d4;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<Comparable> f87130j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ boolean f87131k = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<? super K> f87132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<K, V> f87134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e<K, V> f87137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0<K, V>.b f87138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0<K, V>.c f87139i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends c0<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && c0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = c0.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            c0.this.g(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.f87135e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c extends AbstractSet<K> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends c0<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f87153g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return c0.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.f87135e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f87144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f87145c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f87146d;

        public d() {
            this.f87144b = c0.this.f87137g.f87151e;
            this.f87146d = c0.this.f87136f;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f87144b;
            c0 c0Var = c0.this;
            if (eVar == c0Var.f87137g) {
                throw new NoSuchElementException();
            }
            if (c0Var.f87136f != this.f87146d) {
                throw new ConcurrentModificationException();
            }
            this.f87144b = eVar.f87151e;
            this.f87145c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f87144b != c0.this.f87137g;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f87145c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            c0.this.g(eVar, true);
            this.f87145c = null;
            this.f87146d = c0.this.f87136f;
        }
    }

    public c0() {
        this(f87130j, true);
    }

    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f87132b;
        e<K, V> eVar2 = this.f87134d;
        if (eVar2 != null) {
            Comparable comparable = comparator == f87130j ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f87153g) : comparator.compare(k10, eVar2.f87153g);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f87149c : eVar2.f87150d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e<K, V> eVar5 = this.f87137g;
        if (eVar4 != null) {
            eVar = new e<>(this.f87133c, eVar4, k10, eVar5, eVar5.f87152f);
            if (iCompareTo < 0) {
                eVar4.f87149c = eVar;
            } else {
                eVar4.f87150d = eVar;
            }
            f(eVar4, true);
        } else {
            if (comparator == f87130j && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f87133c, eVar4, k10, eVar5, eVar5.f87152f);
            this.f87134d = eVar;
        }
        this.f87135e++;
        this.f87136f++;
        return eVar;
    }

    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f87155i, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f87134d = null;
        this.f87135e = 0;
        this.f87136f++;
        e<K, V> eVar = this.f87137g;
        eVar.f87152f = eVar;
        eVar.f87151e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void e(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        c0<K, V>.b bVar = this.f87138h;
        if (bVar != null) {
            return bVar;
        }
        c0<K, V>.b bVar2 = new b();
        this.f87138h = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f87149c;
            e<K, V> eVar3 = eVar.f87150d;
            int i10 = eVar2 != null ? eVar2.f87156j : 0;
            int i11 = eVar3 != null ? eVar3.f87156j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f87149c;
                e<K, V> eVar5 = eVar3.f87150d;
                int i13 = (eVar4 != null ? eVar4.f87156j : 0) - (eVar5 != null ? eVar5.f87156j : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    k(eVar);
                } else {
                    l(eVar3);
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f87149c;
                e<K, V> eVar7 = eVar2.f87150d;
                int i14 = (eVar6 != null ? eVar6.f87156j : 0) - (eVar7 != null ? eVar7.f87156j : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    l(eVar);
                } else {
                    k(eVar2);
                    l(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f87156j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f87156j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f87148b;
        }
    }

    public void g(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f87152f;
            eVar2.f87151e = eVar.f87151e;
            eVar.f87151e.f87152f = eVar2;
        }
        e<K, V> eVar3 = eVar.f87149c;
        e<K, V> eVar4 = eVar.f87150d;
        e<K, V> eVar5 = eVar.f87148b;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                j(eVar, eVar3);
                eVar.f87149c = null;
            } else if (eVar4 != null) {
                j(eVar, eVar4);
                eVar.f87150d = null;
            } else {
                j(eVar, null);
            }
            f(eVar5, false);
            this.f87135e--;
            this.f87136f++;
            return;
        }
        e<K, V> eVarB = eVar3.f87156j > eVar4.f87156j ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e<K, V> eVar6 = eVar.f87149c;
        if (eVar6 != null) {
            i10 = eVar6.f87156j;
            eVarB.f87149c = eVar6;
            eVar6.f87148b = eVarB;
            eVar.f87149c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f87150d;
        if (eVar7 != null) {
            i11 = eVar7.f87156j;
            eVarB.f87150d = eVar7;
            eVar7.f87148b = eVarB;
            eVar.f87150d = null;
        }
        eVarB.f87156j = Math.max(i10, i11) + 1;
        j(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f87155i;
        }
        return null;
    }

    public e<K, V> h(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            g(eVarD, true);
        }
        return eVarD;
    }

    public final void j(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f87148b;
        eVar.f87148b = null;
        if (eVar2 != null) {
            eVar2.f87148b = eVar3;
        }
        if (eVar3 == null) {
            this.f87134d = eVar2;
        } else if (eVar3.f87149c == eVar) {
            eVar3.f87149c = eVar2;
        } else {
            eVar3.f87150d = eVar2;
        }
    }

    public final void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f87149c;
        e<K, V> eVar3 = eVar.f87150d;
        e<K, V> eVar4 = eVar3.f87149c;
        e<K, V> eVar5 = eVar3.f87150d;
        eVar.f87150d = eVar4;
        if (eVar4 != null) {
            eVar4.f87148b = eVar;
        }
        j(eVar, eVar3);
        eVar3.f87149c = eVar;
        eVar.f87148b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f87156j : 0, eVar4 != null ? eVar4.f87156j : 0) + 1;
        eVar.f87156j = iMax;
        eVar3.f87156j = Math.max(iMax, eVar5 != null ? eVar5.f87156j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        c0<K, V>.c cVar = this.f87139i;
        if (cVar != null) {
            return cVar;
        }
        c0<K, V>.c cVar2 = new c();
        this.f87139i = cVar2;
        return cVar2;
    }

    public final void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f87149c;
        e<K, V> eVar3 = eVar.f87150d;
        e<K, V> eVar4 = eVar2.f87149c;
        e<K, V> eVar5 = eVar2.f87150d;
        eVar.f87149c = eVar5;
        if (eVar5 != null) {
            eVar5.f87148b = eVar;
        }
        j(eVar, eVar2);
        eVar2.f87150d = eVar;
        eVar.f87148b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f87156j : 0, eVar5 != null ? eVar5.f87156j : 0) + 1;
        eVar.f87156j = iMax;
        eVar2.f87156j = Math.max(iMax, eVar4 != null ? eVar4.f87156j : 0) + 1;
    }

    public final Object m() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @qj.a
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f87133c) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v11 = eVarB.f87155i;
        eVarB.f87155i = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarH = h(obj);
        if (eVarH != null) {
            return eVarH.f87155i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f87135e;
    }

    public c0(boolean z10) {
        this(f87130j, z10);
    }

    public c0(Comparator<? super K> comparator, boolean z10) {
        this.f87135e = 0;
        this.f87136f = 0;
        this.f87132b = comparator == null ? f87130j : comparator;
        this.f87133c = z10;
        this.f87137g = new e<>(z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f87148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f87149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f87150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f87151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f87152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f87153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f87154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public V f87155i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f87156j;

        public e(boolean z10) {
            this.f87153g = null;
            this.f87154h = z10;
            this.f87152f = this;
            this.f87151e = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f87149c; eVar2 != null; eVar2 = eVar2.f87149c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f87150d; eVar2 != null; eVar2 = eVar2.f87150d) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f87153g;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f87155i;
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
            return this.f87153g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f87155i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f87153g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f87155i;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f87154h) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f87155i;
            this.f87155i = v10;
            return v11;
        }

        public String toString() {
            return this.f87153g + C4235d4.j.f61456b + this.f87155i;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f87148b = eVar;
            this.f87153g = k10;
            this.f87154h = z10;
            this.f87156j = 1;
            this.f87151e = eVar2;
            this.f87152f = eVar3;
            eVar3.f87151e = this;
            eVar2.f87152f = this;
        }
    }
}
