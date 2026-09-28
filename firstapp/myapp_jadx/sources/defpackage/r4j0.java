package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface r4j0 {

    public static final class a implements r4j0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 640386865;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class b implements r4j0 {
        public final m4j0 a;

        public b(m4j0 m4j0Var) {
            this.a = m4j0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(state=" + this.a + ")";
        }
    }
}
