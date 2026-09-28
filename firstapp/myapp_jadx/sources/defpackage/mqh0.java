package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface mqh0 {

    public static final class a implements mqh0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1733093532;
        }

        public final String toString() {
            return "OpenEditModal";
        }
    }

    public static final class b implements mqh0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 429801214;
        }

        public final String toString() {
            return "ShowBlockingModal";
        }
    }

    public static final class c implements mqh0 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "ShowEmptyCodeDeletionWarning(emptyCodeCount=", ")");
        }
    }
}
