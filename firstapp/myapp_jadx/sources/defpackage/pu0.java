package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface pu0 {

    public static final class b implements pu0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1389765028;
        }

        public final String toString() {
            return "Observe";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements pu0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1347002395;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public static final class a implements pu0 {
        public final long a;

        public /* synthetic */ a(int i) {
            this(0L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "Auto(aliveTimeMillis=", ")");
        }

        public a(long j) {
            this.a = j;
        }
    }
}
