package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$countryLottery$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lbr extends tje0 implements iaj<uf00<? extends hsq>, scn<String, ? extends Boolean>, scn<String, ? extends r4q>, v1b<? super sx70.a>, Object> {
    public /* synthetic */ uf00 a;
    public /* synthetic */ scn b;
    public /* synthetic */ scn c;

    @Override // defpackage.iaj
    public final Object d(uf00<? extends hsq> uf00Var, scn<String, ? extends Boolean> scnVar, scn<String, ? extends r4q> scnVar2, v1b<? super sx70.a> v1bVar) {
        lbr lbrVar = new lbr(4, v1bVar);
        lbrVar.a = uf00Var;
        lbrVar.b = scnVar;
        lbrVar.c = scnVar2;
        return lbrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uf00 uf00Var = this.a;
        scn scnVar = this.b;
        scn scnVar2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return scnVar2.isEmpty() ? new sx70.a(0) : new sx70.a(p7b.a(uf00Var, scnVar, true));
    }
}
