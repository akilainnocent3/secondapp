package fr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class n0 extends m0 {
    @oy.l
    public static <T> List<T> c1(@oy.l List<? extends T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        return new u1(list);
    }

    @cs.j(name = "asReversedMutable")
    @oy.l
    public static <T> List<T> d1(@oy.l List<T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        return new t1(list);
    }

    public static final int e1(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= h0.L(list)) {
            return h0.L(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new ms.l(0, h0.L(list)) + "].");
    }

    public static final int f1(List<?> list, int i10) {
        return h0.L(list) - i10;
    }

    public static final int g1(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new ms.l(0, list.size()) + "].");
    }
}
