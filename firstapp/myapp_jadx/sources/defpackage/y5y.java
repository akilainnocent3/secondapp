package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface y5y {

    public static final class a implements y5y {
        public static final a a = new a();
        public static final String b = "";

        @Override // defpackage.y5y
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 266490915;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements y5y {
        public final int a;
        public final String b;

        public b(int i) {
            this.a = i;
            this.b = String.valueOf(i);
        }

        @Override // defpackage.y5y
        public final String a() {
            return this.b;
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
            return rr1.b(new StringBuilder("Number(number="), this.a, ')');
        }
    }

    String a();
}
