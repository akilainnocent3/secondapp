package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class to50 {
    public final long a;
    public final gq50 b;

    public to50(long j, gq50 gq50Var) {
        this.a = j;
        this.b = gq50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to50)) {
            return false;
        }
        to50 to50Var = (to50) obj;
        return this.a == to50Var.a && this.b.equals(to50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReversResult(timestamp=" + this.a + ", status=" + this.b + ")";
    }
}
