package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyStatsHandlerImpl$init$3", f = "SportyPenaltyStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s4d0 extends tje0 implements Function2<f5d0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o4d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4d0(o4d0 o4d0Var, v1b<? super s4d0> v1bVar) {
        super(2, v1bVar);
        this.b = o4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s4d0 s4d0Var = new s4d0(this.b, v1bVar);
        s4d0Var.a = obj;
        return s4d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f5d0 f5d0Var, v1b<? super Unit> v1bVar) {
        return ((s4d0) create(f5d0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        f5d0 f5d0Var = (f5d0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, f5d0Var));
        return Unit.a;
    }
}
