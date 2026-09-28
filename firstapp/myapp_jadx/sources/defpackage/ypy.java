package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class ypy {
    public static final mpe0 a = hwr.b(new wpy());

    public static BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bigDecimal3.compareTo(bigDecimal4) <= 0) {
            bigDecimal4.getClass();
            return bigDecimal4;
        }
        BigDecimal bigDecimalDivide = bigDecimal3.multiply(bigDecimal).add(bigDecimal2).divide(bigDecimal3, 8, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static BigDecimal b() {
        return (BigDecimal) a.getValue();
    }

    public static BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalMin = bigDecimal2.multiply(b()).min(bigDecimal);
        bigDecimalMin.getClass();
        return bigDecimalMin;
    }
}
