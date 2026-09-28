package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailEventSwitcherHandlerImpl$init$4", f = "MatchEventDetailEventSwitcherHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p1v extends tje0 implements Function2<List<? extends t1v>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q1v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1v(q1v q1vVar, v1b<? super p1v> v1bVar) {
        super(2, v1bVar);
        this.b = q1vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p1v p1vVar = new p1v(this.b, v1bVar);
        p1vVar.a = obj;
        return p1vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends t1v> list, v1b<? super Unit> v1bVar) {
        return ((p1v) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, list));
        return Unit.a;
    }
}
