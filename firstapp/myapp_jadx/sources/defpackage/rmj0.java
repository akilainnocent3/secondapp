package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initPayMethodViewModel$1", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rmj0 extends tje0 implements Function2<y200, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tmj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmj0(tmj0 tmj0Var, v1b<? super rmj0> v1bVar) {
        super(2, v1bVar);
        this.b = tmj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rmj0 rmj0Var = new rmj0(this.b, v1bVar);
        rmj0Var.a = obj;
        return rmj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y200 y200Var, v1b<? super Unit> v1bVar) {
        return ((rmj0) create(y200Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y200 y200Var = (y200) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        osa0.a(Intrinsics.g(y200Var != null ? y200Var.b() : null, "mobilemoney"), this.b.P0().u0, null);
        return Unit.a;
    }
}
