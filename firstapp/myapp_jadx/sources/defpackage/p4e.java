package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$depositDropAlertStatusStateFlow$3", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p4e extends tje0 implements Function2<DepositDropAlertStatus, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f5e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4e(f5e f5eVar, v1b<? super p4e> v1bVar) {
        super(2, v1bVar);
        this.b = f5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p4e p4eVar = new p4e(this.b, v1bVar);
        p4eVar.a = obj;
        return p4eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DepositDropAlertStatus depositDropAlertStatus, v1b<? super Unit> v1bVar) {
        return ((p4e) create(depositDropAlertStatus, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        DepositDropAlertStatus depositDropAlertStatus = (DepositDropAlertStatus) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (depositDropAlertStatus instanceof DepositDropAlertStatus.MaintenanceAlert) {
            this.b.q1(StringsKt.s0(((DepositDropAlertStatus.MaintenanceAlert) depositDropAlertStatus).b));
        }
        return Unit.a;
    }
}
