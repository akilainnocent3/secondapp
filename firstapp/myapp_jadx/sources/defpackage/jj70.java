package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$4", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jj70 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ long a;
    public final /* synthetic */ pj70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj70(v1b v1bVar, pj70 pj70Var) {
        super(2, v1bVar);
        this.b = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jj70 jj70Var = new jj70(v1bVar, this.b);
        jj70Var.a = ((Number) obj).longValue();
        return jj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((jj70) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        long j = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
            ((Number) value).longValue();
        } while (!wwd0Var.g(value, new Long(j)));
        return Unit.a;
    }
}
