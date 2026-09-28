package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCreateTicketErrorHandlerImpl$init$2", f = "ScheduledFootballCreateTicketErrorHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s370 extends tje0 implements Function2<zs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ t370 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s370(t370 t370Var, v1b<? super s370> v1bVar) {
        super(2, v1bVar);
        this.b = t370Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s370 s370Var = new s370(this.b, v1bVar);
        s370Var.a = obj;
        return s370Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zs zsVar, v1b<? super Unit> v1bVar) {
        return ((s370) create(zsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        zs zsVar = (zs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zsVar));
        return Unit.a;
    }
}
