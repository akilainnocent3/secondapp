package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gi1 {
    public static hi1 a() {
        if (hi1.f150149c == null) {
            synchronized (hi1.f150148b) {
                try {
                    if (hi1.f150149c == null) {
                        hi1.f150149c = new hi1();
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        hi1 hi1Var = hi1.f150149c;
        if (hi1Var != null) {
            return hi1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
