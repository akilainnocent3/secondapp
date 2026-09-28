package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStatsVO;", "", "homeTeam", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;", "awayTeam", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;)V", "getHomeTeam", "()Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStats;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAwayTeam", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsTeamStatsVO {
    public static final int $stable = NetworkSportyLegendsTeamStats.$stable;

    @SerializedName("awayTeam")
    private final NetworkSportyLegendsTeamStats awayTeam;

    @SerializedName("homeTeam")
    private final NetworkSportyLegendsTeamStats homeTeam;

    public NetworkSportyLegendsTeamStatsVO(NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats, NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats2) {
        this.homeTeam = networkSportyLegendsTeamStats;
        this.awayTeam = networkSportyLegendsTeamStats2;
    }

    public static /* synthetic */ NetworkSportyLegendsTeamStatsVO copy$default(NetworkSportyLegendsTeamStatsVO networkSportyLegendsTeamStatsVO, NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats, NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats2, int i, Object obj) {
        if ((i & 1) != 0) {
            networkSportyLegendsTeamStats = networkSportyLegendsTeamStatsVO.homeTeam;
        }
        if ((i & 2) != 0) {
            networkSportyLegendsTeamStats2 = networkSportyLegendsTeamStatsVO.awayTeam;
        }
        return networkSportyLegendsTeamStatsVO.copy(networkSportyLegendsTeamStats, networkSportyLegendsTeamStats2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkSportyLegendsTeamStats getHomeTeam() {
        return this.homeTeam;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkSportyLegendsTeamStats getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkSportyLegendsTeamStatsVO copy(NetworkSportyLegendsTeamStats homeTeam, NetworkSportyLegendsTeamStats awayTeam) {
        return new NetworkSportyLegendsTeamStatsVO(homeTeam, awayTeam);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsTeamStatsVO)) {
            return false;
        }
        NetworkSportyLegendsTeamStatsVO networkSportyLegendsTeamStatsVO = (NetworkSportyLegendsTeamStatsVO) other;
        return Intrinsics.g(this.homeTeam, networkSportyLegendsTeamStatsVO.homeTeam) && Intrinsics.g(this.awayTeam, networkSportyLegendsTeamStatsVO.awayTeam);
    }

    public final NetworkSportyLegendsTeamStats getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkSportyLegendsTeamStats getHomeTeam() {
        return this.homeTeam;
    }

    public int hashCode() {
        NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats = this.homeTeam;
        int iHashCode = (networkSportyLegendsTeamStats == null ? 0 : networkSportyLegendsTeamStats.hashCode()) * 31;
        NetworkSportyLegendsTeamStats networkSportyLegendsTeamStats2 = this.awayTeam;
        return iHashCode + (networkSportyLegendsTeamStats2 != null ? networkSportyLegendsTeamStats2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSportyLegendsTeamStatsVO(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ")";
    }
}
