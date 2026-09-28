package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$6", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w970 extends tje0 implements Function2<lmw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ aa70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w970(aa70 aa70Var, v1b<? super w970> v1bVar) {
        super(2, v1bVar);
        this.b = aa70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w970 w970Var = new w970(this.b, v1bVar);
        w970Var.a = obj;
        return w970Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lmw lmwVar, v1b<? super Unit> v1bVar) {
        return ((w970) create(lmwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lmw lmwVar = (lmw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lmwVar));
        return Unit.a;
    }
}
