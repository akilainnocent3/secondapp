package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;

/* JADX INFO: loaded from: classes2.dex */
public final class q2s {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public q2s(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2s)) {
            return false;
        }
        q2s q2sVar = (q2s) obj;
        return this.a == q2sVar.a && this.b == q2sVar.b && this.c == q2sVar.c && this.d == q2sVar.d && this.e == q2sVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("LeaguePosition(totalTeamCount=", this.a, this.b, ", homeTeamForm=", ", homeTeamRank=");
        d5d.a(sbA, this.c, ", awayTeamForm=", this.d, ", awayTeamRank=");
        return zk1.a(this.e, jbkEboCkTqmGf.ALcKvBTmY, sbA);
    }
}
