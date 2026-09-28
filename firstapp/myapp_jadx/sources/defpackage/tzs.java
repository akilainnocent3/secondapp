package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface tzs {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements tzs {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -942401777;
        }

        public final String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b implements tzs {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -217744351;
        }

        public final String toString() {
            return "Loading";
        }
    }

    default boolean a() {
        return equals(b.a);
    }
}
