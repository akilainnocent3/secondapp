package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s5y {
    public static final BigDecimal a = BigDecimal.valueOf(10000L);
    public static final Locale b;
    public static final NumberFormat c;

    static {
        Locale locale = Locale.US;
        b = locale;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        c = numberFormat;
    }

    public static BigDecimal a(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal bigDecimalDivide = bigDecimal.divide(a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static final String b(int i, BigDecimal bigDecimal) {
        return String.format(b, pe4.b(i, "%,.", "f"), Arrays.copyOf(new Object[]{bigDecimal}, 1));
    }

    public static final String c(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        String str = c.format(bigDecimal);
        str.getClass();
        return str;
    }

    public static final String d(Number number) {
        if (number == null) {
            return "--";
        }
        BigDecimal bigDecimalDivide = new BigDecimal(number.toString()).divide(a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return b(2, bigDecimalDivide);
    }

    public static final String e(Number number) {
        if (number == null) {
            return "--";
        }
        BigDecimal bigDecimalDivide = new BigDecimal(number.toString()).divide(a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide.subtract(BigDecimal.valueOf(bigDecimalDivide.longValue())).compareTo(BigDecimal.ZERO) > 0 ? b(2, bigDecimalDivide) : b(0, bigDecimalDivide);
    }

    public static final float g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Object bVar;
        float fFloatValue;
        try {
            zi50.a aVar = zi50.b;
            if (bigDecimal == null) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = bigDecimal.divide(bigDecimal2, 5, RoundingMode.HALF_UP).floatValue();
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
            }
            bVar = Float.valueOf(fFloatValue);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Float f = (Float) bVar;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public static BigDecimal h(Long l) {
        BigDecimal bigDecimalDivide = new BigDecimal(l.toString()).divide(a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static final String f(int i) {
        return String.format(b, oAudzpbdOhCI.BJVFDMkShmDD, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }
}
