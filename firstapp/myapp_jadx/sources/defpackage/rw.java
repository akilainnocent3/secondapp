package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class rw {
    public static final /* synthetic */ int a = 0;

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1000L, "K");
        treeMap.put(1000000L, "M");
        treeMap.put(1000000000L, "G");
        treeMap.put(1000000000000L, "T");
        treeMap.put(1000000000000000L, "P");
        treeMap.put(1000000000000000000L, "E");
    }

    public static String a(b5 b5Var, String str) {
        b5Var.getClass();
        if (str == null || str.length() == 0 || str.equals("null") || str.equals("--")) {
            return "";
        }
        try {
            double d = Double.parseDouble(str);
            DecimalFormat decimalFormat = new DecimalFormat("###,##0", b5Var.getDecimalFormatSymbols());
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            return decimalFormat.format(d);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(b5 b5Var, String str) {
        b5Var.getClass();
        if (str == null || str.length() == 0 || str.equals("null")) {
            return "";
        }
        try {
            double d = Double.parseDouble(str);
            String str2 = (d == ((double) ((int) d)) ? new DecimalFormat("###,##0", b5Var.getDecimalFormatSymbols()) : new DecimalFormat("###,##0.##", b5Var.getDecimalFormatSymbols())).format(d);
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String c(b5 b5Var, String str) {
        String strA;
        b5Var.getClass();
        if (!StringsKt.U(str)) {
            try {
                if (new Regex("[-+]?\\d+(\\.\\d+)?[eE][-+]?\\d+").f(str)) {
                    strA = new BigDecimal(str).setScale(2, RoundingMode.HALF_UP).toPlainString();
                } else {
                    strA = a(b5Var, str);
                    if (strA == null) {
                        strA = "";
                    }
                }
                strA.getClass();
                return strA;
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public static String d(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }
}
