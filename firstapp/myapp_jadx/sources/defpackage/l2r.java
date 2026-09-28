package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betError$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l2r extends tje0 implements jaj<qxp, String, rkd0, rkd0, v1b<? super qrd0>, Object> {
    public /* synthetic */ qxp a;
    public /* synthetic */ String b;
    public /* synthetic */ BigDecimal c;
    public /* synthetic */ BigDecimal d;
    public final /* synthetic */ f2r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2r(v1b v1bVar, f2r f2rVar) {
        super(5, v1bVar);
        this.e = f2rVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        qxp qxpVar = this.a;
        String str = this.b;
        BigDecimal bigDecimal = this.c;
        BigDecimal bigDecimal2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        try {
            zi50.a aVar = zi50.b;
            bVar = new rkd0(new BigDecimal(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        rkd0 rkd0Var = (rkd0) bVar;
        BigDecimal bigDecimal3 = rkd0Var != null ? rkd0Var.a : null;
        if (bigDecimal3 == null) {
            rkd0.Companion.getClass();
            bigDecimal3 = rkd0.b;
        }
        BigDecimal bigDecimal4 = qxpVar.g;
        BigDecimal bigDecimal5 = qxpVar.f;
        String strB = this.e.B.B();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        strB.getClass();
        if (bigDecimal3.compareTo(bigDecimal4) < 0) {
            return new qrd0.b(bigDecimal4, strB);
        }
        if (bigDecimal3.compareTo(bigDecimal5) > 0) {
            return new qrd0.c(bigDecimal5, strB);
        }
        if (bigDecimal2.compareTo(bigDecimal) > 0) {
            return new qrd0.a(strB, bigDecimal2, bigDecimal);
        }
        return null;
    }

    @Override // defpackage.jaj
    public final Object l(qxp qxpVar, String str, rkd0 rkd0Var, rkd0 rkd0Var2, v1b<? super qrd0> v1bVar) {
        BigDecimal bigDecimal = rkd0Var.a;
        BigDecimal bigDecimal2 = rkd0Var2.a;
        l2r l2rVar = new l2r(v1bVar, this.e);
        l2rVar.a = qxpVar;
        l2rVar.b = str;
        l2rVar.c = bigDecimal;
        l2rVar.d = bigDecimal2;
        return l2rVar.invokeSuspend(Unit.a);
    }
}
