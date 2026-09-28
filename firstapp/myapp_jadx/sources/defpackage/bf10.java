package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf10 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public bf10(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf10)) {
            return false;
        }
        bf10 bf10Var = (bf10) obj;
        long j = bf10Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, bf10Var.b) && nbh0.a(this.c, bf10Var.c) && nbh0.a(this.d, bf10Var.d) && nbh0.a(this.e, bf10Var.e);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.e) + f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String strI = j58.i(this.a);
        String strI2 = j58.i(this.b);
        String strI3 = j58.i(this.c);
        String strI4 = j58.i(this.d);
        String strI5 = j58.i(this.e);
        StringBuilder sbA = ux5.a("PixQuickInputScreenColors(border=", strI, ", background=", strI2, ", selectedBackground=");
        hxa.c(sbA, strI3, ", text=", strI4, ", selectedText=");
        return uf80.a(sbA, strI5, ")");
    }
}
