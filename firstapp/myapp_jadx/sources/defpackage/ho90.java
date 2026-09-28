package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$initSimulationSettlementHandler$4", f = "SimulationSettlementHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ho90 extends tje0 implements Function2<qq90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ do90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho90(v1b v1bVar, do90 do90Var) {
        super(2, v1bVar);
        this.b = do90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ho90 ho90Var = new ho90(v1bVar, this.b);
        ho90Var.a = obj;
        return ho90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qq90 qq90Var, v1b<? super Unit> v1bVar) {
        return ((ho90) create(qq90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        qq90 qq90Var = (qq90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.p;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, qq90Var));
        return Unit.a;
    }
}
