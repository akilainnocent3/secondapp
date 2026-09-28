package defpackage;

import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class auh0 {
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[RETURN] */
    public static boolean a(String str, String str2, boolean z, double d, double d2) {
        Double dH;
        str.getClass();
        Double dH2 = b.h(str);
        Double dValueOf = null;
        Double dValueOf2 = dH2 != null ? Double.valueOf(gky.a.c(dH2.doubleValue())) : null;
        if (str2 != null && (dH = b.h(str2)) != null) {
            dValueOf = Double.valueOf(gky.a.c(dH.doubleValue()));
        }
        if (str.length() == 0 || dValueOf2 == null) {
            if (str.length() > 0) {
                return true;
            }
            return false;
        }
        double dDoubleValue = dValueOf2.doubleValue();
        boolean z2 = d <= dDoubleValue && dDoubleValue <= d2;
        boolean z3 = dValueOf != null && (!z ? dValueOf2.doubleValue() > dValueOf.doubleValue() : dValueOf2.doubleValue() < dValueOf.doubleValue());
        if (!z2 || z3) {
            return true;
        }
        return false;
    }
}
