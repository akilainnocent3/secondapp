package defpackage;

import com.sportybet.plugin.realsports.data.CashOut;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class lw implements eky {
    @Override // defpackage.eky
    public final String a(String str, boolean z) {
        BigDecimal bigDecimalDivide;
        str.getClass();
        try {
            BigDecimal bigDecimal = new BigDecimal(c.p(str, ",", "", false));
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) == 0) {
                return "-";
            }
            BigDecimal bigDecimal3 = BigDecimal.ONE;
            if (bigDecimal.compareTo(bigDecimal3) == 0) {
                return "-";
            }
            if (bigDecimal.compareTo(gky.b) >= 0) {
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal3);
                bigDecimalSubtract.getClass();
                bigDecimalDivide = bigDecimalSubtract.multiply(gky.c);
                bigDecimalDivide.getClass();
            } else {
                BigDecimal bigDecimalNegate = gky.c.negate();
                bigDecimalNegate.getClass();
                BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal3);
                bigDecimalSubtract2.getClass();
                bigDecimalDivide = bigDecimalNegate.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                bigDecimalDivide.getClass();
            }
            if (z) {
                if (bigDecimalDivide.compareTo(new BigDecimal(999999.99d)) > 0) {
                    Locale locale = Locale.US;
                    BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(new BigDecimal(CashOut.BIG_NUMBER), RoundingMode.HALF_EVEN);
                    bigDecimalDivide2.getClass();
                    return String.format(locale, "+%.0fM", Arrays.copyOf(new Object[]{bigDecimalDivide2}, 1));
                }
                if (bigDecimalDivide.compareTo(new BigDecimal(9999.99d)) > 0) {
                    Locale locale2 = Locale.US;
                    BigDecimal bigDecimalDivide3 = bigDecimalDivide.divide(new BigDecimal(1000), RoundingMode.HALF_EVEN);
                    bigDecimalDivide3.getClass();
                    return String.format(locale2, "+%.0fK", Arrays.copyOf(new Object[]{bigDecimalDivide3}, 1));
                }
            }
            return String.format(Locale.US, bigDecimalDivide.compareTo(bigDecimal2) > 0 ? "+%.0f" : "%.0f", Arrays.copyOf(new Object[]{bigDecimalDivide}, 1));
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // defpackage.eky
    public final String b(double d, boolean z) {
        return a(String.valueOf(d), true);
    }

    @Override // defpackage.eky
    public final double c(double d) {
        BigDecimal bigDecimalAdd;
        try {
            BigDecimal bigDecimal = new BigDecimal(d);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) == 0) {
                bigDecimalAdd = BigDecimal.ONE;
            } else {
                bigDecimalAdd = bigDecimal.compareTo(bigDecimal2) > 0 ? bigDecimal.divide(gky.c).add(BigDecimal.ONE) : BigDecimal.ONE.add(gky.c.divide(bigDecimal.negate(), 2, RoundingMode.HALF_UP));
            }
            return bigDecimalAdd.setScale(2, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception unused) {
            return d;
        }
    }
}
