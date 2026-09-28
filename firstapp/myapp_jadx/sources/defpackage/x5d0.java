package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class x5d0 implements Serializable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h5d0 e;
    public final String f;
    public final h5d0 i;
    public final String v;
    public final ArrayList w;

    public x5d0(String str, String str2, String str3, String str4, h5d0 h5d0Var, String str5, h5d0 h5d0Var2, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h5d0Var;
        this.f = str5;
        this.i = h5d0Var2;
        this.v = str6;
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5d0)) {
            return false;
        }
        x5d0 x5d0Var = (x5d0) obj;
        return this.a.equals(x5d0Var.a) && this.b.equals(x5d0Var.b) && this.c.equals(x5d0Var.c) && this.d.equals(x5d0Var.d) && this.e.equals(x5d0Var.e) && this.f.equals(x5d0Var.f) && this.i.equals(x5d0Var.i) && this.v.equals(x5d0Var.v) && this.w.equals(x5d0Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + gmf0.a((this.i.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31, 31, this.v);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyPenaltyTicketEvent(id=", this.a, ", leagueId=", this.b, ", leagueUrl=");
        hxa.c(sbA, this.c, ", leagueName=", this.d, ", leftTeamInfo=");
        sbA.append(this.e);
        sbA.append(", leftTeamScore=");
        sbA.append(this.f);
        sbA.append(", rightTeamInfo=");
        sbA.append(this.i);
        sbA.append(", rightTeamScore=");
        sbA.append(this.v);
        sbA.append(", kickResults=");
        sbA.append(this.w);
        sbA.append(")");
        return sbA.toString();
    }
}
