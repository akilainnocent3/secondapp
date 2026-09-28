package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class moc0 {
    public final String a;
    public final String b;

    public moc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moc0)) {
            return false;
        }
        moc0 moc0Var = (moc0) obj;
        return this.a.equals(moc0Var.a) && this.b.equals(moc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsTicketBetBuilderSelection(marketId=", this.a, ", outcomeId=", this.b, ")");
    }
}
