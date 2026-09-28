package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class sn90 {
    public final String a;
    public final String b;
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public sn90(String str, String str2, long j, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn90)) {
            return false;
        }
        sn90 sn90Var = (sn90) obj;
        return this.a.equals(sn90Var.a) && this.b.equals(sn90Var.b) && this.c == sn90Var.c && this.d.equals(sn90Var.d) && this.e.equals(sn90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vt5.a(this.d, f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationSettlementEventGoalTriggerMillis(ticketId=", this.a, ", eventId=", this.b, ", totalMillis=");
        sbA.append(this.c);
        sbA.append(", homeTeamTriggerMillis=");
        sbA.append(this.d);
        sbA.append(", awayTeamTriggerMillis=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
