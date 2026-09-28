package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$insufficientFundsStateFlow$3", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w4e extends tje0 implements gaj<DepositDropAlertStatus, Unit, v1b<? super Unit>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(DepositDropAlertStatus depositDropAlertStatus, Unit unit, v1b<? super Unit> v1bVar) {
        return new w4e(3, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
