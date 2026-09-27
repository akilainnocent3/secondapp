package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bp0 {
    public static dp0 a() {
        dp0 dp0Var;
        dp0 dp0Var2 = dp0.f148307d;
        if (dp0Var2 != null) {
            return dp0Var2;
        }
        synchronized (dp0.f148306c) {
            dp0Var = dp0.f148307d;
            if (dp0Var == null) {
                dp0Var = new dp0();
                dp0.f148307d = dp0Var;
            }
        }
        return dp0Var;
    }
}
