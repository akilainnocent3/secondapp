package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b6y {
    public static final DecimalFormat a;
    public static final DecimalFormat b;
    public static final DecimalFormat c;

    static {
        BigDecimal.valueOf(10000L);
        Locale locale = Locale.US;
        DecimalFormat decimalFormat = new DecimalFormat("0.00", new DecimalFormatSymbols(locale));
        a = decimalFormat;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        decimalFormat.setRoundingMode(roundingMode);
        DecimalFormat decimalFormat2 = new DecimalFormat("0.##", new DecimalFormatSymbols(locale));
        b = decimalFormat2;
        decimalFormat2.setRoundingMode(roundingMode);
        DecimalFormat decimalFormat3 = new DecimalFormat("#,###", new DecimalFormatSymbols(locale));
        c = decimalFormat3;
        decimalFormat3.setRoundingMode(roundingMode);
    }

    public static BigDecimal a(String str) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.contains(",") && !str.contains(".")) {
                    str = str.replace(",", ".");
                }
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
                decimalFormat.setParseBigDecimal(true);
                Number number = decimalFormat.parse(str);
                if (number instanceof BigDecimal) {
                    return (BigDecimal) number;
                }
            } catch (ParseException e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.e(e);
                return bigDecimal;
            }
        }
        return bigDecimal;
    }

    public static String b(BigDecimal bigDecimal) {
        return b.format(bigDecimal.doubleValue());
    }

    public static String c(BigDecimal bigDecimal) {
        return b.format(bigDecimal.doubleValue());
    }
}
