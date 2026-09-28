package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsStatsHandlerImpl$init$3", f = "SportyLegendsStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wmc0 extends tje0 implements Function2<bnc0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ xmc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmc0(xmc0 xmc0Var, v1b<? super wmc0> v1bVar) {
        super(2, v1bVar);
        this.b = xmc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wmc0 wmc0Var = new wmc0(this.b, v1bVar);
        wmc0Var.a = obj;
        return wmc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bnc0 bnc0Var, v1b<? super Unit> v1bVar) {
        return ((wmc0) create(bnc0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        bnc0 bnc0Var = (bnc0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bnc0Var));
        return Unit.a;
    }
}
