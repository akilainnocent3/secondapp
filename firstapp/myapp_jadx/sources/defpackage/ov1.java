package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface ov1 {

    public static final class a implements ov1 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 624201925;
        }

        public final String toString() {
            return "NoNumberBall";
        }
    }

    public static final class b implements ov1 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1715909478;
        }

        public final String toString() {
            return "NoShow";
        }
    }

    public static final class c implements ov1 {
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
            return rr1.b(new StringBuilder("Show(number="), this.a, ')');
        }
    }
}
