package fr;

import dr.w2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class y1 extends x1 {
    @dr.l1(version = "1.6")
    @ur.f
    public static final <E> Set<E> i(int i10, @dr.b ds.l<? super Set<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Set setE = x1.e(i10);
        builderAction.invoke(setE);
        return x1.a(setE);
    }

    @dr.l1(version = "1.6")
    @ur.f
    public static final <E> Set<E> j(@dr.b ds.l<? super Set<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Set setD = x1.d();
        builderAction.invoke(setD);
        return x1.a(setD);
    }

    @oy.l
    public static <T> Set<T> k() {
        return w0.f85173b;
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @oy.l
    public static final <T> HashSet<T> m(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (HashSet) a0.zy(elements, new HashSet(m1.j(elements.length)));
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @oy.l
    public static <T> LinkedHashSet<T> o(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (LinkedHashSet) a0.zy(elements, new LinkedHashSet(m1.j(elements.length)));
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @oy.l
    public static <T> Set<T> q(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (Set) a0.zy(elements, new LinkedHashSet(m1.j(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <T> Set<T> r(@oy.l Set<? extends T> set) {
        kotlin.jvm.internal.m0.p(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : x1.f(set.iterator().next());
        }
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? k() : set;
    }

    @ur.f
    public static final <T> Set<T> t() {
        return k();
    }

    @oy.l
    public static <T> Set<T> u(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return a0.wz(elements);
    }

    @oy.l
    @dr.l1(version = sc.k.f129877g)
    public static final <T> Set<T> v(@oy.m T t10) {
        return t10 != null ? x1.f(t10) : k();
    }

    @oy.l
    @dr.l1(version = sc.k.f129877g)
    public static final <T> Set<T> w(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (Set) a0.db(elements, new LinkedHashSet());
    }
}
