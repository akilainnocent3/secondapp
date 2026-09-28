package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailEventSwitcherHandlerImpl$init$2", f = "MatchEventDetailEventSwitcherHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1v extends tje0 implements Function2<u1v, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q1v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1v(q1v q1vVar, v1b<? super n1v> v1bVar) {
        super(2, v1bVar);
        this.b = q1vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n1v n1vVar = new n1v(this.b, v1bVar);
        n1vVar.a = obj;
        return n1vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u1v u1vVar, v1b<? super Unit> v1bVar) {
        return ((n1v) create(u1vVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        u1v u1vVar = (u1v) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, u1vVar));
        return Unit.a;
    }
}
