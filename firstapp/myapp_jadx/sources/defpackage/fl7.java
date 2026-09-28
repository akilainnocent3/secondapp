package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import kotlin.collections.b;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class fl7 {
    public static String a(double d) {
        List listK = b.k("", "K", "M", "G", "T", "P", "E");
        int i = 0;
        while (d >= 1000.0d && i < b.j(listK)) {
            d /= 1000.0d;
            i++;
        }
        String str = (String) listK.get(i);
        for (int i2 = 2; -1 < i2; i2--) {
            BigDecimal scale = new BigDecimal(d).setScale(i2, RoundingMode.HALF_UP);
            String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            if (str.length() + (StringsKt.M(plainString, ".", false) ? c.p(plainString, ".", "", false) : plainString).length() <= 3) {
                return plainString.concat(str);
            }
        }
        return yk10.a(new BigDecimal(d).setScale(0, RoundingMode.HALF_UP).toPlainString(), str);
    }
}
