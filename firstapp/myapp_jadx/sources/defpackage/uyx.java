package defpackage;

import java.math.BigDecimal;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class uyx {
    public static xyx a(String str) {
        Object bVar;
        if (str == null) {
            return xyx.d;
        }
        if (str.length() == 0 || str.equals("0")) {
            return xyx.d;
        }
        if (StringsKt.h0('.', str)) {
            str = "0" + ((Object) str);
        }
        int iS = StringsKt.S(str, '.', 0, 6);
        if (iS != -1) {
            if ((str.length() - 1) - iS > 2) {
                str = str.substring(0, iS + 3);
            }
            if (str.charAt(str.length() - 1) == '.' && iS != StringsKt.W(str, '.', 0, 6)) {
                str = str.substring(0, str.length() - 1);
            }
        }
        int length = str.length();
        try {
            zi50.a aVar = zi50.b;
            bVar = new BigDecimal(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        BigDecimal bigDecimal = (BigDecimal) bVar;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        bigDecimal.getClass();
        return new xyx(str, length, bigDecimal);
    }
}
