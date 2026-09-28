package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s670 {
    public final int a;
    public final int b;
    public final int c;
    public final List<r670> d;

    public s670(int i, int i2, int i3, List<r670> list) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s670)) {
            return false;
        }
        s670 s670Var = (s670) obj;
        return this.a == s670Var.a && this.b == s670Var.b && this.c == s670Var.c && Intrinsics.g(this.d, s670Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return at6.b(dy5.a("ScheduledFootballHeadToHeadStatsPreviousMeeting(homeTeamWins=", this.a, this.b, ", awayTeamWins=", ", draws="), this.c, ", recentMatchRecords=", this.d, ")");
    }
}
