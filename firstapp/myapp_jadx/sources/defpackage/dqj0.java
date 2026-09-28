package defpackage;

import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$transferStatusStateFlow$1", f = "WithdrawTransferViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dqj0 extends tje0 implements Function2<lk50<? extends TransferStatus>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hqj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqj0(hqj0 hqj0Var, v1b<? super dqj0> v1bVar) {
        super(2, v1bVar);
        this.b = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dqj0 dqj0Var = new dqj0(this.b, v1bVar);
        dqj0Var.a = obj;
        return dqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends TransferStatus> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dqj0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TransferStatus transferStatus;
        wwd0 wwd0Var = this.b.n0;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        boolean z = false;
        if (cVar != null && (transferStatus = (TransferStatus) cVar.a) != null && transferStatus.isVerificationAllPassed()) {
            z = true;
        }
        if (wwd0Var.getValue() instanceof c330.a) {
            bkj0.a(z, null, wwd0Var, null);
        }
        return Unit.a;
    }
}
