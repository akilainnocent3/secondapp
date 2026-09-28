package defpackage;

import android.os.Bundle;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface lli0 {

    public static final class a implements lli0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 29461434;
        }

        public final String toString() {
            return "GoToLoginPage";
        }
    }

    public static final class b implements lli0 {
        public final wae a;

        public b(wae waeVar) {
            this.a = waeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToDestination(destination=" + this.a + ")";
        }
    }

    public static final class c implements lli0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1259506637;
        }

        public final String toString() {
            return "NavigateToLoyaltyMission";
        }
    }

    public static final class d implements lli0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -569695175;
        }

        public final String toString() {
            return "OnShowErrorDialog";
        }
    }

    public static final class e implements lli0 {
        public final UiText a;

        public e(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xh8.a(this.a, "OnShowToast(message=", ", duration=0)");
        }
    }

    public static final class f implements lli0 {
        public final long a;

        public f(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "OnTopAppBarBalanceClick(balance=", ")");
        }
    }

    public static final class g implements lli0 {
        public final String a;
        public final Bundle b;

        public g(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && Intrinsics.g(this.b, gVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Bundle bundle = this.b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            return "OpenMissionUrl(url=" + this.a + ", bundle=" + this.b + ")";
        }
    }

    public static final class h implements lli0 {
        public final String a;

        public h(String str) {
            str.getClass();
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
            return tug.a("OpenUrl(url=", this.a, ")");
        }
    }

    public static final class i implements lli0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1099001358;
        }

        public final String toString() {
            return "RequestExit";
        }
    }

    public static final class j implements lli0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1972641873;
        }

        public final String toString() {
            return "ShowVersionUpdateDialog";
        }
    }
}
