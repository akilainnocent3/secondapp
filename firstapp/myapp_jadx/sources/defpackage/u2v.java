package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailTeamInfoHeaderStateHandlerImpl$init$5", f = "MatchEventDetailTeamInfoHeaderStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u2v extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ v2v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2v(v2v v2vVar, v1b<? super u2v> v1bVar) {
        super(2, v1bVar);
        this.a = v2vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u2v(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((u2v) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v2v v2vVar = this.a;
        jvd0 jvd0Var = v2vVar.c;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            v2vVar.c = ej5.c(v2vVar.b, null, null, new o2v(v2vVar, null), 3);
        }
        return Unit.a;
    }
}
