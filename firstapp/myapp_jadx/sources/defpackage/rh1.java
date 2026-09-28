package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rh1 extends ktb.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public static final class a extends ktb.e.d.c.a {
        public Double a;
        public int b;
        public boolean c;
        public int d;
        public long e;
        public long f;
        public byte g;

        public final rh1 a() {
            if (this.g == 31) {
                return new rh1(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public rh1(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // ktb.e.d.c
    public final Double a() {
        return this.a;
    }

    @Override // ktb.e.d.c
    public final int b() {
        return this.b;
    }

    @Override // ktb.e.d.c
    public final long c() {
        return this.f;
    }

    @Override // ktb.e.d.c
    public final int d() {
        return this.d;
    }

    @Override // ktb.e.d.c
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.c)) {
            return false;
        }
        ktb.e.d.c cVar = (ktb.e.d.c) obj;
        Double d = this.a;
        if (d == null) {
            if (cVar.a() != null) {
                return false;
            }
        } else if (!d.equals(cVar.a())) {
            return false;
        }
        return this.b == cVar.b() && this.c == cVar.f() && this.d == cVar.d() && this.e == cVar.e() && this.f == cVar.c();
    }

    @Override // ktb.e.d.c
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return nrz.a(this.f, "}", sb);
    }
}
