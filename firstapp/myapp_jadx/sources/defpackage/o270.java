package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl$init$4", f = "ScheduledFootballCellHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o270 extends tje0 implements Function2<qcn<? extends w270>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ a270 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o270(v1b v1bVar, a270 a270Var) {
        super(2, v1bVar);
        this.b = a270Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o270 o270Var = new o270(v1bVar, this.b);
        o270Var.a = obj;
        return o270Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qcn<? extends w270> qcnVar, v1b<? super Unit> v1bVar) {
        return ((o270) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        qcn qcnVar = (qcn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, qcnVar));
        return Unit.a;
    }
}
