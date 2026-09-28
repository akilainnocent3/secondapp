package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballHeadToHeadStatsHandlerImpl$init$2", f = "ScheduledFootballHeadToHeadStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i670 extends tje0 implements Function2<u670, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f670 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i670(f670 f670Var, v1b<? super i670> v1bVar) {
        super(2, v1bVar);
        this.b = f670Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i670 i670Var = new i670(this.b, v1bVar);
        i670Var.a = obj;
        return i670Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u670 u670Var, v1b<? super Unit> v1bVar) {
        return ((i670) create(u670Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        u670 u670Var = (u670) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, u670Var));
        return Unit.a;
    }
}
