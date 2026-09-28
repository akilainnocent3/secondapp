package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSelectionHandlerImpl$init$3", f = "ScheduledFootballSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hi70 extends tje0 implements Function2<d880, v1b<? super Unit>, Object> {
    public final /* synthetic */ li70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi70(li70 li70Var, v1b<? super hi70> v1bVar) {
        super(2, v1bVar);
        this.a = li70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hi70(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d880 d880Var, v1b<? super Unit> v1bVar) {
        return ((hi70) create(d880Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.a.a(new tz60.a(0), k00.d, k00.c);
        return Unit.a;
    }
}
