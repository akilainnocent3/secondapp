package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface tz60 extends pdd0 {

    public static final class a implements tz60 {
        public final String a = "sf__add_to_betslip";

        public a(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("AddToBetslipEvent(name=", this.a, ")");
        }
    }

    public static final class b implements tz60 {
        public final String a = "sf__animation_error";
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("total_file_count", Integer.valueOf(this.b)), new Pair("error_file_count", Integer.valueOf(this.c)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return zk1.a(this.c, ")", ml5.a(this.b, "AnimationErrorEvent(name=", this.a, ", totalFileCount=", ", errorFileCount="));
        }
    }

    public static final class d implements tz60 {
        public final String a = "sf__betslip_accept_change__view";

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
            return tug.a("BetslipAcceptChangeViewEvent(name=", this.a, ")");
        }
    }

    public static final class e implements tz60 {
        public final String a = "sf__event_list__view";

        public e(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("EventListViewEvent(name=", this.a, ")");
        }
    }

    public static final class f implements tz60 {
        public final String a = "sf__h2h__view";

        public f(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("HeadToHeadViewEvent(name=", this.a, ")");
        }
    }

    public static final class g implements tz60 {
        public final String a = "sf__matchday_error";

        public g(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("MatchdayErrorEvent(name=", this.a, ")");
        }
    }

    public static final class h implements tz60 {
        public final String a = "sf__open_bet_error";

        public h(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenBetErrorEvent(name=", this.a, ")");
        }
    }

    public static final class i implements tz60 {
        public final String a = "sf__open_bet_keep_betting__click";

        public i(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenBetKeepBettingClickEvent(name=", this.a, ")");
        }
    }

    public static final class j implements tz60 {
        public final String a = "sf__open_bet__view";

        public j(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenBetViewEvent(name=", this.a, ")");
        }
    }

    public static final class k implements tz60 {
        public final String a = "sf__place_bet__click";

        public k(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PlaceBetClickEvent(name=", this.a, ")");
        }
    }

    public static final class l implements tz60 {
        public final String a = "sf__socket_error";

        public l(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.g(this.a, ((l) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SocketErrorEvent(name=", this.a, ")");
        }
    }

    public static final class m implements tz60 {
        public final String a = "sf__stats_league__view";

        public m(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.g(this.a, ((m) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("StatsLeagueViewEvent(name=", this.a, ")");
        }
    }

    public static final class n implements tz60 {
        public final String a = "sf__stats_match_result__view";

        public n(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.g(this.a, ((n) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("StatsMatchResultViewEvent(name=", this.a, ")");
        }
    }

    public static final class c implements tz60 {
        public final String a = LxHElgWAiSeM.SEUvMOYSZFO;
        public final a b;

        public enum a {
            QUICKBET("quickbet"),
            BETSLIP("betslip");

            public final String a;

            a(String str) {
                this.a = str;
            }
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("place_bet_flow", this.b.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetslipAcceptChangeClickEvent(name=" + this.a + ", placeBetFlow=" + this.b + ")";
        }

        public c(a aVar) {
            this.b = aVar;
        }
    }
}
