package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class t5k0 {
    public final String a;
    public final String b;

    public t5k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5k0)) {
            return false;
        }
        t5k0 t5k0Var = (t5k0) obj;
        return this.a.equals(t5k0Var.a) && this.b.equals(t5k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("WorldCupTicketBetBuilderSelection(marketId=", this.a, ", outcomeId=", this.b, ")");
    }
}
