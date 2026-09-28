package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchAnyWinActiveState$2", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v63 extends tje0 implements gaj<myh<? super el0>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ q73 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v63(q73 q73Var, v1b<? super v63> v1bVar) {
        super(3, v1bVar);
        this.a = q73Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super el0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new v63(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.H0.m(el0.c);
        return Unit.a;
    }
}
