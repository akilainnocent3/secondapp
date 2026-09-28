package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface hyf0 {

    public static final class a implements hyf0 {
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
            return pe4.b(this.a, "DepositAccountsHint(maxAccounts=", ")");
        }
    }

    public static final class b implements hyf0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1623221286;
        }

        public final String toString() {
            return "MaxAccountsReached";
        }
    }
}
