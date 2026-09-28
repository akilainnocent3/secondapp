package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a7r {

    public static final class a implements a7r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2132120292;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements a7r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2083838744;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements a7r {
        public final qcn<c7r> a;
        public final tlq b;

        public c(tlq tlqVar, uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = tlqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(list=" + this.a + ", endState=" + this.b + ")";
        }
    }
}
