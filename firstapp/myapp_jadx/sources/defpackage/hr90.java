package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hr90 {
    public final String a;

    public hr90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr90) && this.a.equals(((hr90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SimulationTicketDetailFooterState(ticketNumber=", this.a, ")");
    }
}
