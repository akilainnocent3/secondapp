package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSingleBetHandlerImpl$init$6", f = "ScheduledFootballSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zj70 extends tje0 implements Function2<et90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bk70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj70(bk70 bk70Var, v1b<? super zj70> v1bVar) {
        super(2, v1bVar);
        this.b = bk70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zj70 zj70Var = new zj70(this.b, v1bVar);
        zj70Var.a = obj;
        return zj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(et90 et90Var, v1b<? super Unit> v1bVar) {
        return ((zj70) create(et90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        et90 et90Var = (et90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, et90Var));
        return Unit.a;
    }
}
