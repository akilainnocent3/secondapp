package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qgd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public qgd(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qgd.class != obj.getClass()) {
            return false;
        }
        qgd qgdVar = (qgd) obj;
        long j = qgdVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, qgdVar.b) && nbh0.a(this.c, qgdVar.c) && nbh0.a(this.d, qgdVar.d) && nbh0.a(this.e, qgdVar.e) && nbh0.a(this.f, qgdVar.f) && nbh0.a(this.g, qgdVar.g) && nbh0.a(this.h, qgdVar.h);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.h) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
