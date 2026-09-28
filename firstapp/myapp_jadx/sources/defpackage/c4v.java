package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.handler.MatchEventLeagueTabHandlerImpl$initMatchEventLeagueTabHandler$3", f = "MatchEventLeagueTabHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c4v extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e4v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4v(e4v e4vVar, v1b<? super c4v> v1bVar) {
        super(2, v1bVar);
        this.b = e4vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c4v c4vVar = new c4v(this.b, v1bVar);
        c4vVar.a = obj;
        return c4vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((c4v) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
        return Unit.a;
    }
}
