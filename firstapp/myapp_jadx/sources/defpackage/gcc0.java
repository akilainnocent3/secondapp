package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface gcc0 {

    public static final class a implements gcc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -806826906;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements gcc0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 616397848;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements gcc0 {
        public final fcc0 a;

        public c(fcc0 fcc0Var) {
            this.a = fcc0Var;
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
