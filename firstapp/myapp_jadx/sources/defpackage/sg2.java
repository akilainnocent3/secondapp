package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sg2 implements pdd0 {

    public static final class a extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__create_your_own__add_to_betslip";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBCreateYourOwnAddToBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__create_your_own__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBCreateYourOwnSectionView(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class c extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public c(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__create_your_own_selection__added";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBCreateYourOwnSelectionAdded(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class d extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public d(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__menu_tab__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBMenuTabClick(sport=", this.a, ", league=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public e(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = AnalyticsEvent.BET_BUILDER_MENU_TAB_VIEW;
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBMenuTabView(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class f extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public f(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "quick_picks__pcbb__add_to_betslip";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBQuickPicksPreCannedAddToBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class g extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public g(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "pcbb__share_book_code__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBQuickPicksPreCannedShare(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class h extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public h(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__quick_picks__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && Intrinsics.g(this.b, hVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BBQuickPicksSectionView(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class i extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public i(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "bb__create_your_own__delete";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && Intrinsics.g(this.b, iVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BetBuilderRemoveFromBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class j extends sg2 {
        public final String a;
        public final String b;

        public j(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.sg2, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            mapCreateCustomMetrics.put("source", AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS);
            return mapCreateCustomMetrics;
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b.equals(jVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "featured_bb__add_to_betslip";
        }

        public final int hashCode() {
            return this.b.hashCode() + gmf0.a(87187971, 31, this.a);
        }

        public final String toString() {
            return tx5.a("FeaturedBBAddToBetslip(source=event_details, sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class k extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public k(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "featured_bb__selection_remove__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("FeaturedBBRemoveClick(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class l extends sg2 {
        public final String a;
        public final String b;

        public l(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.sg2, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            mapCreateCustomMetrics.put("source", AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS);
            return mapCreateCustomMetrics;
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && this.b.equals(lVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.FEATURED_BB_VIEW;
        }

        public final int hashCode() {
            return this.b.hashCode() + gmf0.a(87187971, 31, this.a);
        }

        public final String toString() {
            return tx5.a("FeaturedBBView(source=event_details, sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class m extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public m(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "megabb__add_to_betslip";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Intrinsics.g(this.a, mVar.a) && Intrinsics.g(this.b, mVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBAddToBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class n extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public n(int i) {
            super("", "");
            this.a = "";
            this.b = "";
            this.c = "megabb_empty__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.g(this.a, nVar.a) && Intrinsics.g(this.b, nVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBEmptyView(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class o extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public o(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "megabb_failed__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Intrinsics.g(this.a, oVar.a) && Intrinsics.g(this.b, oVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBFailToAddToBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class p extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public p(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "betslip__megabb_selection_remove__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Intrinsics.g(this.a, pVar.a) && Intrinsics.g(this.b, pVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBRemoveFromBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class q extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public q(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "megabb__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Intrinsics.g(this.a, qVar.a) && Intrinsics.g(this.b, qVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBSectionView(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class r extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public r(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "megabb__share_book_code__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return Intrinsics.g(this.a, rVar.a) && Intrinsics.g(this.b, rVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("MegaBBShare(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class s extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public s(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "quick_picks__pcbb_failed__view";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Intrinsics.g(this.a, sVar.a) && Intrinsics.g(this.b, sVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("PreCannedBBFailToAddToBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public static final class t extends sg2 {
        public final String a;
        public final String b;
        public final String c;

        public t(String str, String str2) {
            super(str, str2);
            this.a = str;
            this.b = str2;
            this.c = "betslip__pcbb_selection_remove__click";
        }

        @Override // defpackage.sg2
        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return Intrinsics.g(this.a, tVar.a) && Intrinsics.g(this.b, tVar.b);
        }

        @Override // defpackage.sg2
        public final String f() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("PreCannedBBRemoveFromBetslip(sport=", this.a, ", league=", this.b, ")");
        }
    }

    public sg2(String str, String str2) {
    }

    @Override // defpackage.pdd0
    public HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("sport", f()), new Pair(AnalyticsParam.LEAGUE_PARAM_LEAGUE, e()));
    }

    public abstract String e();

    public abstract String f();
}
