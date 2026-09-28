package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface ib50 {

    public static final class a implements ib50 {
        public static final a a = new a();
    }

    public static final class b implements ib50 {
        public final krf0 a;

        public b(krf0 krf0Var) {
            krf0Var.getClass();
            this.a = krf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Request(tierData=" + this.a + ")";
        }
    }
}
