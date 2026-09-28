package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betPanelFlowInput$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m2r extends tje0 implements kaj<Boolean, rkd0, hsq, qxp, Boolean, v1b<? super f2r.b>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ BigDecimal b;
    public /* synthetic */ hsq c;
    public /* synthetic */ qxp d;
    public /* synthetic */ boolean e;

    public m2r(v1b<? super m2r> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(Boolean bool, rkd0 rkd0Var, hsq hsqVar, qxp qxpVar, Boolean bool2, v1b<? super f2r.b> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        BigDecimal bigDecimal = rkd0Var.a;
        boolean zBooleanValue2 = bool2.booleanValue();
        m2r m2rVar = new m2r(v1bVar);
        m2rVar.a = zBooleanValue;
        m2rVar.b = bigDecimal;
        m2rVar.c = hsqVar;
        m2rVar.d = qxpVar;
        m2rVar.e = zBooleanValue2;
        return m2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        BigDecimal bigDecimal = this.b;
        hsq hsqVar = this.c;
        qxp qxpVar = this.d;
        boolean z2 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new f2r.b(z, bigDecimal, hsqVar, qxpVar, z2);
    }
}
