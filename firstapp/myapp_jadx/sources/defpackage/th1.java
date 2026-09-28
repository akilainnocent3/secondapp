package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class th1 extends ktb.e.d.AbstractC0793e {
    public final ktb.e.d.AbstractC0793e.b a;
    public final String b;
    public final String c;
    public final long d;

    public static final class a extends ktb.e.d.AbstractC0793e.a {
        public uh1 a;
        public String b;
        public String c;
        public long d;
        public byte e;

        public final th1 a() {
            uh1 uh1Var;
            String str;
            String str2;
            if (this.e == 1 && (uh1Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new th1(uh1Var, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((this.e & 1) == 0) {
                sb.append(" templateVersion");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public th1(uh1 uh1Var, String str, String str2, long j) {
        this.a = uh1Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // ktb.e.d.AbstractC0793e
    public final String a() {
        return this.b;
    }

    @Override // ktb.e.d.AbstractC0793e
    public final String b() {
        return this.c;
    }

    @Override // ktb.e.d.AbstractC0793e
    public final ktb.e.d.AbstractC0793e.b c() {
        return this.a;
    }

    @Override // ktb.e.d.AbstractC0793e
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.AbstractC0793e)) {
            return false;
        }
        ktb.e.d.AbstractC0793e abstractC0793e = (ktb.e.d.AbstractC0793e) obj;
        return this.a.equals(abstractC0793e.c()) && this.b.equals(abstractC0793e.a()) && this.c.equals(abstractC0793e.b()) && this.d == abstractC0793e.d();
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return nrz.a(this.d, "}", sb);
    }
}
