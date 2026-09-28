package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballPlaybackHandlerImpl$init$4", f = "ScheduledFootballPlaybackHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cf70 extends tje0 implements Function2<List<? extends f870>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ we70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf70(we70 we70Var, v1b<? super cf70> v1bVar) {
        super(2, v1bVar);
        this.b = we70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cf70 cf70Var = new cf70(this.b, v1bVar);
        cf70Var.a = obj;
        return cf70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends f870> list, v1b<? super Unit> v1bVar) {
        return ((cf70) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, list));
        return Unit.a;
    }
}
