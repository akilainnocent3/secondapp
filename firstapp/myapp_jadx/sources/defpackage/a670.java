package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class a670 {
    public final v670 a;
    public final v670 b;
    public final s670 c;

    public a670(v670 v670Var, v670 v670Var2, s670 s670Var) {
        this.a = v670Var;
        this.b = v670Var2;
        this.c = s670Var;
    }

    public static int a(a670 a670Var) {
        return Math.min(5, Math.max(a670Var.a.h.size(), a670Var.b.h.size()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a670)) {
            return false;
        }
        a670 a670Var = (a670) obj;
        return this.a.equals(a670Var.a) && this.b.equals(a670Var.b) && this.c.equals(a670Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStats(homeTeamInfo=" + this.a + ", awayTeamInfo=" + this.b + ", previousMeeting=" + this.c + ")";
    }
}
