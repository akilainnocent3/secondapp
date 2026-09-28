package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class kdj0 {
    public static final kdj0 e = new kdj0(false, ldj0.d.a, new asd0("", "", asd0.a.d), null);
    public final boolean a;
    public final ldj0 b;
    public final asd0 c;
    public final jdj0 d;

    public kdj0(boolean z, ldj0 ldj0Var, asd0 asd0Var, jdj0 jdj0Var) {
        ldj0Var.getClass();
        this.a = z;
        this.b = ldj0Var;
        this.c = asd0Var;
        this.d = jdj0Var;
    }

    public final BigDecimal a() {
        BigDecimal bigDecimalG = b.g(this.c.b);
        if (bigDecimalG == null) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = s5y.a;
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalG.multiply(bigDecimal2);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdj0)) {
            return false;
        }
        kdj0 kdj0Var = (kdj0) obj;
        return this.a == kdj0Var.a && Intrinsics.g(this.b, kdj0Var.b) && this.c.equals(kdj0Var.c) && Intrinsics.g(this.d, kdj0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        jdj0 jdj0Var = this.d;
        return iHashCode + (jdj0Var == null ? 0 : jdj0Var.hashCode());
    }

    public final String toString() {
        return "WinningPopupDoubleOrNothingStakeInputState(shouldShowStakeKeyboard=" + this.a + ", stakeInputStatus=" + this.b + ", stakeInputState=" + this.c + ", stakeInputHintState=" + this.d + ")";
    }
}
