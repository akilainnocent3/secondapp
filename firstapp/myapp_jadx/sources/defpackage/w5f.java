package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface w5f {

    public static final class a implements w5f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1634531776;
        }

        public final String toString() {
            return "DismissSnackbar";
        }
    }

    public static final class b implements w5f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 721220638;
        }

        public final String toString() {
            return "FinalResultBackToGameButtonClick";
        }
    }

    public static final class c implements w5f {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 189002941;
        }

        public final String toString() {
            return "FinalResultViewDetailsButtonClick";
        }
    }

    public static final class d implements w5f {
        public final d2f a;

        public d(d2f d2fVar) {
            this.a = d2fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KickPointClick(kickPoint=" + this.a + ")";
        }
    }

    public static final class e implements w5f {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2029225406;
        }

        public final String toString() {
            return "KickingVisualCompleted";
        }
    }

    public static final class f implements w5f {
        public final String a;

        public f(String str) {
            this.a = str;
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
            return tug.a("OnPlayAudio(url=", this.a, ")");
        }
    }

    public static final class g implements w5f {
        public final rfj0 a;

        public g(rfj0 rfj0Var) {
            this.a = rfj0Var;
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
            return "WinningPopup(action=" + this.a + ")";
        }
    }
}
