package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class b670 implements l670 {
    public final hp1 a;

    public b670(hp1 hp1Var) {
        this.a = hp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b670) && this.a.equals(((b670) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStatsAverageGoalsScoredInfoState(averageGoalsScoredState=" + this.a + ")";
    }
}
