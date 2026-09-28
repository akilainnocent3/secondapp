package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballEventScoreHandlerImpl$init$4", f = "ScheduledFootballEventScoreHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d570 extends tje0 implements Function2<Map<String, ? extends qcn<? extends r570>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j570 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d570(j570 j570Var, v1b<? super d570> v1bVar) {
        super(2, v1bVar);
        this.b = j570Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d570 d570Var = new d570(this.b, v1bVar);
        d570Var.a = obj;
        return d570Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends qcn<? extends r570>> map, v1b<? super Unit> v1bVar) {
        return ((d570) create(map, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map map = (Map) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, map));
        return Unit.a;
    }
}
