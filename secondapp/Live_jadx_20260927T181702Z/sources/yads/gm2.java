package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gm2 {
    public final hm2 a() {
        hm2 hm2Var;
        hm2 hm2Var2 = hm2.f150196d;
        if (hm2Var2 != null) {
            return hm2Var2;
        }
        synchronized (this) {
            hm2Var = hm2.f150196d;
            if (hm2Var == null) {
                hm2Var = new hm2();
                hm2.f150196d = hm2Var;
            }
        }
        return hm2Var;
    }
}
