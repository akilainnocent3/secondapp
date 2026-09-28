package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ih1 extends ktb.e.d {
    public final long a;
    public final String b;
    public final ktb.e.d.a c;
    public final ktb.e.d.c d;
    public final ktb.e.d.AbstractC0792d e;
    public final ktb.e.d.f f;

    public static final class a extends ktb.e.d.b {
        public long a;
        public String b;
        public ktb.e.d.a c;
        public ktb.e.d.c d;
        public ktb.e.d.AbstractC0792d e;
        public ktb.e.d.f f;
        public byte g;

        public final ih1 a() {
            String str;
            ktb.e.d.a aVar;
            ktb.e.d.c cVar;
            if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
                return new ih1(this.a, str, aVar, cVar, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.b == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public ih1(long j, String str, ktb.e.d.a aVar, ktb.e.d.c cVar, ktb.e.d.AbstractC0792d abstractC0792d, ktb.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0792d;
        this.f = fVar;
    }

    @Override // ktb.e.d
    public final ktb.e.d.a a() {
        return this.c;
    }

    @Override // ktb.e.d
    public final ktb.e.d.c b() {
        return this.d;
    }

    @Override // ktb.e.d
    public final ktb.e.d.AbstractC0792d c() {
        return this.e;
    }

    @Override // ktb.e.d
    public final ktb.e.d.f d() {
        return this.f;
    }

    @Override // ktb.e.d
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d)) {
            return false;
        }
        ktb.e.d dVar = (ktb.e.d) obj;
        if (this.a != dVar.e() || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        ktb.e.d.AbstractC0792d abstractC0792d = this.e;
        if (abstractC0792d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC0792d.equals(dVar.c())) {
            return false;
        }
        ktb.e.d.f fVar = this.f;
        if (fVar == null) {
            return dVar.d() == null;
        }
        return fVar.equals(dVar.d());
    }

    @Override // ktb.e.d
    public final String f() {
        return this.b;
    }

    public final a g() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ktb.e.d.AbstractC0792d abstractC0792d = this.e;
        int iHashCode2 = (iHashCode ^ (abstractC0792d == null ? 0 : abstractC0792d.hashCode())) * 1000003;
        ktb.e.d.f fVar = this.f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
