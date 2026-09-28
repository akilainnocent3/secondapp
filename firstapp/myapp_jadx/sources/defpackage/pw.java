package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class pw {
    public static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put(1000L, "K");
        treeMap.put(1000000L, "M");
        treeMap.put(1000000000L, "G");
        treeMap.put(1000000000000L, "T");
        treeMap.put(1000000000000000L, "P");
        treeMap.put(1000000000000000000L, "E");
    }

    @fae
    public static String a(String str) {
        if (str == null || str.length() == 0 || str.equals("null")) {
            return "";
        }
        return new DecimalFormat("###,##0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(str));
    }

    public static String b(String str) {
        if (str == null || str.length() == 0 || str.equals("null") || str.equals("--")) {
            return "";
        }
        try {
            double d = Double.parseDouble(str);
            DecimalFormat decimalFormat = new DecimalFormat("###,##0", SportyGamesManager.decimalFormatSymbols);
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            return decimalFormat.format(d);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(String str) {
        if (str == null || str.length() == 0 || str.equals("null")) {
            return "";
        }
        try {
            double d = Double.parseDouble(str);
            String str2 = (d == ((double) ((int) d)) ? new DecimalFormat("###,##0", SportyGamesManager.decimalFormatSymbols) : new DecimalFormat("###,##0.##", SportyGamesManager.decimalFormatSymbols)).format(d);
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(double d) {
        if (d == 0.0d) {
            return "0.00";
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        return String.format(SportyGamesManager.locale, "%,.2f", Arrays.copyOf(new Object[]{bigDecimal.setScale(2, roundingMode).setScale(2, roundingMode)}, 1));
    }

    public static String e(long j) {
        if (j == Long.MIN_VALUE) {
            return e(-9223372036854775807L);
        }
        if (j < 0) {
            return inm.a("-", e(-j));
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        Map.Entry entryFloorEntry = a.floorEntry(Long.valueOf(j));
        entryFloorEntry.getClass();
        Long l = (Long) entryFloorEntry.getKey();
        String str = (String) entryFloorEntry.getValue();
        long jLongValue = j / (l.longValue() / 10);
        if (jLongValue < 100) {
            double d = jLongValue / 10.0d;
            if (d != jLongValue / 10) {
                return d + str;
            }
        }
        return (jLongValue / 10) + str;
    }

    public static String f(String str) {
        String strB;
        if (!StringsKt.U(str)) {
            try {
                if (new Regex("[-+]?\\d+(\\.\\d+)?[eE][-+]?\\d+").f(str)) {
                    strB = new BigDecimal(str).setScale(2, RoundingMode.HALF_UP).toPlainString();
                } else {
                    strB = b(str);
                    if (strB == null) {
                        strB = "";
                    }
                }
                strB.getClass();
                return strB;
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public static String g(Double d) {
        try {
            String str = String.format(SportyGamesManager.locale, "%,.2f", Arrays.copyOf(new Object[]{new BigDecimal(String.valueOf(d.doubleValue())).setScale(2, RoundingMode.HALF_EVEN)}, 1));
            return str.length() > 12 ? str.substring(0, 12).concat("..") : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(long j) {
        if (j < 1000) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        double d = j;
        int iLog = (int) (Math.log(d) / Math.log(1000.0d));
        double d2 = iLog;
        int i = iLog - 1;
        String str = String.format(SportyGamesManager.locale, "%.2f%c", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1000.0d, d2)), Character.valueOf("KMGTPE".charAt(i))}, 2));
        if (Intrinsics.g(String.valueOf(str.charAt(str.length() - 2)), "0")) {
            return Intrinsics.g(String.valueOf(str.charAt(str.length() + (-3))), "0") ? String.format(SportyGamesManager.locale, "%.0f%c", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1000.0d, d2)), Character.valueOf("KMGTPE".charAt(i))}, 2)) : String.format(SportyGamesManager.locale, "%.1f%c", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1000.0d, d2)), Character.valueOf("KMGTPE".charAt(i))}, 2));
        }
        return str;
    }

    public static String i(double d) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        String plainString = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static String j(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.CEILING);
        if (d >= 1000.0d) {
            return h((long) d);
        }
        if (d >= 1.0d) {
            String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            return plainString;
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        String plainString2 = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
        plainString2.getClass();
        return plainString2;
    }

    public static String k(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        if (d >= 1000.0d) {
            return h((long) d);
        }
        if (d >= 1.0d) {
            String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            return plainString;
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        String plainString2 = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
        plainString2.getClass();
        return plainString2;
    }

    public static String l(double d) {
        if (d < 1.0d) {
            BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_EVEN);
            String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            return plainString;
        }
        BigDecimal scale2 = new BigDecimal(d).setScale(1, RoundingMode.HALF_EVEN);
        if (d < 1000.0d) {
            if (d < 100.0d) {
                String plainString2 = (scale2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale2.stripTrailingZeros()).toPlainString();
                plainString2.getClass();
                return plainString2;
            }
            BigDecimal scale3 = new BigDecimal(d).setScale(0, RoundingMode.HALF_UP);
            String plainString3 = (scale3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale3.stripTrailingZeros()).toPlainString();
            plainString3.getClass();
            return plainString3;
        }
        long j = (long) d;
        if (j < 1000) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        double d2 = j;
        int iLog = (int) (Math.log(d2) / Math.log(1000.0d));
        double d3 = iLog;
        int i = iLog - 1;
        String str = String.format(SportyGamesManager.locale, "%.1f%c", Arrays.copyOf(new Object[]{Double.valueOf(d2 / Math.pow(1000.0d, d3)), Character.valueOf("KMGTPE".charAt(i))}, 2));
        if (Intrinsics.g(String.valueOf(str.charAt(str.length() - 2)), "0")) {
            return Intrinsics.g(String.valueOf(str.charAt(str.length() + (-3))), "0") ? String.format(SportyGamesManager.locale, "%.0f%c", Arrays.copyOf(new Object[]{Double.valueOf(d2 / Math.pow(1000.0d, d3)), Character.valueOf("KMGTPE".charAt(i))}, 2)) : String.format(SportyGamesManager.locale, "%.0f%c", Arrays.copyOf(new Object[]{Double.valueOf(d2 / Math.pow(1000.0d, d3)), Character.valueOf("KMGTPE".charAt(i))}, 2));
        }
        return str;
    }

    public static String m(double d) {
        if (d == 0.0d) {
            return "0.00";
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        return String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{bigDecimal.setScale(2, roundingMode).setScale(2, roundingMode)}, 1));
    }

    public static String n(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static String o(double d) {
        BigDecimal scale = BigDecimal.valueOf(d).setScale(2, RoundingMode.DOWN);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static String p(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }

    public static String q(double d) {
        try {
            BigDecimal scale = BigDecimal.valueOf(d).setScale(2, RoundingMode.DOWN);
            String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            return plainString;
        } catch (Exception unused) {
            return "";
        }
    }
}
