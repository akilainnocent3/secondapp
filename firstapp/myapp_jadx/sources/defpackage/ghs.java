package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ghs implements id90 {

    public static final class a extends ghs {
        public final gdc a;
        public final jz0 b;

        public a(gdc gdcVar, jz0 jz0Var) {
            this.a = gdcVar;
            this.b = jz0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToAssignedCustomCode(customCode=" + this.a + ", assignedCustomCodeResult=" + this.b + ")";
        }
    }

    public static final class b extends ghs {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -94056541;
        }

        public final String toString() {
            return "NavigateToNewCustomCode";
        }
    }

    public static final class c extends ghs {
        public final gdc a;

        public c(gdc gdcVar) {
            this.a = gdcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToReplaceCustomCode(customCode=" + this.a + ")";
        }
    }

    public static final class d extends ghs {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1838202582;
        }

        public final String toString() {
            return "ShowDialogReachedMaxCustomCodeLength";
        }
    }
}
