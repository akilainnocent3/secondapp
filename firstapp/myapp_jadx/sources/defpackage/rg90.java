package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface rg90 {

    public static final class a implements rg90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 576308393;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements rg90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1597222813;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements rg90 {
        public final v690 a;
        public final uf00<ne90> b;
        public final ae90 c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(v690 v690Var, uf00<? extends ne90> uf00Var, ae90 ae90Var) {
            uf00Var.getClass();
            ae90Var.getClass();
            this.a = v690Var;
            this.b = uf00Var;
            this.c = ae90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + yvz.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Success(selectedTab=" + this.a + ", itemList=" + this.b + ", editState=" + this.c + ")";
        }
    }
}
