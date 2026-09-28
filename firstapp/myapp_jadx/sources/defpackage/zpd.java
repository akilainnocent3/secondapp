package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$oneTimeAccountUiStateFlow$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zpd extends tje0 implements iaj<sry, Boolean, Boolean, v1b<? super x3e>, Object> {
    public /* synthetic */ sry a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(sry sryVar, Boolean bool, Boolean bool2, v1b<? super x3e> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        zpd zpdVar = new zpd(4, v1bVar);
        zpdVar.a = sryVar;
        zpdVar.b = zBooleanValue;
        zpdVar.c = zBooleanValue2;
        return zpdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sry sryVar = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Ctry ctry = sryVar.a;
        return new x3e(ctry, z && ctry.c != null, sryVar.b, z2);
    }
}
