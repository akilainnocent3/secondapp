package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wel {
    public final q2i0 a;
    public final q2s b;
    public final eor c;
    public final m7j0 d;
    public final xq20 e;
    public final ki40 f;

    public wel(q2i0 q2i0Var, q2s q2sVar, eor eorVar, m7j0 m7j0Var, xq20 xq20Var, ki40 ki40Var) {
        this.a = q2i0Var;
        this.b = q2sVar;
        this.c = eorVar;
        this.d = m7j0Var;
        this.e = xq20Var;
        this.f = ki40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wel)) {
            return false;
        }
        wel welVar = (wel) obj;
        return this.a.equals(welVar.a) && this.b.equals(welVar.b) && this.c.equals(welVar.c) && this.d.equals(welVar.d) && Intrinsics.g(this.e, welVar.e) && this.f.equals(welVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        xq20 xq20Var = this.e;
        return this.f.hashCode() + ((iHashCode + (xq20Var == null ? 0 : xq20Var.hashCode())) * 31);
    }

    public final String toString() {
        return "HeadToHeadStats(versusInfo=" + this.a + ", leaguePosition=" + this.b + ", lastMatches=" + this.c + ", winProbability=" + this.d + ", previousMeetings=" + this.e + ", recentStats=" + this.f + ")";
    }
}
