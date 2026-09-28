package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationbethistory.handler.SimulationBetHistoryHandlerImpl$initSimulationBetHistoryHandler$2", f = "SimulationBetHistoryHandlerImpl.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class rl90 extends tje0 implements Function2<qm90.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vl90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl90(vl90 vl90Var, v1b<? super rl90> v1bVar) {
        super(2, v1bVar);
        this.c = vl90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rl90 rl90Var = new rl90(this.c, v1bVar);
        rl90Var.b = obj;
        return rl90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qm90.a aVar, v1b<? super Unit> v1bVar) {
        return ((rl90) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qm90.a aVar = (qm90.a) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.b(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
