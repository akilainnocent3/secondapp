package u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    @nr.f
    public static final <R> R a(@oy.l vv.a aVar, @oy.m Object obj, @oy.l ds.l<? super Boolean, ? extends R> block) {
        kotlin.jvm.internal.m0.p(aVar, "<this>");
        kotlin.jvm.internal.m0.p(block, "block");
        boolean zB = aVar.b(obj);
        try {
            return block.invoke(Boolean.valueOf(zB));
        } finally {
            kotlin.jvm.internal.j0.d(1);
            if (zB) {
                aVar.i(obj);
            }
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static /* synthetic */ Object b(vv.a aVar, Object obj, ds.l block, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.m0.p(aVar, "<this>");
        kotlin.jvm.internal.m0.p(block, "block");
        boolean zB = aVar.b(obj);
        try {
            return block.invoke(Boolean.valueOf(zB));
        } finally {
            kotlin.jvm.internal.j0.d(1);
            if (zB) {
                aVar.i(obj);
            }
            kotlin.jvm.internal.j0.c(1);
        }
    }
}
