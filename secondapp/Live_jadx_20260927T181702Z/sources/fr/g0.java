package fr;

import dr.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public class g0 {
    @ur.f
    public static final <T> ArrayList<T> a(T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return new ArrayList<>(h0.u(tArr, true));
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> List<E> b(@oy.l List<E> builder) {
        kotlin.jvm.internal.m0.p(builder, "builder");
        return ((gr.b) builder).s();
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <E> List<E> c(int i10, ds.l<? super List<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        List listK = k(i10);
        builderAction.invoke(listK);
        return b(listK);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final <E> List<E> d(ds.l<? super List<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        List listJ = j();
        builderAction.invoke(listJ);
        return b(listJ);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final int e(int i10) {
        if (i10 < 0) {
            h0.a0();
        }
        return i10;
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @ur.f
    public static final int f(int i10) {
        if (i10 < 0) {
            h0.b0();
        }
        return i10;
    }

    @ur.f
    public static final Object[] g(Collection<?> collection) {
        kotlin.jvm.internal.m0.p(collection, "collection");
        return kotlin.jvm.internal.w.a(collection);
    }

    @ur.f
    public static final <T> T[] h(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.m0.p(collection, "collection");
        kotlin.jvm.internal.m0.p(array, "array");
        return (T[]) kotlin.jvm.internal.w.b(collection, array);
    }

    @oy.l
    public static final <T> Object[] i(@oy.l T[] tArr, boolean z10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.m0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> List<E> j() {
        return new gr.b(0, 1, null);
    }

    @dr.f1
    @oy.l
    @dr.l1(version = "1.3")
    public static <E> List<E> k(int i10) {
        return new gr.b(i10);
    }

    @oy.l
    public static <T> List<T> l(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.m0.o(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @oy.l
    @dr.l1(version = "1.2")
    public static final <T> List<T> m(@oy.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        List<T> listC6 = r0.c6(iterable);
        Collections.shuffle(listC6);
        return listC6;
    }

    @oy.l
    @dr.l1(version = "1.2")
    public static final <T> List<T> n(@oy.l Iterable<? extends T> iterable, @oy.l Random random) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(random, "random");
        List<T> listC6 = r0.c6(iterable);
        Collections.shuffle(listC6, random);
        return listC6;
    }

    @oy.l
    public static <T> T[] o(int i10, @oy.l T[] array) {
        kotlin.jvm.internal.m0.p(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @ur.f
    public static final <T> List<T> p(Enumeration<T> enumeration) {
        kotlin.jvm.internal.m0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.m0.o(list, "list(...)");
        return list;
    }
}
