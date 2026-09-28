package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h31 {
    public static final h31 d = new a().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public static final class a {
        public boolean a;
        public boolean b;
        public boolean c;

        public final h31 a() {
            if (this.a || !(this.b || this.c)) {
                return new h31(this);
            }
            ib5.a("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
    }

    public h31(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h31.class != obj.getClass()) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return this.a == h31Var.a && this.b == h31Var.b && this.c == h31Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
