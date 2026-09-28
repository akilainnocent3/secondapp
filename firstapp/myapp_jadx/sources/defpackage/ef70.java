package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ef70 {

    public static final class a implements ef70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -55771505;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements ef70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1367453249;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements ef70 {
        public final df70 a;

        public c(f870 f870Var) {
            this.a = f870Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            df70 df70Var = this.a;
            if (df70Var == null) {
                return 0;
            }
            return df70Var.hashCode();
        }

        public final String toString() {
            return "Success(state=" + this.a + ")";
        }
    }
}
