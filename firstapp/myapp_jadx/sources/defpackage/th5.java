package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th5 {
    public final String a;
    public final String b;

    public th5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th5)) {
            return false;
        }
        th5 th5Var = (th5) obj;
        return this.a.equals(th5Var.a) && this.b.equals(th5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("BuildAndGoTicketBetBuilderSelection(marketId=", this.a, ", outcomeId=", this.b, ")");
    }
}
