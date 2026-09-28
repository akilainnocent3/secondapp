package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$12", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gj70 extends tje0 implements Function2<zs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj70(v1b v1bVar, pj70 pj70Var) {
        super(2, v1bVar);
        this.b = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gj70 gj70Var = new gj70(v1bVar, this.b);
        gj70Var.a = obj;
        return gj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zs zsVar, v1b<? super Unit> v1bVar) {
        return ((gj70) create(zsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        zs zsVar = (zs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.n;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zsVar));
        return Unit.a;
    }
}
