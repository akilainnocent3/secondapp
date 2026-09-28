package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$addMyNumberState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i2r extends tje0 implements kaj<String, qxp, ssq, lk50<? extends Unit>, Boolean, v1b<? super ovp>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ qxp b;
    public /* synthetic */ ssq c;
    public /* synthetic */ lk50 d;
    public /* synthetic */ boolean e;

    public i2r(v1b<? super i2r> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(String str, qxp qxpVar, ssq ssqVar, lk50<? extends Unit> lk50Var, Boolean bool, v1b<? super ovp> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        i2r i2rVar = new i2r(v1bVar);
        i2rVar.a = str;
        i2rVar.b = qxpVar;
        i2rVar.c = ssqVar;
        i2rVar.d = lk50Var;
        i2rVar.e = zBooleanValue;
        return i2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        qxp qxpVar = this.b;
        ssq ssqVar = this.c;
        lk50 lk50Var = this.d;
        boolean z = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(str, "standard") && !(qxpVar.j instanceof dvq.c)) {
            if ((ssqVar != null ? ssqVar.d : null) == atq.SNM) {
                if ((lk50Var instanceof lk50.a) || (lk50Var instanceof lk50.c)) {
                    return z ? ovp.b : ovp.a;
                }
                if (Intrinsics.g(lk50Var, lk50.b.a)) {
                    return ovp.d;
                }
                uhc.a();
                return null;
            }
        }
        return ovp.c;
    }
}
