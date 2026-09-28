package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mi70 {
    public final String a;
    public final sj70 b;

    public mi70(String str, sj70 sj70Var) {
        this.a = str;
        this.b = sj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi70)) {
            return false;
        }
        mi70 mi70Var = (mi70) obj;
        return this.a.equals(mi70Var.a) && this.b == mi70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballSelectionStatus(selectionId=" + this.a + ", settlementStatus=" + this.b + ")";
    }
}
