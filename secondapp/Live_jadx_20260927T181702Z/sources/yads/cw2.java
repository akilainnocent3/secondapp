package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cw2 {
    public static dw2 a() {
        dw2 dw2Var;
        dw2 dw2Var2 = dw2.f148385k;
        if (dw2Var2 != null) {
            return dw2Var2;
        }
        synchronized (dw2.f148384j) {
            dw2Var = dw2.f148385k;
            if (dw2Var == null) {
                dw2Var = new dw2();
                dw2.f148385k = dw2Var;
            }
        }
        return dw2Var;
    }
}
