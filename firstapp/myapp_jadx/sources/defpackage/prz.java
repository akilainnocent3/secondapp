package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface prz {

    public static final class a implements prz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1912648305;
        }

        public final String toString() {
            return "Browser";
        }
    }

    public static final class b implements prz {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g7f.b(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }

        public final String toString() {
            return tug.a("Fixed(value=", g7f.c(0.0f), ")");
        }
    }

    public static final class c implements prz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 612818784;
        }

        public final String toString() {
            return "Legacy";
        }
    }
}
