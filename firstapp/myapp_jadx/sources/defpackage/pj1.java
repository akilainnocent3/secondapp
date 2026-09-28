package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class pj1 {
    public final eqe0 a;
    public final pg50 b;
    public final long c;
    public final uig0 d;

    public pj1(pg50 pg50Var, long j) {
        uig0 uig0Var = uig0.b;
        this.a = eqe0.b;
        if (pg50Var == null) {
            bmy.a("Null resource");
            throw null;
        }
        this.b = pg50Var;
        this.c = j;
        this.d = uig0Var;
    }

    public final oug a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pj1)) {
            return false;
        }
        pj1 pj1Var = (pj1) obj;
        return this.a.equals(pj1Var.a) && this.b.equals(pj1Var.b) && this.c == pj1Var.c && this.d.equals(pj1Var.a());
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return this.d.hashCode() ^ ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003);
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + this.a + ", resource=" + this.b + ", startEpochNanos=" + this.c + ", exemplarFilter=" + this.d + "}";
    }
}
