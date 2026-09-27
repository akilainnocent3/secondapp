package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class au1 {
    public static zt1 a(Context context) {
        mt1 mt1Var = new mt1(new pd3());
        e2 e2Var = new e2();
        ah ahVar = new ah(context);
        ub1 e10 = null;
        try {
            mt1Var.a(vt1.f157083b);
            e = null;
        } catch (ub1 e11) {
            e = e11;
        }
        try {
            e2Var.a(context);
            e = null;
        } catch (ub1 e12) {
            e = e12;
        }
        try {
            hc2.a(context);
            e = null;
        } catch (ub1 e13) {
            e = e13;
        }
        try {
            ahVar.a();
        } catch (ub1 e14) {
            e10 = e14;
        }
        List listS = fr.h0.S(e, e, e, e10);
        return !listS.isEmpty() ? new yt1(listS) : xt1.f157986a;
    }
}
