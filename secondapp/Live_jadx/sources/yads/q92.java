package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q92 {
    public static r92 a() {
        r92 r92Var;
        r92 r92Var2 = r92.f154825d;
        if (r92Var2 != null) {
            return r92Var2;
        }
        synchronized (r92.f154824c) {
            r92Var = r92.f154825d;
            if (r92Var == null) {
                r92Var = new r92(new ba2());
                r92.f154825d = r92Var;
            }
        }
        return r92Var;
    }
}
