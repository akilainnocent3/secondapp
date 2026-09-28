package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.d5d;
import defpackage.ew7;
import defpackage.gpp;
import defpackage.tvh;
import defpackage.ux5;
import defpackage.wxa;
import defpackage.zk1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR%\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR%\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR%\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR%\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R%\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R%\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R%\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dÊ\u0001\f\b=\u0012\b\b>\u0012\u0004\b\u0003\u0010\u0000¨\u0006<"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyStatsTeamInfo;", "", "teamId", "", "teamName", "teamLogoUrl", "probability", "", "rank", "form", "teamSize", "avgPoints", "", "homeAvgScore", "awayAvgScore", "overallAvgScore", "recentMatches", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyStatsMatchRecord;", "star", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFFFFLjava/util/List;I)V", "getTeamId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTeamName", "getTeamLogoUrl", "getProbability", "()I", "getRank", "getForm", "getTeamSize", "getAvgPoints", "()F", "getHomeAvgScore", "getAwayAvgScore", "getOverallAvgScore", "getRecentMatches", "()Ljava/util/List;", "getStar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyStatsTeamInfo {
    public static final int $stable = 8;

    @SerializedName("avgPoints")
    private final float avgPoints;

    @SerializedName("awayAvgScore")
    private final float awayAvgScore;

    @SerializedName("form")
    private final int form;

    @SerializedName("homeAvgScore")
    private final float homeAvgScore;

    @SerializedName("overallAvgScore")
    private final float overallAvgScore;

    @SerializedName("probability")
    private final int probability;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("recentMatches")
    private final List<NetworkSportyPenaltyStatsMatchRecord> recentMatches;

    @SerializedName("star")
    private final int star;

    @SerializedName("teamId")
    private final String teamId;

    @SerializedName("teamLogoUrl")
    private final String teamLogoUrl;

    @SerializedName("teamName")
    private final String teamName;

    @SerializedName("teamSize")
    private final int teamSize;

    public NetworkSportyPenaltyStatsTeamInfo(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List<NetworkSportyPenaltyStatsMatchRecord> list, int i5) {
        this.teamId = str;
        this.teamName = str2;
        this.teamLogoUrl = str3;
        this.probability = i;
        this.rank = i2;
        this.form = i3;
        this.teamSize = i4;
        this.avgPoints = f;
        this.homeAvgScore = f2;
        this.awayAvgScore = f3;
        this.overallAvgScore = f4;
        this.recentMatches = list;
        this.star = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltyStatsTeamInfo copy$default(NetworkSportyPenaltyStatsTeamInfo networkSportyPenaltyStatsTeamInfo, String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List list, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = networkSportyPenaltyStatsTeamInfo.teamId;
        }
        return networkSportyPenaltyStatsTeamInfo.copy(str, (i6 & 2) != 0 ? networkSportyPenaltyStatsTeamInfo.teamName : str2, (i6 & 4) != 0 ? networkSportyPenaltyStatsTeamInfo.teamLogoUrl : str3, (i6 & 8) != 0 ? networkSportyPenaltyStatsTeamInfo.probability : i, (i6 & 16) != 0 ? networkSportyPenaltyStatsTeamInfo.rank : i2, (i6 & 32) != 0 ? networkSportyPenaltyStatsTeamInfo.form : i3, (i6 & 64) != 0 ? networkSportyPenaltyStatsTeamInfo.teamSize : i4, (i6 & 128) != 0 ? networkSportyPenaltyStatsTeamInfo.avgPoints : f, (i6 & 256) != 0 ? networkSportyPenaltyStatsTeamInfo.homeAvgScore : f2, (i6 & 512) != 0 ? networkSportyPenaltyStatsTeamInfo.awayAvgScore : f3, (i6 & 1024) != 0 ? networkSportyPenaltyStatsTeamInfo.overallAvgScore : f4, (i6 & 2048) != 0 ? networkSportyPenaltyStatsTeamInfo.recentMatches : list, (i6 & 4096) != 0 ? networkSportyPenaltyStatsTeamInfo.star : i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getAwayAvgScore() {
        return this.awayAvgScore;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getOverallAvgScore() {
        return this.overallAvgScore;
    }

    public final List<NetworkSportyPenaltyStatsMatchRecord> component12() {
        return this.recentMatches;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getStar() {
        return this.star;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamLogoUrl() {
        return this.teamLogoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getForm() {
        return this.form;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTeamSize() {
        return this.teamSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getAvgPoints() {
        return this.avgPoints;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getHomeAvgScore() {
        return this.homeAvgScore;
    }

    public final NetworkSportyPenaltyStatsTeamInfo copy(String teamId, String teamName, String teamLogoUrl, int probability, int rank, int form, int teamSize, float avgPoints, float homeAvgScore, float awayAvgScore, float overallAvgScore, List<NetworkSportyPenaltyStatsMatchRecord> recentMatches, int star) {
        return new NetworkSportyPenaltyStatsTeamInfo(teamId, teamName, teamLogoUrl, probability, rank, form, teamSize, avgPoints, homeAvgScore, awayAvgScore, overallAvgScore, recentMatches, star);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyStatsTeamInfo)) {
            return false;
        }
        NetworkSportyPenaltyStatsTeamInfo networkSportyPenaltyStatsTeamInfo = (NetworkSportyPenaltyStatsTeamInfo) other;
        return Intrinsics.g(this.teamId, networkSportyPenaltyStatsTeamInfo.teamId) && Intrinsics.g(this.teamName, networkSportyPenaltyStatsTeamInfo.teamName) && Intrinsics.g(this.teamLogoUrl, networkSportyPenaltyStatsTeamInfo.teamLogoUrl) && this.probability == networkSportyPenaltyStatsTeamInfo.probability && this.rank == networkSportyPenaltyStatsTeamInfo.rank && this.form == networkSportyPenaltyStatsTeamInfo.form && this.teamSize == networkSportyPenaltyStatsTeamInfo.teamSize && Float.compare(this.avgPoints, networkSportyPenaltyStatsTeamInfo.avgPoints) == 0 && Float.compare(this.homeAvgScore, networkSportyPenaltyStatsTeamInfo.homeAvgScore) == 0 && Float.compare(this.awayAvgScore, networkSportyPenaltyStatsTeamInfo.awayAvgScore) == 0 && Float.compare(this.overallAvgScore, networkSportyPenaltyStatsTeamInfo.overallAvgScore) == 0 && Intrinsics.g(this.recentMatches, networkSportyPenaltyStatsTeamInfo.recentMatches) && this.star == networkSportyPenaltyStatsTeamInfo.star;
    }

    public final float getAvgPoints() {
        return this.avgPoints;
    }

    public final float getAwayAvgScore() {
        return this.awayAvgScore;
    }

    public final int getForm() {
        return this.form;
    }

    public final float getHomeAvgScore() {
        return this.homeAvgScore;
    }

    public final float getOverallAvgScore() {
        return this.overallAvgScore;
    }

    public final int getProbability() {
        return this.probability;
    }

    public final int getRank() {
        return this.rank;
    }

    public final List<NetworkSportyPenaltyStatsMatchRecord> getRecentMatches() {
        return this.recentMatches;
    }

    public final int getStar() {
        return this.star;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamLogoUrl() {
        return this.teamLogoUrl;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final int getTeamSize() {
        return this.teamSize;
    }

    public int hashCode() {
        String str = this.teamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.teamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teamLogoUrl;
        int iA = tvh.a(this.overallAvgScore, tvh.a(this.awayAvgScore, tvh.a(this.homeAvgScore, tvh.a(this.avgPoints, gpp.a(this.teamSize, gpp.a(this.form, gpp.a(this.rank, gpp.a(this.probability, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        List<NetworkSportyPenaltyStatsMatchRecord> list = this.recentMatches;
        return Integer.hashCode(this.star) + ((iA + (list != null ? list.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.teamId;
        String str2 = this.teamName;
        String str3 = this.teamLogoUrl;
        int i = this.probability;
        int i2 = this.rank;
        int i3 = this.form;
        int i4 = this.teamSize;
        float f = this.avgPoints;
        float f2 = this.homeAvgScore;
        float f3 = this.awayAvgScore;
        float f4 = this.overallAvgScore;
        List<NetworkSportyPenaltyStatsMatchRecord> list = this.recentMatches;
        int i5 = this.star;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyStatsTeamInfo(teamId=", str, ", teamName=", str2, ", teamLogoUrl=");
        wxa.b(i, str3, ", probability=", ", rank=", sbA);
        d5d.a(sbA, i2, ", form=", i3, ", teamSize=");
        sbA.append(i4);
        sbA.append(", avgPoints=");
        sbA.append(f);
        sbA.append(", homeAvgScore=");
        ew7.b(sbA, f2, ", awayAvgScore=", f3, ", overallAvgScore=");
        sbA.append(f4);
        sbA.append(", recentMatches=");
        sbA.append(list);
        sbA.append(", star=");
        return zk1.a(i5, ")", sbA);
    }
}
