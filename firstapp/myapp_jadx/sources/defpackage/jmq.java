package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface jmq {

    public static final class a implements jmq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 861815944;
        }

        public final String toString() {
            return "ClickHistory";
        }
    }

    public static final class b implements jmq {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ClickLottery(lotteryId=", this.a, ")");
        }
    }

    public static final class c implements jmq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -283631376;
        }

        public final String toString() {
            return "ClickRewardCenter";
        }
    }

    public static final class d implements jmq {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1185532108;
        }

        public final String toString() {
            return "ClickSearch";
        }
    }

    public static final class e implements jmq {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1632105714;
        }

        public final String toString() {
            return "CloseDrawInfo";
        }
    }

    public static final class f implements jmq {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 963896341;
        }

        public final String toString() {
            return "ExploreFavoriteClick";
        }
    }

    public static final class g implements jmq {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -206061474;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    public static final class h implements jmq {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1419777117;
        }

        public final String toString() {
            return "HowToPlay";
        }
    }

    public static final class i implements jmq {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1574365695;
        }

        public final String toString() {
            return "LoadMoreResults";
        }
    }

    public static final class j implements jmq {
        public final String a;
        public final boolean b;

        public j(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.g(this.a, jVar.a) && this.b == jVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("OpenCloseCountry(countryCode=", this.a, ", isOpen=", ")", this.b);
        }
    }

    public static final class k implements jmq {
        public final String a;

        public k(String str) {
            str.getClass();
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
            return tug.a("OpenDrawInfo(drawId=", this.a, ")");
        }
    }

    public static final class l implements jmq {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 2111911336;
        }

        public final String toString() {
            return "RefreshLotteries";
        }
    }

    public static final class m implements jmq {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 141722679;
        }

        public final String toString() {
            return "RefreshResults";
        }
    }

    public static final class n implements jmq {
        public final fpq a;

        public n(fpq fpqVar) {
            fpqVar.getClass();
            this.a = fpqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectTab(tab=" + this.a + ")";
        }
    }

    public static final class o implements jmq {
        public final ipq a;

        public o(ipq ipqVar) {
            ipqVar.getClass();
            this.a = ipqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectTag(tag=" + this.a + ")";
        }
    }

    public static final class p implements jmq {
        public final String a;
        public final boolean b;

        public p(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Intrinsics.g(this.a, pVar.a) && this.b == pVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("UpdateFavorite(lotteryId=", this.a, ", isFavorite=", ")", this.b);
        }
    }

    public static final class q implements jmq {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1826719426;
        }

        public final String toString() {
            return "UpdateLotteries";
        }
    }
}
