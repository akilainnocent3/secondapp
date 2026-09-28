package defpackage;

import com.appsflyer.internal.l;
import com.sporty.android.core.model.loyalty.MissionProgressDto;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class osv {
    public final int a;
    public final MissionPublishState b;
    public final String c;
    public final String d;
    public final Long e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final qtv k;
    public final double l;
    public final jrv m;
    public final Double n;
    public final Double o;
    public final Boolean p;
    public final Boolean q;
    public final ArrayList r;
    public final boolean s;
    public final MissionProgressDto t;

    public osv(int i, MissionPublishState missionPublishState, String str, String str2, Long l, long j, long j2, String str3, long j3, String str4, qtv qtvVar, double d, jrv jrvVar, Double d2, Double d3, Boolean bool, Boolean bool2, ArrayList arrayList, boolean z, MissionProgressDto missionProgressDto) {
        missionPublishState.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        jrvVar.getClass();
        this.a = i;
        this.b = missionPublishState;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = j;
        this.g = j2;
        this.h = str3;
        this.i = j3;
        this.j = str4;
        this.k = qtvVar;
        this.l = d;
        this.m = jrvVar;
        this.n = d2;
        this.o = d3;
        this.p = bool;
        this.q = bool2;
        this.r = arrayList;
        this.s = z;
        this.t = missionProgressDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osv)) {
            return false;
        }
        osv osvVar = (osv) obj;
        return this.a == osvVar.a && this.b == osvVar.b && Intrinsics.g(this.c, osvVar.c) && Intrinsics.g(this.d, osvVar.d) && Intrinsics.g(this.e, osvVar.e) && this.f == osvVar.f && this.g == osvVar.g && Intrinsics.g(this.h, osvVar.h) && this.i == osvVar.i && Intrinsics.g(this.j, osvVar.j) && this.k == osvVar.k && Double.compare(this.l, osvVar.l) == 0 && Intrinsics.g(this.m, osvVar.m) && Intrinsics.g(this.n, osvVar.n) && Intrinsics.g(this.o, osvVar.o) && Intrinsics.g(this.p, osvVar.p) && Intrinsics.g(this.q, osvVar.q) && this.r.equals(osvVar.r) && this.s == osvVar.s && Intrinsics.g(this.t, osvVar.t);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode = (this.m.hashCode() + nrg0.a((this.k.hashCode() + gmf0.a(f87.a(gmf0.a(f87.a(f87.a((iA + (l == null ? 0 : l.hashCode())) * 31, this.f, 31), this.g, 31), 31, this.h), this.i, 31), 31, this.j)) * 31, 31, this.l)) * 31;
        Double d = this.n;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.o;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.p;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iA2 = mtg0.a(vt5.a(this.r, (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31, this.s);
        MissionProgressDto missionProgressDto = this.t;
        return iA2 + (missionProgressDto != null ? missionProgressDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionDomainData(missionId=");
        sb.append(this.a);
        sb.append(", missionPublishState=");
        sb.append(this.b);
        sb.append(", title=");
        hxa.c(sb, this.c, ", betRequirement=", this.d, ", durationDays=");
        sb.append(this.e);
        sb.append(", endTime=");
        sb.append(this.f);
        g41.a(this.g, ", publishedTime=", ", sportBettingUrl=", sb);
        l.a(this.i, this.h, ", lastParticipationTime=", sb);
        sb.append(", currency=");
        sb.append(this.j);
        sb.append(", requirementType=");
        sb.append(this.k);
        hib0.b(this.l, ", requiredAmount=", ", missionBetRequirementType=", sb);
        sb.append(this.m);
        sb.append(", minStake=");
        sb.append(this.n);
        sb.append(", minTotalOdd=");
        sb.append(this.o);
        sb.append(", giftUsage=");
        sb.append(this.p);
        sb.append(", cashOut=");
        sb.append(this.q);
        sb.append(", rewardList=");
        sb.append(this.r);
        sb.append(", canParticipate=");
        sb.append(this.s);
        sb.append(", missionProgress=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
