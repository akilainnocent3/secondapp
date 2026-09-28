package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$keyboardState$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qaq extends tje0 implements iaj<cvq, Integer, qrd0, v1b<? super tsd0>, Object> {
    public /* synthetic */ cvq a;
    public /* synthetic */ int b;
    public /* synthetic */ qrd0 c;

    @Override // defpackage.iaj
    public final Object d(cvq cvqVar, Integer num, qrd0 qrd0Var, v1b<? super tsd0> v1bVar) {
        int iIntValue = num.intValue();
        qaq qaqVar = new qaq(4, v1bVar);
        qaqVar.a = cvqVar;
        qaqVar.b = iIntValue;
        qaqVar.c = qrd0Var;
        return qaqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cvq cvqVar = this.a;
        int i = this.b;
        qrd0 qrd0Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = qrd0Var != null;
        BigDecimal bigDecimal = cvqVar.b;
        rkd0 rkd0Var = bigDecimal != null ? new rkd0(bigDecimal) : null;
        BigDecimal bigDecimal2 = cvqVar.c;
        rkd0 rkd0Var2 = bigDecimal2 != null ? new rkd0(bigDecimal2) : null;
        BigDecimal bigDecimal3 = cvqVar.d;
        return new tsd0(3, i, z, a4h.f(ay0.v(new rkd0[]{rkd0Var, rkd0Var2, bigDecimal3 != null ? new rkd0(bigDecimal3) : null})));
    }
}
