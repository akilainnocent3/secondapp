package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lh1 extends ktb.e.d.a.b.AbstractC0786a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public lh1(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // ktb.e.d.a.b.AbstractC0786a
    public final long a() {
        return this.a;
    }

    @Override // ktb.e.d.a.b.AbstractC0786a
    public final String b() {
        return this.c;
    }

    @Override // ktb.e.d.a.b.AbstractC0786a
    public final long c() {
        return this.b;
    }

    @Override // ktb.e.d.a.b.AbstractC0786a
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b.AbstractC0786a)) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0786a abstractC0786a = (ktb.e.d.a.b.AbstractC0786a) obj;
        if (this.a != abstractC0786a.a() || this.b != abstractC0786a.c() || !this.c.equals(abstractC0786a.b())) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            return abstractC0786a.d() == null;
        }
        return str.equals(abstractC0786a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return uf80.a(sb, this.d, "}");
    }
}
