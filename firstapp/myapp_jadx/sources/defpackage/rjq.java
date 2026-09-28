package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface rjq {

    public static final class a implements rjq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 760815834;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class b implements c {
        public final qcn<qjq> a;

        public b(uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        @Override // rjq.c
        public final qcn<qjq> a() {
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
            return vf5.a(this.a, "Settled(filterItems=", ")");
        }
    }

    public interface c extends rjq {
        qcn<qjq> a();
    }

    public static final class d implements c {
        public final qcn<qjq> a;

        public d(uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        @Override // rjq.c
        public final qcn<qjq> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vf5.a(this.a, "Win(filterItems=", ")");
        }
    }
}
