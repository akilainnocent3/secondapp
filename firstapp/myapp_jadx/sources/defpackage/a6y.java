package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a6y {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        a = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    }
}
