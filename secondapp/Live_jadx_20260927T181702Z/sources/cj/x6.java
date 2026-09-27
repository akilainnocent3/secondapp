package cj;

import com.ironsource.C4235d4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@j4
@yi.b(emulated = true, serializable = true)
@qj.f("Use ImmutableMap.of or another implementation")
public abstract class x6<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f24649f = new Map.Entry[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f24650g = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @km.j
    @zq.a
    @rj.b
    public transient k7<Map.Entry<K, V>> f24651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @km.j
    @zq.a
    @rj.b
    public transient k7<K> f24652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @km.j
    @zq.a
    @rj.b
    public transient r6<V> f24653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @zq.a
    @rj.b
    public transient l7<K, V> f24654e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends gc<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gc f24655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x6 f24656c;

        public a(final x6 this$0, final gc val$entryIterator) {
            this.f24655b = val$entryIterator;
            this.f24656c = this$0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24655b.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f24655b.next()).getKey();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @qj.f
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.a
        public Comparator<? super V> f24657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f24658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f24661e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f24662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f24664c;

            public a(Object key, Object value1, Object value2) {
                this.f24662a = key;
                this.f24663b = value1;
                this.f24664c = value2;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f24662a + C4235d4.j.f61456b + this.f24663b + " and " + this.f24662a + C4235d4.j.f61456b + this.f24664c);
            }
        }

        public b() {
            this(4);
        }

        private void f(int minCapacity) {
            int i10 = minCapacity * 2;
            Object[] objArr = this.f24658b;
            if (i10 > objArr.length) {
                this.f24658b = Arrays.copyOf(objArr, r6.b.f(objArr.length, i10));
                this.f24660d = false;
            }
        }

        public static <V> void m(Object[] alternatingKeysAndValues, int size, Comparator<? super V> valueComparator) {
            Map.Entry[] entryArr = new Map.Entry[size];
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = i10 * 2;
                Object obj = alternatingKeysAndValues[i11];
                Objects.requireNonNull(obj);
                Object obj2 = alternatingKeysAndValues[i11 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i10] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, size, m9.n(valueComparator).J(n8.Q0()));
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = i12 * 2;
                alternatingKeysAndValues[i13] = entryArr[i12].getKey();
                alternatingKeysAndValues[i13 + 1] = entryArr[i12].getValue();
            }
        }

        public x6<K, V> a() {
            return d();
        }

        public final x6<K, V> b(boolean throwIfDuplicateKeys) {
            Object[] objArrG;
            a aVar;
            a aVar2;
            if (throwIfDuplicateKeys && (aVar2 = this.f24661e) != null) {
                throw aVar2.a();
            }
            int length = this.f24659c;
            if (this.f24657a == null) {
                objArrG = this.f24658b;
            } else {
                if (this.f24660d) {
                    this.f24658b = Arrays.copyOf(this.f24658b, length * 2);
                }
                objArrG = this.f24658b;
                if (!throwIfDuplicateKeys) {
                    objArrG = g(objArrG, this.f24659c);
                    if (objArrG.length < this.f24658b.length) {
                        length = objArrG.length >>> 1;
                    }
                }
                m(objArrG, length, this.f24657a);
            }
            this.f24660d = true;
            z9 z9VarT = z9.T(length, objArrG, this);
            if (!throwIfDuplicateKeys || (aVar = this.f24661e) == null) {
                return z9VarT;
            }
            throw aVar.a();
        }

        public x6<K, V> c() {
            return b(false);
        }

        public x6<K, V> d() {
            return b(true);
        }

        @qj.a
        public b<K, V> e(b<K, V> other) {
            zi.l0.E(other);
            f(this.f24659c + other.f24659c);
            System.arraycopy(other.f24658b, 0, this.f24658b, this.f24659c * 2, other.f24659c * 2);
            this.f24659c += other.f24659c;
            return this;
        }

        public final Object[] g(Object[] localAlternatingKeysAndValues, int size) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                Object obj = localAlternatingKeysAndValues[i10 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i10);
                }
            }
            if (bitSet.isEmpty()) {
                return localAlternatingKeysAndValues;
            }
            Object[] objArr = new Object[(size - bitSet.cardinality()) * 2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < size * 2) {
                if (bitSet.get(i11 >>> 1)) {
                    i11 += 2;
                } else {
                    int i13 = i12 + 1;
                    int i14 = i11 + 1;
                    Object obj2 = localAlternatingKeysAndValues[i11];
                    Objects.requireNonNull(obj2);
                    objArr[i12] = obj2;
                    i12 += 2;
                    i11 += 2;
                    Object obj3 = localAlternatingKeysAndValues[i14];
                    Objects.requireNonNull(obj3);
                    objArr[i13] = obj3;
                }
            }
            return objArr;
        }

        @qj.a
        public b<K, V> h(Comparator<? super V> valueComparator) {
            zi.l0.h0(this.f24657a == null, "valueComparator was already set");
            this.f24657a = (Comparator) zi.l0.F(valueComparator, "valueComparator");
            return this;
        }

        @qj.a
        public b<K, V> i(K key, V value) {
            f(this.f24659c + 1);
            j3.a(key, value);
            Object[] objArr = this.f24658b;
            int i10 = this.f24659c;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.f24659c = i10 + 1;
            return this;
        }

        @qj.a
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @qj.a
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof Collection) {
                f(this.f24659c + ((Collection) entries).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @qj.a
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }

        public b(int initialCapacity) {
            this.f24658b = new Object[initialCapacity * 2];
            this.f24659c = 0;
            this.f24660d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c<K, V> extends x6<K, V> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends y6<K, V> {
            public a() {
            }

            @Override // cj.y6
            public x6<K, V> L() {
                return c.this;
            }

            @Override // cj.k7, cj.r6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            /* JADX INFO: renamed from: l */
            public gc<Map.Entry<K, V>> iterator() {
                return c.this.R();
            }

            @Override // cj.y6, cj.k7, cj.r6
            @yi.c
            @yi.d
            public Object n() {
                return super.n();
            }
        }

        @Override // cj.x6
        @yi.c
        @yi.d
        public Object Q() {
            return super.Q();
        }

        public abstract gc<Map.Entry<K, V>> R();

        @Override // cj.x6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // cj.x6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // cj.x6
        public k7<Map.Entry<K, V>> n() {
            return new a();
        }

        @Override // cj.x6
        public k7<K> p() {
            return new z6(this);
        }

        @Override // cj.x6
        public r6<V> r() {
            return new a7(this);
        }

        @Override // cj.x6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d extends c<K, k7<V>> {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends gc<Map.Entry<K, k7<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f24667b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f24668c;

            /* JADX INFO: renamed from: cj.x6$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public class C0242a extends g<K, k7<V>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f24669b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f24670c;

                public C0242a(final a this$2, final Map.Entry val$backingEntry) {
                    this.f24669b = val$backingEntry;
                    this.f24670c = this$2;
                }

                @Override // cj.g, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f24669b.getKey();
                }

                @Override // cj.g, java.util.Map.Entry
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public k7<V> getValue() {
                    return k7.B(this.f24669b.getValue());
                }
            }

            public a(final d this$1, final Iterator val$backingIterator) {
                this.f24667b = val$backingIterator;
                this.f24668c = this$1;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, k7<V>> next() {
                return new C0242a(this, (Map.Entry) this.f24667b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f24667b.hasNext();
            }
        }

        public d() {
        }

        @Override // cj.x6.c, cj.x6
        @yi.c
        @yi.d
        public Object Q() {
            return super.Q();
        }

        @Override // cj.x6.c
        public gc<Map.Entry<K, k7<V>>> R() {
            return new a(this, x6.this.entrySet().iterator());
        }

        @Override // cj.x6, java.util.Map
        @zq.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public k7<V> get(@zq.a Object key) {
            Object obj = x6.this.get(key);
            if (obj == null) {
                return null;
            }
            return k7.B(obj);
        }

        @Override // cj.x6, java.util.Map
        public boolean containsKey(@zq.a Object key) {
            return x6.this.containsKey(key);
        }

        @Override // cj.x6, java.util.Map
        public int hashCode() {
            return x6.this.hashCode();
        }

        @Override // cj.x6.c, cj.x6
        public k7<K> p() {
            return x6.this.keySet();
        }

        @Override // java.util.Map
        public int size() {
            return x6.this.size();
        }

        @Override // cj.x6
        public boolean u() {
            return x6.this.u();
        }

        @Override // cj.x6
        public boolean v() {
            return x6.this.v();
        }

        public /* synthetic */ d(x6 x6Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.d
    public static class e<K, V> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f24671d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f24672e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f24673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f24674c;

        public e(x6<K, V> map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            gc<Map.Entry<K, V>> it = map.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f24673b = objArr;
            this.f24674c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object d() {
            Object[] objArr = (Object[]) this.f24673b;
            Object[] objArr2 = (Object[]) this.f24674c;
            b<K, V> bVarE = e(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                bVarE.i(objArr[i10], objArr2[i10]);
            }
            return bVarE.d();
        }

        public b<K, V> e(int size) {
            return new b<>(size);
        }

        public final Object g() {
            Object obj = this.f24673b;
            if (!(obj instanceof k7)) {
                return d();
            }
            k7 k7Var = (k7) obj;
            r6 r6Var = (r6) this.f24674c;
            b<K, V> bVarE = e(k7Var.size());
            gc it = k7Var.iterator();
            gc it2 = r6Var.iterator();
            while (it.hasNext()) {
                bVarE.i(it.next(), it2.next());
            }
            return bVarE.d();
        }
    }

    public static <K, V> x6<K, V> A(K k10, V v10, K k11, V v11) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        return z9.R(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> x6<K, V> B(K k10, V v10, K k11, V v11, K k12, V v12) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        return z9.R(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> x6<K, V> C(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        return z9.R(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> x6<K, V> D(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        return z9.R(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> x6<K, V> E(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        j3.a(k15, v15);
        return z9.R(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> x6<K, V> H(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        j3.a(k15, v15);
        j3.a(k16, v16);
        return z9.R(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> x6<K, V> I(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        j3.a(k15, v15);
        j3.a(k16, v16);
        j3.a(k17, v17);
        return z9.R(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }

    public static <K, V> x6<K, V> J(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        j3.a(k15, v15);
        j3.a(k16, v16);
        j3.a(k17, v17);
        j3.a(k18, v18);
        return z9.R(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> x6<K, V> K(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        j3.a(k10, v10);
        j3.a(k11, v11);
        j3.a(k12, v12);
        j3.a(k13, v13);
        j3.a(k14, v14);
        j3.a(k15, v15);
        j3.a(k16, v16);
        j3.a(k17, v17);
        j3.a(k18, v18);
        j3.a(k19, v19);
        return z9.R(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }

    @SafeVarargs
    public static <K, V> x6<K, V> L(Map.Entry<? extends K, ? extends V>... entries) {
        return l(Arrays.asList(entries));
    }

    @yi.d
    private void M(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @n6
    public static <T, K, V> Collector<T, ?, x6<K, V>> N(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return h3.N(keyFunction, valueFunction);
    }

    @n6
    public static <T, K, V> Collector<T, ?, x6<K, V>> O(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return h3.O(keyFunction, valueFunction, mergeFunction);
    }

    public static <K, V> b<K, V> g() {
        return new b<>();
    }

    public static <K, V> b<K, V> h(int expectedSize) {
        j3.b(expectedSize, "expectedSize");
        return new b<>(expectedSize);
    }

    public static void j(boolean safe, String conflictDescription, Object entry1, Object entry2) {
        if (!safe) {
            throw k(conflictDescription, entry1, entry2);
        }
    }

    public static IllegalArgumentException k(String conflictDescription, Object entry1, Object entry2) {
        return new IllegalArgumentException("Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
    }

    public static <K, V> x6<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        b bVar = new b(entries instanceof Collection ? ((Collection) entries).size() : 4);
        bVar.k(entries);
        return bVar.a();
    }

    public static <K, V> x6<K, V> m(Map<? extends K, ? extends V> map) {
        if ((map instanceof x6) && !(map instanceof SortedMap)) {
            x6<K, V> x6Var = (x6) map;
            if (!x6Var.v()) {
                return x6Var;
            }
        }
        return l(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> s(K key, V value) {
        j3.a(key, value);
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    public static <K, V> x6<K, V> y() {
        return (x6<K, V>) z9.f24803p;
    }

    public static <K, V> x6<K, V> z(K k10, V v10) {
        j3.a(k10, v10);
        return z9.R(1, new Object[]{k10, v10});
    }

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public r6<V> values() {
        r6<V> r6Var = this.f24653d;
        if (r6Var != null) {
            return r6Var;
        }
        r6<V> r6VarR = r();
        this.f24653d = r6VarR;
        return r6VarR;
    }

    @yi.d
    public Object Q() {
        return new e(this);
    }

    @Override // java.util.Map
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@zq.a Object key) {
        return get(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@zq.a Object value) {
        return values().contains(value);
    }

    public l7<K, V> d() {
        if (isEmpty()) {
            return l7.d0();
        }
        l7<K, V> l7Var = this.f24654e;
        if (l7Var != null) {
            return l7Var;
        }
        l7<K, V> l7Var2 = new l7<>(new d(this, null), size(), null);
        this.f24654e = l7Var2;
        return l7Var2;
    }

    @Override // java.util.Map
    public boolean equals(@zq.a Object object) {
        return n8.w(this, object);
    }

    @Override // java.util.Map
    @zq.a
    public abstract V get(@zq.a Object key);

    @Override // java.util.Map
    @zq.a
    public final V getOrDefault(@zq.a Object key, @zq.a V defaultValue) {
        V v10 = get(key);
        return v10 != null ? v10 : defaultValue;
    }

    @Override // java.util.Map
    public int hashCode() {
        return na.k(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract k7<Map.Entry<K, V>> n();

    public abstract k7<K> p();

    @Override // java.util.Map
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    @zq.a
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public abstract r6<V> r();

    @Override // java.util.Map
    @Deprecated
    @qj.a
    @zq.a
    public final V remove(@zq.a Object o10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public k7<Map.Entry<K, V>> entrySet() {
        k7<Map.Entry<K, V>> k7Var = this.f24651b;
        if (k7Var != null) {
            return k7Var;
        }
        k7<Map.Entry<K, V>> k7VarN = n();
        this.f24651b = k7VarN;
        return k7VarN;
    }

    public String toString() {
        return n8.y0(this);
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    public gc<K> w() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public k7<K> keySet() {
        k7<K> k7Var = this.f24652c;
        if (k7Var != null) {
            return k7Var;
        }
        k7<K> k7VarP = p();
        this.f24652c = k7VarP;
        return k7VarP;
    }
}
