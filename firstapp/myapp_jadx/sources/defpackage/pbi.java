package defpackage;

import com.appsflyer.internal.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class pbi {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public pbi(String str, long j, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = j;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbi)) {
            return false;
        }
        pbi pbiVar = (pbi) obj;
        return this.a.equals(pbiVar.a) && this.b == pbiVar.b && this.c.equals(pbiVar.c) && this.d.equals(pbiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vt5.a(this.c, f87.a(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "FootballFamilySettlementEventGoalTriggerMillis(eventId=", this.a, ", totalMillis=");
        sbA.append(", homeTeamTriggerMillis=");
        sbA.append(this.c);
        sbA.append(", awayTeamTriggerMillis=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
