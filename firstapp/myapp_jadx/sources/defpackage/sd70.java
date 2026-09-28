package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface sd70 {

    public static final class a implements sd70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 282787943;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements sd70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1706012697;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements sd70 {
        public final rd70 a;

        public c(rd70 rd70Var) {
            this.a = rd70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            rd70 rd70Var = this.a;
            if (rd70Var == null) {
                return 0;
            }
            return rd70Var.hashCode();
        }

        public final String toString() {
            return "Success(state=" + this.a + ")";
        }
    }
}
