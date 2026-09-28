package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$depositDropAlertStatusStateFlow$1", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n4e extends tje0 implements gaj<jw1, Boolean, v1b<? super jw1>, Object> {
    public /* synthetic */ jw1 a;

    @Override // defpackage.gaj
    public final Object invoke(jw1 jw1Var, Boolean bool, v1b<? super jw1> v1bVar) {
        bool.getClass();
        n4e n4eVar = new n4e(3, v1bVar);
        n4eVar.a = jw1Var;
        return n4eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jw1 jw1Var = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return jw1Var;
    }
}
