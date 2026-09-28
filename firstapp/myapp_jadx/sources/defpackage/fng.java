package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fng {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final boolean r;

    public fng(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, String str10, String str11, String str12, String str13, boolean z, String str14, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = j;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = z;
        this.p = str14;
        this.q = z2;
        this.r = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fng)) {
            return false;
        }
        fng fngVar = (fng) obj;
        return Intrinsics.g(this.a, fngVar.a) && this.b.equals(fngVar.b) && this.c.equals(fngVar.c) && Intrinsics.g(this.d, fngVar.d) && Intrinsics.g(this.e, fngVar.e) && Intrinsics.g(this.f, fngVar.f) && Intrinsics.g(this.g, fngVar.g) && Intrinsics.g(this.h, fngVar.h) && Intrinsics.g(this.i, fngVar.i) && this.j == fngVar.j && Intrinsics.g(this.k, fngVar.k) && Intrinsics.g(this.l, fngVar.l) && Intrinsics.g(this.m, fngVar.m) && Intrinsics.g(this.n, fngVar.n) && this.o == fngVar.o && Intrinsics.g(this.p, fngVar.p) && this.q == fngVar.q && this.r == fngVar.r;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iA2 = f87.a((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, this.j, 31);
        String str7 = this.k;
        int iHashCode6 = (iA2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.n;
        int iA3 = mtg0.a((iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 961, 31, this.o);
        String str11 = this.p;
        return Boolean.hashCode(this.r) + mtg0.a((iA3 + (str11 != null ? str11.hashCode() : 0)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("EventData(id=", this.a, ", homeTeam=", this.b, ", awayTeam=");
        hxa.c(sbA, this.c, ", tournamentName=", this.d, ", homeTeamId=");
        hxa.c(sbA, this.e, ", awayTeamId=", this.f, ", homeLogoUrl=");
        hxa.c(sbA, this.g, ", awayLogoUrl=", this.h, ", score=");
        l.a(this.j, this.i, ", startTime=", sbA);
        hxa.c(sbA, ", homeScoreHT=", this.k, ", awayScoreHT=", this.l);
        hxa.c(sbA, ", homeScoreFT=", this.m, TEFcJcMqR.DGEu, this.n);
        sbA.append(", startOdds=null, isLive=");
        sbA.append(this.o);
        sbA.append(", sportId=");
        sbA.append(this.p);
        u8.a(", isLiveStreamAvailable=", ", isAudioStreamAvailable=", sbA, this.q, this.r);
        sbA.append(")");
        return sbA.toString();
    }
}
