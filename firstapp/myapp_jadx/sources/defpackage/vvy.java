package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface vvy {

    public static final class a implements vvy {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 446438127;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements vvy {
        public final uvy a;

        public b(uvy uvyVar) {
            this.a = uvyVar;
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
            return "Ready(config=" + this.a + ")";
        }
    }
}
