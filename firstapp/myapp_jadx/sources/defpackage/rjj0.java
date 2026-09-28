package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$initSportyPinState$1", f = "WithdrawBankV2ViewModel.kt", l = {324}, m = "invokeSuspend", v = 2)
public final class rjj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mjj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjj0(mjj0 mjj0Var, v1b<? super rjj0> v1bVar) {
        super(2, v1bVar);
        this.b = mjj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rjj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rjj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        mjj0 mjj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (!mjj0Var.u0.q() || mjj0Var.E0) {
                return Unit.a;
            }
            lyh<lk50<WithdrawalPinStatusInfo>> lyhVarI0 = mjj0Var.p0.i0(pu0.c.a);
            this.a = 1;
            obj = bm50.p(lyhVarI0, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            if (((WithdrawalPinStatusInfo) ((lk50.c) lk50Var).a).getSportyPinStatus() == SportyPinStatus.Disabled) {
                ej5.c(o8i0.d(mjj0Var), null, null, new ujj0(mjj0Var, null), 3);
            }
        } else if (lk50Var instanceof lk50.a) {
            ej5.c(o8i0.d(mjj0Var), null, null, new ujj0(mjj0Var, null), 3);
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            uhc.a();
            return null;
        }
        mjj0Var.E0 = true;
        return Unit.a;
    }
}
