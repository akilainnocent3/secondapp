package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOpenBetsCountHandlerImpl$init$6", f = "ScheduledFootballOpenBetsCountHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lb70 extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mb70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb70(v1b v1bVar, mb70 mb70Var) {
        super(2, v1bVar);
        this.b = mb70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lb70 lb70Var = new lb70(v1bVar, this.b);
        lb70Var.a = obj;
        return lb70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
        return ((lb70) create(num, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Integer num = (Integer) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, num != null ? String.valueOf(num.intValue()) : null));
        return Unit.a;
    }
}
