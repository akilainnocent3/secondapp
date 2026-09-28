package defpackage;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class i7x {
    public static String a(double d) {
        Locale locale = Locale.US;
        locale.getClass();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setGroupingUsed(false);
        String str = numberInstance.format(d);
        str.getClass();
        return str;
    }
}
