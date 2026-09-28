package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$requestWithdraw$1", f = "WithdrawBankViewModel.kt", l = {738}, m = "invokeSuspend", v = 2)
public final class kkj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ akj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkj0(akj0 akj0Var, v1b<? super kkj0> v1bVar) {
        super(2, v1bVar);
        this.b = akj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kkj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kkj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        akj0 akj0Var = this.b;
        wwd0 wwd0Var = akj0Var.G;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (akj0Var.o0.getAccount() == null) {
                b.h(akj0Var.f);
                return Unit.a;
            }
            WithdrawRequest withdrawRequestP1 = akj0Var.P1();
            if (withdrawRequestP1 == null) {
                return Unit.a;
            }
            wwd0Var.setValue(tzs.b.a);
            xqj0 xqj0Var = akj0Var.j0;
            y300.a aVar = akj0Var.r0;
            ku90<a> ku90Var = akj0Var.f;
            ku90<spg0> ku90Var2 = akj0Var.v;
            ku90<m480> ku90Var3 = akj0Var.y;
            ku90<tng0> ku90Var4 = akj0Var.A;
            ku90<kqj0> ku90Var5 = akj0Var.d0;
            wjj0 wjj0Var = akj0Var.N0;
            ku90<pdd0> ku90Var6 = akj0Var.K;
            this.a = 1;
            if (xqj0Var.a(aVar, withdrawRequestP1, ku90Var, ku90Var2, ku90Var3, ku90Var4, ku90Var5, wjj0Var, ku90Var6, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int i2 = akj0.O0;
        wwd0Var.setValue(tzs.a.a);
        lqj0.a(akj0Var.d0);
        vpg0.d(akj0Var.v);
        akj0Var.x1("");
        return Unit.a;
    }
}
