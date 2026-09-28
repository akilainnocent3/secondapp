package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipMultipleHandlerImpl$init$2", f = "ScheduledFootballBetslipMultipleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y070 extends tje0 implements Function2<nmw, v1b<? super Unit>, Object> {
    public final /* synthetic */ a170 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y070(v1b v1bVar, a170 a170Var) {
        super(2, v1bVar);
        this.a = a170Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y070(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(nmw nmwVar, v1b<? super Unit> v1bVar) {
        return ((y070) create(nmwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.h;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
        return Unit.a;
    }
}
