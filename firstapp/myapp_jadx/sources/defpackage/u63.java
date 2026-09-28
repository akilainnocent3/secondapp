package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchAnyWinActiveState$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u63 extends tje0 implements Function2<el0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u63(q73 q73Var, v1b<? super u63> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u63 u63Var = new u63(this.b, v1bVar);
        u63Var.a = obj;
        return u63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(el0 el0Var, v1b<? super Unit> v1bVar) {
        return ((u63) create(el0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        el0 el0Var = (el0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.H0.m(el0Var);
        return Unit.a;
    }
}
