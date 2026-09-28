package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface gtt {

    public static final class a implements gtt {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -883383630;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements gtt {
        public final uf00<wvt> a;
        public final s1g0 b;
        public final boolean c;
        public final boolean d;
        public final tyt e;
        public final boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(uf00<? extends wvt> uf00Var, s1g0 s1g0Var, boolean z, boolean z2, tyt tytVar, boolean z3) {
            uf00Var.getClass();
            s1g0Var.getClass();
            tytVar.getClass();
            this.a = uf00Var;
            this.b = s1g0Var;
            this.c = z;
            this.d = z2;
            this.e = tytVar;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && Intrinsics.g(this.e, bVar.e) && this.f == bVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + mtg0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loyalty(list=");
            sb.append(this.a);
            sb.append(", topInfo=");
            sb.append(this.b);
            sb.append(", shouldSkipBallFlicking=");
            nng.a(", shouldScrollToBenefit=", ", selectedTab=", sb, this.c, this.d);
            sb.append(this.e);
            sb.append(", isLoggedIn=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }
}
