package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bu1 {
    public final cu1 a() {
        cu1 cu1Var;
        cu1 cu1Var2 = cu1.f147908f;
        if (cu1Var2 != null) {
            return cu1Var2;
        }
        synchronized (this) {
            cu1Var = cu1.f147908f;
            if (cu1Var == null) {
                cu1Var = new cu1();
                cu1.f147908f = cu1Var;
            }
        }
        return cu1Var;
    }
}
