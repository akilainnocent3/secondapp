package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface zm90 {

    public static final class a implements zm90 {
        public final ym90 a;

        public a(ym90 ym90Var) {
            this.a = ym90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Failure(error=" + this.a + ")";
        }
    }

    public static final class b implements zm90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1512145224;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements zm90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1792762684;
        }

        public final String toString() {
            return "None";
        }
    }

    public interface d extends zm90 {

        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1541870155;
            }

            public final String toString() {
                return "Initial";
            }
        }

        public static final class b implements d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 421765764;
            }

            public final String toString() {
                return "More";
            }
        }
    }
}
