package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h970 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final List<i970> f;

    public h970(int i, int i2, String str, String str2, String str3, List<i970> list) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h970)) {
            return false;
        }
        h970 h970Var = (h970) obj;
        return this.a == h970Var.a && this.b == h970Var.b && this.c.equals(h970Var.c) && this.d.equals(h970Var.d) && this.e.equals(h970Var.e) && Intrinsics.g(this.f, h970Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("ScheduledFootballMatchdayResult(season=", this.a, this.b, ", matchday=", ", leagueId=");
        hxa.c(sbA, this.c, ", leagueName=", this.d, LhMGMAwwhzjwfz.ycDBRWLFkiFLjpD);
        return nve.a(this.e, ", events=", ")", sbA, this.f);
    }
}
