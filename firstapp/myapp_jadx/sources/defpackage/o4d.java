package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class o4d implements eky {
    @Override // defpackage.eky
    public final String a(String str, boolean z) {
        str.getClass();
        return str;
    }

    @Override // defpackage.eky
    public final String b(double d, boolean z) {
        BigDecimal bigDecimal;
        if (d > 999999.0d) {
            return m58.a((int) (d / 1000000.0d), "M");
        }
        if (d > 9999.99d) {
            return m58.a((int) (d / 1000.0d), "K");
        }
        if (z) {
            bigDecimal = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        } else {
            BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
            bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
        }
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        return plainString;
    }

    @Override // defpackage.eky
    public final double c(double d) {
        return d;
    }
}
