package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tci {
    public final String a;
    public final String b;

    public tci(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tci)) {
            return false;
        }
        tci tciVar = (tci) obj;
        return this.a.equals(tciVar.a) && this.b.equals(tciVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("FootballFamilySettlementNonLeadingEvent(id=", this.a, ", resultSequence=", this.b, ")");
    }
}
