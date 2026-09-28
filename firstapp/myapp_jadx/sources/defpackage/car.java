package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface car {

    public static final class a implements car {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 329270034;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements car {
        public static final b a = new b();
    }

    public static final class c implements car {
        public final qcn<c7r> a;
        public final boolean b;

        public c(uf00 uf00Var, boolean z) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = z;
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
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(results=" + this.a + ", hasMore=" + this.b + ")";
        }
    }
}
