package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface qm90 {

    public interface a extends qm90 {

        /* JADX INFO: renamed from: qm90$a$a, reason: collision with other inner class name */
        public static final class C1017a implements a {
            public static final C1017a a = new C1017a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1017a);
            }

            public final int hashCode() {
                return 2041221284;
            }

            public final String toString() {
                return "Initial";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1626570229;
            }

            public final String toString() {
                return "More";
            }
        }
    }

    public static final class b implements qm90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 210368478;
        }

        public final String toString() {
            return "ScrollTicketListToTop";
        }
    }
}
