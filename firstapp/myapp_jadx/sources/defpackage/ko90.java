package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ko90 implements jo90 {
    public final int a;

    public ko90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko90) && this.a == ((ko90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "SimulationSettlementOneCutInsureState(iconResId=", ")");
    }
}
