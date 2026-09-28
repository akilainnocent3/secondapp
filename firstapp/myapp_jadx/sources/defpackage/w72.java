package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class w72 {
    public static final tmh0 a = new tmh0("https://www.sportybet.com/", "https://www.sportybet.com/", "https://www.sportybet.com/", "https://www.sportybet.com/", "https://s.sporty.net/", "https://sporty.com/", "sporty d9fb2eca-8239-4078-b23a-cf376fb5609b", null, "https://livescore.sportybet.com/", "https://alive-{country_code}.sportybet.com/", "https://otlp-sportybet.sportydog.net", b.k("s.sporty.net", "cdn.sporty.net"));

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.BRAZIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.MEXICO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.CAMEROON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CountryCodeName.MOZAMBIQUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }
}
