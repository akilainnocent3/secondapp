package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$combinationDataFlow$4", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class z970 extends tje0 implements Function2<Pair<? extends wr4, ? extends nmw>, v1b<? super mmw>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aa70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z970(aa70 aa70Var, v1b<? super z970> v1bVar) {
        super(2, v1bVar);
        this.c = aa70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z970 z970Var = new z970(this.c, v1bVar);
        z970Var.b = obj;
        return z970Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends wr4, ? extends nmw> pair, v1b<? super mmw> v1bVar) {
        return ((z970) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        wr4 wr4Var = (wr4) pair.a;
        nmw nmwVar = (nmw) pair.b;
        rmw rmwVar = this.c.d;
        this.b = null;
        this.a = 1;
        Object objD = ej5.d(rmwVar.a, new qmw(nmwVar, rmwVar, wr4Var, null), this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
