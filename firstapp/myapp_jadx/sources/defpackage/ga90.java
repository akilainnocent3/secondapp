package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface ga90 {

    public static final class a implements ga90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 749442448;
        }

        public final String toString() {
            return "BetslipTheme";
        }
    }

    public static final class b implements ga90 {
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
            return d020.a(this.a, "FreebetGift(amount=", ")");
        }
    }

    public static final class c implements ga90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1465201269;
        }

        public final String toString() {
            return "RakebackBoostGift";
        }
    }

    public static final class d implements ga90 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -872667012;
        }

        public final String toString() {
            return "SportyTVWorldCupPass";
        }
    }
}
