package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class el90 {
    public final int a;

    public el90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el90) && this.a == ((el90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "SimulationAutoBetTimes(limit=", ")");
    }
}
