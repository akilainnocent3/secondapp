package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r770 {
    public final String a;
    public final String b;
    public final int c;
    public final List<t770> d;

    public r770(String str, String str2, int i, List<t770> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r770)) {
            return false;
        }
        r770 r770Var = (r770) obj;
        return this.a.equals(r770Var.a) && this.b.equals(r770Var.b) && this.c == r770Var.c && Intrinsics.g(this.d, r770Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return at6.b(ux5.a("ScheduledFootballLeagueStats(leagueId=", this.a, ", leagueName=", this.b, ", season="), this.c, ", teamInfos=", this.d, ")");
    }
}
