package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gx8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            rbn rbnVarB = egm.a;
            if (rbnVarB == null) {
                rbn.a aVar2 = new rbn.a("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                m2g m2gVar = lwh0.a;
                soa0 soa0Var = new soa0(j58.b);
                fxz fxzVar = new fxz();
                fxzVar.f(10.0f, 20.0f);
                fxzVar.h(-6.0f);
                fxzVar.c(4.0f);
                fxzVar.h(6.0f);
                fxzVar.c(5.0f);
                fxzVar.h(-8.0f);
                fxzVar.c(3.0f);
                fxzVar.d(12.0f, 3.0f);
                fxzVar.d(2.0f, 12.0f);
                fxzVar.c(3.0f);
                fxzVar.h(8.0f);
                fxzVar.a();
                rbn.a.a(aVar2, fxzVar.a, soa0Var);
                rbnVarB = aVar2.b();
                egm.a = rbnVarB;
            }
            h6n.a(rbnVarB, "Home", null, ((lib0) aVar.O(oib0.a)).a0, aVar, 48, 4);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
