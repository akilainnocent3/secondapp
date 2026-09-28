package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface evq {

    public static final class a implements evq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2038968179;
        }

        public final String toString() {
            return "AddNumber";
        }
    }

    public static final class b implements evq {
        public final qcn<Integer> a;
        public final boolean b;

        public b(qcn<Integer> qcnVar, boolean z) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Apply(numbers=" + this.a + ", skipChecking=" + this.b + ")";
        }
    }

    public static final class c implements evq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 981595316;
        }

        public final String toString() {
            return "ClickHowToPlay";
        }
    }

    public static final class d implements evq {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Delete(myNumberId=" + this.a + ", skipChecking=" + this.b + ")";
        }
    }

    public static final class e implements evq {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -187039691;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class f implements evq {
        public final int a;
        public final String b;
        public final qcn<Integer> c;

        public f(int i, qcn qcnVar, String str) {
            str.getClass();
            qcnVar.getClass();
            this.a = i;
            this.b = str;
            this.c = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return ts3.a(uqe0.a(this.a, "EditNumber(id=", ", name=", this.b, ", mainNumbers="), this.c, ")");
        }
    }

    public static final class g implements evq {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1782138477;
        }

        public final String toString() {
            return "PopBackStack";
        }
    }

    public static final class h implements evq {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -967122785;
        }

        public final String toString() {
            return "RefetchMyNumber";
        }
    }

    public static final class i implements evq {
        public final lk50<qxp> a;

        public i(lk50<qxp> lk50Var) {
            lk50Var.getClass();
            this.a = lk50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateBetConfig(betConfig=" + this.a + ")";
        }
    }

    public static final class j implements evq {
        public final dvq a;

        public j(dvq dvqVar) {
            this.a = dvqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateMyNumber(myNumber=" + this.a + ")";
        }
    }
}
