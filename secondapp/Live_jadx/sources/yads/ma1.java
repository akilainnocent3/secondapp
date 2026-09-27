package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ma1 {
    public static na1 a() {
        if (na1.f152960f == null) {
            synchronized (na1.f152959e) {
                try {
                    if (na1.f152960f == null) {
                        na1.f152960f = new na1();
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        na1 na1Var = na1.f152960f;
        if (na1Var != null) {
            return na1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
