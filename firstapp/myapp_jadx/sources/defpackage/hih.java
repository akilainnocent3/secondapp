package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface hih {

    public static final class a implements hih {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1066354030;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class b implements hih {
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
            return d020.a(this.a, "Success(lastFetchTime=", ")");
        }
    }
}
