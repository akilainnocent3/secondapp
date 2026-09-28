package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballEventScoreHandlerImpl$init$9", f = "ScheduledFootballEventScoreHandlerImpl.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class g570 extends tje0 implements Function2<q570, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j570 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g570(j570 j570Var, v1b<? super g570> v1bVar) {
        super(2, v1bVar);
        this.c = j570Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g570 g570Var = new g570(this.c, v1bVar);
        g570Var.b = obj;
        return g570Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q570 q570Var, v1b<? super Unit> v1bVar) {
        return ((g570) create(q570Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        q570 q570Var = (q570) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.a(q570Var, this) == y5bVar) {
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
