package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uci implements pci {
    public final int a;

    public uci(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uci) && this.a == ((uci) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "FootballFamilySettlementOneCutInsureState(drawableResId=", ")");
    }
}
