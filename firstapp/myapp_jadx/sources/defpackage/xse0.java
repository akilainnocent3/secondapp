package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public interface xse0 {
    static String m0(String str, kse0 kse0Var, Function1 function1) {
        Integer intOrNull;
        if (str.length() == 0 || str.equals("∞")) {
            return str;
        }
        String strP = StringsKt.M(str, "∞", false) ? c.p(str, "∞", "", false) : str;
        if ((c.u(strP, "0", false) && str.length() > 1) || c.u(strP, "-", false) || (intOrNull = StringsKt.toIntOrNull(strP)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        if (function1 != null) {
            iIntValue = ((Number) function1.invoke(intOrNull)).intValue();
            strP = String.valueOf(iIntValue);
        }
        int i = kse0Var.a;
        if (iIntValue > i) {
            return String.valueOf(i);
        }
        int i2 = kse0Var.b;
        return (iIntValue >= i2 || function1 == null) ? strP : String.valueOf(i2);
    }

    static void m1(ztw ztwVar, String str) {
        Object value;
        int length;
        do {
            value = ztwVar.getValue();
            length = str.length();
        } while (!ztwVar.g(value, ijf0.b((ijf0) value, str, vlf0.a(length, length), 4)));
    }
}
