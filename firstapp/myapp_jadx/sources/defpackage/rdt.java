package defpackage;

import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.b;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class rdt {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static List a(CountryCodeName countryCodeName) {
        countryCodeName.getClass();
        String code = countryCodeName.getCode();
        int i = a.a[countryCodeName.ordinal()];
        if (i == 1) {
            return b.k(new PaymentChannel(70, "MTN Mobile Money", inm.a("mtn-", code), R.drawable.mtn_icon, null, b.k("096", "076"), true, true, false, 16, null), new PaymentChannel(80, "Airtel Money", inm.a("airtel-", code), R.drawable.airtel, null, b.k("097", "077", "057"), true, true, false, 16, null), new PaymentChannel(81, "Airtel Money", inm.a("airtel-", code), R.drawable.airtel, null, b.k("097", "077", "057"), false, false, true, 16, null), new PaymentChannel(84, "Zamtel Mobile Money", "Zamtel_PawaPay_ZM", R.drawable.logo_zamtel, null, kotlin.collections.a.c("095"), true, true, false, 16, null));
        }
        if (i != 2) {
            return i != 3 ? m2g.a : b.k(new PaymentChannel(160, "MTN Mobile Money", inm.a("mtn-", code), R.drawable.mtn_icon, null, b.k("077", "078", "076"), true, true, false, 16, null), new PaymentChannel(150, "Airtel Money", inm.a("airtel-", code), R.drawable.airtel, null, b.k("070", "075", "074"), true, true, false, 16, null), new PaymentChannel(151, "Airtel Money", inm.a("airtel-", code), R.drawable.airtel, null, b.k("070", "075", "074"), false, false, true, 16, null));
        }
        return b.k(new PaymentChannel(90, "Tigo", inm.a("tigo-", code), R.drawable.tigo_icon, null, b.k("065", "067", "071"), true, true, false, 16, null), new PaymentChannel(91, "Tigo", inm.a("tigo-", code), R.drawable.tigo_icon, null, b.k("065", "067", "071"), false, false, true, 16, null), new PaymentChannel(100, "Vodacom", inm.a("vodacom-", code), R.drawable.vodacom_icon, null, b.k("074", "075", "076"), false, true, false, 16, null), new PaymentChannel(HttpStatusCodesKt.HTTP_PROCESSING, "Vodacom", inm.a("vodacom-", code), R.drawable.vodacom_icon, null, b.k("074", "075", "076"), false, false, true, 16, null), new PaymentChannel(110, "Airtel", inm.a("airtel-", code), R.drawable.airtel, null, b.k("068", "069", "078"), true, true, false, 16, null), new PaymentChannel(111, "Airtel", inm.a("airtel-", code), R.drawable.airtel, null, b.k("068", "069", "078"), false, false, true, 16, null));
    }
}
