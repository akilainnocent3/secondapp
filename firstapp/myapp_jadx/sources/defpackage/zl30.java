package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface zl30 {

    public static final class a implements zl30 {
        public final qn30 a;

        public a(qn30 qn30Var) {
            this.a = qn30Var;
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

    public static final class b implements zl30 {
        public final qcn<wl30> a;
        public final int b;
        public final boolean c;
        public final zo30 d;

        public b(qcn<wl30> qcnVar, int i, boolean z, zo30 zo30Var) {
            qcnVar.getClass();
            zo30Var.getClass();
            this.a = qcnVar;
            this.b = i;
            this.c = z;
            this.d = zo30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            return "Loaded(items=" + this.a + ", offset=" + this.b + ", isEnded=" + this.c + ", loadMoreState=" + this.d + ')';
        }
    }

    public static final class c implements zl30 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1362837075;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
