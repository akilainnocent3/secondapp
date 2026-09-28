package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gci {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final sbi f;
    public final hdi g;
    public final qeo h;
    public final hci i;
    public final qcn<rei> j;

    public gci(String str, String str2, String str3, String str4, String str5, sbi sbiVar, hdi hdiVar, qeo qeoVar, hci hciVar, uf00 uf00Var) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        hdiVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = sbiVar;
        this.g = hdiVar;
        this.h = qeoVar;
        this.i = hciVar;
        this.j = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gci)) {
            return false;
        }
        gci gciVar = (gci) obj;
        return this.a.equals(gciVar.a) && Intrinsics.g(this.b, gciVar.b) && Intrinsics.g(this.c, gciVar.c) && Intrinsics.g(this.d, gciVar.d) && Intrinsics.g(this.e, gciVar.e) && this.f == gciVar.f && Intrinsics.g(this.g, gciVar.g) && Intrinsics.g(this.h, gciVar.h) && this.i == gciVar.i && Intrinsics.g(this.j, gciVar.j);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        sbi sbiVar = this.f;
        int iHashCode = (this.g.hashCode() + ((iA + (sbiVar == null ? 0 : sbiVar.hashCode())) * 31)) * 31;
        qeo qeoVar = this.h;
        int iHashCode2 = (iHashCode + (qeoVar == null ? 0 : qeoVar.hashCode())) * 31;
        hci hciVar = this.i;
        int iHashCode3 = (iHashCode2 + (hciVar == null ? 0 : hciVar.hashCode())) * 31;
        qcn<rei> qcnVar = this.j;
        return iHashCode3 + (qcnVar != null ? qcnVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("FootballFamilySettlementEventState(eventId=", this.a, ", homeTeamNameText=", this.b, ", homeTeamLogoUrl=");
        hxa.c(sbA, this.c, ", awayTeamNameText=", this.d, ", awayTeamLogoUrl=");
        sbA.append(this.e);
        sbA.append(", indicator=");
        sbA.append(this.f);
        sbA.append(", scoreAnimation=");
        sbA.append(this.g);
        sbA.append(", scoreInfoState=");
        sbA.append(this.h);
        sbA.append(", expansion=");
        sbA.append(this.i);
        sbA.append(", selectionStates=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
