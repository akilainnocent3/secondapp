package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface aun {

    public static final class a implements aun {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -116468842;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements aun {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1306755912;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements aun {
        public final ztn a;

        public c(ztn ztnVar) {
            this.a = ztnVar;
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
