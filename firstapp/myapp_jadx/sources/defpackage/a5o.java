package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a5o extends pdd0 {

    public static final class a implements a5o {
        public final String a = AnalyticsEvent.IV_ANIMATION_ERROR;
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("AnimationErrorEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class a0 implements a5o {
        public final String a;
        public final String b;

        public a0(String str) {
            str.getClass();
            this.a = "iv__odds_filter__risky__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.a.equals(a0Var.a) && Intrinsics.g(this.b, a0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("OddsFilterRiskyClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class b implements a5o {
        public final String a = "iv__back__exit__click";

        public b(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("BackExitClickEvent(name=", this.a, ")");
        }
    }

    public static final class b0 implements a5o {
        public final String a;
        public final String b;

        public b0(String str) {
            str.getClass();
            this.a = "iv__odds_filter__simple__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return this.a.equals(b0Var.a) && Intrinsics.g(this.b, b0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("OddsFilterSimpleClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements a5o {
        public final String a = "iv__back__more__click";

        public c(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("BackMoreClickEvent(name=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c0 implements a5o {
        public final String a = "iv__open_bet__keep_betting__click";
        public final String b;

        public c0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.a.equals(c0Var.a) && Intrinsics.g(this.b, c0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("OpenBetKeepBettingClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements a5o {
        public final String a = "iv__back__x__click";

        public d(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("BackXClickEvent(name=", this.a, ")");
        }
    }

    public static final class d0 implements a5o {
        public final String a;
        public final String b;
        public final String c;

        public d0(String str, String str2) {
            str.getClass();
            str.getClass();
            this.a = "iv__open_bet_kickoff__click";
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapD = kpu.d(new Pair("sportId", this.b));
            String str = this.c;
            if (str != null) {
                mapD.put("simulation_speed_option", str);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.a.equals(d0Var.a) && Intrinsics.g(this.b, d0Var.b) && Intrinsics.g(this.c, d0Var.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return uf80.a(ux5.a("OpenBetKickoffClickEvent(name=", this.a, ", sportId=", this.b, ", simulationSpeedOption="), this.c, ")");
        }
    }

    public static final class e implements a5o {
        public final String a = "iv__bet_builder__add_to_betslip";
        public final String b;

        public e(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("BetBuilderAddToBetslipEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class e0 implements a5o {
        public final String a = "iv__open_bet__rebet__add_to_betslip";
        public final String b;

        public e0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return this.a.equals(e0Var.a) && Intrinsics.g(this.b, e0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("OpenBetRebetAddToBetslipEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class f implements a5o {
        public final String a = "iv__bet_history_details__view";
        public final String b;

        public f(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BetHistoryDetailsViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f0 implements a5o {
        public final String a = "iv__place_bet__click";
        public final String b;

        public f0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) obj;
            return this.a.equals(f0Var.a) && Intrinsics.g(this.b, f0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("PlaceBetClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class g implements a5o {
        public final String a = "iv__bet_history_kickoff__click";
        public final String b;

        public g(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BetHistoryKickoffClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class h implements a5o {
        public final String a;
        public final String b;

        public h(String str) {
            str.getClass();
            this.a = "iv__bet_history__view";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && Intrinsics.g(this.b, hVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("BetHistoryViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class h0 implements a5o {
        public final String a;
        public final String b;

        public h0(String str) {
            str.getClass();
            this.a = "iv__round_result__view";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            return this.a.equals(h0Var.a) && Intrinsics.g(this.b, h0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("RoundResultViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i implements a5o {
        public final String a;
        public final String b;

        public i(String str) {
            str.getClass();
            this.a = "iv__event_details__h2h_stats__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && Intrinsics.g(this.b, iVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("EventDetailsHeadToHeadStatsClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class i0 implements a5o {
        public final String a = "iv__sharing__click";

        public i0(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && Intrinsics.g(this.a, ((i0) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SharingClickEvent(name=", this.a, ")");
        }
    }

    public static final class j implements a5o {
        public final String a = "iv__event_list__add_to_betslip";
        public final String b;

        public j(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && Intrinsics.g(this.b, jVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListAddToBetslipEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class j0 implements a5o {
        public final String a = "iv__sharing_panel__view";

        public j0(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && Intrinsics.g(this.a, ((j0) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SharingPanelViewEvent(name=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k implements a5o {
        public final String a = "iv__event_list__bet_builder__click";
        public final String b;
        public final Boolean c;

        public k(String str, Boolean bool) {
            this.b = str;
            this.c = bool;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b), new Pair(AnalyticsParam.EVENT_STATUS, this.c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a.equals(kVar.a) && Intrinsics.g(this.b, kVar.b) && this.c.equals(kVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return rg2.a(ux5.a("EventListBetBuilderClickEvent(name=", this.a, ", sportId=", this.b, ", status="), this.c, ")");
        }
    }

    public static final class k0 implements a5o {
        public final String a = "iv__skip_to_result__click";
        public final String b;

        public k0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k0)) {
                return false;
            }
            k0 k0Var = (k0) obj;
            return this.a.equals(k0Var.a) && this.b.equals(k0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("SkipToResultClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class l implements a5o {
        public final String a = "iv__event_list__details__add_to_betslip";
        public final String b;

        public l(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && Intrinsics.g(this.b, lVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a(qUnCRF.iajtPtk, this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class l0 implements a5o {
        public final String a;
        public final String b;

        public l0(String str) {
            str.getClass();
            this.a = "iv__switch_match__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) obj;
            return this.a.equals(l0Var.a) && Intrinsics.g(this.b, l0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("SwitchMatchClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class m implements a5o {
        public final String a = "iv__event_list__details__bet_builder__click";
        public final String b;
        public final Boolean c;

        public m(String str, Boolean bool) {
            this.b = str;
            this.c = bool;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b), new Pair(AnalyticsParam.EVENT_STATUS, this.c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a.equals(mVar.a) && Intrinsics.g(this.b, mVar.b) && this.c.equals(mVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return rg2.a(ux5.a("EventListDetailsBetBuilderClickEvent(name=", this.a, ", sportId=", this.b, ", status="), this.c, ")");
        }
    }

    public static final class m0 implements a5o {
        public final String a;
        public final String b;

        public m0(String str) {
            str.getClass();
            this.a = "iv__switch_match__view";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) obj;
            return this.a.equals(m0Var.a) && Intrinsics.g(this.b, m0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("SwitchMatchViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class n implements a5o {
        public final String a = "iv__event_list__details__next_round__click";
        public final String b;

        public n(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a.equals(nVar.a) && Intrinsics.g(this.b, nVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListDetailsNextRoundClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class n0 implements a5o {
        public final String a = "iv__winning__next_round__click";
        public final String b;

        public n0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n0)) {
                return false;
            }
            n0 n0Var = (n0) obj;
            return this.a.equals(n0Var.a) && this.b.equals(n0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("WinningNextRoundClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class o implements a5o {
        public final String a;
        public final String b;

        public o(String str) {
            str.getClass();
            this.a = "iv__event_list__details__odds_filter__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.a.equals(oVar.a) && Intrinsics.g(this.b, oVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("EventListDetailsOddsFilterClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class o0 implements a5o {
        public final String a = "iv__winning__sharing__click";
        public final String b;

        public o0(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            return this.a.equals(o0Var.a) && this.b.equals(o0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("WinningSharingClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class p implements a5o {
        public final String a = "iv__event_list__details__view";
        public final String b;

        public p(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a.equals(pVar.a) && Intrinsics.g(this.b, pVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListDetailsViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class q implements a5o {
        public final String a;
        public final String b;

        public q(String str) {
            str.getClass();
            this.a = "iv__event_list__h2h_stats__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a.equals(qVar.a) && Intrinsics.g(this.b, qVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("EventListHeadToHeadStatsClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class r implements a5o {
        public final String a = "iv__event_list__league_stats__click";
        public final String b;

        public r(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.a.equals(rVar.a) && Intrinsics.g(this.b, rVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListLeagueStatsClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class s implements a5o {
        public final String a = "iv__event_list__next_round__click";
        public final String b;

        public s(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.a.equals(sVar.a) && Intrinsics.g(this.b, sVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListNextRoundClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class t implements a5o {
        public final String a = "iv__event_list__odds_filter__click";
        public final String b;

        public t(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.a.equals(tVar.a) && Intrinsics.g(this.b, tVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListOddsFilterClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class u implements a5o {
        public final String a = "iv__event_list__view";
        public final String b;

        public u(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.a.equals(uVar.a) && Intrinsics.g(this.b, uVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("EventListViewEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class v implements a5o {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public v(String str, long j, long j2) {
            str.getClass();
            this.a = "iv__h2h_stats__view";
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b), new Pair(AnalyticsParam.SOCIAL_START_TIMESTAMP, Long.valueOf(this.c)), new Pair(AnalyticsParam.SOCIAL_END_TIMESTAMP, Long.valueOf(this.d)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a.equals(vVar.a) && Intrinsics.g(this.b, vVar.b) && this.c == vVar.c && this.d == vVar.d;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("HeadToHeadStatsViewEvent(name=", this.a, ", sportId=", this.b, ", startTimestamp=");
            sbA.append(this.c);
            return zug.a(this.d, ", endTimestamp=", ")", sbA);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class w implements a5o {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public w(String str, long j, long j2) {
            str.getClass();
            this.a = "iv__league_stats__view";
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b), new Pair(AnalyticsParam.SOCIAL_START_TIMESTAMP, Long.valueOf(this.c)), new Pair(AnalyticsParam.SOCIAL_END_TIMESTAMP, Long.valueOf(this.d)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a.equals(wVar.a) && Intrinsics.g(this.b, wVar.b) && this.c == wVar.c && this.d == wVar.d;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("LeagueStatsViewEvent(name=", this.a, ", sportId=", this.b, ", startTimestamp=");
            sbA.append(this.c);
            return zug.a(this.d, ", endTimestamp=", ")", sbA);
        }
    }

    public static final class x implements a5o {
        public final String a = "iv__missing_probability";
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public x(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String str = this.b;
            if (str == null) {
                str = "";
            }
            Pair pair = new Pair("sportId", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair2 = new Pair("round_id", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            Pair pair3 = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str3);
            String str4 = this.e;
            if (str4 == null) {
                str4 = "";
            }
            Pair pair4 = new Pair("market_id", str4);
            String str5 = this.f;
            if (str5 == null) {
                str5 = "";
            }
            Pair pair5 = new Pair("outcome_id", str5);
            String str6 = this.g;
            if (str6 == null) {
                str6 = "";
            }
            Pair pair6 = new Pair("odds", str6);
            String str7 = this.h;
            return kpu.d(pair, pair2, pair3, pair4, pair5, pair6, new Pair("probability", str7 != null ? str7 : ""));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.a.equals(xVar.a) && Intrinsics.g(this.b, xVar.b) && Intrinsics.g(this.c, xVar.c) && Intrinsics.g(this.d, xVar.d) && Intrinsics.g(this.e, xVar.e) && Intrinsics.g(this.f, xVar.f) && Intrinsics.g(this.g, xVar.g) && Intrinsics.g(this.h, xVar.h);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.h;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("MissingProbability(name=", this.a, ", sportId=", this.b, ", roundId=");
            hxa.c(sbA, this.c, ", eventId=", this.d, ", marketId=");
            hxa.c(sbA, this.e, ", outcomeId=", this.f, ", odds=");
            return kwi.a(sbA, this.g, ", probability=", this.h, ")");
        }
    }

    public static final class y implements a5o {
        public final String a;
        public final String b;

        public y(String str) {
            str.getClass();
            this.a = "iv__odds_filter__custom_range__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.a.equals(yVar.a) && Intrinsics.g(this.b, yVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("OddsFilterCustomRangeClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    public static final class z implements a5o {
        public final String a;
        public final String b;

        public z(String str) {
            str.getClass();
            this.a = "iv__odds_filter__present_range__click";
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("sportId", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.a.equals(zVar.a) && Intrinsics.g(this.b, zVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("OddsFilterPresentRangeClickEvent(name=", this.a, ", sportId=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g0 implements a5o {
        public final String a;
        public final Map<String, Object> b;

        public g0(String str, Map<String, ? extends Object> map) {
            map.getClass();
            this.a = str;
            this.b = map;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> map = new HashMap<>();
            map.putAll(this.b);
            return map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) obj;
            return Intrinsics.g(this.a, g0Var.a) && Intrinsics.g(this.b, g0Var.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ReportEvent(name=" + this.a + ", params=" + this.b + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g0(Map<String, ? extends Object> map) {
            this(map, 0);
            map.getClass();
        }

        public /* synthetic */ g0(Map map, int i) {
            this("instant_virtuals", (Map<String, ? extends Object>) map);
        }
    }
}
