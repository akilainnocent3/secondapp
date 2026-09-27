package fr;

import dr.w2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class m1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f85130a = 1073741824;

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <K, V> Map<K, V> d(@oy.l Map<K, V> builder) {
        kotlin.jvm.internal.m0.p(builder, "builder");
        return ((gr.d) builder).n();
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <K, V> Map<K, V> e(int i10, ds.l<? super Map<K, V>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Map mapH = h(i10);
        builderAction.invoke(mapH);
        return d(mapH);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <K, V> Map<K, V> f(ds.l<? super Map<K, V>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Map mapG = g();
        builderAction.invoke(mapG);
        return d(mapG);
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <K, V> Map<K, V> g() {
        return new gr.d();
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <K, V> Map<K, V> h(int i10) {
        return new gr.d(i10);
    }

    public static final <K, V> V i(@oy.l ConcurrentMap<K, V> concurrentMap, K k10, @oy.l ds.a<? extends V> defaultValue) {
        kotlin.jvm.internal.m0.p(concurrentMap, "<this>");
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        V v10 = concurrentMap.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k10, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @dr.f1
    public static int j(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @oy.l
    public static <K, V> Map<K, V> k(@oy.l dr.z0<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.m0.p(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.j(), pair.k());
        kotlin.jvm.internal.m0.o(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @oy.l
    @dr.l1(version = sc.k.f129877g)
    public static final <K, V> SortedMap<K, V> l(@oy.l Comparator<? super K> comparator, @oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        n1.y0(treeMap, pairs);
        return treeMap;
    }

    @oy.l
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> m(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        n1.y0(treeMap, pairs);
        return treeMap;
    }

    @ur.f
    public static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @oy.l
    public static final <K, V> Map<K, V> o(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.m0.o(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    @ur.f
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return o(map);
    }

    @oy.l
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> q(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return new TreeMap(map);
    }

    @oy.l
    public static <K, V> SortedMap<K, V> r(@oy.l Map<? extends K, ? extends V> map, @oy.l Comparator<? super K> comparator) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
