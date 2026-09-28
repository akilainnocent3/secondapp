package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a950 implements id90 {

    public static final class a extends a950 {
        public final jz0 a;

        public a(jz0 jz0Var) {
            this.a = jz0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnSuccessReplacedCode(assignedCustomCodeResult=" + this.a + ")";
        }
    }
}
