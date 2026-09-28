package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class aoh0 {
    public final psm a;
    public final yi5 b;
    public final ysm c;
    public final mpe0 d;

    public aoh0(psm psmVar, yi5 yi5Var, ysm ysmVar) {
        psmVar.getClass();
        yi5Var.getClass();
        ysmVar.getClass();
        this.a = psmVar;
        this.b = yi5Var;
        this.c = ysmVar;
        this.d = hwr.b(new Function0() { // from class: znh0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                aoh0 aoh0Var = this.a;
                CountryCodeName countryCode = aoh0Var.a.getCountryCode();
                yi5 yi5Var2 = aoh0Var.b;
                return " sportybetclient/sportybet/" + countryCode + "/" + yi5Var2.b().a() + "/" + yi5Var2.b().getVersionCode() + " channel/sportybet deviceId/" + aoh0Var.c.a().a;
            }
        });
    }
}
