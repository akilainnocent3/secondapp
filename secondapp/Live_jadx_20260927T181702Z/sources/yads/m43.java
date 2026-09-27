package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m43 {
    public static n43 a() {
        if (n43.f152875b == null) {
            synchronized (n43.f152876c) {
                try {
                    if (n43.f152875b == null) {
                        n43.f152875b = new n43();
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        n43 n43Var = n43.f152875b;
        if (n43Var != null) {
            return n43Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
