package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$initFirstDepositState$1", f = "WithdrawBankViewModel.kt", l = {414}, m = "invokeSuspend", v = 2)
public final class ekj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ akj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekj0(akj0 akj0Var, v1b<? super ekj0> v1bVar) {
        super(2, v1bVar);
        this.b = akj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ekj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ekj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            akj0 akj0Var = this.b;
            if (!akj0Var.r0.o()) {
                return Unit.a;
            }
            g1i g1iVarB = akj0Var.l0.b(pu0.c.a);
            this.a = 1;
            if (bm50.p(g1iVarB, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
