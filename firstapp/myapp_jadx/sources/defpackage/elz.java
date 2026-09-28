package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface elz {

    public static final class a implements elz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1477770204;
        }

        public final String toString() {
            return "HasMore";
        }
    }

    public static final class b implements elz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1837858735;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements elz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1110991103;
        }

        public final String toString() {
            return "NoMore";
        }
    }
}
