package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v6o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final qeo h;
    public final d7o i;

    public v6o(String str, String str2, String str3, String str4, String str5, String str6, String str7, qeo qeoVar, d7o d7oVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = qeoVar;
        this.i = d7oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6o)) {
            return false;
        }
        v6o v6oVar = (v6o) obj;
        return this.a.equals(v6oVar.a) && this.b.equals(v6oVar.b) && this.c.equals(v6oVar.c) && this.d.equals(v6oVar.d) && this.e.equals(v6oVar.e) && this.f.equals(v6oVar.f) && this.g.equals(v6oVar.g) && Intrinsics.g(this.h, v6oVar.h) && this.i.equals(v6oVar.i);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        qeo qeoVar = this.h;
        return this.i.hashCode() + ((iA + (qeoVar == null ? 0 : qeoVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantVirtualShowOffRoundEvent(eventId=", this.a, ", homeTeamLogoUrl=", this.b, ", homeTeamName=");
        hxa.c(sbA, this.c, ", homeTeamScore=", this.d, ", awayTeamLogoUrl=");
        hxa.c(sbA, this.e, ", awayTeamName=", this.f, ", awayTeamScore=");
        sbA.append(this.g);
        sbA.append(", footballScoreInfoState=");
        sbA.append(this.h);
        sbA.append(", selection=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
