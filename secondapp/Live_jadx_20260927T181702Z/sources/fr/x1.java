package fr;

import dr.w2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class x1 {
    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> Set<E> a(@oy.l Set<E> builder) {
        kotlin.jvm.internal.m0.p(builder, "builder");
        return ((gr.j) builder).g();
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <E> Set<E> b(int i10, ds.l<? super Set<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Set setE = e(i10);
        builderAction.invoke(setE);
        return a(setE);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <E> Set<E> c(ds.l<? super Set<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        Set setD = d();
        builderAction.invoke(setD);
        return a(setD);
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> Set<E> d() {
        return new gr.j();
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> Set<E> e(int i10) {
        return new gr.j(i10);
    }

    @oy.l
    public static <T> Set<T> f(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        kotlin.jvm.internal.m0.o(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @oy.l
    public static final <T> TreeSet<T> g(@oy.l Comparator<? super T> comparator, @oy.l T... elements) {
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (TreeSet) a0.zy(elements, new TreeSet(comparator));
    }

    @oy.l
    public static <T> TreeSet<T> h(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return (TreeSet) a0.zy(elements, new TreeSet());
    }
}
