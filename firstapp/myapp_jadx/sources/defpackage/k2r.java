package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betAmountInput$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k2r extends tje0 implements kaj<rkd0, String, qrd0, s2q, s2q, v1b<? super f2r.a>, Object> {
    public /* synthetic */ BigDecimal a;
    public /* synthetic */ String b;
    public /* synthetic */ qrd0 c;
    public /* synthetic */ s2q d;
    public /* synthetic */ s2q e;

    public k2r(v1b<? super k2r> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(rkd0 rkd0Var, String str, qrd0 qrd0Var, s2q s2qVar, s2q s2qVar2, v1b<? super f2r.a> v1bVar) {
        BigDecimal bigDecimal = rkd0Var.a;
        k2r k2rVar = new k2r(v1bVar);
        k2rVar.a = bigDecimal;
        k2rVar.b = str;
        k2rVar.c = qrd0Var;
        k2rVar.d = s2qVar;
        k2rVar.e = s2qVar2;
        return k2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimal = this.a;
        String str = this.b;
        qrd0 qrd0Var = this.c;
        s2q s2qVar = this.d;
        s2q s2qVar2 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new f2r.a(str, qrd0Var, bigDecimal, s2qVar, s2qVar2);
    }
}
