package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s200 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s200(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                x200 x200Var = (x200) obj;
                psm psmVar = x200Var.d;
                CountryCodeName countryCode = psmVar.getCountryCode();
                ga00 ga00VarF = x200Var.f();
                String strF = psmVar.f();
                y6c y6cVar = new y6c(x200Var, 2);
                countryCode.getClass();
                ga00VarF.getClass();
                strF.getClass();
                boolean z = ga00VarF == ga00.DEPOSIT;
                return e0l.a[countryCode.ordinal()] == 1 ? new l9k0(strF, y6cVar, z) : new vum(countryCode, strF, z);
            default:
                ((q1c0) obj).T2();
                return Unit.a;
        }
    }
}
