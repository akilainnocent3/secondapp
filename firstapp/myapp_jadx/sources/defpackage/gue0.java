package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface gue0 {

    public static final class a implements gue0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2023223595;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements d {
        public final uf00<lwe0> a;

        public b(uf00<lwe0> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        @Override // gue0.d
        public final uf00<lwe0> a() {
            return this.a;
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
            return "Error(list=" + this.a + ')';
        }
    }

    public static final class c implements gue0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 658165146;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public interface d extends gue0 {
        uf00<lwe0> a();
    }

    public static final class e implements d {
        public final uf00<lwe0> a;
        public final fxe0 b;

        public e(uf00<lwe0> uf00Var, fxe0 fxe0Var) {
            uf00Var.getClass();
            fxe0Var.getClass();
            this.a = uf00Var;
            this.b = fxe0Var;
        }

        @Override // gue0.d
        public final uf00<lwe0> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(list=" + this.a + ", loadMoreState=" + this.b + ')';
        }
    }
}
