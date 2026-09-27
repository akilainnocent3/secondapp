package fr;

import dr.w2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class k0 extends j0 {
    public static final <T> void i0(@oy.l Iterator<? extends T> it, @oy.l ds.l<? super T, w2> operation) {
        kotlin.jvm.internal.m0.p(it, "<this>");
        kotlin.jvm.internal.m0.p(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <T> Iterator<T> j0(Iterator<? extends T> it) {
        kotlin.jvm.internal.m0.p(it, "<this>");
        return it;
    }

    @oy.l
    public static <T> Iterator<c1<T>> k0(@oy.l Iterator<? extends T> it) {
        kotlin.jvm.internal.m0.p(it, "<this>");
        return new e1(it);
    }
}
