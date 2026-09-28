package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class ukd0 {
    public static final String a(int i, BigDecimal bigDecimal, boolean z, boolean z2) {
        bigDecimal.getClass();
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setGroupingUsed(z2);
        decimalFormat.setMaximumFractionDigits(i);
        if (!z) {
            i = 0;
        }
        decimalFormat.setMinimumFractionDigits(i);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(bigDecimal);
        str.getClass();
        return str;
    }

    public static BigDecimal b(String str) {
        Object bVar;
        rkd0.Companion.getClass();
        BigDecimal bigDecimal = rkd0.b;
        str.getClass();
        bigDecimal.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = new rkd0(new BigDecimal(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        rkd0 rkd0Var = (rkd0) bVar;
        BigDecimal bigDecimal2 = rkd0Var != null ? rkd0Var.a : null;
        return bigDecimal2 == null ? bigDecimal : bigDecimal2;
    }
}
