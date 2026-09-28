package defpackage;

import com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface zxq {

    public static final class a implements zxq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1892497214;
        }

        public final String toString() {
            return "AddMyNumber";
        }
    }

    public static final class a0 implements zxq {
        public static final a0 a = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -2092659806;
        }

        public final String toString() {
            return "PlaceBet";
        }
    }

    public static final class b implements zxq {
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
            return tug.a("ApplyNumber(numberString=", this.a, ")");
        }
    }

    public static final class b0 implements zxq {
        public static final b0 a = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return -1147847598;
        }

        public final String toString() {
            return "RecentDrawLoadMore";
        }
    }

    public static final class c implements zxq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 901669503;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class c0 implements zxq {
        public static final c0 a = new c0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return 850341124;
        }

        public final String toString() {
            return "RecentDrawRefresh";
        }
    }

    public static final class d implements zxq {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1354296771;
        }

        public final String toString() {
            return "DismissMainDrawPanelDialog";
        }
    }

    public static final class d0 implements zxq {
        public static final d0 a = new d0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return 1955359018;
        }

        public final String toString() {
            return "RouteToLobby";
        }
    }

    public static final class e implements zxq {
        public final nvp.d a;

        public e(nvp.d dVar) {
            this.a = dVar;
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
            return "DoSharedAction(event=" + this.a + ")";
        }
    }

    public static final class e0 implements zxq {
        public final String a;

        public e0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.a.equals(((e0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SelectedGroup(groupId=", this.a, ")");
        }
    }

    public static final class f implements zxq {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("ExpendBetPanel(isExpend=", ")", this.a);
        }
    }

    public static final class f0 implements zxq {
        public final lk50<qxp> a;

        public f0(lk50<qxp> lk50Var) {
            lk50Var.getClass();
            this.a = lk50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && Intrinsics.g(this.a, ((f0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetConfig(result=" + this.a + ")";
        }
    }

    public static final class g implements zxq {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 277029601;
        }

        public final String toString() {
            return "HideLiveToast";
        }
    }

    public static final class g0 implements zxq {
        public final boolean a;

        public g0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.a == ((g0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateFavorite(isFavorite=", ")", this.a);
        }
    }

    public interface h extends zxq {
    }

    public static final class h0 implements zxq {
        public final boolean a;

        public h0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.a == ((h0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateGiftEnable(enable=", ")", this.a);
        }
    }

    public interface i extends h {
        String getMarketId();
    }

    public static final class i0 implements zxq {
        public final dvq a;

        public i0(dvq dvqVar) {
            this.a = dvqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.a.equals(((i0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateMyNumber(myNumber=" + this.a + ")";
        }
    }

    public interface j extends h {

        public static final class a implements j {
            public final s4r.a a;

            public a(s4r.a aVar) {
                aVar.getClass();
                this.a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ApplyReBetData(data=" + this.a + ")";
            }
        }

        public static final class b implements j {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2008004381;
            }

            public final String toString() {
                return "DeleteAll";
            }
        }
    }

    public static final class j0 implements zxq {
        public final boolean a;

        public j0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.a == ((j0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateStreamFullScreen(isFullScreen=", ")", this.a);
        }
    }

    public static final class k implements zxq {
        public static final k a = new k();
    }

    public static final class m implements zxq {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -943547002;
        }

        public final String toString() {
            return "OnClickMyNumber";
        }
    }

    public static final class n implements zxq {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -2082977144;
        }

        public final String toString() {
            return "OnConfirmBet";
        }
    }

    public static final class o implements zxq {
        public static final o a = new o();
    }

    public static final class p implements zxq {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1226116651;
        }

        public final String toString() {
            return "OnDismissConfirmDialog";
        }
    }

    public static final class q implements zxq {
        public final int a;

        public q(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a == ((q) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OnDone(saveDefaultAmount=", ")");
        }
    }

    public static final class r implements zxq {
        public final String a;

        public r(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a.equals(((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnNumberInput(input=", this.a, ")");
        }
    }

    public static final class s implements zxq {
        public final BigDecimal a;

        public s(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            BigDecimal bigDecimal = ((s) obj).a;
            rkd0.a aVar = rkd0.Companion;
            return Intrinsics.g(this.a, bigDecimal);
        }

        public final int hashCode() {
            rkd0.a aVar = rkd0.Companion;
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnQuickStake(amount=", rkd0.a(this.a), ")");
        }
    }

    public static final class t implements zxq {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 182121828;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    public static final class u implements zxq {
        public final String a;

        public u(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.a.equals(((u) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnViewOrder(orderId=", this.a, ")");
        }
    }

    public static final class v implements zxq {
        public final boolean a;

        public v(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.a == ((v) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("OpenCloseDrawInfo(isOpen=", ")", this.a);
        }
    }

    public static final class w implements zxq {
        public final boolean a;

        public w(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("OpenCloseRecentDraw(isOpen=", ")", this.a);
        }
    }

    public static final class x implements zxq {
        public static final x a = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -1331946470;
        }

        public final String toString() {
            return "OpenGiftDialog";
        }
    }

    public static final class y implements zxq {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 250885714;
        }

        public final String toString() {
            return "OpenHistory";
        }
    }

    public static final class z implements zxq {
        public final String a;

        public z(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && Intrinsics.g(this.a, ((z) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenMainDrawPanelDialog(marketId=", this.a, ")");
        }
    }

    public static final class l implements zxq {
        public final String a;
        public final HowToPlayPresentation b;

        public l(String str, HowToPlayPresentation howToPlayPresentation) {
            str.getClass();
            howToPlayPresentation.getClass();
            this.a = str;
            this.b = howToPlayPresentation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.a, lVar.a) && this.b == lVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnClickHowToPlay(howToPlay=" + this.a + ", presentation=" + this.b + ")";
        }

        public /* synthetic */ l(String str) {
            this(str, HowToPlayPresentation.DEFAULT);
        }
    }
}
