package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class eb1 {
    public final fb1 a() {
        fb1 fb1Var;
        fb1 fb1Var2 = fb1.f149038d;
        if (fb1Var2 != null) {
            return fb1Var2;
        }
        synchronized (this) {
            fb1Var = fb1.f149038d;
            if (fb1Var == null) {
                fb1Var = new fb1();
                fb1.f149038d = fb1Var;
            }
        }
        return fb1Var;
    }
}
