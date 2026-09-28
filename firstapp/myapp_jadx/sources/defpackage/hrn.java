package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hrn {
    public final String a;
    public final String b;

    public hrn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrn)) {
            return false;
        }
        hrn hrnVar = (hrn) obj;
        return this.a.equals(hrnVar.a) && this.b.equals(hrnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantFootballTicketBetBuilderSelection(marketId=", this.a, ", outcomeId=", this.b, ")");
    }
}
