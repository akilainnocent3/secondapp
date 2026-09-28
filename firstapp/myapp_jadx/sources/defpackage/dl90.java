package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dl90 {
    public final boolean a;
    public final el90 b;

    public dl90(boolean z, el90 el90Var) {
        this.a = z;
        this.b = el90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl90)) {
            return false;
        }
        dl90 dl90Var = (dl90) obj;
        return this.a == dl90Var.a && this.b.equals(dl90Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SimulationAutoBetConfig(isEnabled=" + this.a + ", times=" + this.b + ")";
    }
}
