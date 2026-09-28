package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$14", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hj70 extends tje0 implements Function2<rj70.a, v1b<? super Unit>, Object> {
    public final /* synthetic */ pj70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj70(v1b v1bVar, pj70 pj70Var) {
        super(2, v1bVar);
        this.a = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hj70(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rj70.a aVar, v1b<? super Unit> v1bVar) {
        return ((hj70) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.d.a(new tz60.g(0), k00.d, k00.c);
        return Unit.a;
    }
}
