package defpackage;

import com.sporty.android.common.uievent.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$setupSportyPin$1", f = "WithdrawBankV2ViewModel.kt", l = {343}, m = "invokeSuspend", v = 2)
public final class ujj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mjj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujj0(mjj0 mjj0Var, v1b<? super ujj0> v1bVar) {
        super(2, v1bVar);
        this.b = mjj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ujj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ujj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        mjj0 mjj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            pi80 pi80Var = mjj0Var.m0;
            this.a = 1;
            pi80Var.getClass();
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            mjj0Var.y.a(new m480.e(bc6Var));
            Unit unit = Unit.a;
            obj = bc6Var.o();
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
        oi80 oi80Var = (oi80) obj;
        if (Intrinsics.g(oi80Var, oi80.b.a)) {
            mjj0Var.E0 = false;
            ej5.c(o8i0.d(mjj0Var), null, null, new rjj0(mjj0Var, null), 3);
        } else {
            if (!Intrinsics.g(oi80Var, oi80.a.a)) {
                uhc.a();
                return null;
            }
            b.b(mjj0Var.f);
        }
        return Unit.a;
    }
}
