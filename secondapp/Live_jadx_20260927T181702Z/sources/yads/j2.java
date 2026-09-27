package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j2 {
    public final k2 a() {
        k2 k2Var;
        k2 k2Var2 = k2.f151363c;
        if (k2Var2 != null) {
            return k2Var2;
        }
        synchronized (this) {
            k2Var = k2.f151363c;
            if (k2Var == null) {
                k2Var = new k2();
                k2.f151363c = k2Var;
            }
        }
        return k2Var;
    }
}
