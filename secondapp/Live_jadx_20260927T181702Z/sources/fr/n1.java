package fr;

import dr.w2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,814:1\n413#1:824\n424#1:829\n521#1,6:834\n546#1,6:840\n1#2:815\n1252#3,4:816\n1252#3,4:820\n1252#3,4:825\n1252#3,4:830\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n463#1:824\n478#1:829\n536#1:834,6\n561#1:840,6\n413#1:816,4\n424#1:820,4\n463#1:825,4\n478#1:830,4\n*E\n"})
public class n1 extends m1 {
    @oy.l
    public static final <K, V> Map<K, V> A(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @ur.f
    public static final <K, V> void A0(Map<K, V> map, K k10, V v10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        map.put(k10, v10);
    }

    @oy.l
    public static final <K, V> Map<K, V> B(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @oy.l
    public static <K, V> Map<K, V> B0(@oy.l Iterable<? extends dr.z0<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k0(C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return C0(iterable, new LinkedHashMap(m1.j(collection.size())));
        }
        return m1.k((dr.z0) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    @oy.l
    public static final <K, V> Map<K, V> C(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @oy.l
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@oy.l Iterable<? extends dr.z0<? extends K, ? extends V>> iterable, @oy.l M destination) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @oy.l
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@oy.l Map<? extends K, ? extends V> map, @oy.l M destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static <K, V> Map<K, V> D0(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? J0(map) : m1.o(map);
        }
        return z();
    }

    @oy.l
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@oy.l Map<? extends K, ? extends V> map, @oy.l M destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@oy.l Map<? extends K, ? extends V> map, @oy.l M destination) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @oy.l
    public static final <K, V> Map<K, V> F(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @oy.l
    public static <K, V> Map<K, V> F0(@oy.l zu.m<? extends dr.z0<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @ur.f
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.get(k10);
    }

    @oy.l
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@oy.l zu.m<? extends dr.z0<? extends K, ? extends V>> mVar, @oy.l M destination) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        x0(destination, mVar);
        return destination;
    }

    @ur.f
    public static final <K, V> V H(Map<K, ? extends V> map, K k10, ds.a<? extends V> defaultValue) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return v10 == null ? defaultValue.invoke() : v10;
    }

    @oy.l
    public static final <K, V> Map<K, V> H0(@oy.l dr.z0<? extends K, ? extends V>[] z0VarArr) {
        kotlin.jvm.internal.m0.p(z0VarArr, "<this>");
        int length = z0VarArr.length;
        if (length != 0) {
            return length != 1 ? I0(z0VarArr, new LinkedHashMap(m1.j(z0VarArr.length))) : m1.k(z0VarArr[0]);
        }
        return z();
    }

