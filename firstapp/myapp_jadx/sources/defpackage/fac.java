package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface fac {

    public static final class a implements fac {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 716433296;
        }

        public final String toString() {
            return "Conceal";
        }
    }

    public static final class b implements fac {
        public final gdc a;
        public final boolean b;

        public b(gdc gdcVar, boolean z) {
            this.a = gdcVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Display(code=" + this.a + ", acting=" + this.b + ")";
        }
    }
}
