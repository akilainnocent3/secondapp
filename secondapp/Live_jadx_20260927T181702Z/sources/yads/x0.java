package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x0 {
    public static z0 a() {
        z0 z0Var;
        Object obj = z0.f158542f;
        z0 z0Var2 = z0.f158543g;
        if (z0Var2 != null) {
            return z0Var2;
        }
        synchronized (obj) {
            z0Var = z0.f158543g;
            if (z0Var == null) {
                z0Var = new z0();
                z0.f158543g = z0Var;
            }
        }
        return z0Var;
    }
}
