package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class f9z {
    public final long a;
    public final long b;
    public final long c;

    public f9z(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9z)) {
            return false;
        }
        f9z f9zVar = (f9z) obj;
        long j = f9zVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, f9zVar.b) && nbh0.a(this.c, f9zVar.c);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strI = j58.i(this.a);
        String strI2 = j58.i(this.b);
        return uf80.a(ux5.a("OutlinedButtonColor(backgroundColor=", strI, ", contentColor=", strI2, ", disabledContentColor="), j58.i(this.c), ")");
    }
}
