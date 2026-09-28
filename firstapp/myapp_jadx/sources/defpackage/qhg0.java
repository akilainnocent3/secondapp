package defpackage;

import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class qhg0 {
    public final b5 a;

    public static final class a {
        public static String a(b5 b5Var, Double d, int i) {
            b5Var.getClass();
            if (d != null) {
                try {
                    String str = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(d.doubleValue());
                    str.getClass();
                    return str;
                } catch (Exception unused) {
                }
            }
            return "0.00";
        }

        public static String b(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1776695937:
                    return !lowerCase.equals("super hero") ? "" : "112";
                case -334405516:
                    return !lowerCase.equals("super jet") ? "" : "134";
                case -334018233:
                    return !lowerCase.equals("super-jet") ? "" : "134";
                case 12755838:
                    return !lowerCase.equals("sporty jet") ? "" : "134";
                case 13143121:
                    return !lowerCase.equals("sporty-jet") ? "" : "134";
                case 22300664:
                    return !lowerCase.equals("galaxy go") ? "" : "136";
                case 22313157:
                    return !lowerCase.equals("galaxy-go") ? "" : "136";
                case 90661964:
                    return !lowerCase.equals("sg_galaxy_go") ? "" : "136";
                case 395371445:
                    return !lowerCase.equals("sporty hero") ? "" : "112";
                case 395464193:
                    return !lowerCase.equals("sporty kick") ? "" : "142";
                case 407469966:
                    return !lowerCase.equals("sporty-kick") ? "" : "142";
                case 1666071305:
                    return !lowerCase.equals("sg_sporty_hero") ? "" : "112";
                case 1666164053:
                    return !lowerCase.equals("sg_sporty_kick") ? "" : "142";
                case 2131956138:
                    return !lowerCase.equals("sg_sporty_jet") ? "" : "134";
                default:
                    return "";
            }
        }
    }

    public qhg0(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }
}
