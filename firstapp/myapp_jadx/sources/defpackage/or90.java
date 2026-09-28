package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationticketdetail.handler.SimulationTicketDetailHandlerImpl$initSimulationTicketDetailHandler$4", f = "SimulationTicketDetailHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class or90 extends tje0 implements Function2<ts90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pr90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or90(pr90 pr90Var, v1b<? super or90> v1bVar) {
        super(2, v1bVar);
        this.b = pr90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        or90 or90Var = new or90(this.b, v1bVar);
        or90Var.a = obj;
        return or90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ts90 ts90Var, v1b<? super Unit> v1bVar) {
        return ((or90) create(ts90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ts90 ts90Var = (ts90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.v;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ts90Var));
        return Unit.a;
    }
}
