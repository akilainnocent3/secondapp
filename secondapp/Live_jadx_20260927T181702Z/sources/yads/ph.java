package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ph {
    public static oh a(Context context, iu3 iu3Var) {
        Context applicationContext = context.getApplicationContext();
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(applicationContext);
        if (nt2VarA == null || !nt2VarA.E) {
            return new co(applicationContext, new rh1(applicationContext), new mh1(), new qh(iu3Var));
        }
        rh1 rh1Var = new rh1(applicationContext);
        mh1 mh1Var = new mh1();
        qh qhVar = new qh(iu3Var);
        Object obj2 = sh.f155425c;
        return new fs(applicationContext, rh1Var, mh1Var, qhVar, rh.a(), new ii2());
    }
}
