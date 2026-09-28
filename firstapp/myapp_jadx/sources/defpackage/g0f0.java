package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface g0f0 {

    public static final class a implements g0f0 {
        public static final a a = new a();
        public static final String b = "none";

        @Override // defpackage.g0f0
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 848686342;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class b implements g0f0 {
        public final int a;
        public final int b;
        public final String c;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = "symbol_" + (i + 1) + '_' + (i2 + 1);
        }

        @Override // defpackage.g0f0
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Symbol(caveIndex=");
            sb.append(this.a);
            sb.append(", symbolIndex=");
            return rr1.b(sb, this.b, ')');
        }
    }

    String a();
}
