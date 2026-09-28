package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface qrv {

    public static final class a implements qrv {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1326064525;
        }

        public final String toString() {
            return "Available";
        }
    }

    public static final class b implements qrv {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "CoolingDown(availableAt=", ")");
        }
    }

    public static final class c implements qrv {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1017425900;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
