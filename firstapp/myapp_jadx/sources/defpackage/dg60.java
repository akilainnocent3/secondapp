package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface dg60 {

    public static final class a implements dg60 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("Spinning(stopping="), this.a, ')');
        }
    }

    public static final class b implements dg60 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1145388943;
        }

        public final String toString() {
            return "Stop";
        }
    }
}
