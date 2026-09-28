package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailTeamInfoHeaderStateHandlerImpl$dismissTooltip$1", f = "MatchEventDetailTeamInfoHeaderStateHandlerImpl.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class p2v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v2v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2v(v2v v2vVar, v1b<? super p2v> v1bVar) {
        super(2, v1bVar);
        this.b = v2vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p2v(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p2v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yho yhoVar = this.b.a;
            wm20 wm20VarA = yhoVar.m.a(yhoVar, yho.o[12]);
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (wm20VarA.g(this, bool) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
