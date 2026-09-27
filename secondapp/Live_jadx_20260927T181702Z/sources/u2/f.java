package u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final <T extends e, R> R a(@oy.l T t10, @oy.l ds.l<? super T, ? extends R> block) throws Throwable {
        kotlin.jvm.internal.m0.p(t10, "<this>");
        kotlin.jvm.internal.m0.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            kotlin.jvm.internal.j0.d(1);
            try {
                t10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.j0.c(1);
            return rInvoke;
        } catch (Throwable th3) {
            kotlin.jvm.internal.j0.d(1);
            try {
                t10.close();
            } catch (Throwable th4) {
                dr.t.a(th3, th4);
            }
            throw th3;
        }
    }
}
