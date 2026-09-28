package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationbethistory.handler.SimulationBetHistoryHandlerImpl$initSimulationBetHistoryHandler$4", f = "SimulationBetHistoryHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tl90 extends tje0 implements Function2<sm90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ vl90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl90(vl90 vl90Var, v1b<? super tl90> v1bVar) {
        super(2, v1bVar);
        this.b = vl90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tl90 tl90Var = new tl90(this.b, v1bVar);
        tl90Var.a = obj;
        return tl90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sm90 sm90Var, v1b<? super Unit> v1bVar) {
        return ((tl90) create(sm90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        sm90 sm90Var = (sm90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, sm90Var));
        return Unit.a;
    }
}
