package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u4o implements Serializable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<y4o> e;
    public final String f;
    public final List<String> i;

    public u4o(String str, String str2, String str3, String str4, List<y4o> list, String str5, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4o)) {
            return false;
        }
        u4o u4oVar = (u4o) obj;
        return this.a.equals(u4oVar.a) && this.b.equals(u4oVar.b) && this.c.equals(u4oVar.c) && this.d.equals(u4oVar.d) && Intrinsics.g(this.e, u4oVar.e) && this.f.equals(u4oVar.f) && Intrinsics.g(this.i, u4oVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(ai50.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingTicketEvent(id=", this.a, ", leagueId=", this.b, ", leagueUrl=");
        hxa.c(sbA, this.c, ", leagueName=", this.d, ", racers=");
        gfs.a(", resultSequence=", this.f, ", resultTrack=", sbA, this.e);
        return ng1.a(sbA, this.i, ")");
    }
}
