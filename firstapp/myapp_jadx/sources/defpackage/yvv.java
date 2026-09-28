package defpackage;

import com.sporty.android.core.model.loyalty.BetType;
import com.sporty.android.core.model.loyalty.LoyaltyMissionTaskType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;
import com.sporty.android.core.model.loyalty.MissionStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yvv {
    public final LoyaltyMissionTaskType a;
    public final String b;
    public final double c;
    public final String d;
    public final jrv e;
    public final Double f;
    public final Double g;
    public final Boolean h;
    public final Boolean i;
    public final MissionBetCategory j;
    public final List<BetType> k;
    public final List<String> l;
    public final List<String> m;
    public final List<String> n;
    public final MissionStatus o;
    public final Double p;

    /* JADX WARN: Multi-variable type inference failed */
    public yvv(LoyaltyMissionTaskType loyaltyMissionTaskType, String str, double d, String str2, jrv jrvVar, Double d2, Double d3, Boolean bool, Boolean bool2, MissionBetCategory missionBetCategory, List<? extends BetType> list, List<String> list2, List<String> list3, List<String> list4, MissionStatus missionStatus, Double d4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = loyaltyMissionTaskType;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = jrvVar;
        this.f = d2;
        this.g = d3;
        this.h = bool;
        this.i = bool2;
        this.j = missionBetCategory;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = missionStatus;
        this.p = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvv)) {
            return false;
        }
        yvv yvvVar = (yvv) obj;
        return this.a == yvvVar.a && this.b.equals(yvvVar.b) && Double.compare(this.c, yvvVar.c) == 0 && Intrinsics.g(this.d, yvvVar.d) && Intrinsics.g(this.e, yvvVar.e) && Intrinsics.g(this.f, yvvVar.f) && Intrinsics.g(this.g, yvvVar.g) && Intrinsics.g(this.h, yvvVar.h) && Intrinsics.g(this.i, yvvVar.i) && this.j == yvvVar.j && Intrinsics.g(this.k, yvvVar.k) && Intrinsics.g(this.l, yvvVar.l) && Intrinsics.g(this.m, yvvVar.m) && Intrinsics.g(this.n, yvvVar.n) && this.o == yvvVar.o && Intrinsics.g(this.p, yvvVar.p);
    }

    public final int hashCode() {
        int iA = nrg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        jrv jrvVar = this.e;
        int iHashCode2 = (iHashCode + (jrvVar == null ? 0 : jrvVar.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MissionBetCategory missionBetCategory = this.j;
        int iA2 = ai50.a(ai50.a(ai50.a(ai50.a((iHashCode6 + (missionBetCategory == null ? 0 : missionBetCategory.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        MissionStatus missionStatus = this.o;
        int iHashCode7 = (iA2 + (missionStatus == null ? 0 : missionStatus.hashCode())) * 31;
        Double d3 = this.p;
        return iHashCode7 + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionTask(taskType=");
        sb.append(this.a);
        sb.append(", displayText=");
        sb.append(this.b);
        sb.append(", target=");
        fwv.a(this.c, ", sportBettingUrl=", this.d, sb);
        sb.append(", betRequirementType=");
        sb.append(this.e);
        sb.append(", minStake=");
        sb.append(this.f);
        sb.append(", minTotalOdd=");
        sb.append(this.g);
        sb.append(", giftUsage=");
        sb.append(this.h);
        sb.append(", cashOut=");
        sb.append(this.i);
        sb.append(", betCategory=");
        sb.append(this.j);
        qjk.a(", betTypeList=", ", betInSpecificRealSportTypeSportIdList=", sb, this.k, this.l);
        qjk.a(", betInSpecificTournamentList=", ", betInSpecificMarketList=", sb, this.m, this.n);
        sb.append(", status=");
        sb.append(this.o);
        sb.append(", accumulatedAmount=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
