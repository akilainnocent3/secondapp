package gr;

import com.ironsource.G5;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
public final class d<K, V> implements Map<K, V>, Serializable, es.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l
    public static final a f87320o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87321p = -1640531527;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f87322q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f87323r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f87324s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l
    public static final d f87325t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public K[] f87326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public V[] f87327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public int[] f87328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public int[] f87329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f87332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f87333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f87334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @m
    public gr.f<K> f87335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @m
    public g<V> f87336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @m
    public gr.e<K, V> f87337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f87338n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(u.u(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        @l
        public final d e() {
            return d.f87325t;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<K, V> extends C0859d<K, V> implements Iterator<Map.Entry<K, V>>, es.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l d<K, V> map) {
            super(map);
            m0.p(map, "map");
        }

        @Override // java.util.Iterator
        @l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (b() >= e().f87331g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            c<K, V> cVar = new c<>(e(), d());
            f();
            return cVar;
        }

        public final void j(@l StringBuilder sb2) {
            m0.p(sb2, "sb");
            if (b() >= e().f87331g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = e().f87326b[d()];
            if (obj == e()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(G5.T);
            Object[] objArr = e().f87327c;
            m0.m(objArr);
            Object obj2 = objArr[d()];
            if (obj2 == e()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        public final int k() {
            if (b() >= e().f87331g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = e().f87326b[d()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = e().f87327c;
            m0.m(objArr);
            Object obj2 = objArr[d()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<K, V> implements Map.Entry<K, V>, es.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public final d<K, V> f87339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f87340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f87341d;

        public c(@l d<K, V> map, int i10) {
            m0.p(map, "map");
            this.f87339b = map;
            this.f87340c = i10;
            this.f87341d = map.f87333i;
        }

        private final void a() {
            if (this.f87339b.f87333i != this.f87341d) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@m Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m0.g(entry.getKey(), getKey()) && m0.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) this.f87339b.f87326b[this.f87340c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = this.f87339b.f87327c;
            m0.m(objArr);
            return (V) objArr[this.f87340c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            this.f87339b.p();
            Object[] objArrM = this.f87339b.m();
            int i10 = this.f87340c;
            V v11 = (V) objArrM[i10];
            objArrM[i10] = v10;
            return v11;
        }

        @l
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(G5.T);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: gr.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
    public static class C0859d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public final d<K, V> f87342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f87343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f87344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f87345e;

        public C0859d(@l d<K, V> map) {
            m0.p(map, "map");
            this.f87342b = map;
            this.f87344d = -1;
            this.f87345e = map.f87333i;
            f();
        }

        public final void a() {
            if (this.f87342b.f87333i != this.f87345e) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f87343c;
        }

        public final int d() {
            return this.f87344d;
        }

        @l
        public final d<K, V> e() {
            return this.f87342b;
        }

        public final void f() {
            while (this.f87343c < this.f87342b.f87331g) {
                int[] iArr = this.f87342b.f87328d;
                int i10 = this.f87343c;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f87343c = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f87343c = i10;
        }

        public final void h(int i10) {
            this.f87344d = i10;
        }

        public final boolean hasNext() {
            return this.f87343c < this.f87342b.f87331g;
        }

        public final void remove() {
            a();
            if (this.f87344d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f87342b.p();
            this.f87342b.U(this.f87344d);
            this.f87344d = -1;
            this.f87345e = this.f87342b.f87333i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<K, V> extends C0859d<K, V> implements Iterator<K>, es.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@l d<K, V> map) {
            super(map);
            m0.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (b() >= e().f87331g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            K k10 = (K) e().f87326b[d()];
            f();
            return k10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f<K, V> extends C0859d<K, V> implements Iterator<V>, es.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@l d<K, V> map) {
            super(map);
            m0.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (b() >= e().f87331g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object[] objArr = e().f87327c;
            m0.m(objArr);
            V v10 = (V) objArr[d()];
            f();
            return v10;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f87338n = true;
        f87325t = dVar;
    }

    public d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f87326b = kArr;
        this.f87327c = vArr;
        this.f87328d = iArr;
        this.f87329e = iArr2;
        this.f87330f = i10;
        this.f87331g = i11;
        this.f87332h = f87320o.d(C());
    }

    private final void P(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final void Q() {
        this.f87333i++;
    }

    private final Object a0() throws NotSerializableException {
        if (this.f87338n) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > A()) {
            int iE = fr.d.Companion.e(A(), i10);
            this.f87326b = (K[]) gr.c.e(this.f87326b, iE);
            V[] vArr = this.f87327c;
            this.f87327c = vArr != null ? (V[]) gr.c.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f87328d, iE);
            m0.o(iArrCopyOf, "copyOf(...)");
            this.f87328d = iArrCopyOf;
            int iC = f87320o.c(iE);
            if (iC > C()) {
                R(iC);
            }
        }
    }

    private final void w(int i10) {
        if (Y(i10)) {
            r(true);
        } else {
            v(this.f87331g + i10);
        }
    }

    public final int A() {
        return this.f87326b.length;
    }

    @l
    public Set<Map.Entry<K, V>> B() {
        gr.e<K, V> eVar = this.f87337m;
        if (eVar != null) {
            return eVar;
        }
        gr.e<K, V> eVar2 = new gr.e<>(this);
        this.f87337m = eVar2;
        return eVar2;
    }

    public final int C() {
        return this.f87329e.length;
    }

    @l
    public Set<K> D() {
        gr.f<K> fVar = this.f87335k;
        if (fVar != null) {
            return fVar;
        }
        gr.f<K> fVar2 = new gr.f<>(this);
        this.f87335k = fVar2;
        return fVar2;
    }

    public int E() {
        return this.f87334j;
    }

    @l
    public Collection<V> H() {
        g<V> gVar = this.f87336l;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.f87336l = gVar2;
        return gVar2;
    }

    public final int J(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f87332h;
    }

    public final boolean K() {
        return this.f87338n;
    }

    @l
    public final e<K, V> L() {
        return new e<>(this);
    }

    public final boolean M(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (N(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean N(Map.Entry<? extends K, ? extends V> entry) {
        int iL = l(entry.getKey());
        V[] vArrM = m();
        if (iL >= 0) {
            vArrM[iL] = entry.getValue();
            return true;
        }
        int i10 = (-iL) - 1;
        if (m0.g(entry.getValue(), vArrM[i10])) {
            return false;
        }
        vArrM[i10] = entry.getValue();
        return true;
    }

    public final boolean O(int i10) {
        int iJ = J(this.f87326b[i10]);
        int i11 = this.f87330f;
        while (true) {
            int[] iArr = this.f87329e;
            if (iArr[iJ] == 0) {
                iArr[iJ] = i10 + 1;
                this.f87328d[i10] = iJ;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iJ = iJ == 0 ? C() - 1 : iJ - 1;
        }
    }

    public final void R(int i10) {
        Q();
        int i11 = 0;
        if (this.f87331g > size()) {
            r(false);
        }
        this.f87329e = new int[i10];
        this.f87332h = f87320o.d(i10);
        while (i11 < this.f87331g) {
            int i12 = i11 + 1;
            if (!O(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    public final boolean T(@l Map.Entry<? extends K, ? extends V> entry) {
        m0.p(entry, "entry");
        p();
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        V[] vArr = this.f87327c;
        m0.m(vArr);
        if (!m0.g(vArr[iY], entry.getValue())) {
            return false;
        }
        U(iY);
        return true;
    }

    public final void U(int i10) {
        gr.c.f(this.f87326b, i10);
        V[] vArr = this.f87327c;
        if (vArr != null) {
            gr.c.f(vArr, i10);
        }
        V(this.f87328d[i10]);
        this.f87328d[i10] = -1;
        this.f87334j = size() - 1;
        Q();
    }

    public final void V(int i10) {
        int iB = u.B(this.f87330f * 2, C() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? C() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f87330f) {
                this.f87329e[i12] = 0;
                return;
            }
            int[] iArr = this.f87329e;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((J(this.f87326b[i14]) - i10) & (C() - 1)) >= i11) {
                    this.f87329e[i12] = i13;
                    this.f87328d[i14] = i12;
                }
                iB--;
            }
            i12 = i10;
            i11 = 0;
            iB--;
        } while (iB >= 0);
        this.f87329e[i12] = -1;
    }

    public final boolean W(K k10) {
        p();
        int iY = y(k10);
        if (iY < 0) {
            return false;
        }
        U(iY);
        return true;
    }

    public final boolean X(V v10) {
        p();
        int iZ = z(v10);
        if (iZ < 0) {
            return false;
        }
        U(iZ);
        return true;
    }

    public final boolean Y(int i10) {
        int iA = A();
        int i11 = this.f87331g;
        int i12 = iA - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= A() / 4;
    }

    @l
    public final f<K, V> Z() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        p();
        int i10 = this.f87331g - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f87328d;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f87329e[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        gr.c.g(this.f87326b, 0, this.f87331g);
        V[] vArr = this.f87327c;
        if (vArr != null) {
            gr.c.g(vArr, 0, this.f87331g);
        }
        this.f87334j = 0;
        this.f87331g = 0;
        Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return y(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(@m Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && u((Map) obj);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V get(Object obj) {
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        V[] vArr = this.f87327c;
        m0.m(vArr);
        return vArr[iY];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarX = x();
        int iK = 0;
        while (bVarX.hasNext()) {
            iK += bVarX.k();
        }
        return iK;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    public final int l(K k10) {
        p();
        while (true) {
            int iJ = J(k10);
            int iB = u.B(this.f87330f * 2, C() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f87329e[iJ];
                if (i11 <= 0) {
                    if (this.f87331g >= A()) {
                        w(1);
                        break;
                    }
                    int i12 = this.f87331g;
                    int i13 = i12 + 1;
                    this.f87331g = i13;
                    this.f87326b[i12] = k10;
                    this.f87328d[i12] = iJ;
                    this.f87329e[iJ] = i13;
                    this.f87334j = size() + 1;
                    Q();
                    if (i10 > this.f87330f) {
                        this.f87330f = i10;
                    }
                    return i12;
                }
                if (m0.g(this.f87326b[i11 - 1], k10)) {
                    return -i11;
                }
                i10++;
                if (i10 > iB) {
                    R(C() * 2);
                    break;
                }
                iJ = iJ == 0 ? C() - 1 : iJ - 1;
            }
        }
    }

    public final V[] m() {
        V[] vArr = this.f87327c;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) gr.c.d(A());
        this.f87327c = vArr2;
        return vArr2;
    }

    @l
    public final Map<K, V> n() {
        p();
        this.f87338n = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f87325t;
        m0.n(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void p() {
        if (this.f87338n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    @m
    public V put(K k10, V v10) {
        p();
        int iL = l(k10);
        V[] vArrM = m();
        if (iL >= 0) {
            vArrM[iL] = v10;
            return null;
        }
        int i10 = (-iL) - 1;
        V v11 = vArrM[i10];
        vArrM[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(@l Map<? extends K, ? extends V> from) {
        m0.p(from, "from");
        p();
        M(from.entrySet());
    }

    public final void r(boolean z10) {
        int i10;
        V[] vArr = this.f87327c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f87331g;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f87328d;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f87326b;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f87329e[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        gr.c.g(this.f87326b, i12, i10);
        if (vArr != null) {
            gr.c.g(vArr, i12, this.f87331g);
        }
        this.f87331g = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V remove(Object obj) {
        p();
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        V[] vArr = this.f87327c;
        m0.m(vArr);
        V v10 = vArr[iY];
        U(iY);
        return v10;
    }

    public final boolean s(@l Collection<?> m10) {
        m0.p(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    public final boolean t(@l Map.Entry<? extends K, ? extends V> entry) {
        m0.p(entry, "entry");
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        V[] vArr = this.f87327c;
        m0.m(vArr);
        return m0.g(vArr[iY], entry.getValue());
    }

    @l
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarX = x();
        int i10 = 0;
        while (bVarX.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarX.j(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        m0.o(string, "toString(...)");
        return string;
    }

    public final boolean u(Map<?, ?> map) {
        return size() == map.size() && s(map.entrySet());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return H();
    }

    @l
    public final b<K, V> x() {
        return new b<>(this);
    }

    public final int y(K k10) {
        int iJ = J(k10);
        int i10 = this.f87330f;
        while (true) {
            int i11 = this.f87329e[iJ];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (m0.g(this.f87326b[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? C() - 1 : iJ - 1;
        }
    }

    public final int z(V v10) {
        int i10 = this.f87331g;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f87328d[i10] >= 0) {
                V[] vArr = this.f87327c;
                m0.m(vArr);
                if (m0.g(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(gr.c.d(i10), null, new int[i10], new int[f87320o.c(i10)], 2, 0);
    }
}
