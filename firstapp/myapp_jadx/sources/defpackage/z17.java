package defpackage;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001cR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b%\u0010\u001cR\u001c\u00100\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b1\u0010/R\u001c\u00103\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b,\u0010/R\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u001c\u00109\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b \u00107R \u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u001b\u001a\u0004\b#\u0010\u001cR \u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b;\u0010\u001cR\u001c\u0010@\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b5\u0010?¨\u0006A"}, d2 = {"Lz17;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "challengeType", "", "b", "I", "r", "()I", "topRankLimit", "c", "u", "url", "", "d", "J", "m", "()J", "lastParticipationTime", "e", "betCategory", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "betInSpecificRealSportTypeList", "g", "betInSpecificInstantVirtualTypeList", "h", "betInSpecificTournamentList", "betInSpecificMarketList", "j", "betTypeList", "k", "betBuilderTypeList", "l", "t", "upTypeList", "earlyGoalsTypeList", "", "n", "Ljava/lang/Double;", "o", "()Ljava/lang/Double;", "minStake", "p", "minTotalOdds", "maxTotalOdds", "", "q", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "giftUsage", "cashOut", "Lp27;", "s", "championRewardList", "topRankingRewardList", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "participantCount", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class z17 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("challengeType")
    private final String challengeType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("topRanking")
    private final int topRankLimit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("lastParticipationTime")
    private final long lastParticipationTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("betCategory")
    private final String betCategory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("betInSpecificRealSportTypeList")
    private final List<String> betInSpecificRealSportTypeList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("betInSpecificInstantVirtualTypeList")
    private final List<String> betInSpecificInstantVirtualTypeList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("betInSpecificTournamentList")
    private final List<String> betInSpecificTournamentList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("betInSpecificMarketList")
    private final List<String> betInSpecificMarketList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("betTypeList")
    private final List<String> betTypeList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("betBuilderTypeList")
    private final List<String> betBuilderTypeList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("upTypeList")
    private final List<String> upTypeList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("earlyGoalsTypeList")
    private final List<String> earlyGoalsTypeList;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName("minStake")
    private final Double minStake;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName("minTotalOdd")
    private final Double minTotalOdds;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName("maxTotalOdd")
    private final Double maxTotalOdds;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName("giftUsage")
    private final Boolean giftUsage;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName("cashOut")
    private final Boolean cashOut;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @SerializedName("championRewardList")
    private final List<p27> championRewardList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @SerializedName("topRankingRewardList")
    private final List<p27> topRankingRewardList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @SerializedName("participantCount")
    private final Integer participantCount;

    public final List<String> a() {
        return this.betBuilderTypeList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBetCategory() {
        return this.betCategory;
    }

    public final List<String> c() {
        return this.betInSpecificInstantVirtualTypeList;
    }

    public final List<String> d() {
        return this.betInSpecificMarketList;
    }

    public final List<String> e() {
        return this.betInSpecificRealSportTypeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z17)) {
            return false;
        }
        z17 z17Var = (z17) obj;
        return Intrinsics.g(this.challengeType, z17Var.challengeType) && this.topRankLimit == z17Var.topRankLimit && Intrinsics.g(this.url, z17Var.url) && this.lastParticipationTime == z17Var.lastParticipationTime && Intrinsics.g(this.betCategory, z17Var.betCategory) && Intrinsics.g(this.betInSpecificRealSportTypeList, z17Var.betInSpecificRealSportTypeList) && Intrinsics.g(this.betInSpecificInstantVirtualTypeList, z17Var.betInSpecificInstantVirtualTypeList) && Intrinsics.g(this.betInSpecificTournamentList, z17Var.betInSpecificTournamentList) && Intrinsics.g(this.betInSpecificMarketList, z17Var.betInSpecificMarketList) && Intrinsics.g(this.betTypeList, z17Var.betTypeList) && Intrinsics.g(this.betBuilderTypeList, z17Var.betBuilderTypeList) && Intrinsics.g(this.upTypeList, z17Var.upTypeList) && Intrinsics.g(this.earlyGoalsTypeList, z17Var.earlyGoalsTypeList) && Intrinsics.g(this.minStake, z17Var.minStake) && Intrinsics.g(this.minTotalOdds, z17Var.minTotalOdds) && Intrinsics.g(this.maxTotalOdds, z17Var.maxTotalOdds) && Intrinsics.g(this.giftUsage, z17Var.giftUsage) && Intrinsics.g(this.cashOut, z17Var.cashOut) && Intrinsics.g(this.championRewardList, z17Var.championRewardList) && Intrinsics.g(this.topRankingRewardList, z17Var.topRankingRewardList) && Intrinsics.g(this.participantCount, z17Var.participantCount);
    }

    public final List<String> f() {
        return this.betInSpecificTournamentList;
    }

    public final List<String> g() {
        return this.betTypeList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getCashOut() {
        return this.cashOut;
    }

    public final int hashCode() {
        int iA = gpp.a(this.topRankLimit, this.challengeType.hashCode() * 31, 31);
        String str = this.url;
        int iA2 = f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.lastParticipationTime, 31);
        String str2 = this.betCategory;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.betInSpecificRealSportTypeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.betInSpecificInstantVirtualTypeList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.betInSpecificTournamentList;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.betInSpecificMarketList;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.betTypeList;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.betBuilderTypeList;
        int iHashCode7 = (iHashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.upTypeList;
        int iHashCode8 = (iHashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<String> list8 = this.earlyGoalsTypeList;
        int iHashCode9 = (iHashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Double d = this.minStake;
        int iHashCode10 = (iHashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minTotalOdds;
        int iHashCode11 = (iHashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.maxTotalOdds;
        int iHashCode12 = (iHashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.giftUsage;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cashOut;
        int iA3 = ai50.a(ai50.a((iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.championRewardList), 31, this.topRankingRewardList);
        Integer num = this.participantCount;
        return iA3 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getChallengeType() {
        return this.challengeType;
    }

    public final List<p27> j() {
        return this.championRewardList;
    }

    public final List<String> k() {
        return this.earlyGoalsTypeList;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getGiftUsage() {
        return this.giftUsage;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getLastParticipationTime() {
        return this.lastParticipationTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Double getMaxTotalOdds() {
        return this.maxTotalOdds;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Double getMinTotalOdds() {
        return this.minTotalOdds;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getParticipantCount() {
        return this.participantCount;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTopRankLimit() {
        return this.topRankLimit;
    }

    public final List<p27> s() {
        return this.topRankingRewardList;
    }

    public final List<String> t() {
        return this.upTypeList;
    }

    public final String toString() {
        String str = this.challengeType;
        int i = this.topRankLimit;
        String str2 = this.url;
        long j = this.lastParticipationTime;
        String str3 = this.betCategory;
        List<String> list = this.betInSpecificRealSportTypeList;
        List<String> list2 = this.betInSpecificInstantVirtualTypeList;
        List<String> list3 = this.betInSpecificTournamentList;
        List<String> list4 = this.betInSpecificMarketList;
        List<String> list5 = this.betTypeList;
        List<String> list6 = this.betBuilderTypeList;
        List<String> list7 = this.upTypeList;
        List<String> list8 = this.earlyGoalsTypeList;
        Double d = this.minStake;
        Double d2 = this.minTotalOdds;
        Double d3 = this.maxTotalOdds;
        Boolean bool = this.giftUsage;
        Boolean bool2 = this.cashOut;
        List<p27> list9 = this.championRewardList;
        List<p27> list10 = this.topRankingRewardList;
        Integer num = this.participantCount;
        StringBuilder sbA = ml5.a(i, "ChallengeParameterDto(challengeType=", str, ", topRankLimit=", ", url=");
        l.a(j, str2, ", lastParticipationTime=", sbA);
        sbA.append(", betCategory=");
        sbA.append(str3);
        sbA.append(", betInSpecificRealSportTypeList=");
        sbA.append(list);
        qjk.a(", betInSpecificInstantVirtualTypeList=", ", betInSpecificTournamentList=", sbA, list2, list3);
        qjk.a(", betInSpecificMarketList=", ", betTypeList=", sbA, list4, list5);
        qjk.a(", betBuilderTypeList=", ", upTypeList=", sbA, list6, list7);
        sbA.append(", earlyGoalsTypeList=");
        sbA.append(list8);
        sbA.append(", minStake=");
        sbA.append(d);
        lsv.a(d2, d3, ", minTotalOdds=", ", maxTotalOdds=", sbA);
        sbA.append(", giftUsage=");
        sbA.append(bool);
        sbA.append(", cashOut=");
        sbA.append(bool2);
        qjk.a(", championRewardList=", ", topRankingRewardList=", sbA, list9, list10);
        sbA.append(", participantCount=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
