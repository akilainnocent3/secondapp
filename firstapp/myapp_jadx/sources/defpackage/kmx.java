package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface kmx {

    public static final class a implements kmx {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -672617015;
        }

        public final String toString() {
            return "Availability";
        }
    }

    public static final class b implements kmx {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -239266533;
        }

        public final String toString() {
            return "Cms";
        }
    }

    public static final class c implements kmx {
        public final double a;
        public final long b;
        public final ap20 c;
        public final boolean d;

        public c(double d, long j, ap20 ap20Var, boolean z) {
            this.a = d;
            this.b = j;
            this.c = ap20Var;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.a, cVar.a) == 0 && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + f87.a(Double.hashCode(this.a) * 31, this.b, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JoinRoom(feeAmount=");
            sb.append(this.a);
            sb.append(", roomConfigId=");
            sb.append(this.b);
            sb.append(", pigType=");
            sb.append(this.c);
            sb.append(", isRejoining=");
            return ruw.a(sb, this.d, ')');
        }
    }

    public static final class d implements kmx {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2007007818;
        }

        public final String toString() {
            return "Rooms";
        }
    }

    public static final class e implements kmx {
        public final ap20 a;

        public e(ap20 ap20Var) {
            ap20Var.getClass();
            this.a = ap20Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RoomsOnResultScreen(pigType=" + this.a + ')';
        }
    }

    public static final class f implements kmx {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2120536800;
        }

        public final String toString() {
            return "Status";
        }
    }

    public static final class g implements kmx {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -718595964;
        }

        public final String toString() {
            return "Validate";
        }
    }

    public static final class h implements kmx {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -865049547;
        }

        public final String toString() {
            return "WalletInfo";
        }
    }

    public static final class i implements kmx {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -837552583;
        }

        public final String toString() {
            return "WebSocket";
        }
    }
}
