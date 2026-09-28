package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface u860 {

    public static final class a implements u860 {
        public final uc60 a;

        public a(uc60 uc60Var) {
            this.a = uc60Var;
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
            return "Failed(message=" + this.a + ')';
        }
    }

    public static final class b implements u860 {
        public final qcn<s860> a;
        public final boolean b;
        public final re60 c;

        public b(qcn<s860> qcnVar, boolean z, re60 re60Var) {
            qcnVar.getClass();
            re60Var.getClass();
            this.a = qcnVar;
            this.b = z;
            this.c = re60Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Loaded(items=" + this.a + ", isEnded=" + this.b + ", loadMoreState=" + this.c + ')';
        }
    }

    public static final class c implements u860 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2068896018;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
