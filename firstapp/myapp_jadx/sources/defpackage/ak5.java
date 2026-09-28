package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ak5(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final ak5 a(long j, long j2, long j3, long j4) {
        return new ak5(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ak5)) {
            return false;
        }
        ak5 ak5Var = (ak5) obj;
        long j = ak5Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, ak5Var.b) && nbh0.a(this.c, ak5Var.c) && nbh0.a(this.d, ak5Var.d);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.d) + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
