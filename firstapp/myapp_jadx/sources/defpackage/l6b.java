package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface l6b {

    public static final class a implements l6b {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Counting(seconds=", ")");
        }
    }

    public static final class b implements l6b {
        public static final b a = new b();
    }
}
