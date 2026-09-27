package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ap0 {
    public static cp0 a() {
        cp0 cp0Var;
        cp0 cp0Var2 = cp0.f147844d;
        if (cp0Var2 != null) {
            return cp0Var2;
        }
        synchronized (cp0.f147843c) {
            cp0Var = cp0.f147844d;
            if (cp0Var == null) {
                cp0Var = new cp0();
                cp0.f147844d = cp0Var;
            }
        }
        return cp0Var;
    }
}
