package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class q570 {
    public final String a;
    public final String b;

    public q570(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q570)) {
            return false;
        }
        q570 q570Var = (q570) obj;
        return this.a.equals(q570Var.a) && this.b.equals(q570Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("ScheduledFootballEventScoreSelection(matchdayId=", this.a, ", eventId=", this.b, ")");
    }
}
