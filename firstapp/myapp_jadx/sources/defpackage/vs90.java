package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vs90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<ws90> g;

    public vs90(String str, String str2, String str3, String str4, String str5, String str6, List<ws90> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs90)) {
            return false;
        }
        vs90 vs90Var = (vs90) obj;
        return this.a.equals(vs90Var.a) && this.b.equals(vs90Var.b) && this.c.equals(vs90Var.c) && this.d.equals(vs90Var.d) && this.e.equals(vs90Var.e) && this.f.equals(vs90Var.f) && Intrinsics.g(this.g, vs90Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketEvent(id=", this.a, ", homeTeamName=", this.b, ", awayTeamName=");
        hxa.c(sbA, this.c, ", homeTeamScore=", this.d, ", awayTeamScore=");
        hxa.c(sbA, this.e, ", resultSequence=", this.f, ", markets=");
        return ng1.a(sbA, this.g, ")");
    }
}
