package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class aj1 extends snn {
    public final String a;
    public final long b;
    public final long c;

    public aj1(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.snn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.snn
    public final long b() {
        return this.c;
    }

    @Override // defpackage.snn
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof snn)) {
            return false;
        }
        snn snnVar = (snn) obj;
        return this.a.equals(snnVar.a()) && this.b == snnVar.c() && this.c == snnVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return nrz.a(this.c, "}", sb);
    }
}
