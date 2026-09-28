package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.GetWithdrawBankHintBundleUseCase$invoke$2", f = "GetWithdrawBankHintBundleUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wgk extends tje0 implements iaj<WithdrawAlertHintStatus, Boolean, Boolean, v1b<? super mij0>, Object> {
    public /* synthetic */ WithdrawAlertHintStatus a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(WithdrawAlertHintStatus withdrawAlertHintStatus, Boolean bool, Boolean bool2, v1b<? super mij0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        wgk wgkVar = new wgk(4, v1bVar);
        wgkVar.a = withdrawAlertHintStatus;
        wgkVar.b = zBooleanValue;
        wgkVar.c = zBooleanValue2;
        return wgkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WithdrawAlertHintStatus withdrawAlertHintStatus = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new mij0(withdrawAlertHintStatus, z, z2);
    }
}
