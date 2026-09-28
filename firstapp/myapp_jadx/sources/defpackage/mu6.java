package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface mu6 extends gre0 {

    public static final class a implements mu6 {
        public final int a;
        public final String b;

        public a(int i) {
            this.a = i;
            this.b = "Bg_Cave_" + (i + 1);
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
            return rr1.b(new StringBuilder("BgCave(caveIndex="), this.a, ')');
        }
    }

    public static final class b implements mu6 {
        public final int a;
        public final String b;

        public b(int i) {
            this.a = i;
            this.b = "Bg_Cave_Switch_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("BgCaveSwitch(caveIndex="), this.a, ')');
        }
    }

    @Override // defpackage.gre0
    default int d() {
        sre0[] sre0VarArr = sre0.a;
        return 0;
    }
}
