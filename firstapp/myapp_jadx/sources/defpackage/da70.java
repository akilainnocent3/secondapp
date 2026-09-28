package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class da70 {
    public final String a;
    public final qgy b;

    public da70(String str, qgy qgyVar) {
        this.a = str;
        this.b = qgyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da70)) {
            return false;
        }
        da70 da70Var = (da70) obj;
        return this.a.equals(da70Var.a) && this.b.equals(da70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballOddsButtonState(outcomeId=" + this.a + ", oddsButtonState=" + this.b + ")";
    }
}
