package com.sportybet.android.instantwin.newtork.model.response.heattoheadstats;

import defpackage.d5d;
import defpackage.gpp;
import defpackage.kwi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\nHÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsHeadToHead;", "", "matches", "", "Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsMatchRecord;", "homeTeamWins", "", "awayTeamWins", "draws", "homeTeamHighestWinScore", "", "awayTeamHighestWinScore", "<init>", "(Ljava/util/List;IIILjava/lang/String;Ljava/lang/String;)V", "getMatches", "()Ljava/util/List;", "getHomeTeamWins", "()I", "getAwayTeamWins", "getDraws", "getHomeTeamHighestWinScore", "()Ljava/lang/String;", "getAwayTeamHighestWinScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantVirtualTeamStatsHeadToHead {
    public static final int $stable = 8;
    private final String awayTeamHighestWinScore;
    private final int awayTeamWins;
    private final int draws;
    private final String homeTeamHighestWinScore;
    private final int homeTeamWins;
    private final List<NetworkInstantVirtualTeamStatsMatchRecord> matches;

    public /* synthetic */ NetworkInstantVirtualTeamStatsHeadToHead(List list, int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantVirtualTeamStatsHeadToHead copy$default(NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead, List list, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = networkInstantVirtualTeamStatsHeadToHead.matches;
        }
        if ((i4 & 2) != 0) {
            i = networkInstantVirtualTeamStatsHeadToHead.homeTeamWins;
        }
        if ((i4 & 4) != 0) {
            i2 = networkInstantVirtualTeamStatsHeadToHead.awayTeamWins;
        }
        if ((i4 & 8) != 0) {
            i3 = networkInstantVirtualTeamStatsHeadToHead.draws;
        }
        if ((i4 & 16) != 0) {
            str = networkInstantVirtualTeamStatsHeadToHead.homeTeamHighestWinScore;
        }
        if ((i4 & 32) != 0) {
            str2 = networkInstantVirtualTeamStatsHeadToHead.awayTeamHighestWinScore;
        }
        String str3 = str;
        String str4 = str2;
        return networkInstantVirtualTeamStatsHeadToHead.copy(list, i, i2, i3, str3, str4);
    }

    public final List<NetworkInstantVirtualTeamStatsMatchRecord> component1() {
        return this.matches;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHomeTeamWins() {
        return this.homeTeamWins;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAwayTeamWins() {
        return this.awayTeamWins;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamHighestWinScore() {
        return this.homeTeamHighestWinScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamHighestWinScore() {
        return this.awayTeamHighestWinScore;
    }

    public final NetworkInstantVirtualTeamStatsHeadToHead copy(List<NetworkInstantVirtualTeamStatsMatchRecord> matches, int homeTeamWins, int awayTeamWins, int draws, String homeTeamHighestWinScore, String awayTeamHighestWinScore) {
        return new NetworkInstantVirtualTeamStatsHeadToHead(matches, homeTeamWins, awayTeamWins, draws, homeTeamHighestWinScore, awayTeamHighestWinScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantVirtualTeamStatsHeadToHead)) {
            return false;
        }
        NetworkInstantVirtualTeamStatsHeadToHead networkInstantVirtualTeamStatsHeadToHead = (NetworkInstantVirtualTeamStatsHeadToHead) other;
        return Intrinsics.g(this.matches, networkInstantVirtualTeamStatsHeadToHead.matches) && this.homeTeamWins == networkInstantVirtualTeamStatsHeadToHead.homeTeamWins && this.awayTeamWins == networkInstantVirtualTeamStatsHeadToHead.awayTeamWins && this.draws == networkInstantVirtualTeamStatsHeadToHead.draws && Intrinsics.g(this.homeTeamHighestWinScore, networkInstantVirtualTeamStatsHeadToHead.homeTeamHighestWinScore) && Intrinsics.g(this.awayTeamHighestWinScore, networkInstantVirtualTeamStatsHeadToHead.awayTeamHighestWinScore);
    }

    public final String getAwayTeamHighestWinScore() {
        return this.awayTeamHighestWinScore;
    }

    public final int getAwayTeamWins() {
        return this.awayTeamWins;
    }

    public final int getDraws() {
        return this.draws;
    }

    public final String getHomeTeamHighestWinScore() {
        return this.homeTeamHighestWinScore;
    }

    public final int getHomeTeamWins() {
        return this.homeTeamWins;
    }

    public final List<NetworkInstantVirtualTeamStatsMatchRecord> getMatches() {
        return this.matches;
    }

    public int hashCode() {
        List<NetworkInstantVirtualTeamStatsMatchRecord> list = this.matches;
        int iA = gpp.a(this.draws, gpp.a(this.awayTeamWins, gpp.a(this.homeTeamWins, (list == null ? 0 : list.hashCode()) * 31, 31), 31), 31);
        String str = this.homeTeamHighestWinScore;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayTeamHighestWinScore;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<NetworkInstantVirtualTeamStatsMatchRecord> list = this.matches;
        int i = this.homeTeamWins;
        int i2 = this.awayTeamWins;
        int i3 = this.draws;
        String str = this.homeTeamHighestWinScore;
        String str2 = this.awayTeamHighestWinScore;
        StringBuilder sb = new StringBuilder("NetworkInstantVirtualTeamStatsHeadToHead(matches=");
        sb.append(list);
        sb.append(", homeTeamWins=");
        sb.append(i);
        sb.append(", awayTeamWins=");
        d5d.a(sb, i2, ", draws=", i3, ", homeTeamHighestWinScore=");
        return kwi.a(sb, str, ", awayTeamHighestWinScore=", str2, ")");
    }

    public NetworkInstantVirtualTeamStatsHeadToHead(List<NetworkInstantVirtualTeamStatsMatchRecord> list, int i, int i2, int i3, String str, String str2) {
        this.matches = list;
        this.homeTeamWins = i;
        this.awayTeamWins = i2;
        this.draws = i3;
        this.homeTeamHighestWinScore = str;
        this.awayTeamHighestWinScore = str2;
    }

    public NetworkInstantVirtualTeamStatsHeadToHead() {
        this(null, 0, 0, 0, null, null, 63, null);
    }
}
