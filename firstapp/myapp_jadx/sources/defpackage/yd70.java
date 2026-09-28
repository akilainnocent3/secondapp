package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl$init$2", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yd70 extends tje0 implements Function2<kd70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ td70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd70(td70 td70Var, v1b<? super yd70> v1bVar) {
        super(2, v1bVar);
        this.b = td70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yd70 yd70Var = new yd70(this.b, v1bVar);
        yd70Var.a = obj;
        return yd70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kd70 kd70Var, v1b<? super Unit> v1bVar) {
        return ((yd70) create(kd70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        kd70 kd70Var = (kd70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.j;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kd70Var));
        return Unit.a;
    }
}
