package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$goSetEmail$1", f = "WithdrawTransferViewModel.kt", l = {469}, m = "invokeSuspend", v = 2)
public final class wpj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hqj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpj0(hqj0 hqj0Var, v1b<? super wpj0> v1bVar) {
        super(2, v1bVar);
        this.b = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wpj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wpj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        hqj0 hqj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            hqj0Var.x0.a(new rpj0.a(bc6Var));
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int i2 = hqj0.E0;
        vpg0.d(hqj0Var.v);
        return Unit.a;
    }
}
