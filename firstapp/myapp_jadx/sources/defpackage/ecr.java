package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface ecr {

    public static final class a implements ecr {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2085578737;
        }

        public final String toString() {
            return "FetchData";
        }
    }

    public static final class b implements ecr {
        public final dvq.b a;

        public b(dvq.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateMyNumber(myNumber=" + this.a + ")";
        }
    }
}
