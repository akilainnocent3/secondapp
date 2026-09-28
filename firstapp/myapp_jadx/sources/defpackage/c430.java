package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface c430 {

    public static final class a implements c430 {
        public static final a a = new a();

        static {
            p780 p780Var = p780.d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -152643905;
        }

        public final String toString() {
            return "NoSelected";
        }
    }

    public static final class b implements c430 {
        public final int a;
        public final p780 b;

        public b(int i, p780 p780Var) {
            this.a = i;
            this.b = p780Var;
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
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Selected(position=" + this.a + ", selectedStatus=" + this.b + ")";
        }
    }
}
