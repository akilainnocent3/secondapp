package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ng1 {
    public static og1 a() {
        og1 og1Var;
        og1 og1Var2 = og1.f153485e;
        if (og1Var2 != null) {
            return og1Var2;
        }
        synchronized (og1.f153484d) {
            og1Var = og1.f153485e;
            if (og1Var == null) {
                og1Var = new og1(new ey1(ey1.f148879c));
                og1.f153485e = og1Var;
            }
        }
        return og1Var;
    }
}
