package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class p670 implements l670 {
    public final kor a;

    public p670(kor korVar) {
        this.a = korVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p670) && this.a.equals(((p670) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStatsLastMatchesInfoState(lastMatchesState=" + this.a + ")";
    }
}
