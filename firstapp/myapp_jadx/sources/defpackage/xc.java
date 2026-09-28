package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface xc {

    public static final class a implements xc {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1072402076;
        }

        public final String toString() {
            return "Active";
        }
    }

    public static final class b implements xc {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1815400014;
        }

        public final String toString() {
            return "Idle";
        }
    }
}
