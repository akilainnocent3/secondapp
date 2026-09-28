package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballConfirmDialogHandlerImpl$init$2", f = "ScheduledFootballConfirmDialogHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b370 extends tje0 implements Function2<ysa, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z270 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b370(v1b v1bVar, z270 z270Var) {
        super(2, v1bVar);
        this.b = z270Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b370 b370Var = new b370(v1bVar, this.b);
        b370Var.a = obj;
        return b370Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ysa ysaVar, v1b<? super Unit> v1bVar) {
        return ((b370) create(ysaVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ysa ysaVar = (ysa) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ysaVar));
        return Unit.a;
    }
}
