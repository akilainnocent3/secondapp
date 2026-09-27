package cj;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true, serializable = true)
@j4
public class w6<K, V> extends b7<K, V> implements i8<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @yi.c
    @yi.d
    public static final long f24635k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @km.j
    @zq.a
    @rj.b
    public transient w6<V, K> f24636j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<K, V> extends b7.c<K, V> {
        public a() {
        }

        @Override // cj.b7.c
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public w6<K, V> a() {
            return (w6) super.a();
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(b7.c<K, V> other) {
            super.b(other);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(int expectedValuesPerKey) {
            super.e(expectedValuesPerKey);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Comparator<? super K> keyComparator) {
            super.g(keyComparator);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> valueComparator) {
            super.h(valueComparator);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K key, V value) {
            super.i(key, value);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(w8<? extends K, ? extends V> multimap) {
            super.k(multimap);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.l(entries);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<K, V> m(K key, Iterable<? extends V> values) {
            super.m(key, values);
            return this;
        }

        @Override // cj.b7.c
        @qj.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a<K, V> n(K key, V... values) {
            super.n(key, values);
            return this;
        }

        public a(int expectedKeys) {
            super(expectedKeys);
        }
    }

    public w6(x6<K, v6<V>> map, int size) {
        super(map, size);
    }

    public static <K, V> a<K, V> Q() {
        return new a<>();
    }

    public static <K, V> a<K, V> R(int expectedKeys) {
        j3.b(expectedKeys, "expectedKeys");
        return new a<>(expectedKeys);
    }

    public static <K, V> w6<K, V> S(w8<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return a0();
        }
        if (multimap instanceof w6) {
            w6<K, V> w6Var = (w6) multimap;
            if (!w6Var.B()) {
                return w6Var;
            }
        }
        return W(multimap.d().entrySet(), null);
    }

    public static <K, V> w6<K, V> T(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a().l(entries).a();
    }

    @n6
    public static <T, K, V> Collector<T, ?, w6<K, V>> U(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        return h3.D(keyFunction, valuesFunction);
    }

    public static <K, V> w6<K, V> V(Collection<? extends Map.Entry<K, r6.b<V>>> mapEntries, @zq.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return a0();
        }
        x6.b bVar = new x6.b(mapEntries.size());
        int size = 0;
        for (Map.Entry<K, r6.b<V>> entry : mapEntries) {
            K key = entry.getKey();
            v6.a aVar = (v6.a) entry.getValue();
            v6 v6VarE = valueComparator == null ? aVar.e() : aVar.o(valueComparator);
            bVar.i(key, v6VarE);
            size += v6VarE.size();
        }
        return new w6<>(bVar.d(), size);
    }

    public static <K, V> w6<K, V> W(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @zq.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return a0();
        }
        x6.b bVar = new x6.b(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            v6 v6VarU = valueComparator == null ? v6.u(value) : v6.R(valueComparator, value);
            if (!v6VarU.isEmpty()) {
                bVar.i(key, v6VarU);
                size += v6VarU.size();
            }
        }
        return new w6<>(bVar.d(), size);
    }

    public static <K, V> w6<K, V> a0() {
        return l4.f24097l;
    }

    public static <K, V> w6<K, V> b0(K k10, V v10) {
        a aVarQ = Q();
        aVarQ.i(k10, v10);
        return aVarQ.a();
    }

    public static <K, V> w6<K, V> c0(K k10, V v10, K k11, V v11) {
        a aVarQ = Q();
        aVarQ.i(k10, v10);
        aVarQ.i(k11, v11);
        return aVarQ.a();
    }

    public static <K, V> w6<K, V> d0(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarQ = Q();
        aVarQ.i(k10, v10);
        aVarQ.i(k11, v11);
        aVarQ.i(k12, v12);
        return aVarQ.a();
    }

    public static <K, V> w6<K, V> e0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarQ = Q();
        aVarQ.i(k10, v10);
        aVarQ.i(k11, v11);
        aVarQ.i(k12, v12);
        aVarQ.i(k13, v13);
        return aVarQ.a();
    }

    public static <K, V> w6<K, V> f0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarQ = Q();
        aVarQ.i(k10, v10);
        aVarQ.i(k11, v11);
        aVarQ.i(k12, v12);
        aVarQ.i(k13, v13);
        aVarQ.i(k14, v14);
        return aVarQ.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yi.c
    @yi.d
    private void g0(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i10 = stream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid key count " + i10);
        }
        x6.b bVarG = x6.g();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            int i13 = stream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i13);
            }
            v6.a aVarQ = v6.q();
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                aVarQ.g(object2);
            }
            bVarG.i(object, aVarQ.e());
            i11 += i13;
        }
        try {
            b7.e.f23419a.b(this, bVarG.d());
            b7.e.f23420b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @n6
    public static <T, K, V> Collector<T, ?, w6<K, V>> j0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return h3.M(keyFunction, valueFunction);
    }

    @yi.c
    @yi.d
    private void k0(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        ka.j(this, stream);
    }

    @Override // cj.b7
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public v6<V> get(K key) {
        v6<V> v6Var = (v6) this.f23404g.get(key);
        return v6Var == null ? v6.z() : v6Var;
    }

    @Override // cj.b7
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public w6<V, K> A() {
        w6<V, K> w6Var = this.f24636j;
        if (w6Var != null) {
            return w6Var;
        }
        w6<V, K> w6VarZ = Z();
        this.f24636j = w6VarZ;
        return w6VarZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w6<V, K> Z() {
        a aVarQ = Q();
        gc it = m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarQ.i(entry.getValue(), entry.getKey());
        }
        w6<V, K> w6VarA = aVarQ.a();
        w6VarA.f24636j = this;
        return w6VarA;
    }

    @Override // cj.b7, cj.w8
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final v6<V> a(@zq.a Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // cj.b7, cj.h, cj.w8
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final v6<V> b(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }
}
