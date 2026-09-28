package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyOddsFilterHandlerImpl$init$3", f = "SportyPenaltyOddsFilterHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dzc0 extends tje0 implements Function2<viy, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gzc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzc0(gzc0 gzc0Var, v1b<? super dzc0> v1bVar) {
        super(2, v1bVar);
        this.b = gzc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dzc0 dzc0Var = new dzc0(this.b, v1bVar);
        dzc0Var.a = obj;
        return dzc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(viy viyVar, v1b<? super Unit> v1bVar) {
        return ((dzc0) create(viyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        viy viyVar = (viy) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, viyVar));
        return Unit.a;
    }
}
