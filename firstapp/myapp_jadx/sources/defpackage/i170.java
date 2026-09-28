package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipSingleHandlerImpl$init$2", f = "ScheduledFootballBetslipSingleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i170 extends tje0 implements Function2<ft90, v1b<? super Unit>, Object> {
    public final /* synthetic */ k170 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i170(v1b v1bVar, k170 k170Var) {
        super(2, v1bVar);
        this.a = k170Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i170(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ft90 ft90Var, v1b<? super Unit> v1bVar) {
        return ((i170) create(ft90Var, v1bVar)).invokeSuspend(Unit.a);
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
