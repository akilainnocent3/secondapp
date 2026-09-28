package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface na60 {

    public static final class a implements na60 {
        public final qcn<qcn<Integer>> a;

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
            return "HaveData(list=" + this.a + ')';
        }
    }

    public static final class b implements na60 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 270330412;
        }

        public final String toString() {
            return "NoData";
        }
    }
}
