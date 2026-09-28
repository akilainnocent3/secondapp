package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hmv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public hmv(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hmv)) {
            return false;
        }
        hmv hmvVar = (hmv) obj;
        long j = hmvVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, hmvVar.b) && nbh0.a(this.c, hmvVar.c) && nbh0.a(this.d, hmvVar.d) && nbh0.a(this.e, hmvVar.e) && nbh0.a(this.f, hmvVar.f);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.f) + f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