    public static final <K, V> V I(@oy.l Map<K, ? extends V> map, K k10, @oy.l ds.a<? extends V> defaultValue) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : defaultValue.invoke();
    }

    @oy.l
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@oy.l dr.z0<? extends K, ? extends V>[] z0VarArr, @oy.l M destination) {
        kotlin.jvm.internal.m0.p(z0VarArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        y0(destination, z0VarArr);
        return destination;
    }

    public static final <K, V> V J(@oy.l Map<K, V> map, K k10, @oy.l ds.a<? extends V> defaultValue) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        map.put(k10, vInvoke);
        return vInvoke;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static <K, V> Map<K, V> J0(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @dr.l1(version = "1.1")
    public static <K, V> V K(@oy.l Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return (V) l1.a(map, k10);
    }

    @ur.f
    public static final <K, V> dr.z0<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.m0.p(entry, "<this>");
        return new dr.z0<>(entry.getKey(), entry.getValue());
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @oy.l
    public static <K, V> HashMap<K, V> M(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(m1.j(pairs.length));
        y0(map, pairs);
        return map;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lds/a<+TR;>;)TR; */
    @dr.l1(version = "1.3")
    @ur.f
    public static final Object N(Map map, ds.a defaultValue) {
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @ur.f
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return !map.isEmpty();
    }

    @dr.l1(version = "1.3")
    @ur.f
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @ur.f
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @oy.l
    public static final <K, V> LinkedHashMap<K, V> S(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        return (LinkedHashMap) I0(pairs, new LinkedHashMap(m1.j(pairs.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <K, V, R> Map<R, V> T(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@oy.l Map<? extends K, ? extends V> map, @oy.l M destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @ur.f
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @oy.l
    public static <K, V> Map<K, V> W(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        return pairs.length > 0 ? I0(pairs, new LinkedHashMap(m1.j(pairs.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <K, V, R> Map<K, R> X(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@oy.l Map<? extends K, ? extends V> map, @oy.l M destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <K, V> Map<K, V> Z(@oy.l Map<? extends K, ? extends V> map, @oy.l Iterable<? extends K> keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        Map mapJ0 = J0(map);
        m0.J0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static <K, V> Map<K, V> a0(@oy.l Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        Map mapJ0 = J0(map);
        mapJ0.remove(k10);
        return k0(mapJ0);
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <K, V> Map<K, V> b0(@oy.l Map<? extends K, ? extends V> map, @oy.l zu.m<? extends K> keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        Map mapJ0 = J0(map);
        m0.L0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <K, V> Map<K, V> c0(@oy.l Map<? extends K, ? extends V> map, @oy.l K[] keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        Map mapJ0 = J0(map);
        m0.M0(mapJ0.keySet(), keys);
        return k0(mapJ0);
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        m0.J0(map.keySet(), keys);
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> void e0(Map<K, V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        map.remove(k10);
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> void f0(Map<K, V> map, zu.m<? extends K> keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        m0.L0(map.keySet(), keys);
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(keys, "keys");
        m0.M0(map.keySet(), keys);
    }

    @cs.j(name = "mutableIterator")
    @ur.f
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @oy.l
    public static <K, V> Map<K, V> j0(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(pairs.length));
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <K, V> Map<K, V> k0(@oy.l Map<K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : m1.o(map);
        }
        return z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @oy.l
    public static <K, V> Map<K, V> m0(@oy.l Map<? extends K, ? extends V> map, @oy.l dr.z0<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pair, "pair");
        if (map.isEmpty()) {
            return m1.k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.j(), pair.k());
        return linkedHashMap;
    }

    @oy.l
    public static <K, V> Map<K, V> n0(@oy.l Map<? extends K, ? extends V> map, @oy.l Iterable<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return B0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @oy.l
    public static <K, V> Map<K, V> o0(@oy.l Map<? extends K, ? extends V> map, @oy.l Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @oy.l
    public static final <K, V> Map<K, V> p0(@oy.l Map<? extends K, ? extends V> map, @oy.l zu.m<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @oy.l
    public static final <K, V> Map<K, V> q0(@oy.l Map<? extends K, ? extends V> map, @oy.l dr.z0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return H0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @ur.f
    public static final <K, V> void r0(Map<? super K, ? super V> map, dr.z0<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pair, "pair");
        map.put(pair.j(), pair.k());
    }

    @dr.l1(version = "1.6")
    @ur.f
    public static final <K, V> Map<K, V> s(int i10, @dr.b ds.l<? super Map<K, V>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Map mapH = m1.h(i10);
        builderAction.invoke(mapH);
        return m1.d(mapH);
    }

    @ur.f
    public static final <K, V> void s0(Map<? super K, ? super V> map, Iterable<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        w0(map, pairs);
    }

    @dr.l1(version = "1.6")
    @ur.f
    public static final <K, V> Map<K, V> t(@dr.b ds.l<? super Map<K, V>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Map mapG = m1.g();
        builderAction.invoke(mapG);
        return m1.d(mapG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <K, V> void t0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(map2, "map");
        map.putAll(map2);
    }

    @ur.f
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.m0.p(entry, "<this>");
        return entry.getKey();
    }

    @ur.f
    public static final <K, V> void u0(Map<? super K, ? super V> map, zu.m<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        x0(map, pairs);
    }

    @ur.f
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.m0.p(entry, "<this>");
        return entry.getValue();
    }

    @ur.f
    public static final <K, V> void v0(Map<? super K, ? super V> map, dr.z0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        y0(map, pairs);
    }

    @ur.f
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void w0(@oy.l Map<? super K, ? super V> map, @oy.l Iterable<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        for (dr.z0<? extends K, ? extends V> z0Var : pairs) {
            map.put(z0Var.d(), z0Var.g());
        }
    }

    @ur.f
    public static final <K> boolean x(Map<? extends K, ?> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void x0(@oy.l Map<? super K, ? super V> map, @oy.l zu.m<? extends dr.z0<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        for (dr.z0<? extends K, ? extends V> z0Var : pairs) {
            map.put(z0Var.d(), z0Var.g());
        }
    }

    @ur.f
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.containsValue(v10);
    }

    public static final <K, V> void y0(@oy.l Map<? super K, ? super V> map, @oy.l dr.z0<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        for (dr.z0<? extends K, ? extends V> z0Var : pairs) {
            map.put(z0Var.d(), z0Var.g());
        }
    }

    @oy.l
    public static <K, V> Map<K, V> z() {
        v0 v0Var = v0.f85163b;
        kotlin.jvm.internal.m0.n(v0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return v0Var;
    }

    @ur.f
    public static final <K, V> V z0(Map<? extends K, V> map, K k10) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return (V) kotlin.jvm.internal.v1.k(map).remove(k10);
    }
}
