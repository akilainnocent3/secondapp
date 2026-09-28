package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yqc0 {
    public final long a;
    public final long b;
    public final long c;

    public yqc0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc0)) {
            return false;
        }
        yqc0 yqc0Var = (yqc0) obj;
        long j = yqc0Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, yqc0Var.b) && nbh0.a(this.c, yqc0Var.c);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strI = j58.i(this.a);
        String strI2 = j58.i(this.b);
        return uf80.a(ux5.a("SportyListSectionColors(containerColor=", strI, ", titleColor=", strI2, ", contentColor="), j58.i(this.c), ")");
    }
}
