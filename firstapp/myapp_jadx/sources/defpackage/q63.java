package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$checkMayReFetchOutcomeDataWhenOnResume$1", f = "BetSlipViewModel.kt", l = {1831}, m = "invokeSuspend", v = 2)
public final class q63 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public final /* synthetic */ q73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q63(q73 q73Var, v1b<? super q63> v1bVar) {
        super(2, v1bVar);
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q63(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q63) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        q73 q73Var = this.c;
        jrm jrmVar = q73Var.N;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            Long l = q73Var.F1;
            if (l == null) {
                return Unit.a;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            ot3 ot3Var = q73Var.B;
            this.a = jCurrentTimeMillis;
            this.b = 1;
            obj = ot3Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.a;
            uj50.b(obj);
        }
        aw3 aw3Var = (aw3) obj;
        if (!aw3Var.a || j < aw3Var.b || jrmVar.U().isEmpty()) {
            return Unit.a;
        }
        ArrayList arrayListU = jrmVar.U();
        q73Var.C1(g880.k(arrayListU, true), aak.v, arrayListU);
        q73Var.Q0();
        return Unit.a;
    }
}
