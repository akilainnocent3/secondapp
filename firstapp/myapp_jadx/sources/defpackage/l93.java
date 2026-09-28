package defpackage;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class l93 {
    public static t2q.d a(u2q u2qVar, String str, BigDecimal bigDecimal) {
        u2qVar.getClass();
        str.getClass();
        String str2 = u2qVar.a;
        String str3 = u2qVar.b;
        Date date = new Date(u2qVar.d);
        Locale locale = Locale.getDefault();
        locale.getClass();
        String strL = bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0);
        BigDecimal bigDecimal2 = u2qVar.e;
        String strA = ukd0.a(2, bigDecimal2, true, true);
        BigDecimal bigDecimal3 = u2qVar.f;
        String strConcat = ukd0.a(2, bigDecimal3, true, true).concat("x");
        bigDecimal3.getClass();
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal3);
        bigDecimalMultiply.getClass();
        rkd0.a aVar = rkd0.Companion;
        if (bigDecimal == null || bigDecimalMultiply.compareTo(bigDecimal) <= 0) {
            bigDecimal = bigDecimalMultiply;
        }
        return new t2q.d(str2, str3, strL, strA, str, strConcat, ukd0.a(2, bigDecimal, true, true));
    }
}
