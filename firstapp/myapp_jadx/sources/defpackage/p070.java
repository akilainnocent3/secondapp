package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipHandlerImpl$init$8", f = "ScheduledFootballBetslipHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p070 extends tje0 implements Function2<cw3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q070 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p070(v1b v1bVar, q070 q070Var) {
        super(2, v1bVar);
        this.b = q070Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p070 p070Var = new p070(v1bVar, this.b);
        p070Var.a = obj;
        return p070Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cw3 cw3Var, v1b<? super Unit> v1bVar) {
        return ((p070) create(cw3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        cw3 cw3Var = (cw3) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cw3Var));
        return Unit.a;
    }
}
