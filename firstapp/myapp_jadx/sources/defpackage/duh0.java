package defpackage;

import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class duh0 {
    public static evd0 a(String str, double d, double d2, BigDecimal bigDecimal) {
        str.getClass();
        bigDecimal.getClass();
        Double dH = b.h(str);
        if (str.length() == 0 || dH == null || dH.doubleValue() < d) {
            return new evd0.a(d);
        }
        if (dH.doubleValue() > d2) {
            return new evd0.b(d2);
        }
        return dH.doubleValue() > bigDecimal.doubleValue() ? evd0.c.a : evd0.d.a;
    }
}
