package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fg6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public fg6(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ fg6 b(fg6 fg6Var, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j2 = fg6Var.b;
        }
        return fg6Var.a(j, j2, fg6Var.c, fg6Var.d);
    }

    public final fg6 a(long j, long j2, long j3, long j4) {
        return new fg6(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fg6)) {
            return false;
        }
        fg6 fg6Var = (fg6) obj;
        long j = fg6Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, fg6Var.b) && nbh0.a(this.c, fg6Var.c) && nbh0.a(this.d, fg6Var.d);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.d) + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
