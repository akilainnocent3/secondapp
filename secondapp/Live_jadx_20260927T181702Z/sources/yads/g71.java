package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g71 {
    public static h71 a() {
        if (h71.f149956c == null) {
            synchronized (h71.f149955b) {
                try {
                    if (h71.f149956c == null) {
                        h71.f149956c = new h71();
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        h71 h71Var = h71.f149956c;
        if (h71Var != null) {
            return h71Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
