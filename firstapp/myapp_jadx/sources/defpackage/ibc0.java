package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetslipSingleHandlerImpl$init$5", f = "SportyLegendsBetslipSingleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ibc0 extends tje0 implements Function2<iv3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jbc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibc0(v1b v1bVar, jbc0 jbc0Var) {
        super(2, v1bVar);
        this.b = jbc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ibc0 ibc0Var = new ibc0(v1bVar, this.b);
        ibc0Var.a = obj;
        return ibc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(iv3 iv3Var, v1b<? super Unit> v1bVar) {
        return ((ibc0) create(iv3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        iv3 iv3Var = (iv3) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, iv3Var));
        return Unit.a;
    }
}
