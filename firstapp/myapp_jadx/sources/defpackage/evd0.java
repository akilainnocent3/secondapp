package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class evd0 {

    public static final class a extends evd0 {
        public final double a;

        public a(double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        public final String toString() {
            return "BelowMin(minStakeLimit=" + this.a + ")";
        }
    }

    public static final class b extends evd0 {
        public final double a;

        public b(double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Double.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        public final String toString() {
            return "ExceedMax(maxStakeLimit=" + this.a + ")";
        }
    }

    public static final class c extends evd0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1364202251;
        }

        public final String toString() {
            return "InsufficientBalance";
        }
    }

    public static final class d extends evd0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1296699544;
        }

        public final String toString() {
            return "Valid";
        }
    }
}
