package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$currentState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t2r extends tje0 implements kaj<dqh0, ssq, yxq, g0q, ovp, v1b<? super f2r.c>, Object> {
    public /* synthetic */ dqh0 a;
    public /* synthetic */ ssq b;
    public /* synthetic */ yxq c;
    public /* synthetic */ g0q d;
    public /* synthetic */ ovp e;

    public t2r(v1b<? super t2r> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(dqh0 dqh0Var, ssq ssqVar, yxq yxqVar, g0q g0qVar, ovp ovpVar, v1b<? super f2r.c> v1bVar) {
        t2r t2rVar = new t2r(v1bVar);
        t2rVar.a = dqh0Var;
        t2rVar.b = ssqVar;
        t2rVar.c = yxqVar;
        t2rVar.d = g0qVar;
        t2rVar.e = ovpVar;
        return t2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dqh0 dqh0Var = this.a;
        ssq ssqVar = this.b;
        yxq yxqVar = this.c;
        g0q g0qVar = this.d;
        ovp ovpVar = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new f2r.c(yxqVar, ssqVar, dqh0Var, g0qVar, ovpVar);
    }
}
