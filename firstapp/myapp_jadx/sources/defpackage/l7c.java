package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface l7c {

    public static final class a implements l7c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1686709872;
        }

        public final String toString() {
            return "Conceal";
        }
    }

    public static final class b implements l7c {
        public final int a;
        public final String b;
        public final boolean c;

        public b(int i, String str, boolean z) {
            this.a = i;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(uqe0.a(this.a, "Display(id=", ", aliasCode=", this.b, ", acting="), this.c, ")");
        }
    }
}
