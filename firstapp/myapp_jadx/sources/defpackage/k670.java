package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballHeadToHeadStatsHandlerImpl$init$5", f = "ScheduledFootballHeadToHeadStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k670 extends tje0 implements Function2<u670, v1b<? super Unit>, Object> {
    public final /* synthetic */ f670 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k670(f670 f670Var, v1b<? super k670> v1bVar) {
        super(2, v1bVar);
        this.a = f670Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k670(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u670 u670Var, v1b<? super Unit> v1bVar) {
        return ((k670) create(u670Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.b.a(new tz60.f(0), k00.d, k00.c);
        return Unit.a;
    }
}
