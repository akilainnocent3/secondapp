package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface cs3 {

    public static final class a implements cs3 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -636713951;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class b implements cs3 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1135022632;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements cs3 {
        public final ds3 a;

        public c(ds3 ds3Var) {
            this.a = ds3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Ready(data=" + this.a + ")";
        }
    }
}
