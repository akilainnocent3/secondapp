package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class us90 {
    public final er90 a;
    public final String b;

    public us90(er90 er90Var, String str) {
        this.a = er90Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us90)) {
            return false;
        }
        us90 us90Var = (us90) obj;
        return this.a.equals(us90Var.a) && this.b.equals(us90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimulationTicketDetailWatermarkIconState(watermarkIconDrawable=" + this.a + ", watermarkIconResourceId=" + this.b + ")";
    }
}
