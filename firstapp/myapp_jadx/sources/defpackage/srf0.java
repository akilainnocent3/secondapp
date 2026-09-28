package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class srf0 {
    public final usf0 a;
    public final usf0 b;

    public srf0(usf0 usf0Var, usf0 usf0Var2) {
        this.a = usf0Var;
        this.b = usf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf0)) {
            return false;
        }
        srf0 srf0Var = (srf0) obj;
        return this.a.equals(srf0Var.a) && this.b.equals(srf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TierMarkData(size=" + this.a + ", offset=" + this.b + ")";
    }
}
