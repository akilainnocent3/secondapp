package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gl90 {
    public final String a;
    public final String b;

    public gl90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl90)) {
            return false;
        }
        gl90 gl90Var = (gl90) obj;
        return this.a.equals(gl90Var.a) && this.b.equals(gl90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SimulationBetHistoryCellDateState(day=", this.a, ", month=", this.b, ")");
    }
}
