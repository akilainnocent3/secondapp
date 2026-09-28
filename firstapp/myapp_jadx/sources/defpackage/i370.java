package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface i370 {

    public static final class a implements i370 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1929829535;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements i370 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -506604781;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements i370 {
        public final h370 a;

        public c(h370 h370Var) {
            this.a = h370Var;
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
            return "Success(state=" + this.a + ")";
        }
    }
}
