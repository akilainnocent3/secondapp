package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballWinningDialogHandlerImpl$init$3", f = "ScheduledFootballWinningDialogHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class km70 extends tje0 implements Function2<xro, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mm70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km70(v1b v1bVar, mm70 mm70Var) {
        super(2, v1bVar);
        this.b = mm70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        km70 km70Var = new km70(v1bVar, this.b);
        km70Var.a = obj;
        return km70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xro xroVar, v1b<? super Unit> v1bVar) {
        return ((km70) create(xroVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        xro xroVar;
        xro xroVar2 = (xro) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mm70 mm70Var = this.b;
        mm70Var.a.g();
        wwd0 wwd0Var = mm70Var.e;
        do {
            value = wwd0Var.getValue();
            xroVar = (xro) value;
            if (xroVar == null) {
                xroVar = xroVar2;
            }
        } while (!wwd0Var.g(value, xroVar));
        return Unit.a;
    }
}
