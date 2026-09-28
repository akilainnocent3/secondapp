package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wu30 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wu30(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wu30)) {
            return false;
        }
        wu30 wu30Var = (wu30) obj;
        long j = wu30Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, wu30Var.b) && nbh0.a(this.c, wu30Var.c) && nbh0.a(this.d, wu30Var.d);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.d) + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
