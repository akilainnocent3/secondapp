package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class m9k {
    public final nzm a;
    public final vxw b;
    public final mgb0 c;

    public m9k(nzm nzmVar, vxw vxwVar, mgb0 mgb0Var) {
        nzmVar.getClass();
        vxwVar.getClass();
        mgb0Var.getClass();
        this.a = nzmVar;
        this.b = vxwVar;
        this.c = mgb0Var;
    }

    public static boolean a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null || bigDecimal2 == null) {
            if (bigDecimal == null) {
                return bigDecimal2 == null;
            }
            if (bigDecimal2 != null) {
                rkd0.a aVar = rkd0.Companion;
                return bigDecimal.equals(bigDecimal2);
            }
        } else if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return true;
        }
        return false;
    }

    public static BigDecimal c(double d) {
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(d).divide(BigDecimal.valueOf(10000L));
        bigDecimalDivide.getClass();
        rkd0.a aVar = rkd0.Companion;
        return bigDecimalDivide;
    }

    public final jte b() {
        k1i k1iVarA = r1i.a(new xzh(this.c.isLoginFlow(), new i9k(this, null)), hzh.a(new h9k(this, null)), hzh.a(new l9k(this, null)), new j9k(this, null));
        e9k e9kVar = new e9k();
        y8h0.d(2, e9kVar);
        return uzh.c(k1iVarA, uzh.a, e9kVar);
    }
}
