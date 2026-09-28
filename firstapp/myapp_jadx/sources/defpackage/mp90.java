package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mp90 {
    public final String a;
    public final lp90 b;
    public final boolean c;

    public mp90(String str, lp90 lp90Var, boolean z) {
        this.a = str;
        this.b = lp90Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp90)) {
            return false;
        }
        mp90 mp90Var = (mp90) obj;
        return this.a.equals(mp90Var.a) && this.b.equals(mp90Var.b) && this.c == mp90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationSettlementSelectionResultState(selectionId=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", shouldShowResultTooltip=");
        return mq0.a(sb, this.c, ")");
    }
}
