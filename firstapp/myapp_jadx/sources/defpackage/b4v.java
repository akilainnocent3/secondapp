package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.handler.MatchEventLeagueTabHandlerImpl$initMatchEventLeagueTabHandler$2", f = "MatchEventLeagueTabHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b4v extends tje0 implements Function2<m4v, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e4v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4v(e4v e4vVar, v1b<? super b4v> v1bVar) {
        super(2, v1bVar);
        this.b = e4vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b4v b4vVar = new b4v(this.b, v1bVar);
        b4vVar.a = obj;
        return b4vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m4v m4vVar, v1b<? super Unit> v1bVar) {
        return ((b4v) create(m4vVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        m4v m4vVar = (m4v) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, m4vVar));
        return Unit.a;
    }
}
