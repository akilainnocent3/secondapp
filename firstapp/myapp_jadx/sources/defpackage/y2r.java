package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$keyboardState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y2r extends tje0 implements iaj<cvq, Integer, qrd0, v1b<? super tsd0>, Object> {
    public /* synthetic */ cvq a;
    public /* synthetic */ int b;
    public /* synthetic */ qrd0 c;

    @Override // defpackage.iaj
    public final Object d(cvq cvqVar, Integer num, qrd0 qrd0Var, v1b<? super tsd0> v1bVar) {
        int iIntValue = num.intValue();
        y2r y2rVar = new y2r(4, v1bVar);
        y2rVar.a = cvqVar;
        y2rVar.b = iIntValue;
        y2rVar.c = qrd0Var;
        return y2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cvq cvqVar = this.a;
        int i = this.b;
        qrd0 qrd0Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimal = cvqVar.b;
        rkd0 rkd0Var = bigDecimal != null ? new rkd0(bigDecimal) : null;
        BigDecimal bigDecimal2 = cvqVar.c;
        rkd0 rkd0Var2 = bigDecimal2 != null ? new rkd0(bigDecimal2) : null;
        BigDecimal bigDecimal3 = cvqVar.d;
        return new tsd0(3, i, qrd0Var != null, a4h.f(ay0.v(new rkd0[]{rkd0Var, rkd0Var2, bigDecimal3 != null ? new rkd0(bigDecimal3) : null})));
    }
}
