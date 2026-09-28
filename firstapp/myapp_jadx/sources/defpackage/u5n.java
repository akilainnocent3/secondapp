package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u5n {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public u5n(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final u5n a(long j, long j2, long j3, long j4) {
        return new u5n(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u5n)) {
            return false;
        }
        u5n u5nVar = (u5n) obj;
        long j = u5nVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, u5nVar.b) && nbh0.a(this.c, u5nVar.c) && nbh0.a(this.d, u5nVar.d);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.d) + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
