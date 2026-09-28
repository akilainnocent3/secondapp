package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface yog {

    public static final class a implements yog {
        public final qcn<pve0> a;

        public a(uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Condition(animations=" + this.a + ')';
        }
    }

    public static final class b implements yog {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1365938314;
        }

        public final String toString() {
            return "NoCondition";
        }
    }
}
