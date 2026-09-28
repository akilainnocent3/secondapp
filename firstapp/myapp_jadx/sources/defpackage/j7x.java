package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface j7x {

    public static final class a implements j7x {
        public final y8x a;

        public a(y8x y8xVar) {
            this.a = y8xVar;
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

    public static final class b implements j7x {
        public final qcn<g7x> a;
        public final int b;
        public final boolean c;
        public final fax d;

        public b(qcn<g7x> qcnVar, int i, boolean z, fax faxVar) {
            qcnVar.getClass();
            faxVar.getClass();
            this.a = qcnVar;
            this.b = i;
            this.c = z;
            this.d = faxVar;
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

    public static final class c implements j7x {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1963597824;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
