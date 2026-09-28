package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.appsflyer.internal.v;
import com.google.gson.annotations.SerializedName;
import defpackage.cv7;
import defpackage.oie;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ°\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR)\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR)\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR)\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R)\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R)\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R)\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b'\u0010#R-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R)\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0013¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001dÊ\u0001\f\b@\u0012\b\bA\u0012\u0004\b\u0003\u0010\u0000¨\u0006?"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;", "", "teamId", "", "teamName", "teamLogoUrl", "probability", "", "rank", "form", "teamSize", "avgPoints", "", "homeAvgScore", "awayAvgScore", "overallAvgScore", "recentMatches", "", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsMatchStats;", "star", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;)V", "getTeamId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTeamName", "getTeamLogoUrl", "getProbability", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRank", "getForm", "getTeamSize", "getAvgPoints", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHomeAvgScore", "getAwayAvgScore", "getOverallAvgScore", "getRecentMatches", "()Ljava/util/List;", "getStar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsTeamStats {
    public static final int $stable = 8;

    @SerializedName("avgPoints")
    private final Float avgPoints;

    @SerializedName("awayAvgScore")
    private final Float awayAvgScore;

    @SerializedName("form")
    private final Integer form;

    @SerializedName("homeAvgScore")
    private final Float homeAvgScore;

    @SerializedName("overallAvgScore")
    private final Float overallAvgScore;

    @SerializedName("probability")
    private final Integer probability;

    @SerializedName("rank")
    private final Integer rank;

    @SerializedName("recentMatches")
    private final List<NetworkSportyLegendsMatchStats> recentMatches;

    @SerializedName("star")
    private final Integer star;

    @SerializedName("teamId")
    private final String teamId;

    @SerializedName("teamLogoUrl")
    private final String teamLogoUrl;

    @SerializedName("teamName")
    private final String teamName;

    @SerializedName("teamSize")
    private final Integer teamSize;

    public NetworkSportyLegendsTeamStats(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Float f, Float f2, Float f3, Float f4, List<NetworkSportyLegendsMatchStats> list, Integer num5) {
        this.teamId = str;
        this.teamName = str2;
        this.teamLogoUrl = str3;
        this.probability = num;
        this.rank = num2;
        this.form = num3;
        this.teamSize = num4;
        this.avgPoints = f;
        this.homeAvgScore = f2;
        this.awayAvgScore = f3;
        this.overallAvgScore = f4;
        this.recentMatches = list;
        this.star = num5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyLegendsTeamStats copy$default(NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Float f, Float f2, Float f3, Float f4, List list, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyLegendsTeamStats.teamId;
        }
        return networkSportyLegendsTeamStats.copy(str, (i & 2) != 0 ? networkSportyLegendsTeamStats.teamName : str2, (i & 4) != 0 ? networkSportyLegendsTeamStats.teamLogoUrl : str3, (i & 8) != 0 ? networkSportyLegendsTeamStats.probability : num, (i & 16) != 0 ? networkSportyLegendsTeamStats.rank : num2, (i & 32) != 0 ? networkSportyLegendsTeamStats.form : num3, (i & 64) != 0 ? networkSportyLegendsTeamStats.teamSize : num4, (i & 128) != 0 ? networkSportyLegendsTeamStats.avgPoints : f, (i & 256) != 0 ? networkSportyLegendsTeamStats.homeAvgScore : f2, (i & 512) != 0 ? networkSportyLegendsTeamStats.awayAvgScore : f3, (i & 1024) != 0 ? networkSportyLegendsTeamStats.overallAvgScore : f4, (i & 2048) != 0 ? networkSportyLegendsTeamStats.recentMatches : list, (i & 4096) != 0 ? networkSportyLegendsTeamStats.star : num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getAwayAvgScore() {
        return this.awayAvgScore;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getOverallAvgScore() {
        return this.overallAvgScore;
    }

    public final List<NetworkSportyLegendsMatchStats> component12() {
        return this.recentMatches;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getStar() {
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
    public final Integer getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getForm() {
        return this.form;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTeamSize() {
        return this.teamSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getAvgPoints() {
        return this.avgPoints;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getHomeAvgScore() {
        return this.homeAvgScore;
    }

    public final NetworkSportyLegendsTeamStats copy(String teamId, String teamName, String teamLogoUrl, Integer probability, Integer rank, Integer form, Integer teamSize, Float avgPoints, Float homeAvgScore, Float awayAvgScore, Float overallAvgScore, List<NetworkSportyLegendsMatchStats> recentMatches, Integer star) {
        return new NetworkSportyLegendsTeamStats(teamId, teamName, teamLogoUrl, probability, rank, form, teamSize, avgPoints, homeAvgScore, awayAvgScore, overallAvgScore, recentMatches, star);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsTeamStats)) {
            return false;
        }
        NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats = (NetworkSportyLegendsTeamStats) other;
        return Intrinsics.g(this.teamId, networkSportyLegendsTeamStats.teamId) && Intrinsics.g(this.teamName, networkSportyLegendsTeamStats.teamName) && Intrinsics.g(this.teamLogoUrl, networkSportyLegendsTeamStats.teamLogoUrl) && Intrinsics.g(this.probability, networkSportyLegendsTeamStats.probability) && Intrinsics.g(this.rank, networkSportyLegendsTeamStats.rank) && Intrinsics.g(this.form, networkSportyLegendsTeamStats.form) && Intrinsics.g(this.teamSize, networkSportyLegendsTeamStats.teamSize) && Intrinsics.g(this.avgPoints, networkSportyLegendsTeamStats.avgPoints) && Intrinsics.g(this.homeAvgScore, networkSportyLegendsTeamStats.homeAvgScore) && Intrinsics.g(this.awayAvgScore, networkSportyLegendsTeamStats.awayAvgScore) && Intrinsics.g(this.overallAvgScore, networkSportyLegendsTeamStats.overallAvgScore) && Intrinsics.g(this.recentMatches, networkSportyLegendsTeamStats.recentMatches) && Intrinsics.g(this.star, networkSportyLegendsTeamStats.star);
    }

    public final Float getAvgPoints() {
        return this.avgPoints;
    }

    public final Float getAwayAvgScore() {
        return this.awayAvgScore;
    }

    public final Integer getForm() {
        return this.form;
    }

    public final Float getHomeAvgScore() {
        return this.homeAvgScore;
    }

    public final Float getOverallAvgScore() {
        return this.overallAvgScore;
    }

    public final Integer getProbability() {
        return this.probability;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final List<NetworkSportyLegendsMatchStats> getRecentMatches() {
        return this.recentMatches;
    }

    public final Integer getStar() {
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

    public final Integer getTeamSize() {
        return this.teamSize;
    }

    public int hashCode() {
        String str = this.teamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.teamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teamLogoUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.probability;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rank;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.form;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.teamSize;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.avgPoints;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.homeAvgScore;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.awayAvgScore;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.overallAvgScore;
        int iHashCode11 = (iHashCode10 + (f4 == null ? 0 : f4.hashCode())) * 31;
        List<NetworkSportyLegendsMatchStats> list = this.recentMatches;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.star;
        return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        String str = this.teamId;
        String str2 = this.teamName;
        String str3 = this.teamLogoUrl;
        Integer num = this.probability;
        Integer num2 = this.rank;
        Integer num3 = this.form;
        Integer num4 = this.teamSize;
        Float f = this.avgPoints;
        Float f2 = this.homeAvgScore;
        Float f3 = this.awayAvgScore;
        Float f4 = this.overallAvgScore;
        List<NetworkSportyLegendsMatchStats> list = this.recentMatches;
        Integer num5 = this.star;
        StringBuilder sbA = ux5.a("NetworkSportyLegendsTeamStats(teamId=", str, ", teamName=", str2, ", teamLogoUrl=");
        oie.a(num, str3, ", probability=", ", rank=", sbA);
        cv7.a(sbA, num2, ", form=", num3, ", teamSize=");
        sbA.append(num4);
        sbA.append(", avgPoints=");
        sbA.append(f);
        sbA.append(", homeAvgScore=");
        sbA.append(f2);
        sbA.append(", awayAvgScore=");
        sbA.append(f3);
        sbA.append(", overallAvgScore=");
        sbA.append(f4);
        sbA.append(", recentMatches=");
        sbA.append(list);
        sbA.append(", star=");
        return v.a(sbA, num5, ")");
    }
}
