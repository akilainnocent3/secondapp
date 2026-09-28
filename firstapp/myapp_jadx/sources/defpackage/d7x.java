package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface d7x {

    public static final class a implements d7x {
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

    public static final class b implements d7x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1213626158;
        }

        public final String toString() {
            return "LoadMore";
        }
    }
}
