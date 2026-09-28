package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface ot70 {

    public static final class a implements ot70 {
        public final Event a;
        public final ny70 b;

        public a(Event event, ny70 ny70Var) {
            event.getClass();
            this.a = event;
            this.b = ny70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "EventResultClicked(event=" + this.a + ", section=" + this.b + ")";
        }
    }

    public static final class b implements ot70 {
        public final zv70 a;

        public b(zv70 zv70Var) {
            this.a = zv70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GameClicked(game=" + this.a + ")";
        }
    }

    public static final class c implements ot70 {
        public final Event a;

        public c(Event event) {
            event.getClass();
            this.a = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MatchStatsClicked(event=" + this.a + ")";
        }
    }

    public static final class d implements ot70 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("QueryChanged(query=", this.a, ")");
        }
    }

    public static final class e implements ot70 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("RecentQueryClick(query=", this.a, ")");
        }
    }

    public static final class f implements ot70 {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("RecentQueryRemoved(query=", this.a, ")");
        }
    }

    public static final class g implements ot70 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1520750176;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    public static final class h implements ot70 {
        public final ny70 a;

        public h(ny70 ny70Var) {
            this.a = ny70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SectionExpanded(section=" + this.a + ")";
        }
    }

    public static final class i implements ot70 {
        public final String a;
        public final int b;

        public i(String str, int i) {
            this.a = str;
            this.b = i;
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

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "SuggestedQueryClick(query=", this.a, ", position=", ")");
        }
    }

    public static final class j implements ot70 {
        public final String a;
        public final String b;
        public final String c;

        public j(String str, String str2, String str3) {
            com.appsflyer.internal.m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b) && Intrinsics.g(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("TeamClicked(sportId=", this.a, ", teamId=", this.b, ", teamName="), this.c, ")");
        }
    }

    public static final class k implements ot70 {
        public final String a;
        public final String b;

        public k(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
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

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("TournamentClicked(sportId=", this.a, ", tournamentId=", this.b, ")");
        }
    }

    public static final class l implements ot70 {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a.equals(((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TrendingQueryClick(query=", this.a, ")");
        }
    }

    public static final class m implements ot70 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 749405153;
        }

        public final String toString() {
            return "ViewAllGamesClicked";
        }
    }
}
