package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface kli0 {

    public interface a extends kli0 {

        /* JADX INFO: renamed from: kli0$a$a, reason: collision with other inner class name */
        public static final class C0768a implements a {
            public static final C0768a a = new C0768a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0768a);
            }

            public final int hashCode() {
                return -1104760684;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1456428749;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    public static final class b implements kli0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 201213892;
        }

        public final String toString() {
            return "GoToLoginPage";
        }
    }

    public interface c extends kli0 {

        public static final class a implements c {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
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

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("NavigateToGame(redirectUrl=", this.a, ", updateRequiredAppVersion=", this.b, ")");
            }
        }
    }

    public static final class d implements kli0 {
        public final fgi0 a;

        public d(fgi0 fgi0Var) {
            this.a = fgi0Var;
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
            return "OnBannerClicked(item=" + this.a + ")";
        }
    }

    public static final class e implements kli0 {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OnBigWinClicked(id=", ")");
        }
    }

    public static final class f implements kli0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 999944647;
        }

        public final String toString() {
            return "OnBuildAndGoClick";
        }
    }

    public static final class g implements kli0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1150346981;
        }

        public final String toString() {
            return "OnBuildAndGoEntrySheetDismissed";
        }
    }

    public static final class h implements kli0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -615879712;
        }

        public final String toString() {
            return "OnBuildAndGoEntrySheetRequested";
        }
    }

    public static final class i implements kli0 {
        public final r7e a;

        public i(r7e r7eVar) {
            r7eVar.getClass();
            this.a = r7eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnDepositFloatingIconVisibilityChanged(state=" + this.a + ")";
        }
    }

    public static final class j implements kli0 {
        public final chi0 a;

        public j(chi0 chi0Var) {
            this.a = chi0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnEntranceClicked(item=" + this.a + ")";
        }
    }

    public static final class k implements kli0 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1040674632;
        }

        public final String toString() {
            return "OnGiftClick";
        }
    }

    public static final class l implements kli0 {
        public final wae a;

        public l(wae waeVar) {
            this.a = waeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnMissionDestinationHandle(destination=" + this.a + ")";
        }
    }

    public static final class m implements kli0 {
        public final int a;

        public m(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OnMissionRulesClick(missionId=", ")");
        }
    }

    public static final class n implements kli0 {
        public final int a;

        public n(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OnMissionStart(missionId=", ")");
        }
    }

    public static final class o implements kli0 {
        public final String a;
        public final Bundle b;

        public o(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
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

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Bundle bundle = this.b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            return "OnMissionUrlHandle(url=" + this.a + ", bundle=" + this.b + ")";
        }
    }

    public static final class p implements kli0 {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1900986587;
        }

        public final String toString() {
            return "OnScreenResumed";
        }
    }

    public static final class q implements kli0 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1005139133;
        }

        public final String toString() {
            return "OnShowErrorDialog";
        }
    }

    public static final class r implements kli0 {
        public final vki0 a;

        public r(vki0 vki0Var) {
            this.a = vki0Var;
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
            return "OnTabSelected(tab=" + this.a + ")";
        }
    }

    public static final class s implements kli0 {
        public static final s a = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1917751971;
        }

        public final String toString() {
            return "OnTopAppBarBalanceClick";
        }
    }

    public static final class t implements kli0 {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -1217043290;
        }

        public final String toString() {
            return "OnViewOtherMissionsClick";
        }
    }

    public static final class u implements kli0 {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1676593276;
        }

        public final String toString() {
            return "RequestExit";
        }
    }
}
