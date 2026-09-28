package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface zh2 {

    public static final class a implements zh2 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1481057354;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements zh2 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 713639188;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements zh2 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1390685188;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements zh2 {
        public final pg2 a;

        public d(pg2 pg2Var) {
            this.a = pg2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(content=" + this.a + ")";
        }
    }
}
