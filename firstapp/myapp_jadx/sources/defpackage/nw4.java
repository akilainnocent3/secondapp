package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nw4 {

    public static abstract class a extends nw4 {

        /* JADX INFO: renamed from: nw4$a$a, reason: collision with other inner class name */
        public static final class C0907a extends a {
            public final int a;

            public C0907a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0907a) && this.a == ((C0907a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("CampaignEnding(hoursLeft="), this.a, ')');
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 98421146;
            }

            public final String toString() {
                return "FullyUnengaged";
            }
        }

        public static final class c extends a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("PartiallyUnengaged(betsLeft="), this.a, ')');
            }
        }

        public static final class d extends a {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return rr1.b(new StringBuilder("RedeemReminder(hoursLeft="), this.a, ')');
            }
        }
    }

    public static abstract class b extends nw4 {

        public static final class a extends b {
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
                return org0.a(new StringBuilder("CampaignEnrollment(maxWinningsAmount="), this.a, ')');
            }
        }

        /* JADX INFO: renamed from: nw4$b$b, reason: collision with other inner class name */
        public static final class C0908b extends b {
            public static final C0908b a = new C0908b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0908b);
            }

            public final int hashCode() {
                return -361598546;
            }

            public final String toString() {
                return "OneBetLeft";
            }
        }
    }

    public static final class c extends nw4 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1416949744;
        }

        public final String toString() {
            return "None";
        }
    }

    public static abstract class d extends nw4 {

        public static final class a extends d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 181282252;
            }

            public final String toString() {
                return "RedeemReminder";
            }
        }

        public static final class b extends d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -759506855;
            }

            public final String toString() {
                return "TierComplete";
            }
        }
    }
}
