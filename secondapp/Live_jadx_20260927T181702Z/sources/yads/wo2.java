package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class wo2 {
    public static xo2 a() {
        xo2 xo2Var;
        xo2 xo2Var2 = xo2.f157950b;
        if (xo2Var2 != null) {
            return xo2Var2;
        }
        synchronized (xo2.f157949a) {
            xo2Var = xo2.f157950b;
            if (xo2Var == null) {
                xo2Var = new xo2();
                xo2.f157950b = xo2Var;
            }
        }
        return xo2Var;
    }
}
