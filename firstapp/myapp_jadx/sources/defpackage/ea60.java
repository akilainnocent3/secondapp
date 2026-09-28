package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface ea60 {

    public static final class a implements ea60 {
        public final d860 a;

        public a(d860 d860Var) {
            this.a = d860Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfirmBetAmount(amount=" + this.a + ')';
        }
    }
}
