package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface zuv {

    public static final class a implements zuv {
    }

    public static final class b implements zuv {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1445440456;
        }

        public final String toString() {
            return "Default";
        }
    }

    public static final class c implements zuv {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1865798253;
        }

        public final String toString() {
            return "Warning";
        }
    }
}
