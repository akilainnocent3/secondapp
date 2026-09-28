package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface tl30 {

    public static final class a implements tl30 {
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
            return rr1.b(new StringBuilder("ExpendItem(id="), this.a, ')');
        }
    }

    public static final class b implements tl30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1637627103;
        }

        public final String toString() {
            return "LoadMore";
        }
    }
}
