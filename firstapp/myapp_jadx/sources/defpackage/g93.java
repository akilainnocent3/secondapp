package defpackage;

import com.sportybet.plugin.realsports.data.Share;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "Please instead with IBetStore")
public final class g93 {
    public static volatile lrm a = null;
    public static volatile boolean b = false;

    public static lrm a() {
        lrm lrmVar = a;
        if (lrmVar != null) {
            return lrmVar;
        }
        synchronized (g93.class) {
            if (a != null) {
                return a;
            }
            try {
                lrm lrmVarF = ((z03) qag.a(hp0.A, z03.class)).F();
                if (!b) {
                    d13.d(lrmVarF);
                    b = true;
                }
                a = lrmVarF;
                return lrmVarF;
            } catch (IllegalStateException e) {
                e = e;
                itf0.a.p(e, "BetStore: Hilt not ready, fall back to local state", new Object[0]);
                return d13.a.e().b;
            } catch (NullPointerException e2) {
                e = e2;
                itf0.a.p(e, "BetStore: Hilt not ready, fall back to local state", new Object[0]);
                return d13.a.e().b;
            }
        }
    }

    public static void b(Share share) {
        a().w(share);
    }
}
