package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface lyo {

    public static final class a implements lyo {
        public static final a a = new a();
    }

    public static final class b implements lyo {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("NumberBall(number="), this.a, ')');
        }
    }
}
