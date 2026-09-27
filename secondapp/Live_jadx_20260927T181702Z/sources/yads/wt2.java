package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class wt2 {
    public static xt2 a() {
        xt2 xt2Var;
        xt2 xt2Var2 = xt2.f157988c;
        if (xt2Var2 != null) {
            return xt2Var2;
        }
        synchronized (xt2.f157987b) {
            xt2Var = xt2.f157988c;
            if (xt2Var == null) {
                xt2Var = new xt2();
                xt2.f157988c = xt2Var;
            }
        }
        return xt2Var;
    }
}
