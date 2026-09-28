package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface dvq {

    public static final class a implements dvq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 147327930;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class c implements dvq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -3897613;
        }

        public final String toString() {
            return "Unavailable";
        }
    }

    public static final class b implements dvq {
        public final qcn<Integer> a;
        public final qcn<qvq> b;

        public b(qcn<Integer> qcnVar, qcn<qvq> qcnVar2) {
            qcnVar.getClass();
            qcnVar2.getClass();
            this.a = qcnVar;
            this.b = qcnVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HasData(availableBalls=" + this.a + ", myNumbers=" + this.b + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            n1a0 n1a0Var = n1a0.c;
            this(n1a0Var, n1a0Var);
        }
    }
}
