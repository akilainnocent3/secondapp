package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$depositDropAlertStatusStateFlow$2", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class npd extends tje0 implements gaj<Integer, Boolean, v1b<? super Integer>, Object> {
    public /* synthetic */ int a;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Boolean bool, v1b<? super Integer> v1bVar) {
        int iIntValue = num.intValue();
        bool.booleanValue();
        npd npdVar = new npd(3, v1bVar);
        npdVar.a = iIntValue;
        return npdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Integer(i);
    }
}
