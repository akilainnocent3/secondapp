package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ni1 extends gom.a {
    public final wgh0 a;
    public final long b;

    public ni1(wgh0 wgh0Var, long j) {
        this.a = wgh0Var;
        this.b = j;
    }

    @Override // gom.a
    public final m21 a() {
        return this.a;
    }

    @Override // gom.a
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gom.a)) {
            return false;
        }
        gom.a aVar = (gom.a) obj;
        return this.a.equals(aVar.a()) && this.b == aVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{startAttributes=");
        sb.append(this.a);
        sb.append(", startTimeNanos=");
        return nrz.a(this.b, "}", sb);
    }
}
