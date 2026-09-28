package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vpx implements id90 {

    public static final class a extends vpx {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 632202002;
        }

        public final String toString() {
            return "OnEditSuccess";
        }
    }

    public static final class b extends vpx {
        public final gdc a;
        public final jz0 b;

        public b(gdc gdcVar, jz0 jz0Var) {
            this.a = gdcVar;
            this.b = jz0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnSuccessNewCode(customCode=" + this.a + ", assignedCustomCodeResult=" + this.b + ")";
        }
    }
}
