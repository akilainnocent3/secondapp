package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class iu1 {
    public static ju1 a() {
        ju1 ju1Var;
        ju1 ju1Var2 = ju1.f151264b;
        if (ju1Var2 != null) {
            return ju1Var2;
        }
        synchronized (ju1.f151265c) {
            ju1Var = ju1.f151264b;
            if (ju1Var == null) {
                ju1Var = new ju1();
                ju1.f151264b = ju1Var;
            }
        }
        return ju1Var;
    }
}
