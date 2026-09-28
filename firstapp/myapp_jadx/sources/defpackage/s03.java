package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s03 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final boolean d;
    public final BigDecimal e;
    public final qcn<skd0> f;
    public final BigDecimal g;
    public final BigDecimal h;

    public s03(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, BigDecimal bigDecimal4, qcn<skd0> qcnVar) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        qcnVar.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = z;
        this.e = bigDecimal4;
        this.f = qcnVar;
        if (bigDecimal4.compareTo(bigDecimal) >= 0) {
            bigDecimal.getClass();
            bigDecimal2.getClass();
            bigDecimal4.getClass();
            if (bigDecimal4.compareTo(bigDecimal) >= 0 && bigDecimal4.compareTo(bigDecimal2) <= 0) {
                bigDecimal2 = bigDecimal4;
            }
        }
        this.g = bigDecimal2;
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimal5 = skd0.b;
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
        bigDecimalAbs.getClass();
        bigDecimalAbs.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100L);
        bigDecimalValueOf.getClass();
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalDivide = bigDecimalAbs.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN);
        bigDecimalDivide.getClass();
        bigDecimalDivide.getClass();
        this.h = bigDecimalDivide;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s03)) {
            return false;
        }
        s03 s03Var = (s03) obj;
        BigDecimal bigDecimal = s03Var.a;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.a, bigDecimal) && Intrinsics.g(this.b, s03Var.b) && Intrinsics.g(this.c, s03Var.c) && this.d == s03Var.d && Intrinsics.g(this.e, s03Var.e) && Intrinsics.g(this.f, s03Var.f);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = skd0.b;
        return this.f.hashCode() + dd3.a(this.e, mtg0.a(dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetSliderState(min=");
        r03.a(", max=", sb, this.a);
        r03.a(", value=", sb, this.b);
        r03.a(", hasGift=", sb, this.c);
        sb.append(this.d);
        sb.append(", userWallet=");
        r03.a(", chipsList=", sb, this.e);
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s03() {
        BigDecimal bigDecimal = skd0.b;
        this(bigDecimal, bigDecimal, bigDecimal, false, bigDecimal, n1a0.c);
    }
}
