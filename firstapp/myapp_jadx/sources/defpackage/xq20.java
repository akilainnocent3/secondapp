package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xq20 {
    public final d6f0 a;
    public final int b;
    public final String c;
    public final d6f0 d;
    public final int e;
    public final String f;
    public final int g;
    public final List<olv> h;

    public xq20(d6f0 d6f0Var, int i, String str, d6f0 d6f0Var2, int i2, String str2, int i3, List list) {
        list.getClass();
        this.a = d6f0Var;
        this.b = i;
        this.c = str;
        this.d = d6f0Var2;
        this.e = i2;
        this.f = str2;
        this.g = i3;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq20)) {
            return false;
        }
        xq20 xq20Var = (xq20) obj;
        return this.a.equals(xq20Var.a) && this.b == xq20Var.b && this.c.equals(xq20Var.c) && this.d.equals(xq20Var.d) && this.e == xq20Var.e && this.f.equals(xq20Var.f) && this.g == xq20Var.g && Intrinsics.g(this.h, xq20Var.h);
    }

    public final int hashCode() {
        return Integer.hashCode(5) + ai50.a(gpp.a(this.g, gmf0.a(gpp.a(this.e, (this.d.hashCode() + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviousMeetings(homeTeamBasicInfo=");
        sb.append(this.a);
        sb.append(", homeTeamWins=");
        sb.append(this.b);
        sb.append(", homeTeamHighestWinScore=");
        sb.append(this.c);
        sb.append(", awayTeamBasicInfo=");
        sb.append(this.d);
        sb.append(", awayTeamWins=");
        f78.b(this.e, ", awayTeamHighestWinScore=", this.f, ", draws=", sb);
        return at6.b(sb, this.g, ", meetingRecords=", this.h, ", maxDisplayCountOfMeetingRecords=5)");
    }
}
