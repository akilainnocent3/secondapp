package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface thm extends pdd0 {

    public static final class a implements thm {
        public final k a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final int f;

        public a(k kVar, String str, String str2, String str3, String str4, int i) {
            this.a = kVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            Pair pair = new Pair("source", this.a.a);
            String str = this.b;
            if (str == null) {
                str = "";
            }
            Pair pair2 = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str);
            String str2 = this.c;
            return kpu.d(pair, pair2, new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, str2 != null ? str2 : ""), new Pair(AnalyticsParam.LEAGUE_PARAM_LEAGUE, this.d), new Pair(AnalyticsParam.MARKET_PARAM_MARKET, this.e), new Pair("position", Integer.valueOf(this.f)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.FEATURED_MATCHES_EVENT_CARD_CLICK;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return Integer.hashCode(this.f) + gmf0.a(gmf0.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeaturedMatchesCardClick(source=");
            sb.append(this.a);
            sb.append(", eventId=");
            sb.append(this.b);
            sb.append(", gameId=");
            hxa.c(sb, this.c, ", league=", this.d, ", market=");
            return ijg0.a(this.f, this.e, ", position=", ")", sb);
        }
    }

    public static final class b implements thm {
        public final k a;
        public final String b;
        public final String c;

        public b(k kVar, String str, String str2) {
            this.a = kVar;
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            Pair pair = new Pair("source", this.a.a);
            String str = this.b;
            if (str == null) {
                str = "";
            }
            Pair pair2 = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str);
            String str2 = this.c;
            return kpu.d(pair, pair2, new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, str2 != null ? str2 : ""));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.FEATURED_MATCHES_DETAILS_CLICK;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeaturedMatchesDetailsClick(source=");
            sb.append(this.a);
            sb.append(", eventId=");
            sb.append(this.b);
            sb.append(", gameId=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class c implements thm {
        public final k a;
        public final String b;
        public final String c;

        public c(k kVar, String str, String str2) {
            this.a = kVar;
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a), new Pair(AnalyticsParam.LEAGUE_PARAM_LEAGUE_ID, this.b), new Pair(AnalyticsParam.LEAGUE_PARAM_LEAGUE, this.c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.FEATURED_MATCHES_LEAGUES_TAB_CLICK;
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeaturedMatchesLeaguesTabClick(source=");
            sb.append(this.a);
            sb.append(", leagueId=");
            sb.append(this.b);
            sb.append(", league=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class d implements thm {
        public final k a;

        public d(k kVar) {
            this.a = kVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.FEATURED_MATCHES_VIEW;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FeaturedMatchesView(source=" + this.a + ")";
        }
    }

    public static final class e implements thm {
        public final k a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;

        public e(k kVar, String str, String str2, int i, int i2) {
            str2.getClass();
            this.a = kVar;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a), new Pair(AnalyticsParam.LEAGUE_PARAM_LEAGUE, this.b), new Pair(AnalyticsParam.MARKET_PARAM_MARKET, this.c), new Pair("position", Integer.valueOf(this.d)), new Pair(AnalyticsParam.EVENT_PARAM_CARD_COUNT, Integer.valueOf(this.e)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b.equals(eVar.b) && Intrinsics.g(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.HOME_FEATURED_MATCHES_ADD_TO_BETSLIP;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HomeFeaturedMatchesAddToBetSlip(source=");
            sb.append(this.a);
            sb.append(", league=");
            sb.append(this.b);
            sb.append(", market=");
            wxa.b(this.d, this.c, ", position=", ", cardCount=", sb);
            return zk1.a(this.e, ")", sb);
        }
    }

    public static final class f implements thm {
        public final k a;

        public f(k kVar) {
            this.a = kVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.HOME_FEATURED_MATCHES_LEAGUE_LINK_CLICK;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HomeFeaturedMatchesLeagueLinkClick(source=" + this.a + ")";
        }
    }

    public static final class g implements thm {
        public final k a;

        public g(k kVar) {
            this.a = kVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("source", this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.HOME_FEATURED_MATCHES_STATS_ICON_CLICK;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HomeFeaturedMatchesStatsIconClick(source=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class h implements thm {
        public final String a;
        public final int b;

        public h(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String lowerCase = kotlin.text.c.p(this.a, " ", "_", false).toLowerCase(Locale.ROOT);
            return kpu.d(ekc.a(lowerCase, AnalyticsParam.HOME_NAV_ICON, lowerCase), new Pair(AnalyticsParam.HOME_NAV_ROW_POSITION, Integer.valueOf(this.b + 1)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && this.b == hVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.HOME_PAGE_COUPON_ROW_CLICK;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "HomePageCouponRowClick(icon=", this.a, ", rowPosition=", ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class i implements thm {
        public final String a;
        public final int b;

        public i(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String lowerCase = kotlin.text.c.p(this.a, " ", "_", false).toLowerCase(Locale.ROOT);
            return kpu.d(ekc.a(lowerCase, AnalyticsParam.HOME_NAV_ICON, lowerCase), new Pair(AnalyticsParam.HOME_NAV_ROW_POSITION, Integer.valueOf(this.b + 1)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b == iVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.HOME_PAGE_TOP_NAV_ITEM_CLICK;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "HomePageTopNavItemClick(icon=", this.a, ", rowPosition=", ")");
        }
    }

    public static final class j implements thm {
        public final String a = AnalyticsEvent.HOME_VIEW;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("HomeView(name=", this.a, ")");
        }
    }

    public enum k {
        SPORT("sport_homepage"),
        CASINO("casino_homepage");

        public final String a;

        k(String str) {
            this.a = str;
        }
    }
}
