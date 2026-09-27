package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sr2 {
    public static tr2 a() {
        if (tr2.f156026d == null) {
            synchronized (tr2.f156025c) {
                try {
                    if (tr2.f156026d == null) {
                        tr2.f156026d = new tr2(new ki2(), new oy0());
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        tr2 tr2Var = tr2.f156026d;
        if (tr2Var != null) {
            return tr2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
