package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class w670 implements l670 {
    public final s7j0 a;

    public w670(s7j0 s7j0Var) {
        this.a = s7j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w670) && this.a.equals(((w670) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStatsWinProbabilityInfoState(winProbabilityState=" + this.a + ")";
    }
}
