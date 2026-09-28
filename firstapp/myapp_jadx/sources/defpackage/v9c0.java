package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v9c0 {

    public static final class a extends v9c0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 548642856;
        }

        public final String toString() {
            return "AddToBetslipEvent";
        }
    }

    public static final class b extends v9c0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -761804671;
        }

        public final String toString() {
            return "AnimationError";
        }
    }

    public static final class c extends v9c0 {
        public final long a;
        public final String b;

        public c(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sbA = b0.a(this.a, "AnimationView(durationMs=", ", animationMode=", this.b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d extends v9c0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 447676350;
        }

        public final String toString() {
            return "BetBuilderAddToBetslipEvent";
        }
    }

    public static final class e extends v9c0 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("BetBuilderClickEvent(enabled=", ")", this.a);
        }
    }

    public static final class f extends v9c0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1206759560;
        }

        public final String toString() {
            return "BetHistoryClick";
        }
    }

    public static final class g extends v9c0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2036193669;
        }

        public final String toString() {
            return "ConfirmClick";
        }
    }

    public static final class h extends v9c0 {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LeagueTabClick(leagueName=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class i extends v9c0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -637456667;
        }

        public final String toString() {
            return QWvyvNzGsBpRT.GUbskpxGCgTm;
        }
    }

    public static final class j extends v9c0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1107032956;
        }

        public final String toString() {
            return "LuckyPickClick";
        }
    }

    public static final class k extends v9c0 {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("MarketClickEvent(marketName=", this.a, ")");
        }
    }

    public static final class l extends v9c0 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -792858742;
        }

        public final String toString() {
            return "NextRoundClick";
        }
    }

    public static final class m extends v9c0 {
        public final a5o a;

        public m(a5o a5oVar) {
            this.a = a5oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.g(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OddsFilter(event=" + this.a + ")";
        }
    }

    public static final class n extends v9c0 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 710376033;
        }

        public final String toString() {
            return "PlaceBetClick";
        }
    }

    public static final class o extends v9c0 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1228443032;
        }

        public final String toString() {
            return "PlayerAnimationPlaceBetClick";
        }
    }

    public static final class p extends v9c0 {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1975077185;
        }

        public final String toString() {
            return "RecommendedMatchClick";
        }
    }

    public static final class q extends v9c0 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1902189068;
        }

        public final String toString() {
            return "SkipToResultClick";
        }
    }

    public static final class r extends v9c0 {
        public final a a;

        public enum a {
            SHOW("show"),
            HIDE("hide");

            public final String a;

            a(String str) {
                this.a = str;
            }
        }

        public r(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StatsView(status=" + this.a + ")";
        }
    }
}
