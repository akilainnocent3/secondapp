package defpackage;

import com.appsflyer.internal.x;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m6g0 {
    public final String a;
    public final long b;
    public final ArrayList c;

    public m6g0(long j, String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6g0)) {
            return false;
        }
        m6g0 m6g0Var = (m6g0) obj;
        return Intrinsics.g(this.a, m6g0Var.a) && this.b == m6g0Var.b && this.c.equals(m6g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "TournamentGroups(tournamentId=", this.a, ", lastUpdated=");
        sbA.append(", groups=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
