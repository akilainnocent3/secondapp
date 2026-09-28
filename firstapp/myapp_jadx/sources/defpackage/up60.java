package defpackage;

import android.database.SQLException;

/* JADX INFO: loaded from: classes.dex */
public final class up60 {
    public static final void a(vp60 vp60Var, String str) {
        vp60Var.getClass();
        str.getClass();
        hq60 hq60VarH1 = vp60Var.H1(str);
        try {
            hq60VarH1.D1();
            vc1.a(hq60VarH1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    public static final void b(int i, String str) {
        throw new SQLException(hce0.a(i, "Error code: ") + ", message: ".concat(str));
    }
}
