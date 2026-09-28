package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface k0r {

    public static final class a implements k0r {
        public static final a a = new a();

        @Override // defpackage.k0r
        public final boolean a() {
            return false;
        }

        @Override // defpackage.k0r
        public final boolean b() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2068782029;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public static final class b implements k0r {
        public static final b a = new b();

        @Override // defpackage.k0r
        public final boolean a() {
            return false;
        }

        @Override // defpackage.k0r
        public final boolean b() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1715507206;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements k0r {
        public final hsq a;
        public final qcn<usq> b;
        public final qcn<zsq> c;
        public final boolean d;
        public final boolean e;

        public c(hsq hsqVar, uf00 uf00Var, uf00 uf00Var2, boolean z, boolean z2) {
            hsqVar.getClass();
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = hsqVar;
            this.b = uf00Var;
            this.c = uf00Var2;
            this.d = z;
            this.e = z2;
        }

        @Override // defpackage.k0r
        public final boolean a() {
            return this.d;
        }

        @Override // defpackage.k0r
        public final boolean b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(shu.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(lottery=");
            sb.append(this.a);
            sb.append(", groups=");
            sb.append(this.b);
            sb.append(", marketList=");
            sb.append(this.c);
            sb.append(", enableMyNumber=");
            sb.append(this.d);
            sb.append(", favorite=");
            return mq0.a(sb, this.e, ")");
        }
    }

    boolean a();

    boolean b();
}
