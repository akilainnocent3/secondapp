package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface hqi0 {

    public static final class a implements hqi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 955811356;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements hqi0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 955962071;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c implements hqi0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1372187211;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements hqi0 {
        public final uf00<ori0> a;
        public final wri0 b;

        public d(uf00<ori0> uf00Var, wri0 wri0Var) {
            uf00Var.getClass();
            wri0Var.getClass();
            this.a = uf00Var;
            this.b = wri0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(list=" + this.a + ", loadMoreState=" + this.b + ')';
        }
    }
}
