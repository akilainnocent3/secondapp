package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class krh0 {
    public static HashMap a(double d, double d2, double d3) {
        double d4;
        HashMap map = new HashMap();
        int i = 0;
        map.put(0, Double.valueOf(d));
        while (d < d2) {
            if (d == d3) {
                d4 = d > 1.0d ? c(d, d(d)) : d + 0.1d;
            } else {
                d4 = d + d(d);
            }
            if (d < d3 && d4 > d3) {
                d4 = d3;
            } else if (d4 >= d2) {
                d4 = d2;
            }
            i++;
            map.put(Integer.valueOf(i), Double.valueOf(Double.parseDouble(l(d4))));
            d = Double.parseDouble(l(d4));
        }
        return map;
    }

    public static LinkedHashMap b(double d, double d2, double d3) {
        double d4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        linkedHashMap.put(0, Double.valueOf(d));
        while (d < d2) {
            if (d == d3) {
                d4 = d > 1.0d ? c(d, d(d)) : d + 0.1d;
            } else {
                d4 = d + d(d);
            }
            if (d < d3 && d4 > d3) {
                d4 = d3;
            } else if (d4 >= d2) {
                d4 = d2;
            }
            i++;
            linkedHashMap.put(Integer.valueOf(i), Double.valueOf(Double.parseDouble(l(d4))));
            d = Double.parseDouble(l(d4));
        }
        return linkedHashMap;
    }

    public static double c(double d, double d2) {
        if (d % 1.0d != 0.0d) {
            d = Math.floor(d);
        }
        do {
            d = Double.parseDouble(l(d)) + 1.0d;
        } while (d % d2 != 0.0d);
        return d;
    }

    public static double d(double d) {
        int i;
        if (d < 1.01d || d >= 1.1d) {
            i = (d < 1.1d || d >= 2.0d) ? 1 : 10;
        } else {
            i = 100;
        }
        return Math.pow(10.0d, Math.floor(Math.log10(d / ((double) i))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x0071 A[RETURN] */
    public static String e(String str) {
        switch (str) {
            case "sg_spin_da_bottle":
                return "Spin da' Bottle";
            case "sg_spin2win":
                return "Spin2Win";
            case "sg_fruit_hunt":
                return "Fruit Hunt";
            case "sg_spin_match":
                return "Spin Match";
            case "sg_pocket_rockets":
                return "Pocket Rockets";
            case "sg_even_odd":
                return "Even Odd";
            case "sg_red_black":
                return "Red-Black";
            case "sg_sporty_hero":
                return "Sporty Hero";
            case "sg_rush":
                return "Rush";
            default:
                return str;
        }
    }

    public static String f(String str) {
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
            case 395218650:
                return !lowerCase.equals("sporty cars") ? "" : "143";
            case 395371445:
                return !lowerCase.equals("sporty hero") ? "" : "112";
            case 395464193:
                return !lowerCase.equals("sporty kick") ? "" : "142";
            case 407224423:
                return !lowerCase.equals("sporty-cars") ? "" : "143";
            case 407377218:
                return !lowerCase.equals("sporty-hero") ? "" : "112";
            case 407469966:
                return !lowerCase.equals("sporty-kick") ? "" : "142";
            case 1665918510:
                return !lowerCase.equals("sg_sporty_cars") ? "" : "143";
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

    public static String g(String str) {
        String lowerCase;
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case 13143121:
                return !str.equals("sporty-jet") ? "" : "https://s.sporty.net/cms/sporty_jet_logo_a6d5f3cfb3.webp";
            case 22313157:
                return !str.equals("galaxy-go") ? "" : "https://s.sporty.net/cms/galaxy_go_logo_5cb608455c.webp";
            case 407377218:
                return !str.equals("sporty-hero") ? "" : "https://s.sporty.net/cms/sh_header_logo_8f2265e4ae.webp";
            case 407469966:
                return !str.equals("sporty-kick") ? "" : "https://s.sporty.net/cms/sporty_kick_logo_f9b58c9290.webp";
            case 510525191:
                return !str.equals("one-punch") ? "" : "https://s.sporty.net/cms/one_punch_logo_be8ef90e64.webp";
            case 967676810:
                if (!str.equals("sporty-skills")) {
                    return "";
                }
                String country = SportyGamesManager.getInstance().getCountry();
                if (country != null) {
                    lowerCase = country.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                return Intrinsics.g(lowerCase, "mx") ? "https://s.sporty.net/cms/ss_logo_mx_70e77df7c3.webp" : "https://s.sporty.net/cms/ss_title_image_d4ed8911e7.webp";
            case 1618394686:
                return !str.equals("crazy-rider") ? "" : "https://s.sporty.net/cms/crazy_rider_logo_5d5c8be33b.webp";
            default:
                return "";
        }
    }

    public static float h(String str) {
        String str2;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 3152) {
            str2 = "br";
        } else {
            if (iHashCode != 3297) {
                if (iHashCode != 3499) {
                    if (iHashCode != 3879) {
                        if (iHashCode == 104431) {
                            str2 = "int";
                        }
                    } else if (str.equals("za")) {
                        return 0.12f;
                    }
                } else if (str.equals("mx")) {
                    return 0.16f;
                }
                return 0.2f;
            }
            str2 = "gh";
        }
        str.equals(str2);
        return 0.2f;
    }

    public static String i(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 3152) {
            if (iHashCode == 3297) {
                return !str.equals("gh") ? "" : pm5.GH_FLAG_WEBP.a();
            }
            if (iHashCode == 3499) {
                return !str.equals("mx") ? "" : pm5.MX_FLAG_WEBP.a();
            }
            if (iHashCode == 3879) {
                return !str.equals("za") ? "" : pm5.ZA_FLAG_WEBP.a();
            }
            if (iHashCode != 104431 || !str.equals("int")) {
                return "";
            }
        } else if (!str.equals("br")) {
            return "";
        }
        return pm5.BR_FLAG_WEBP.a();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    public static String j(Context context) {
        NetworkCapabilities networkCapabilities;
        int dataNetworkType;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return "unknown";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (!networkCapabilities.hasTransport(0)) {
            return "unknown";
        }
        try {
            Object systemService2 = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
            dataNetworkType = telephonyManager != null ? telephonyManager.getDataNetworkType() : 0;
        } catch (SecurityException unused) {
        }
        if (dataNetworkType != 0) {
            if (dataNetworkType == 20) {
                return "5G";
            }
            switch (dataNetworkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "cellular";
            }
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        int subtype = activeNetworkInfo != null ? activeNetworkInfo.getSubtype() : 0;
        if (subtype == 20) {
            return "5G";
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "cellular";
        }
    }

    public static void k(uy1 uy1Var, int i) {
        try {
            if (ay0.V(new Integer[]{80100, 80400}).contains(Integer.valueOf(i))) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.f, null);
                return;
            }
            v44 v44Var = v44.b;
            if (v44Var == null) {
                Context applicationContext = uy1Var.getApplicationContext();
                applicationContext.getClass();
                v44Var = new v44(applicationContext);
                v44.b = v44Var;
            }
            String str = (String) ((Map) v44Var.a.getValue()).get(Integer.valueOf(i));
            if (str == null) {
                str = "";
            }
            Bundle bundle = new Bundle();
            bundle.putString("KEY_LIMIT_TYPE", str);
            SportyGamesManager.getInstance().gotoSportyBet(xae.f, bundle);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String l(double d) {
        try {
            String str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
            str.getClass();
            return str;
        } catch (Exception unused) {
            return "0.00";
        }
    }

    public static String m(String str) {
        str.getClass();
        try {
            return CollectionsKt.a0(StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null), " ", null, null, new y810(1), 30);
        } catch (Exception unused) {
            return str;
        }
    }
}
