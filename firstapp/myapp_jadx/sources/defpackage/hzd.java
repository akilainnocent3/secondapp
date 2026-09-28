package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositEWalletViewModel$depositDropAlertStatusStateFlow$2", f = "DepositEWalletViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hzd extends tje0 implements gaj<wgn, Boolean, v1b<? super Unit>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(wgn wgnVar, Boolean bool, v1b<? super Unit> v1bVar) {
        bool.booleanValue();
        return new hzd(3, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
