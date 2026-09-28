package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ata0 {
    public final String a;
    public final qgy b;

    public ata0(String str, qgy qgyVar) {
        this.a = str;
        this.b = qgyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ata0)) {
            return false;
        }
        ata0 ata0Var = (ata0) obj;
        return this.a.equals(ata0Var.a) && this.b.equals(ata0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SpecifierDropdownMenuOddsButtonState(outcomeId=" + this.a + ", oddsButtonState=" + this.b + ")";
    }
}
