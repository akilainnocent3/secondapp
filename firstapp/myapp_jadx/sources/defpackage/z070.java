package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipMultipleHandlerImpl$init$7", f = "ScheduledFootballBetslipMultipleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z070 extends tje0 implements Function2<vr3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ a170 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z070(v1b v1bVar, a170 a170Var) {
        super(2, v1bVar);
        this.b = a170Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z070 z070Var = new z070(v1bVar, this.b);
        z070Var.a = obj;
        return z070Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vr3 vr3Var, v1b<? super Unit> v1bVar) {
        return ((z070) create(vr3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        vr3 vr3Var = (vr3) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, vr3Var));
        return Unit.a;
    }
}
