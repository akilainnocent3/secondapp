package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface une0 {

    public static final class a implements une0 {
        public final aoe0 a;

        public a(aoe0 aoe0Var) {
            this.a = aoe0Var;
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
            return "DeleteClicked(item=" + this.a + ")";
        }
    }

    public static final class b implements une0 {
        public final aoe0 a;

        public b(aoe0 aoe0Var) {
            this.a = aoe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ItemClicked(item=" + this.a + ")";
        }
    }
}
