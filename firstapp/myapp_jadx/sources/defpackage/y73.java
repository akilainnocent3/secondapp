package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$sendTrackEvent$1", f = "BetSlipViewModel.kt", l = {1806}, m = "invokeSuspend", v = 2)
public final class y73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v03 b;
    public final /* synthetic */ q73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y73(v03 v03Var, q73 q73Var, v1b<? super y73> v1bVar) {
        super(2, v1bVar);
        this.b = v03Var;
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y73(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        v03 v03Var = this.b;
        q73 q73Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (!(v03Var instanceof v03.n)) {
                q73Var.T1(v03Var);
            } else {
                if (q73Var.N.D()) {
                    return Unit.a;
                }
                pjh0 pjh0Var = q73Var.U;
                this.a = 1;
                obj = pjh0Var.a(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        String str = (String) obj;
        if (v03Var instanceof v03.l) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - q73Var.J1 > 100) {
                q73Var.T1(((v03.l) v03Var).a(str));
                q73Var.J1 = jCurrentTimeMillis;
            }
        } else {
            q73Var.T1(((v03.n) v03Var).a(str));
        }
        return Unit.a;
    }
}
