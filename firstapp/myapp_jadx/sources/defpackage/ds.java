package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ds {

    public static final class a extends ds {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1828083879;
        }

        public final String toString() {
            return "Blocked";
        }
    }

    public static final class b extends ds {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -363105578;
        }

        public final String toString() {
            return "NoAlert";
        }
    }

    public static final class c extends ds {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1821152824;
        }

        public final String toString() {
            return "Proceeded";
        }
    }
}
