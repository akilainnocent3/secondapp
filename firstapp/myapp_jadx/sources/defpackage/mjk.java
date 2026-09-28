package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface mjk {

    public static final class a implements mjk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2070831189;
        }

        public final String toString() {
            return "Boost";
        }
    }

    public static final class b implements mjk {
        public final awk a;

        public b(awk awkVar) {
            this.a = awkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Regular(giftType=" + this.a + ")";
        }
    }
}
