package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e9z {
    public final long a;
    public final long b;

    public e9z(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9z)) {
            return false;
        }
        e9z e9zVar = (e9z) obj;
        if (!g7f.b(1.0f, 1.0f)) {
            return false;
        }
        long j = e9zVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, e9zVar.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(1.0f) * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.b) + f87.a(iHashCode, this.a, 31);
    }

    public final String toString() {
        String strC = g7f.c(1.0f);
        String strI = j58.i(this.a);
        return uf80.a(ux5.a("OutlinedButtonBorderStroke(width=", strC, ", contentColor=", strI, ", disabledContentColor="), j58.i(this.b), ")");
    }
}
