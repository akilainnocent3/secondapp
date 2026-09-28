package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface wwf {

    public static final class a implements wwf {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -683732792;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public static final class b implements wwf {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -686816078;
        }

        public final String toString() {
            return "ConfirmEmailSentClicked";
        }
    }

    public static final class c implements wwf {
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
            return vwz.a("ConfirmNewEmailChanged(confirmNewEmail=", this.a, ")");
        }
    }

    public static final class d implements wwf {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 423505799;
        }

        public final String toString() {
            return "DismissErrorDialog";
        }
    }

    public static final class e implements wwf {
        public final ijf0 a;

        public e(ijf0 ijf0Var) {
            this.a = ijf0Var;
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
            return vwz.a("NewEmailChanged(newEmail=", this.a, ")");
        }
    }
}
