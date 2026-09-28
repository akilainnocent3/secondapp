package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class p54 {
    public static final BigDecimal a = BigDecimal.valueOf(10000L);

    public static final BigDecimal a(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        return bigDecimal.compareTo(bigDecimal2) >= 0 ? bigDecimal : bigDecimal2;
    }

    public static final BigDecimal b(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal bigDecimalDivide = bigDecimal.divide(a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static final BigDecimal c(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal bigDecimal2 = a;
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }
}
