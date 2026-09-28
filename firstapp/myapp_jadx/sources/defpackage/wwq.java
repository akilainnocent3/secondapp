package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface wwq {

    public static final class a implements wwq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1394194000;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements wwq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1606275972;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements wwq {
        public final boolean a;
        public final int b;
        public final ovq c;
        public final qcn<rvq> d;

        public c(boolean z, int i, ovq ovqVar, qcn<rvq> qcnVar) {
            qcnVar.getClass();
            this.a = z;
            this.b = i;
            this.c = ovqVar;
            this.d = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d);
        }

        public final int hashCode() {
            int iA = gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            ovq ovqVar = this.c;
            return this.d.hashCode() + ((iA + (ovqVar == null ? 0 : ovqVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbA = zug0.a("Success(canAddNewNumber=", ", maxNumber=", ", dialog=", this.b, this.a);
            sbA.append(this.c);
            sbA.append(", numberList=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
