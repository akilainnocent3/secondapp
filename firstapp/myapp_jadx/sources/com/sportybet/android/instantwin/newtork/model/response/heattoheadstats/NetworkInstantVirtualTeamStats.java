package com.sportybet.android.instantwin.newtork.model.response.heattoheadstats;

import defpackage.d5d;
import defpackage.ew7;
import defpackage.gpp;
import defpackage.tvh;
import defpackage.ux5;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008f\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00105\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$Ê\u0001\f\b8\u0012\b\b9\u0012\u0004\b\u0003\u0010\u0000¨\u00067"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStats;", "", "teamId", "", "teamName", "teamLogoUrl", "probability", "", "rank", "form", "teamSize", "avgPoints", "", "homeAvgScore", "awayAvgScore", "overallAvgScore", "recentMatches", "", "Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsMatchRecord;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFFFFLjava/util/List;)V", "getTeamId", "()Ljava/lang/String;", "getTeamName", "getTeamLogoUrl", "getProbability", "()I", "getRank", "getForm", "getTeamSize", "getAvgPoints", "()F", "getHomeAvgScore", "getAwayAvgScore", "getOverallAvgScore", "getRecentMatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantVirtualTeamStats {
    public static final int $stable = 8;
    private final float avgPoints;
    private final float awayAvgScore;
    private final int form;
    private final float homeAvgScore;
    private final float overallAvgScore;
    private final int probability;
    private final int rank;
    private final List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches;
    private final String teamId;
    private final String teamLogoUrl;
    private final String teamName;
    private final int teamSize;

    public /* synthetic */ NetworkInstantVirtualTeamStats(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) != 0 ? 0.0f : f, (i5 & 256) != 0 ? 0.0f : f2, (i5 & 512) != 0 ? 0.0f : f3, (i5 & 1024) == 0 ? f4 : 0.0f, (i5 & 2048) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantVirtualTeamStats copy$default(NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats, String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = networkInstantVirtualTeamStats.teamId;
        }
        if ((i5 & 2) != 0) {
            str2 = networkInstantVirtualTeamStats.teamName;
        }
        if ((i5 & 4) != 0) {
            str3 = networkInstantVirtualTeamStats.teamLogoUrl;
        }
        if ((i5 & 8) != 0) {
            i = networkInstantVirtualTeamStats.probability;
        }
        if ((i5 & 16) != 0) {
            i2 = networkInstantVirtualTeamStats.rank;
        }
        if ((i5 & 32) != 0) {
            i3 = networkInstantVirtualTeamStats.form;
        }
        if ((i5 & 64) != 0) {
            i4 = networkInstantVirtualTeamStats.teamSize;
        }
        if ((i5 & 128) != 0) {
            f = networkInstantVirtualTeamStats.avgPoints;
        }
        if ((i5 & 256) != 0) {
            f2 = networkInstantVirtualTeamStats.homeAvgScore;
        }
        if ((i5 & 512) != 0) {
            f3 = networkInstantVirtualTeamStats.awayAvgScore;
        }
        if ((i5 & 1024) != 0) {
            f4 = networkInstantVirtualTeamStats.overallAvgScore;
        }
        if ((i5 & 2048) != 0) {
            list = networkInstantVirtualTeamStats.recentMatches;
        }
        float f5 = f4;
        List list2 = list;
        float f6 = f2;
        float f7 = f3;
        int i6 = i4;
        float f8 = f;
        int i7 = i2;
        int i8 = i3;
        return networkInstantVirtualTeamStats.copy(str, str2, str3, i, i7, i8, i6, f8, f6, f7, f5, list2);
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

    public final List<NetworkInstantVirtualTeamStatsMatchRecord> component12() {
        return this.recentMatches;
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

    public final NetworkInstantVirtualTeamStats copy(String teamId, String teamName, String teamLogoUrl, int probability, int rank, int form, int teamSize, float avgPoints, float homeAvgScore, float awayAvgScore, float overallAvgScore, List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches) {
        return new NetworkInstantVirtualTeamStats(teamId, teamName, teamLogoUrl, probability, rank, form, teamSize, avgPoints, homeAvgScore, awayAvgScore, overallAvgScore, recentMatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantVirtualTeamStats)) {
            return false;
        }
        NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats = (NetworkInstantVirtualTeamStats) other;
        return Intrinsics.g(this.teamId, networkInstantVirtualTeamStats.teamId) && Intrinsics.g(this.teamName, networkInstantVirtualTeamStats.teamName) && Intrinsics.g(this.teamLogoUrl, networkInstantVirtualTeamStats.teamLogoUrl) && this.probability == networkInstantVirtualTeamStats.probability && this.rank == networkInstantVirtualTeamStats.rank && this.form == networkInstantVirtualTeamStats.form && this.teamSize == networkInstantVirtualTeamStats.teamSize && Float.compare(this.avgPoints, networkInstantVirtualTeamStats.avgPoints) == 0 && Float.compare(this.homeAvgScore, networkInstantVirtualTeamStats.homeAvgScore) == 0 && Float.compare(this.awayAvgScore, networkInstantVirtualTeamStats.awayAvgScore) == 0 && Float.compare(this.overallAvgScore, networkInstantVirtualTeamStats.overallAvgScore) == 0 && Intrinsics.g(this.recentMatches, networkInstantVirtualTeamStats.recentMatches);
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

    public final List<NetworkInstantVirtualTeamStatsMatchRecord> getRecentMatches() {
        return this.recentMatches;
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
        List<NetworkInstantVirtualTeamStatsMatchRecord> list = this.recentMatches;
        return iA + (list != null ? list.hashCode() : 0);
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
        List<NetworkInstantVirtualTeamStatsMatchRecord> list = this.recentMatches;
        StringBuilder sbA = ux5.a("NetworkInstantVirtualTeamStats(teamId=", str, ", teamName=", str2, ", teamLogoUrl=");
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
        sbA.append(")");
        return sbA.toString();
    }

    public NetworkInstantVirtualTeamStats(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List<NetworkInstantVirtualTeamStatsMatchRecord> list) {
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
    }

    public NetworkInstantVirtualTeamStats() {
        this(null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 4095, null);
    }
}
