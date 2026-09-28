package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nh1 extends ktb.e.d.a.b.c {
    public final String a;
    public final String b;
    public final long c;

    public nh1(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // ktb.e.d.a.b.c
    public final long a() {
        return this.c;
    }

    @Override // ktb.e.d.a.b.c
    public final String b() {
        return this.b;
    }

    @Override // ktb.e.d.a.b.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b.c)) {
            return false;
        }
        ktb.e.d.a.b.c cVar = (ktb.e.d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return nrz.a(this.c, "}", sb);
    }
}
