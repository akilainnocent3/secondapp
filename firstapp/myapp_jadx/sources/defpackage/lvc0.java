package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyBetslipHandlerImpl$init$3", f = "SportyPenaltyBetslipHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lvc0 extends tje0 implements Function2<cw3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mvc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvc0(mvc0 mvc0Var, v1b<? super lvc0> v1bVar) {
        super(2, v1bVar);
        this.b = mvc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lvc0 lvc0Var = new lvc0(this.b, v1bVar);
        lvc0Var.a = obj;
        return lvc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cw3 cw3Var, v1b<? super Unit> v1bVar) {
        return ((lvc0) create(cw3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        cw3 cw3Var = (cw3) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cw3Var));
        return Unit.a;
    }
}
