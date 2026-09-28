package defpackage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class q760 {
    public static void a(wwd0 wwd0Var) {
        Object value;
        hyo aVar;
        do {
            value = wwd0Var.getValue();
            aVar = (hyo) value;
            if (aVar instanceof hyo.a) {
                BigDecimal bigDecimalB = b(((hyo.a) aVar).a.getText());
                if (bigDecimalB != null) {
                    String strA = tkd0.a(bigDecimalB, (4 & 2) != 0, (4 & 4) != 0);
                    int length = strA.length();
                    aVar = new hyo.a(new omn.a(new ijf0(strA, vlf0.a(length, length), 4)));
                }
            } else if (!(aVar instanceof hyo.b)) {
                uhc.a();
                return;
            }
        } while (!wwd0Var.g(value, aVar));
    }

    public static BigDecimal b(String str) {
        Object bVar;
        str.getClass();
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setParseBigDecimal(true);
        try {
            zi50.a aVar = zi50.b;
            bVar = decimalFormat.parse(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Number number = (Number) bVar;
        if (number == null) {
            return null;
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : null;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimal2 = skd0.b;
        return bigDecimal;
    }

    public static hyo.a c(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return new hyo.a(new omn.b(tkd0.a(bigDecimal, (4 & 2) != 0, (4 & 4) != 0)));
    }

    public static void d(wwd0 wwd0Var, Function1 function1) {
        Object value;
        Object aVar;
        omn bVar;
        wwd0Var.getClass();
        do {
            value = wwd0Var.getValue();
            aVar = (hyo) value;
            if (aVar instanceof hyo.a) {
                omn omnVar = ((hyo.a) aVar).a;
                BigDecimal bigDecimalB = b(omnVar.getText());
                if (bigDecimalB != null) {
                    skd0 skd0Var = (skd0) function1.invoke(new skd0(bigDecimalB));
                    BigDecimal bigDecimal = skd0Var != null ? skd0Var.a : null;
                    skd0 skd0Var2 = bigDecimal != null ? new skd0(bigDecimal) : null;
                    BigDecimal bigDecimal2 = skd0Var2 != null ? skd0Var2.a : null;
                    if (bigDecimal2 != null) {
                        if (omnVar instanceof omn.a) {
                            String strA = tkd0.a(bigDecimal2, (4 & 2) != 0, (4 & 4) != 0);
                            int length = strA.length();
                            bVar = new omn.a(new ijf0(strA, vlf0.a(length, length), 4));
                        } else {
                            if (!(omnVar instanceof omn.b)) {
                                uhc.a();
                                return;
                            }
                            bVar = new omn.b(tkd0.a(bigDecimal2, (4 & 2) != 0, (4 & 4) != 0));
                        }
                        aVar = new hyo.a(bVar);
                    }
                }
            } else if (!(aVar instanceof hyo.b)) {
                uhc.a();
                return;
            }
        } while (!wwd0Var.g(value, aVar));
    }
}
