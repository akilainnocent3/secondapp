package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xhj0 {

    public static final class a implements xhj0 {
        public final BigDecimal a;
        public final BigDecimal b;

        public a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            bigDecimal.getClass();
            bigDecimal2.getClass();
            this.a = bigDecimal;
            this.b = bigDecimal2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AmountInsufficientWithFee(amount=" + this.a + ", fee=" + this.b + ")";
        }
    }

    public static final class b implements xhj0 {
        public final UiText a;
        public final wae b;
        public final jif c;

        public b(UiText uiText, wae waeVar, jif jifVar) {
            uiText.getClass();
            this.a = uiText;
            this.b = waeVar;
            this.c = jifVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            wae waeVar = this.b;
            return this.c.hashCode() + ((iHashCode + (waeVar == null ? 0 : waeVar.hashCode())) * 31);
        }

        public final String toString() {
            return "CustomValidationError(errorMessage=" + this.a + ", errorClickableDestination=" + this.b + ", onErrorAction=" + this.c + ")";
        }
    }

    public static final class c implements xhj0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1425038691;
        }

        public final String toString() {
            return "DecimalNotAllowed";
        }
    }

    public static final class d implements xhj0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1765435996;
        }

        public final String toString() {
            return "EmptyAmount";
        }
    }

    public static final class e implements xhj0 {
        public final BigDecimal a;

        public e(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ExceedBalance(balance=" + this.a + ")";
        }
    }

    public static final class f implements xhj0 {
        public final BigDecimal a;

        public f(BigDecimal bigDecimal) {
            this.a = bigDecimal;
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
            return "ExceedWithdrawableBalance(withdrawableBalance=" + this.a + ")";
        }
    }

    public static final class g implements xhj0 {
        public final BigDecimal a;

        public g(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OverMaxWithdraw(maxAmount=" + this.a + ")";
        }
    }

    public static final class h implements xhj0 {
        public final BigDecimal a;

        public h(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
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
            return "UnderMinWithdraw(minAmount=" + this.a + ")";
        }
    }

    public static final class i implements xhj0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1168673333;
        }

        public final String toString() {
            return "ValidAmount";
        }
    }

    public static final class j implements xhj0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 448892902;
        }

        public final String toString() {
            return "ValidationError";
        }
    }
}
