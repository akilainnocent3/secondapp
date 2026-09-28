package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ph1 extends ktb.e.d.a.b.AbstractC0788d.AbstractC0789a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public static final class a extends ktb.e.d.a.b.AbstractC0788d.AbstractC0789a.AbstractC0790a {
        public long a;
        public String b;
        public String c;
        public long d;
        public int e;
        public byte f;

        public final ph1 a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new ph1(this.e, this.a, this.d, str, this.c);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public ph1(int i, long j, long j2, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d.AbstractC0789a
    public final String a() {
        return this.c;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d.AbstractC0789a
    public final int b() {
        return this.e;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d.AbstractC0789a
    public final long c() {
        return this.d;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d.AbstractC0789a
    public final long d() {
        return this.a;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d.AbstractC0789a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b.AbstractC0788d.AbstractC0789a)) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0788d.AbstractC0789a abstractC0789a = (ktb.e.d.a.b.AbstractC0788d.AbstractC0789a) obj;
        if (this.a != abstractC0789a.d() || !this.b.equals(abstractC0789a.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC0789a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0789a.a())) {
            return false;
        }
        return this.d == abstractC0789a.c() && this.e == abstractC0789a.b();
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return zk1.a(this.e, "}", sb);
    }
}
