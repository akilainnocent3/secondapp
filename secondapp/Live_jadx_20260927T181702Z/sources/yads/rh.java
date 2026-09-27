package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class rh {
    public static sh a() {
        if (sh.f155426d == null) {
            synchronized (sh.f155425c) {
                try {
                    if (sh.f155426d == null) {
                        sh.f155426d = new sh(new ki2(), new oy0());
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        sh shVar = sh.f155426d;
        if (shVar != null) {
            return shVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
