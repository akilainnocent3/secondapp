package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulation.handler.SimulationEventHandlerImpl$initSimulationEventHandler$1", f = "SimulationEventHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wm90 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ xm90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm90(xm90 xm90Var, v1b<? super wm90> v1bVar) {
        super(2, v1bVar);
        this.b = xm90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wm90 wm90Var = new wm90(this.b, v1bVar);
        wm90Var.a = ((Boolean) obj).booleanValue();
        return wm90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((wm90) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.b(z);
        return Unit.a;
    }
}
