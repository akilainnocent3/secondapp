package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class y7b {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final int a(CountryCodeName countryCodeName) {
        switch (countryCodeName == null ? -1 : a.a[countryCodeName.ordinal()]) {
            case 1:
                return R.drawable.icon_flag_zm_ball;
            case 2:
                return R.drawable.icon_flag_ug_ball;
            case 3:
                return R.drawable.icon_flag_ke_ball;
            case 4:
                return R.drawable.icon_flag_ng_ball;
            case 5:
                return R.drawable.icon_flag_gh_ball;
            case 6:
                return R.drawable.icon_flag_tz_ball;
            default:
                return -1;
        }
    }

    public static final String b(CountryCodeName countryCodeName) {
        countryCodeName.getClass();
        String upperCase = countryCodeName.getCode().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return "https://s.sporty.net/sportycom/countryFlagIcon/" + upperCase;
    }
}
