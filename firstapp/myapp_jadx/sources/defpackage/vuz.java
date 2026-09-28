package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface vuz {

    public static final class a implements vuz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -849683796;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements vuz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -569130797;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements vuz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 168592562;
        }

        public final String toString() {
            return "ConditionClick";
        }
    }

    public static final class d implements vuz {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2799773;
        }

        public final String toString() {
            return "Submit";
        }
    }

    public static final class e implements vuz {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 384065670;
        }

        public final String toString() {
            return "SuccessAcknowledged";
        }
    }

    public static final class f implements vuz {
        public final ijf0 a;

        public f(ijf0 ijf0Var) {
            this.a = ijf0Var;
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
            return vwz.a("UpdateConfirmPassword(confirmPassword=", this.a, ")");
        }
    }

    public static final class g implements vuz {
        public final ijf0 a;

        public g(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdatePassword(password=", this.a, ")");
        }
    }
}
