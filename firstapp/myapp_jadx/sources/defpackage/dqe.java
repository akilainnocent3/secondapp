package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface dqe {

    public static final class a implements dqe {
        public final int a;

        public static void a(int i) {
            if (i > 0) {
                return;
            }
            hb5.a("px must be > 0.");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return "Pixels(px=" + this.a + ')';
        }
    }

    public static final class b implements dqe {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
