package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mcc0 {
    public final q2s a;
    public final hp1 b;
    public final s7j0 c;

    public mcc0(q2s q2sVar, hp1 hp1Var, s7j0 s7j0Var) {
        this.a = q2sVar;
        this.b = hp1Var;
        this.c = s7j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc0)) {
            return false;
        }
        mcc0 mcc0Var = (mcc0) obj;
        return this.a.equals(mcc0Var.a) && this.b.equals(mcc0Var.b) && this.c.equals(mcc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyLegendsHeadToHeadStatsInfoState(leaguePosition=" + this.a + ", averageGoalsScoredState=" + this.b + ", winProbabilityState=" + this.c + ")";
    }
}
