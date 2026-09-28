package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface gwc0 {

    public static final class a implements gwc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1126344122;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements gwc0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 296880632;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements gwc0 {
        public final fwc0 a;

        public c(fwc0 fwc0Var) {
            this.a = fwc0Var;
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
