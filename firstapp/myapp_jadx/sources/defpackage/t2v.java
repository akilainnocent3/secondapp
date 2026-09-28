package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailTeamInfoHeaderStateHandlerImpl$init$2", f = "MatchEventDetailTeamInfoHeaderStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t2v extends tje0 implements Function2<n2v, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ v2v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2v(v2v v2vVar, v1b<? super t2v> v1bVar) {
        super(2, v1bVar);
        this.b = v2vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t2v t2vVar = new t2v(this.b, v1bVar);
        t2vVar.a = obj;
        return t2vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(n2v n2vVar, v1b<? super Unit> v1bVar) {
        return ((t2v) create(n2vVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        n2v n2vVar = (n2v) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, n2vVar));
        return Unit.a;
    }
}
