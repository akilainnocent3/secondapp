package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface k4f {

    public static final class a implements k4f {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Error(failureCount=", ")");
        }
    }

    public static final class b implements k4f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -392592980;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements k4f {
        public final j4f a;

        public c(j4f j4fVar) {
            this.a = j4fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(roundInfo=" + this.a + ")";
        }
    }
}
