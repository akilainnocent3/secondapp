package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lox {

    public static final class a extends lox {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -348594898;
        }

        public final String toString() {
            return "Available";
        }
    }

    public static final class b extends lox {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 247604597;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
