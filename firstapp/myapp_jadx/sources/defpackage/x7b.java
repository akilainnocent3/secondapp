package defpackage;

import android.content.res.Resources;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportygames.crash.models.header.snc.OdQr;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x7b {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public final CountryCodeName a;
        public final boolean b;
        public final int c;
        public final String d;

        public a(CountryCodeName countryCodeName, boolean z, int i, String str) {
            countryCodeName.getClass();
            str.getClass();
            this.a = countryCodeName;
            this.b = z;
            this.c = i;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gpp.a(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return "UiCountryConfig(countryCode=" + this.a + ", isSelected=" + this.b + ", icon=" + this.c + ", title=" + this.d + ")";
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CountryCodeName.CAMEROON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CountryCodeName.MEXICO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CountryCodeName.BRAZIL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CountryCodeName.MOZAMBIQUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CountryCodeName.INTERNATIONAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public static String a(int i, CountryCodeName countryCodeName) {
        try {
            String string = yrh0.j().getString(i);
            string.getClass();
            return string;
        } catch (Resources.NotFoundException unused) {
            switch (b.a[countryCodeName.ordinal()]) {
                case 1:
                    return "Kenya";
                case 2:
                    return "Nigeria";
                case 3:
                    return "Ghana";
                case 4:
                    return "Zambia";
                case 5:
                    return "Tanzania";
                case 6:
                    return "Uganda";
                case 7:
                    return "Cameroon";
                case 8:
                    return "South Africa";
                case 9:
                    return "Mexico";
                case 10:
                    return "Brazil";
                case 11:
                    return "Mozambique";
                case 12:
                    return "";
                default:
                    uhc.a();
                    return null;
            }
        }
    }

    public static String b(int i) {
        String string = yrh0.j().getString(i);
        string.getClass();
        return string;
    }

    public static w7b c(CountryCodeName countryCodeName, String str) {
        String str2;
        countryCodeName.getClass();
        str.getClass();
        String str3 = " BRL ";
        switch (b.a[countryCodeName.ordinal()]) {
            case 1:
                CountryCodeName countryCodeName2 = CountryCodeName.KENYA;
                return new bhp(countryCodeName2, a(R.string.common_functions__kenya, countryCodeName2), " KES ", "+254", Integer.parseInt(b(R.string.push_product_ke)), "GMT+3", b(R.string.oper_id_ke), 10);
            case 2:
                CountryCodeName countryCodeName3 = CountryCodeName.NIGERIA;
                return new o4x(countryCodeName3, a(R.string.common_functions__nigeria, countryCodeName3), " NGN ", "+234", Integer.parseInt(b(R.string.push_product_ng)), UccrWswQGaIj.xqAftazjAS, b(R.string.oper_id_ng), 11);
            case 3:
                CountryCodeName countryCodeName4 = CountryCodeName.GHANA;
                return new wcj(countryCodeName4, a(R.string.common_functions__ghana, countryCodeName4), " GHS ", "+233", Integer.parseInt(b(R.string.push_product_gh)), OdQr.zlgiSe, b(R.string.oper_id_gh), 10);
            case 4:
                CountryCodeName countryCodeName5 = CountryCodeName.ZAMBIA;
                return new bbk0(countryCodeName5, a(R.string.common_functions__zambia, countryCodeName5), " ZMW ", "+260", Integer.parseInt(b(R.string.push_product_zm)), "GMT+2", b(R.string.oper_id_zm), 10);
            case 5:
                CountryCodeName countryCodeName6 = CountryCodeName.TANZANIA;
                return new c1f0(countryCodeName6, a(R.string.common_functions__tanzania, countryCodeName6), " TZS ", "+255", Integer.parseInt(b(R.string.push_product_tz)), "GMT+3", b(R.string.oper_id_tz), 10);
            case 6:
                CountryCodeName countryCodeName7 = CountryCodeName.UGANDA;
                return new sah0(countryCodeName7, a(R.string.common_functions__uganda, countryCodeName7), " UGX ", "+256", Integer.parseInt(b(R.string.push_product_ug)), "GMT+3", b(R.string.oper_id_ug), 10);
            case 7:
                CountryCodeName countryCodeName8 = CountryCodeName.CAMEROON;
                return new mm5(countryCodeName8, a(R.string.common_functions__cameroon, countryCodeName8), " XAF ", "+237", Integer.parseInt(b(R.string.push_product_int)), UccrWswQGaIj.xqAftazjAS, b(R.string.oper_id_cm), 9);
            case 8:
                CountryCodeName countryCodeName9 = CountryCodeName.SOUTH_AFRICA;
                return new n9k0(countryCodeName9, a(R.string.common_functions__south_africa, countryCodeName9), " ZAR ", "+27", Integer.parseInt(b(R.string.push_product_za)), "GMT+2", b(R.string.oper_id_za), 10);
            case 9:
                CountryCodeName countryCodeName10 = CountryCodeName.MEXICO;
                return new ugu(countryCodeName10, a(R.string.common_functions__mexico, countryCodeName10), " MXN ", "+52", 100, TimeZone.getDefault().getDisplayName(false, 0), hp0.A.getString(R.string.oper_id_mx), 10);
            case 10:
                String strA = a(R.string.common_functions__brazil, CountryCodeName.BRAZIL);
                if (str.length() > 0) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = str2;
                }
                return new dr1(strA, str3, Integer.parseInt(b(R.string.push_product_br)));
            case 11:
                CountryCodeName countryCodeName11 = CountryCodeName.MOZAMBIQUE;
                return new rhu(countryCodeName11, a(R.string.common_functions__mozambique, countryCodeName11), " MZN ", "+258", Integer.parseInt(b(R.string.push_product_int)), "GMT+2", b(R.string.oper_id_mz), 9);
            default:
                return new dr1(a(R.string.common_functions__brazil, CountryCodeName.BRAZIL), " BRL ", Integer.parseInt(b(R.string.push_product_int)));
        }
    }
}
