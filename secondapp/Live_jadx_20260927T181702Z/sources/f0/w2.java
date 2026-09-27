package f0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1548:1\n1#2:1549\n919#3,2:1550\n919#3,2:1552\n919#3,2:1554\n919#3,2:1556\n919#3,2:1558\n919#3,2:1560\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1521#1:1550,2\n1528#1:1552,2\n1529#1:1554,2\n1539#1:1556,2\n1540#1:1558,2\n1541#1:1560,2\n*E\n"})
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final Object[] f82160a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final v2<Object> f82161b = new j2(0);

    public static final void d(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            g0.f.e("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void e(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            g0.f.c("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            g0.f.e("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 > size) {
            g0.f.e("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }

    @oy.l
    public static final <E> v2<E> f() {
        v2<E> v2Var = (v2<E>) f82161b;
        kotlin.jvm.internal.m0.n(v2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return v2Var;
    }

    @oy.l
    public static final <E> j2<E> g() {
        return new j2<>(0, 1, null);
    }

    @oy.l
    public static final <E> j2<E> h(E e10) {
        j2<E> j2Var = new j2<>(1);
        j2Var.a0(e10);
        return j2Var;
    }

    @oy.l
    public static final <E> j2<E> i(E e10, E e11) {
        j2<E> j2Var = new j2<>(2);
        j2Var.a0(e10);
        j2Var.a0(e11);
        return j2Var;
    }

    @oy.l
    public static final <E> j2<E> j(E e10, E e11, E e12) {
        j2<E> j2Var = new j2<>(3);
        j2Var.a0(e10);
        j2Var.a0(e11);
        j2Var.a0(e12);
        return j2Var;
    }

    @oy.l
    public static final <E> j2<E> k(@oy.l E... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        j2<E> j2Var = new j2<>(elements.length);
        j2Var.B0(elements);
        return j2Var;
    }

    @oy.l
    public static final <E> v2<E> l() {
        v2<E> v2Var = (v2<E>) f82161b;
        kotlin.jvm.internal.m0.n(v2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return v2Var;
    }

    @oy.l
    public static final <E> v2<E> m(E e10) {
        return h(e10);
    }

    @oy.l
    public static final <E> v2<E> n(E e10, E e11) {
        return i(e10, e11);
    }

    @oy.l
    public static final <E> v2<E> o(E e10, E e11, E e12) {
        return j(e10, e11, e12);
    }

    @oy.l
    public static final <E> v2<E> p(@oy.l E... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        j2 j2Var = new j2(elements.length);
        j2Var.B0(elements);
        return j2Var;
    }
}
