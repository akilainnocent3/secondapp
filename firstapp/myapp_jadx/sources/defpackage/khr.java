package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface khr {

    public static final class a implements khr {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 88191379;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements khr {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -551287884;
        }

        public final String toString() {
            return "Gone";
        }
    }

    public static final class c implements g {
        public final String a;
        public final qcn<ggr> b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final igr f;

        public c(String str, uf00 uf00Var, String str2, boolean z, boolean z2, igr igrVar) {
            str.getClass();
            uf00Var.getClass();
            igrVar.getClass();
            this.a = str;
            this.b = uf00Var;
            this.c = str2;
            this.d = z;
            this.e = z2;
            this.f = igrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c.equals(cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + mtg0.a(mtg0.a(gmf0.a(shu.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HasTicket(ticketId=");
            sb.append(this.a);
            sb.append(", balls=");
            sb.append(this.b);
            sb.append(", page=");
            uts.b(this.c, ", prevEnable=", ", nextEnable=", sb, this.d);
            sb.append(this.e);
            sb.append(", slideDirection=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class d implements khr {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -551264169;
        }

        public final String toString() {
            return "Hide";
        }
    }

    public static final class e implements g {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 668207623;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class f implements g {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1937489726;
        }

        public final String toString() {
            return "NoTicket";
        }
    }

    public interface g extends khr {
    }
}
