package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface tyo {

    public static final class a implements tyo {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1107461599;
        }

        public final String toString() {
            return "NoNumber";
        }
    }

    public static final class b implements tyo {
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
            return rr1.b(new StringBuilder("Number(value="), this.a, ')');
        }
    }
}
