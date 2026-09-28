package defpackage;

import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$transferStatusStateFlow$2", f = "WithdrawTransferViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eqj0 extends tje0 implements Function2<TransferStatus, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hqj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqj0(hqj0 hqj0Var, v1b<? super eqj0> v1bVar) {
        super(2, v1bVar);
        this.b = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eqj0 eqj0Var = new eqj0(this.b, v1bVar);
        eqj0Var.a = obj;
        return eqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransferStatus transferStatus, v1b<? super Unit> v1bVar) {
        return ((eqj0) create(transferStatus, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TransferStatus transferStatus = (TransferStatus) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        transferStatus.getClass();
        hqj0 hqj0Var = this.b;
        ej5.c(o8i0.d(hqj0Var), null, null, new spj0(transferStatus, hqj0Var, null), 3);
        return Unit.a;
    }
}
