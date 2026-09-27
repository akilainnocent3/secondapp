package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rw1 {
    public final sw1 a(Context context) {
        sw1 sw1Var;
        sw1 sw1Var2 = sw1.f155588d;
        if (sw1Var2 != null) {
            return sw1Var2;
        }
        synchronized (this) {
            try {
                sw1Var = sw1.f155588d;
                if (sw1Var == null) {
                    Object obj = dw2.f148384j;
                    nt2 nt2VarA = cw2.a().a(context);
                    sw1Var = new sw1(nt2VarA != null ? nt2VarA.f153150b : 0);
                    sw1.f155588d = sw1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sw1Var;
    }
}
