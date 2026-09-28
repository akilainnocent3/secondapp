package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class npi {
    public static final ArrayList b;
    public static final ArrayList c;
    public static final ArrayList d;
    public static final ArrayList e;
    public static final ArrayList f;
    public static final ArrayList g;
    public static final ArrayList h;
    public static final ArrayList i;
    public static final ArrayList j;
    public static final ArrayList k;
    public static final ArrayList l;
    public final psm a;

    public static final class a {
        public static ArrayList a(a aVar, String str, String str2, String str3, String str4, String str5, int i) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            String str6 = (i & 32) != 0 ? null : "https://www.tiktok.com/@sportybet.mx";
            return ay0.v(new mpi[]{new mpi(opi.FACEBOOK, str), str2 != null ? new mpi(opi.X, str2) : null, str3 != null ? new mpi(opi.INSTAGRAM, str3) : null, str4 != null ? new mpi(opi.TELEGRAM, str4) : null, new mpi(opi.YOUTUBE, str5), str6 != null ? new mpi(opi.TIKTOK, str6) : null});
        }
    }

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
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CountryCodeName.INTERNATIONAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CountryCodeName.BRAZIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CountryCodeName.MEXICO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CountryCodeName.CAMEROON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CountryCodeName.MOZAMBIQUE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    static {
        a aVar = new a();
        b = a.a(aVar, "https://www.facebook.com/sportybetng", "https://x.com/sportybetng", "https://www.instagram.com/sportybetng", "https://t.me/SportyBetNG_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        c = a.a(aVar, "https://www.facebook.com/sportybetgh", "https://x.com/sportybetgh", "https://www.instagram.com/sportybetgh", "https://t.me/SportyBetGH_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        d = a.a(aVar, "https://www.facebook.com/sportybetzm", "https://x.com/sportybetzm", "https://www.instagram.com/sportybetzambia", "https://t.me/SportyBetZM_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        e = a.a(aVar, "https://www.facebook.com/sportybettz", "https://x.com/sportybettz", "https://www.instagram.com/sportybettanzania", "https://t.me/SportyBetTZ_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        f = a.a(aVar, "https://www.facebook.com/sportybetug", "https://x.com/sportybetug", "https://www.instagram.com/sportybetuganda", "https://t.me/SportyBetUG_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        g = a.a(aVar, "https://www.facebook.com/sportybetke", "https://x.com/sportybetke", "https://www.instagram.com/sportybetkenya", "https://t.me/SportyBetKE_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        h = a.a(aVar, "https://www.facebook.com/sportybetza", "https://x.com/SportyBetZA", "https://www.instagram.com/sportybetza", "https://t.me/SportyBetZA_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        i = a.a(aVar, "https://www.facebook.com/SportyBetCameroun", "https://x.com/sportybetcm", "https://www.instagram.com/sportybetcm", "https://t.me/SportyBetCM_Bot", "https://www.youtube.com/@sportybetafrica", 32);
        j = a.a(aVar, "https://www.facebook.com/SportyBetMozambique/", null, null, "https://t.me/SportyBetMZ_Bot", "https://www.youtube.com/@sportybetafrica", 38);
        k = a.a(aVar, "https://www.facebook.com/sportybetbr", "https://x.com/sportybetbrasil", "https://www.instagram.com/sportybet.brasil/", "https://t.me/SportyBetBr_Bot", "https://www.youtube.com/@sportybrasil", 32);
        l = a.a(aVar, "https://facebook.com/sportybetmexico", "https://x.com/sportybet_mx", "https://www.instagram.com/sportybet.mexico", null, "https://www.youtube.com/@SportybetMexico", 8);
    }

    public npi(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }
}
