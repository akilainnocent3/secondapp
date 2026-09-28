package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ioh0 {
    public final long a;
    public final long b;
    public final joh0 c;
    public final double d;
    public final long e;
    public final long f;

    public ioh0(long j, long j2, joh0 joh0Var, double d, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = joh0Var;
        this.d = d;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioh0)) {
            return false;
        }
        ioh0 ioh0Var = (ioh0) obj;
        return this.a == ioh0Var.a && this.b == ioh0Var.b && this.c == ioh0Var.c && Double.compare(this.d, ioh0Var.d) == 0 && this.e == ioh0Var.e && this.f == ioh0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + f87.a(nrg0.a((this.c.hashCode() + f87.a(Long.hashCode(this.a) * 31, this.b, 31)) * 31, 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbA = q6a0.a(this.a, "UserChallengeProgress(id=", ", challengeId=");
        sbA.append(this.b);
        sbA.append(", status=");
        sbA.append(this.c);
        hib0.b(this.d, ", accumulatedAmount=", ", expireTime=", sbA);
        sbA.append(this.e);
        return zug.a(this.f, ", updateTime=", ")", sbA);
    }
}
