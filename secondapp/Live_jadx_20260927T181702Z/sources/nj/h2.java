package nj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.b(emulated = true)
public final class h2 {
    public static boolean a(@zq.a Throwable t10, Class<? extends Throwable> expectedClass) {
        return expectedClass.isInstance(t10);
    }

    public static void b(Throwable t10) {
        zi.l0.E(t10);
        if (t10 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
