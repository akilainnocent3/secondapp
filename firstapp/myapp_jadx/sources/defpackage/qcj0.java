package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface qcj0 {

    public static final class a implements qcj0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -950052796;
        }

        public final String toString() {
            return "BackToGame";
        }
    }

    public static final class b implements qcj0 {
        public final wbj0 a;
        public final wbj0 b;

        public b(wbj0 wbj0Var, wbj0 wbj0Var2) {
            this.a = wbj0Var;
            this.b = wbj0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CashoutAndTakeTheShot(cashoutButtonState=" + this.a + ", takeTheShotButtonState=" + this.b + ")";
        }
    }
}
