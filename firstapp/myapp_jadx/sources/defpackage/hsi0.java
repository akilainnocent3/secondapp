package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface hsi0 {

    public static final class a implements hsi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2068170802;
        }

        public final String toString() {
            return "NoHint";
        }
    }

    public static final class b implements hsi0 {
        public final int a;
        public final String b;
        public final String c;
        public final long d;

        public b(String str, String str2, int i, long j) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !this.b.equals(bVar.b) || !this.c.equals(bVar.c)) {
                return false;
            }
            long j = bVar.d;
            int i = j58.n;
            return nbh0.a(this.d, j);
        }

        public final int hashCode() {
            int iA = gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            return Long.hashCode(this.d) + iA;
        }

        public final String toString() {
            return "ShowHint(multiplierId=" + this.a + ", amount=" + this.b + ", chance=" + this.c + ", color=" + ((Object) j58.i(this.d)) + ')';
        }
    }

    default Integer a() {
        if (equals(a.a)) {
            return null;
        }
        if (this instanceof b) {
            return Integer.valueOf(((b) this).a);
        }
        uhc.a();
        return null;
    }
}
