package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface qxq {

    public static final class a implements qxq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1013758173;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements qxq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1013908888;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c implements qxq {
        public final tlq a;
        public final qcn<mxq> b;

        public c(tlq tlqVar, uf00 uf00Var) {
            uf00Var.getClass();
            this.a = tlqVar;
            this.b = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HasData(endState=" + this.a + ", orders=" + this.b + ")";
        }
    }

    public static final class d implements qxq {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1224503500;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
