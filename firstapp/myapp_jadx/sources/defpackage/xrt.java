package defpackage;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001cR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b%\u0010\u001cR\u001c\u0010/\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00104\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b+\u00103R\u001c\u0010:\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b'\u00109R\u001c\u0010;\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b \u00109R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u001b\u001a\u0004\b#\u0010\u001cR\"\u0010?\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b=\u0010\u001cR\u001c\u0010B\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\b7\u0010A¨\u0006C"}, d2 = {"Lxrt;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "challengeType", "", "b", "I", "r", "()I", "topRanking", "c", "u", "url", "", "d", "J", "m", "()J", "lastParticipationTime", "e", "betCategory", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "betInSpecificRealSportTypeList", "g", "betInSpecificInstantVirtualTypeList", "h", "betInSpecificTournamentList", "betInSpecificMarketList", "j", "betTypeList", "k", "betBuilderTypeList", "l", "t", "upTypeList", "earlyGoalsTypeList", "n", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "minStake", "", "Ljava/lang/Double;", "p", "()Ljava/lang/Double;", "minTotalOdd", "maxTotalOdd", "", "q", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "giftUsage", "cashOut", "Lo27;", "s", "championRewardList", "topRankingRewardList", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "participantCount", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class xrt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("challengeType")
    private final String challengeType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("topRanking")
    private final int topRanking;

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
    private final Long minStake;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName("minTotalOdd")
    private final Double minTotalOdd;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName("maxTotalOdd")
    private final Double maxTotalOdd;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName("giftUsage")
    private final Boolean giftUsage;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName("cashOut")
    private final Boolean cashOut;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @SerializedName("championRewardList")
    private final List<o27> championRewardList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @SerializedName("topRankingRewardList")
    private final List<o27> topRankingRewardList;

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
        if (!(obj instanceof xrt)) {
            return false;
        }
        xrt xrtVar = (xrt) obj;
        return Intrinsics.g(this.challengeType, xrtVar.challengeType) && this.topRanking == xrtVar.topRanking && Intrinsics.g(this.url, xrtVar.url) && this.lastParticipationTime == xrtVar.lastParticipationTime && Intrinsics.g(this.betCategory, xrtVar.betCategory) && Intrinsics.g(this.betInSpecificRealSportTypeList, xrtVar.betInSpecificRealSportTypeList) && Intrinsics.g(this.betInSpecificInstantVirtualTypeList, xrtVar.betInSpecificInstantVirtualTypeList) && Intrinsics.g(this.betInSpecificTournamentList, xrtVar.betInSpecificTournamentList) && Intrinsics.g(this.betInSpecificMarketList, xrtVar.betInSpecificMarketList) && Intrinsics.g(this.betTypeList, xrtVar.betTypeList) && Intrinsics.g(this.betBuilderTypeList, xrtVar.betBuilderTypeList) && Intrinsics.g(this.upTypeList, xrtVar.upTypeList) && Intrinsics.g(this.earlyGoalsTypeList, xrtVar.earlyGoalsTypeList) && Intrinsics.g(this.minStake, xrtVar.minStake) && Intrinsics.g(this.minTotalOdd, xrtVar.minTotalOdd) && Intrinsics.g(this.maxTotalOdd, xrtVar.maxTotalOdd) && Intrinsics.g(this.giftUsage, xrtVar.giftUsage) && Intrinsics.g(this.cashOut, xrtVar.cashOut) && Intrinsics.g(this.championRewardList, xrtVar.championRewardList) && Intrinsics.g(this.topRankingRewardList, xrtVar.topRankingRewardList) && Intrinsics.g(this.participantCount, xrtVar.participantCount);
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
        int iA = gmf0.a(f87.a(gmf0.a(gpp.a(this.topRanking, this.challengeType.hashCode() * 31, 31), 31, this.url), this.lastParticipationTime, 31), 31, this.betCategory);
        List<String> list = this.betInSpecificRealSportTypeList;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.betInSpecificInstantVirtualTypeList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.betInSpecificTournamentList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.betInSpecificMarketList;
        int iA2 = ai50.a((iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.betTypeList);
        List<String> list5 = this.betBuilderTypeList;
        int iHashCode4 = (iA2 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.upTypeList;
        int iHashCode5 = (iHashCode4 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.earlyGoalsTypeList;
        int iHashCode6 = (iHashCode5 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Long l = this.minStake;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.minTotalOdd;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.maxTotalOdd;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.giftUsage;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cashOut;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<o27> list8 = this.championRewardList;
        int iHashCode12 = (iHashCode11 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<o27> list9 = this.topRankingRewardList;
        int iHashCode13 = (iHashCode12 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Integer num = this.participantCount;
        return iHashCode13 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getChallengeType() {
        return this.challengeType;
    }

    public final List<o27> j() {
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
    public final Double getMaxTotalOdd() {
        return this.maxTotalOdd;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Double getMinTotalOdd() {
        return this.minTotalOdd;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getParticipantCount() {
        return this.participantCount;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTopRanking() {
        return this.topRanking;
    }

    public final List<o27> s() {
        return this.topRankingRewardList;
    }

    public final List<String> t() {
        return this.upTypeList;
    }

    public final String toString() {
        String str = this.challengeType;
        int i = this.topRanking;
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
        Long l = this.minStake;
        Double d = this.minTotalOdd;
        Double d2 = this.maxTotalOdd;
        Boolean bool = this.giftUsage;
        Boolean bool2 = this.cashOut;
        List<o27> list9 = this.championRewardList;
        List<o27> list10 = this.topRankingRewardList;
        Integer num = this.participantCount;
        StringBuilder sbA = ml5.a(i, "LoyaltyChallengeConfigParameterDto(challengeType=", str, ", topRanking=", ", url=");
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
        sbA.append(l);
        lsv.a(d, d2, ", minTotalOdd=", ", maxTotalOdd=", sbA);
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
