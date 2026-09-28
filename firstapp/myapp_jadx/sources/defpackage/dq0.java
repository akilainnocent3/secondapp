package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface dq0 {

    public static final class a implements dq0 {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("InBound(offset=", this.a, this.b, ", size=", ")");
        }
    }

    public static final class b implements dq0 {
        public static final b a = new b();
    }
}
