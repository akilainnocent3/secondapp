package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$state$1", f = "LNBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vyp extends tje0 implements jaj<pjq, pjq, rjq, qxq, v1b<? super qyp>, Object> {
    public /* synthetic */ pjq a;
    public /* synthetic */ pjq b;
    public /* synthetic */ rjq c;
    public /* synthetic */ qxq d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pjq pjqVar = this.a;
        pjq pjqVar2 = this.b;
        rjq rjqVar = this.c;
        qxq qxqVar = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new qyp(pjqVar, pjqVar2, qxqVar, rjqVar);
    }

    @Override // defpackage.jaj
    public final Object l(pjq pjqVar, pjq pjqVar2, rjq rjqVar, qxq qxqVar, v1b<? super qyp> v1bVar) {
        vyp vypVar = new vyp(5, v1bVar);
        vypVar.a = pjqVar;
        vypVar.b = pjqVar2;
        vypVar.c = rjqVar;
        vypVar.d = qxqVar;
        return vypVar.invokeSuspend(Unit.a);
    }
}
