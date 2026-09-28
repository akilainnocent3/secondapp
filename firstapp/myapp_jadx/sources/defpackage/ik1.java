package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ik1 extends uu50 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public static final class a extends uu50.a {
        public String a;
        public String b;
        public String c;
        public String d;
        public long e;
        public byte f;

        public final ik1 a() {
            if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new ik1(this.a, this.b, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            if (this.c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((this.f & 1) == 0) {
                sb.append(" templateVersion");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public ik1(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.uu50
    public final String a() {
        return this.d;
    }

    @Override // defpackage.uu50
    public final String b() {
        return this.e;
    }

    @Override // defpackage.uu50
    public final String c() {
        return this.b;
    }

    @Override // defpackage.uu50
    public final long d() {
        return this.f;
    }

    @Override // defpackage.uu50
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uu50)) {
            return false;
        }
        uu50 uu50Var = (uu50) obj;
        return this.b.equals(uu50Var.c()) && this.c.equals(uu50Var.e()) && this.d.equals(uu50Var.a()) && this.e.equals(uu50Var.b()) && this.f == uu50Var.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return nrz.a(this.f, "}", sb);
    }
}
