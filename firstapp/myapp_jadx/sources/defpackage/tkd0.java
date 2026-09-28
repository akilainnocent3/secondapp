package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class tkd0 {
    public static final /* synthetic */ int a = 0;

    public static final String a(BigDecimal bigDecimal, boolean z, boolean z2) {
        bigDecimal.getClass();
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setGroupingUsed(z2);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(z ? 2 : 0);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(bigDecimal);
        str.getClass();
        return str;
    }
}
