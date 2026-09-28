package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.historydetail.presentation.LNHistoryDetailViewModel$state$1", f = "LNHistoryDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jjq extends tje0 implements gaj<lk50<? extends ygq>, chq, v1b<? super bjq>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ chq b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends ygq> lk50Var, chq chqVar, v1b<? super bjq> v1bVar) {
        jjq jjqVar = new jjq(3, v1bVar);
        jjqVar.a = lk50Var;
        jjqVar.b = chqVar;
        return jjqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        chq chqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bjq(lk50Var, chqVar);
    }
}
