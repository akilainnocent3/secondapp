package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wp60 {
    public static final int a(vp60 vp60Var) {
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT changes()");
        try {
            hq60VarH1.D1();
            int i = (int) hq60VarH1.getLong(0);
            vc1.a(hq60VarH1, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }
}
