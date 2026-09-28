package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface uwz {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements uwz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -636046247;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements uwz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1479712745;
        }

        public final String toString() {
            return "ForgotPasswordClicked";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements uwz {
        public final ijf0 a;

        public c(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("PasswordChanged(password=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements uwz {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -333737871;
        }

        public final String toString() {
            return "PasswordVisibilityToggled";
        }
    }
}
