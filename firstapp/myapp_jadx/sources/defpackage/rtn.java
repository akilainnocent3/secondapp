package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rtn {
    public final String a;
    public final String b;
    public final List<h2o> c;
    public final int d;
    public final List<fun> e;

    public rtn(String str, String str2, List<h2o> list, int i, List<fun> list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtn)) {
            return false;
        }
        rtn rtnVar = (rtn) obj;
        return this.a.equals(rtnVar.a) && this.b.equals(rtnVar.b) && Intrinsics.g(this.c, rtnVar.c) && this.d == rtnVar.d && Intrinsics.g(this.e, rtnVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingEvent(id=", this.a, ", leagueId=", this.b, ", racers=");
        sbA.append(this.c);
        sbA.append(", marketCount=");
        sbA.append(this.d);
        sbA.append(", markets=");
        return ng1.a(sbA, this.e, ")");
    }
}
