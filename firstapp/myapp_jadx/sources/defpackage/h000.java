package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface h000 {

    public static final class a implements h000 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 191226008;
        }

        public final String toString() {
            return "ShowSomethingWentWrongToast";
        }
    }

    public static final class b implements h000 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1462329924;
        }

        public final String toString() {
            return "ToContactUsScreen";
        }
    }

    public static final class c implements h000 {
        public final wae a;

        public c(wae waeVar) {
            waeVar.getClass();
            this.a = waeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToDeeplinkDestination(destination=" + this.a + ")";
        }
    }

    public static final class d implements h000 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1748885549;
        }

        public final String toString() {
            return "ToKycScreen";
        }
    }

    public static final class e implements h000 {
        public final String a;
        public final UiText b;
        public final String c;
        public final String d;
        public final String e;
        public final int f;

        public e(String str, UiText uiText, String str2, String str3, String str4, int i) {
            uiText.getClass();
            this.a = str;
            this.b = uiText;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c) && Intrinsics.g(this.d, eVar.d) && Intrinsics.g(this.e, eVar.e) && this.f == eVar.f;
        }

        public final int hashCode() {
            int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return Integer.hashCode(this.f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = x45.a(this.b, "ToSuccessfulTransactionScreen(amount=", this.a, ", paymentTo=", ", phoneNumber=");
            hxa.c(sbA, this.c, ", tradeId=", this.d, ", fee=");
            return ijg0.a(this.f, this.e, ", type=", ")", sbA);
        }
    }

    public static final class f implements h000 {
        public final Boolean a;
        public final aqg0 b;
        public final boolean c;

        public f(Boolean bool, aqg0 aqg0Var, boolean z) {
            this.a = bool;
            this.b = aqg0Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            aqg0 aqg0Var = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (aqg0Var != null ? aqg0Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToTransactionsScreen(isDeposit=");
            sb.append(this.a);
            sb.append(", category=");
            sb.append(this.b);
            sb.append(", finishCurrentScreen=");
            return mq0.a(sb, this.c, ")");
        }

        public /* synthetic */ f(int i) {
            this(null, null, false);
        }
    }
}
