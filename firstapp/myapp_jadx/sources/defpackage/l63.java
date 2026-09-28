package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$3", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l63 extends tje0 implements Function2<a53, v1b<? super Unit>, Object> {
    public final /* synthetic */ q73 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l63(q73 q73Var, v1b<? super l63> v1bVar) {
        super(2, v1bVar);
        this.a = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l63(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a53 a53Var, v1b<? super Unit> v1bVar) {
        return ((l63) create(a53Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.Z1();
        return Unit.a;
    }
}
