package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g3o {
    public final String a;
    public final String b;
    public final List<own> c;
    public final long d;

    public g3o(String str, String str2, List<own> list, long j) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3o)) {
            return false;
        }
        g3o g3oVar = (g3o) obj;
        return this.a.equals(g3oVar.a) && this.b.equals(g3oVar.b) && Intrinsics.g(this.c, g3oVar.c) && this.d == g3oVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingRoundInfo(roundId=", this.a, ", roundTag=", this.b, QWvyvNzGsBpRT.hYSWD);
        sbA.append(this.c);
        sbA.append(", userSettledRound=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
