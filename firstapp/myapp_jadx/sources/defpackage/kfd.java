package defpackage;

import android.os.Build;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes8.dex */
public final class kfd {
    public static pg50 a(ysm ysmVar, CountryCodeName countryCodeName, yi5 yi5Var, cbg cbgVar) {
        ysmVar.getClass();
        countryCodeName.getClass();
        yi5Var.getClass();
        cbgVar.getClass();
        sg50 sg50VarE = pg50.c.e();
        sg50VarE.a(ye80.a, "SportyBet Android");
        sg50VarE.a(ye80.b, yi5Var.b().a());
        g21 g21Var = g21.a;
        sg50VarE.a(kyo.a(g21Var, "service.country"), countryCodeName.getCode());
        kyo kyoVarA = kyo.a(g21Var, "service.environment");
        cbgVar.a();
        sg50VarE.a(kyoVarA, "prod");
        sg50VarE.a(kyo.a(g21Var, "service.platform"), "android");
        sg50VarE.a(j3z.b, "Android");
        kyo kyoVar = j3z.c;
        String str = Build.VERSION.RELEASE;
        sg50VarE.a(kyoVar, str);
        kyo kyoVar2 = j3z.a;
        StringBuilder sbA = he.a("Android Version ", str, " (Build ");
        sbA.append(Build.ID);
        sbA.append(" API level ");
        sbA.append(Build.VERSION.SDK_INT);
        sbA.append(")");
        sg50VarE.a(kyoVar2, sbA.toString());
        gk1 gk1VarA = pg50.a(sg50VarE.a.a(), sg50VarE.b);
        sg50 sg50VarE2 = pg50.b.e();
        sg50VarE2.a(uce.a, ysmVar.c((3 & 1) != 0 ? "not_started" : ""));
        sg50VarE2.a(uce.c, Build.MODEL);
        sg50VarE2.a(uce.b, Build.MANUFACTURER);
        return gk1VarA.d(pg50.a(sg50VarE2.a.a(), sg50VarE2.b));
    }
}
