package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballEventScoreHandlerImpl$init$8", f = "ScheduledFootballEventScoreHandlerImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class f570 extends tje0 implements Function2<Pair<? extends ni70, ? extends Long>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j570 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f570(j570 j570Var, v1b<? super f570> v1bVar) {
        super(2, v1bVar);
        this.c = j570Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f570 f570Var = new f570(this.c, v1bVar);
        f570Var.b = obj;
        return f570Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends ni70, ? extends Long> pair, v1b<? super Unit> v1bVar) {
        return ((f570) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ni70 ni70Var = (ni70) pair.a;
            long jLongValue = ((Number) pair.b).longValue();
            this.b = null;
            this.a = 1;
            if (this.c.b(ni70Var, jLongValue, this) == y5bVar) {
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
