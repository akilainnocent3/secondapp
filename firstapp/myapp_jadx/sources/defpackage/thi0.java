package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface thi0 {

    public static final class a implements thi0 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failure(error=null, errorText=null)";
        }
    }

    public static final class b implements thi0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1730170036;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements thi0 {
        public final aii0 a;

        public c() {
            n1a0 n1a0Var = n1a0.c;
            this.a = new aii0(n1a0Var, n1a0Var, n1a0Var, "", false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(uiState=" + this.a + ")";
        }

        public c(aii0 aii0Var) {
            this.a = aii0Var;
        }
    }
}
