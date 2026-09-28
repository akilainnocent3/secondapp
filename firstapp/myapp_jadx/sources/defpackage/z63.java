package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchFlexBetConfig$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z63 extends tje0 implements Function2<BetTypeFlexiBetConfig, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z63(q73 q73Var, v1b<? super z63> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z63 z63Var = new z63(this.b, v1bVar);
        z63Var.a = obj;
        return z63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BetTypeFlexiBetConfig betTypeFlexiBetConfig, v1b<? super Unit> v1bVar) {
        return ((z63) create(betTypeFlexiBetConfig, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.b;
        q73Var.D0.m(betTypeFlexiBetConfig);
        if (!q73Var.z0) {
            q73Var.z0 = true;
            q73Var.U1();
        }
        return Unit.a;
    }
}
