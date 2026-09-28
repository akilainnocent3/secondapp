package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$currentOutcome$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s2r extends tje0 implements gaj<ssq, dqh0, v1b<? super yxq>, Object> {
    public /* synthetic */ ssq a;
    public /* synthetic */ dqh0 b;

    @Override // defpackage.gaj
    public final Object invoke(ssq ssqVar, dqh0 dqh0Var, v1b<? super yxq> v1bVar) {
        s2r s2rVar = new s2r(3, v1bVar);
        s2rVar.a = ssqVar;
        s2rVar.b = dqh0Var;
        return s2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn<yxq> qcnVar;
        ssq ssqVar = this.a;
        dqh0 dqh0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yxq yxqVar = null;
        if (ssqVar == null || (qcnVar = ssqVar.g) == null) {
            return null;
        }
        for (yxq yxqVar2 : qcnVar) {
            if (Intrinsics.g(dqh0Var.getOutcomeId(), yxqVar2.b)) {
                yxqVar = yxqVar2;
                break;
            }
        }
        return yxqVar;
    }
}
