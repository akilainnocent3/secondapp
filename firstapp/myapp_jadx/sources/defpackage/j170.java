package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipSingleHandlerImpl$init$7", f = "ScheduledFootballBetslipSingleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j170 extends tje0 implements Function2<iv3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ k170 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j170(v1b v1bVar, k170 k170Var) {
        super(2, v1bVar);
        this.b = k170Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j170 j170Var = new j170(v1bVar, this.b);
        j170Var.a = obj;
        return j170Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(iv3 iv3Var, v1b<? super Unit> v1bVar) {
        return ((j170) create(iv3Var, v1bVar)).invokeSuspend(Unit.a);
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
