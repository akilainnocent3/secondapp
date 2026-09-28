package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$orderedLottery$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dqq extends tje0 implements gaj<qcn<? extends String>, qcn<? extends erq>, v1b<? super qcn<? extends erq>>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ qcn b;

    @Override // defpackage.gaj
    public final Object invoke(qcn<? extends String> qcnVar, qcn<? extends erq> qcnVar2, v1b<? super qcn<? extends erq>> v1bVar) {
        dqq dqqVar = new dqq(3, v1bVar);
        dqqVar.a = qcnVar;
        dqqVar.b = qcnVar2;
        return dqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        qcn qcnVar2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return qcnVar.isEmpty() ? qcnVar2 : dmt.a(qcnVar, qcnVar2);
    }
}
