package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$sendTrackEvent$1", f = "QuickBetViewModel.kt", l = {328}, m = "invokeSuspend", v = 2)
public final class xf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tf30 b;
    public final /* synthetic */ v03.n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf30(tf30 tf30Var, v03.n nVar, v1b<? super xf30> v1bVar) {
        super(2, v1bVar);
        this.b = tf30Var;
        this.c = nVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xf30(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tf30 tf30Var = this.b;
        iym iymVar = tf30Var.H;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (tf30Var.y.D()) {
                return Unit.a;
            }
            pjh0 pjh0Var = tf30Var.F;
            this.a = 1;
            obj = pjh0Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        String str = (String) obj;
        v03.n nVar = this.c;
        if (nVar instanceof v03.l) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - tf30Var.a0 > 100) {
                gym.a(iymVar, ((v03.l) nVar).a(str));
                tf30Var.a0 = jCurrentTimeMillis;
            }
        } else {
            v03.n nVarA = nVar.a(str);
            gym.a(iymVar, nVarA);
            if (nVarA instanceof v03.o) {
                z8j.a(tf30Var.M, nVarA);
            }
        }
        return Unit.a;
    }
}
