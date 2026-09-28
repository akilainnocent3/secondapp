package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class i0j {
    public static int a(String str) {
        if (str == null) {
            return R.color.fh_splash_DF;
        }
        switch (str.hashCode()) {
            case -1841295610:
                return !str.equals("Rotten") ? R.color.fh_splash_DF : R.color.fh_splash_RO;
            case 1670:
                return !str.equals("2x") ? R.color.fh_splash_DF : R.color.fh_splash_20;
            case 1701:
                return !str.equals("3x") ? R.color.fh_splash_DF : R.color.fh_splash_30;
            case 1763:
                return !str.equals("5x") ? R.color.fh_splash_DF : R.color.fh_splash_50;
            case 1475937:
                return str.equals("0.5x") ? R.color.fh_splash_05 : R.color.fh_splash_DF;
            case 1505635:
                return !str.equals("1.2x") ? R.color.fh_splash_DF : R.color.fh_splash_12;
            case 1505728:
                return !str.equals("1.5x") ? R.color.fh_splash_DF : R.color.fh_splash_15;
            default:
                return R.color.fh_splash_DF;
        }
    }
}
