package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipHandlerImpl$init$3", f = "ScheduledFootballBetslipHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m070 extends tje0 implements Function2<Pair<? extends ft90, ? extends nmw>, v1b<? super Unit>, Object> {
    public final /* synthetic */ q070 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m070(v1b v1bVar, q070 q070Var) {
        super(2, v1bVar);
        this.a = q070Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m070(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends ft90, ? extends nmw> pair, v1b<? super Unit> v1bVar) {
        return ((m070) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lni0.a));
        return Unit.a;
    }
}
