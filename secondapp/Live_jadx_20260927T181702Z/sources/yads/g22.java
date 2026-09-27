package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g22 {
    public static h22 a() {
        h22 h22Var;
        h22 h22Var2 = h22.f149878b;
        if (h22Var2 != null) {
            return h22Var2;
        }
        synchronized (h22.f149877a) {
            h22Var = h22.f149878b;
            if (h22Var == null) {
                h22Var = new h22();
                h22.f149878b = h22Var;
            }
        }
        return h22Var;
    }
}
