package defpackage;

import com.sporty.android.core.model.patron.Country;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface vs40 {

    public static final class a implements vs40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -643537682;
        }

        public final String toString() {
            return "ChangeCountry";
        }
    }

    public static final class b implements vs40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -142371552;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements vs40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 446872761;
        }

        public final String toString() {
            return "CreateAccount";
        }
    }

    public static final class d implements vs40 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1706328305;
        }

        public final String toString() {
            return "ErrorDialogDismissed";
        }
    }

    public static final class e implements vs40 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1345923819;
        }

        public final String toString() {
            return "FetchAllCountries";
        }
    }

    public static final class f implements vs40 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 564980894;
        }

        public final String toString() {
            return "LaunchLogin";
        }
    }

    public static final class g implements vs40 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 352982504;
        }

        public final String toString() {
            return "TermsAndConditionsClick";
        }
    }

    public static final class h implements vs40 {
        public final Country a;

        public h(Country country) {
            this.a = country;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateCitizenship(country=" + this.a + ")";
        }
    }

    public static final class i implements vs40 {
        public final Long a;

        public i(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "UpdateDateOfBirth(dob=" + this.a + ")";
        }
    }

    public static final class j implements vs40 {
        public final ijf0 a;

        public j(ijf0 ijf0Var) {
            this.a = ijf0Var;
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
            return vwz.a("UpdateFirstName(firstNameValue=", this.a, ")");
        }
    }

    public static final class k implements vs40 {
        public final ijf0 a;

        public k(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a.equals(((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdateLastName(lastNameValue=", this.a, ")");
        }
    }

    public static final class l implements vs40 {
        public final ijf0 a;

        public l(ijf0 ijf0Var) {
            this.a = ijf0Var;
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
            return vwz.a("UpdatePassword(passwordValue=", this.a, ")");
        }
    }

    public static final class m implements vs40 {
        public final ijf0 a;

        public m(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a.equals(((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdatePhoneNumber(phoneNumberValue=", this.a, ")");
        }
    }
}
