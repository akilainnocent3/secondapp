package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public interface dre0 {
    static String H(String str) {
        String plainString;
        str.getClass();
        Double dH = b.h(str);
        return (dH == null || (plainString = BigDecimal.valueOf(dH.doubleValue()).setScale(2, RoundingMode.DOWN).toPlainString()) == null) ? "0.00" : plainString;
    }

    static void Z(wwd0 wwd0Var, mse0 mse0Var) {
        wwd0Var.getClass();
        mse0Var.getClass();
        String strH = H(String.valueOf(mse0Var.c));
        int length = strH.length();
        wwd0Var.setValue(new ose0.a(new ijf0(strH, vlf0.a(length, length), 4)));
    }

    static String g1(String str, mse0 mse0Var, Function1 function1) {
        String strValueOf;
        if (c.u(str, "-", false)) {
            return null;
        }
        String str2 = (String) CollectionsKt.V(1, StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null));
        if ((str2 != null ? str2.length() : 0) > 2) {
            return null;
        }
        if (c.u(str, "0", false)) {
            Character chH = wae0.H(str);
            if (chH == null || (strValueOf = String.valueOf(chH.charValue())) == null) {
                strValueOf = ".";
            }
            if (!strValueOf.equals(".")) {
                return null;
            }
        }
        if (c.u(str, ".", false)) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        Double dH = b.h(c.k(str, ".", false) ? str.concat("0") : str);
        if (dH == null) {
            return null;
        }
        double dDoubleValue = dH.doubleValue();
        if (function1 != null) {
            dDoubleValue = ((Number) function1.invoke(dH)).doubleValue();
            str = H(String.valueOf(dDoubleValue));
        }
        double d = mse0Var.b;
        if (dDoubleValue > d) {
            return H(String.valueOf(d));
        }
        double d2 = mse0Var.a;
        return (dDoubleValue >= d2 || function1 == null) ? str : H(String.valueOf(d2));
    }

    static void i(ztw ztwVar, String str) {
        Object value;
        Object bVar;
        do {
            value = ztwVar.getValue();
            ose0 ose0Var = (ose0) value;
            if (ose0Var instanceof ose0.a) {
                ijf0 ijf0Var = ((ose0.a) ose0Var).a;
                int length = str.length();
                bVar = new ose0.a(ijf0.b(ijf0Var, str, vlf0.a(length, length), 4));
            } else {
                if (!(ose0Var instanceof ose0.b)) {
                    uhc.a();
                    return;
                }
                String str2 = ((ose0.b) ose0Var).b;
                str.getClass();
                str2.getClass();
                bVar = new ose0.b(str, str2);
            }
        } while (!ztwVar.g(value, bVar));
    }
}
