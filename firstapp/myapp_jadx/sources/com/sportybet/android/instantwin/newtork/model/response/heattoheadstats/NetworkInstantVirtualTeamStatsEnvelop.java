package com.sportybet.android.instantwin.newtork.model.response.heattoheadstats;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsEnvelop;", "", "homeTeam", "Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStats;", "awayTeam", "headToHead", "Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsHeadToHead;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStats;Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStats;Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsHeadToHead;)V", "getHomeTeam", "()Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStats;", "getAwayTeam", "getHeadToHead", "()Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsHeadToHead;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantVirtualTeamStatsEnvelop {
    public static final int $stable;
    private final NetworkInstantVirtualTeamStats awayTeam;
    private final NetworkInstantVirtualTeamStatsHeadToHead headToHead;
    private final NetworkInstantVirtualTeamStats homeTeam;

    static {
        int i = NetworkInstantVirtualTeamStatsHeadToHead.$stable;
        int i2 = NetworkInstantVirtualTeamStats.$stable;
        $stable = i | i2 | i2;
    }

    public /* synthetic */ NetworkInstantVirtualTeamStatsEnvelop(NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats, NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats2, NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : networkInstantVirtualTeamStats, (i & 2) != 0 ? null : networkInstantVirtualTeamStats2, (i & 4) != 0 ? null : networkInstantVirtualTeamStatsHeadToHead);
    }

    public static /* synthetic */ NetworkInstantVirtualTeamStatsEnvelop copy$default(NetworkInstantVirtualTeamStatsEnvelop networkInstantVirtualTeamStatsEnvelop, NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats, NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats2, NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead, int i, Object obj) {
        if ((i & 1) != 0) {
            networkInstantVirtualTeamStats = networkInstantVirtualTeamStatsEnvelop.homeTeam;
        }
        if ((i & 2) != 0) {
            networkInstantVirtualTeamStats2 = networkInstantVirtualTeamStatsEnvelop.awayTeam;
        }
        if ((i & 4) != 0) {
            networkInstantVirtualTeamStatsHeadToHead = networkInstantVirtualTeamStatsEnvelop.headToHead;
        }
        return networkInstantVirtualTeamStatsEnvelop.copy(networkInstantVirtualTeamStats, networkInstantVirtualTeamStats2, networkInstantVirtualTeamStatsHeadToHead);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkInstantVirtualTeamStats getHomeTeam() {
        return this.homeTeam;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkInstantVirtualTeamStats getAwayTeam() {
        return this.awayTeam;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NetworkInstantVirtualTeamStatsHeadToHead getHeadToHead() {
        return this.headToHead;
    }

    public final NetworkInstantVirtualTeamStatsEnvelop copy(NetworkInstantVirtualTeamStats homeTeam, NetworkInstantVirtualTeamStats awayTeam, NetworkInstantVirtualTeamStatsHeadToHead headToHead) {
        return new NetworkInstantVirtualTeamStatsEnvelop(homeTeam, awayTeam, headToHead);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantVirtualTeamStatsEnvelop)) {
            return false;
        }
        NetworkInstantVirtualTeamStatsEnvelop networkInstantVirtualTeamStatsEnvelop = (NetworkInstantVirtualTeamStatsEnvelop) other;
        return Intrinsics.g(this.homeTeam, networkInstantVirtualTeamStatsEnvelop.homeTeam) && Intrinsics.g(this.awayTeam, networkInstantVirtualTeamStatsEnvelop.awayTeam) && Intrinsics.g(this.headToHead, networkInstantVirtualTeamStatsEnvelop.headToHead);
    }

    public final NetworkInstantVirtualTeamStats getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkInstantVirtualTeamStatsHeadToHead getHeadToHead() {
        return this.headToHead;
    }

    public final NetworkInstantVirtualTeamStats getHomeTeam() {
        return this.homeTeam;
    }

    public int hashCode() {
        NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats = this.homeTeam;
        int iHashCode = (networkInstantVirtualTeamStats == null ? 0 : networkInstantVirtualTeamStats.hashCode()) * 31;
        NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats2 = this.awayTeam;
        int iHashCode2 = (iHashCode + (networkInstantVirtualTeamStats2 == null ? 0 : networkInstantVirtualTeamStats2.hashCode())) * 31;
        NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead = this.headToHead;
        return iHashCode2 + (networkInstantVirtualTeamStatsHeadToHead != null ? networkInstantVirtualTeamStatsHeadToHead.hashCode() : 0);
    }

    public String toString() {
        return "NetworkInstantVirtualTeamStatsEnvelop(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", headToHead=" + this.headToHead + ")";
    }

    public NetworkInstantVirtualTeamStatsEnvelop(NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats, NetworkInstantVirtualTeamStats networkInstantVirtualTeamStats2, NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead) {
        this.homeTeam = networkInstantVirtualTeamStats;
        this.awayTeam = networkInstantVirtualTeamStats2;
        this.headToHead = networkInstantVirtualTeamStatsHeadToHead;
    }

    public NetworkInstantVirtualTeamStatsEnvelop() {
        this(null, null, null, 7, null);
    }
}
