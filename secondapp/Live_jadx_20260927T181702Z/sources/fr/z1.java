package fr;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
public class z1 extends y1 {
    @oy.l
    public static final <T> Set<T> A(@oy.l Set<? extends T> set, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        m0.M0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @ur.f
    public static final <T> Set<T> B(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        return y(set, t10);
    }

    @oy.l
    public static <T> Set<T> C(@oy.l Set<? extends T> set, @oy.l Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        Integer numE0 = i0.e0(elements);
        if (numE0 != null) {
            size = set.size() + numE0.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m1.j(size));
        linkedHashSet.addAll(set);
        m0.s0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @oy.l
    public static <T> Set<T> D(@oy.l Set<? extends T> set, T t10) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m1.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }

    @oy.l
    public static final <T> Set<T> E(@oy.l Set<? extends T> set, @oy.l zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m1.j(set.size() * 2));
        linkedHashSet.addAll(set);
        m0.t0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @oy.l
    public static final <T> Set<T> F(@oy.l Set<? extends T> set, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m1.j(set.size() + elements.length));
        linkedHashSet.addAll(set);
        m0.u0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @ur.f
    public static final <T> Set<T> G(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        return D(set, t10);
    }

    @oy.l
    public static <T> Set<T> x(@oy.l Set<? extends T> set, @oy.l Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        Collection<?> collectionV0 = m0.v0(elements);
        if (collectionV0.isEmpty()) {
            return r0.f6(set);
        }
        if (!(collectionV0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionV0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!((Set) collectionV0).contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    @oy.l
    public static <T> Set<T> y(@oy.l Set<? extends T> set, T t10) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m1.j(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.m0.g(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    @oy.l
    public static final <T> Set<T> z(@oy.l Set<? extends T> set, @oy.l zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        m0.L0(linkedHashSet, elements);
        return linkedHashSet;
    }
}
