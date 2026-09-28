package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$countryPageState$1$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tpq extends tje0 implements gaj<qcn<? extends hsq>, scn<String, ? extends Boolean>, v1b<? super mmq>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ scn b;

    @Override // defpackage.gaj
    public final Object invoke(qcn<? extends hsq> qcnVar, scn<String, ? extends Boolean> scnVar, v1b<? super mmq> v1bVar) {
        tpq tpqVar = new tpq(3, v1bVar);
        tpqVar.a = qcnVar;
        tpqVar.b = scnVar;
        return tpqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        scn scnVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uf00 uf00VarA = p7b.a(qcnVar, scnVar, false);
        return uf00VarA.isEmpty() ? mmq.c.a : new mmq.a(uf00VarA);
    }
}
