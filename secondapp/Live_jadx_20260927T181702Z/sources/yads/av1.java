package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class av1 {
    public static bv1 a() {
        bv1 bv1Var;
        bv1 bv1Var2 = bv1.f147356b;
        if (bv1Var2 != null) {
            return bv1Var2;
        }
        synchronized (bv1.f147357c) {
            bv1Var = bv1.f147356b;
            if (bv1Var == null) {
                bv1Var = new bv1();
                bv1.f147356b = bv1Var;
            }
        }
        return bv1Var;
    }
}
