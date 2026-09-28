package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$contentState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r2r extends tje0 implements jaj<lk50<? extends qxp>, hsq, uf00<? extends usq>, uf00<? extends zsq>, v1b<? super k0r>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ hsq b;
    public /* synthetic */ uf00 c;
    public /* synthetic */ uf00 d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        hsq hsqVar = this.b;
        uf00 uf00Var = this.c;
        uf00 uf00Var2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            return k0r.a.a;
        }
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            return k0r.b.a;
        }
        if (lk50Var instanceof lk50.c) {
            return new k0r.c(hsqVar, uf00Var, uf00Var2, !(((qxp) ((lk50.c) lk50Var).a).j instanceof dvq.c), hsqVar.b);
        }
        uhc.a();
        return null;
    }

    @Override // defpackage.jaj
    public final Object l(lk50<? extends qxp> lk50Var, hsq hsqVar, uf00<? extends usq> uf00Var, uf00<? extends zsq> uf00Var2, v1b<? super k0r> v1bVar) {
        r2r r2rVar = new r2r(5, v1bVar);
        r2rVar.a = lk50Var;
        r2rVar.b = hsqVar;
        r2rVar.c = uf00Var;
        r2rVar.d = uf00Var2;
        return r2rVar.invokeSuspend(Unit.a);
    }
}
