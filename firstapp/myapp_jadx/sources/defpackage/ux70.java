package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ux70 {

    public static final class a implements ux70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1860392354;
        }

        public final String toString() {
            return "Hide";
        }
    }

    public static final class b implements ux70 {
        public final qcn<tx70> a;

        public b(uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vf5.a(this.a, "Show(searchResultTags=", ")");
        }
    }
}
