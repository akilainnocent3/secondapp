package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface kze0 {

    public static final class a implements kze0 {
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
            return org0.a(new StringBuilder("Gift(giftAmount="), this.a, ')');
        }
    }

    public static final class b implements kze0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1247540036;
        }

        public final String toString() {
            return "None";
        }
    }
}
