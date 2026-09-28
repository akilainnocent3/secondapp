package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface uoe0 extends gre0 {

    public static final class a implements uoe0 {
        public final int a;
        public final String b;

        public a(int i) {
            this.a = i;
            this.b = i == 0 ? "Sy_Idle_A" : "Sy_Idle_BC";
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
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
            return rr1.b(new StringBuilder("Idle(symbolIndex="), this.a, ')');
        }
    }

    public static final class b implements uoe0 {
        public static final b a = new b();
        public static final String b = "Sy_none";

        @Override // defpackage.gre0
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1644146731;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class c implements uoe0 {
        public static final c a = new c();
        public static final String b = "Sy_out";

        @Override // defpackage.gre0
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2131248123;
        }

        public final String toString() {
            return "Out";
        }
    }

    public static final class d implements uoe0 {
        public final int a;
        public final String b;

        public d(int i) {
            this.a = i;
            this.b = i != 0 ? i != 4 ? "Sy_Winning_B" : "Sy_Winning_C" : "Sy_Winning_A";
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
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
            return rr1.b(new StringBuilder("Wining(symbolIndex="), this.a, ')');
        }
    }

    @Override // defpackage.gre0
    default int d() {
        sre0[] sre0VarArr = sre0.a;
        return 2;
    }
}
