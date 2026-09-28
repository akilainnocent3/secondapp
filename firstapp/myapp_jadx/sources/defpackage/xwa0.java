package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface xwa0 extends id90 {

    public static final class a implements xwa0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ShowGenericErrorDialog(message=", this.a, ")");
        }
    }

    public static final class b implements xwa0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 833404163;
        }

        public final String toString() {
            return "ShowMaxTierLifetimeLimitDialog";
        }
    }

    public static final class c implements xwa0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 941776061;
        }

        public final String toString() {
            return "ShowMaxTierMustWaitDialog";
        }
    }

    public static final class d implements xwa0 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ShowNewAccountLimitDialog(message=", this.a, ")");
        }
    }

    public static final class e implements xwa0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1799171384;
        }

        public final String toString() {
            return "ShowRequiredDataErrorDialog";
        }
    }

    public static final class f implements xwa0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1105829669;
        }

        public final String toString() {
            return "ShowRiskAuditDialog";
        }
    }

    public static final class g implements xwa0 {
        public final UiText a;
        public final String b;
        public final String c;
        public final String d;

        public g(ResourceUiText resourceUiText, String str, String str2, String str3) {
            str2.getClass();
            str3.getClass();
            this.a = resourceUiText;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && this.b.equals(gVar.b) && Intrinsics.g(this.c, gVar.c) && Intrinsics.g(this.d, gVar.d);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            return this.d.hashCode() + gmf0.a(gmf0.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowWithdrawConfirmationDialog(provider=");
            sb.append(this.a);
            sb.append(", accountNumber=");
            sb.append(this.b);
            sb.append(", accountName=");
            return kwi.a(sb, this.c, ", amount=", this.d, ")");
        }
    }

    public static final class h implements xwa0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 690939454;
        }

        public final String toString() {
            return "ShowWithdrawFailedDialog";
        }
    }

    public static final class i implements xwa0 {
        public final String a;

        public i(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ShowWithdrawGreylistNeedBetsDialog(message=", this.a, ")");
        }
    }

    public static final class j implements xwa0 {
        public final String a;

        public j(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ShowWithdrawGreylistedDialog(message=", this.a, ")");
        }
    }

    public static final class k implements xwa0 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1504652055;
        }

        public final String toString() {
            return "ShowWithdrawOverUserTierLimitDialog";
        }
    }

    public static final class l implements xwa0 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1195340625;
        }

        public final String toString() {
            return "ShowWithdrawOverUserTierLimitForPeriodDialog";
        }
    }

    public static final class m implements xwa0 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 359406781;
        }

        public final String toString() {
            return "StartPullingConfigForUserLimits";
        }
    }

    public static final class n implements xwa0 {
        public final String a;
        public final String b;
        public final String c;

        public n(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.g(this.a, nVar.a) && this.b.equals(nVar.b) && this.c.equals(nVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("ToPendingScreen(amount=", this.a, ", clabe=", this.b, ", tradeId="), this.c, ")");
        }
    }

    public static final class o implements xwa0 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 124461327;
        }

        public final String toString() {
            return "ToSportyPinScreen";
        }
    }

    public static final class p implements xwa0 {
        public final String a;
        public final String b;

        public p(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Intrinsics.g(this.a, pVar.a) && this.b.equals(pVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("ToWithdrawSuccess(amount=", this.a, ", tradeId=", this.b, ")");
        }
    }
}
