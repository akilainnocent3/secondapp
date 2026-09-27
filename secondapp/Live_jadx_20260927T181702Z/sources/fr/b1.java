package fr;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
public class b1 extends a1 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R> Map<K, R> c(@oy.l y0<T, ? extends K> y0Var, @oy.l ds.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y0Var.a(next);
            a0.b.a aVar = (Object) linkedHashMap.get(objA);
            linkedHashMap.put(objA, operation.invoke(objA, aVar, next, Boolean.valueOf(aVar == null && !linkedHashMap.containsKey(objA))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M d(@oy.l y0<T, ? extends K> y0Var, @oy.l M destination, @oy.l ds.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(operation, "operation");
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y0Var.a(next);
            a0.b.a aVar = (Object) destination.get(objA);
            destination.put(objA, operation.invoke(objA, aVar, next, Boolean.valueOf(aVar == null && !destination.containsKey(objA))));
        }
        return destination;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, M extends Map<? super K, Integer>> M e(@oy.l y0<T, ? extends K> y0Var, @oy.l M destination) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            K kA = y0Var.a(itB.next());
            Object obj = destination.get(kA);
            if (obj == null && !destination.containsKey(kA)) {
                obj = 0;
            }
            destination.put(kA, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R> Map<K, R> f(@oy.l y0<T, ? extends K> y0Var, @oy.l ds.p<? super K, ? super T, ? extends R> initialValueSelector, @oy.l ds.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.m0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y0Var.a(next);
            R rInvoke = (Object) linkedHashMap.get(objA);
            if (rInvoke == null && !linkedHashMap.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            linkedHashMap.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R> Map<K, R> g(@oy.l y0<T, ? extends K> y0Var, R r10, @oy.l ds.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = y0Var.a(next);
            a0.c cVar = (Object) linkedHashMap.get(kA);
            if (cVar == null && !linkedHashMap.containsKey(kA)) {
                cVar = (Object) r10;
            }
            linkedHashMap.put(kA, operation.invoke(cVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M h(@oy.l y0<T, ? extends K> y0Var, @oy.l M destination, @oy.l ds.p<? super K, ? super T, ? extends R> initialValueSelector, @oy.l ds.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.m0.p(operation, "operation");
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y0Var.a(next);
            R rInvoke = (Object) destination.get(objA);
            if (rInvoke == null && !destination.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            destination.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M i(@oy.l y0<T, ? extends K> y0Var, @oy.l M destination, R r10, @oy.l ds.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(operation, "operation");
        Iterator<T> itB = y0Var.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = y0Var.a(next);
            a0.c cVar = (Object) destination.get(kA);
            if (cVar == null && !destination.containsKey(kA)) {
                cVar = (Object) r10;
            }
            destination.put(kA, operation.invoke(cVar, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <S, T extends S, K> Map<K, S> j(@oy.l y0<T, ? extends K> y0Var, @oy.l ds.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = y0Var.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = y0Var.a(sInvoke);
            a0.b.a aVar = (Object) linkedHashMap.get(objA);
            if (!(aVar == null && !linkedHashMap.containsKey(objA))) {
                sInvoke = operation.invoke(objA, aVar, sInvoke);
            }
            linkedHashMap.put(objA, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    @dr.l1(version = "1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@oy.l y0<T, ? extends K> y0Var, @oy.l M destination, @oy.l ds.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.m0.p(y0Var, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(operation, "operation");
        Iterator itB = y0Var.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = y0Var.a(sInvoke);
            a0.b.a aVar = (Object) destination.get(objA);
            if (!(aVar == null && !destination.containsKey(objA))) {
                sInvoke = operation.invoke(objA, aVar, sInvoke);
            }
            destination.put(objA, sInvoke);
        }
        return destination;
    }
}
