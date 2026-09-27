package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pd1 {
    public static qd1 a() {
        if (qd1.f154436d == null) {
            synchronized (qd1.f154435c) {
                try {
                    if (qd1.f154436d == null) {
                        qd1.f154436d = new qd1(new ki2(), new oy0());
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        qd1 qd1Var = qd1.f154436d;
        if (qd1Var != null) {
            return qd1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
