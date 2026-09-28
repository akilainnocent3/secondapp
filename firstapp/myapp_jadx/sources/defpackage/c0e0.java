package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface c0e0 {

    public static final class a implements c0e0 {
        public final rx00 a;

        public a(rx00 rx00Var) {
            this.a = rx00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Gameplay(theme=" + this.a + ')';
        }
    }

    public static final class b implements c0e0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -311973987;
        }

        public final String toString() {
            return "Lobby";
        }
    }

    public static final class c implements c0e0 {
        public final rx00 a;

        public c(rx00 rx00Var) {
            this.a = rx00Var;
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
            return "Matchmaking(theme=" + this.a + ')';
        }
    }

    public static final class d implements c0e0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 218341969;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
