package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 extends hs1 {
    public final hs1.a a;
    public final long b;

    public kg1(hs1.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // defpackage.hs1
    public final long a() {
        return this.b;
    }

    @Override // defpackage.hs1
    public final hs1.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        return this.a.equals(hs1Var.b()) && this.b == hs1Var.a();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return nrz.a(this.b, "}", sb);
    }
}
