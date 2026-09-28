package com.sportygames.commons.tournament.model;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import defpackage.hfb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJB\u0010\u0016\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/sportygames/commons/tournament/model/TournamentRankListResponse;", "", "leaderboardRecords", "", "Lcom/sportygames/commons/tournament/model/LeaderboardRecord;", "topRankPoints", "Lcom/sportygames/commons/tournament/model/TopRankPoint;", "tournamentId", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getLeaderboardRecords", "()Ljava/util/List;", "getTopRankPoints", "getTournamentId", "()Ljava/lang/Long;", "setTournamentId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/sportygames/commons/tournament/model/TournamentRankListResponse;", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentRankListResponse {
    public static final int $stable = 8;
    private final List<LeaderboardRecord> leaderboardRecords;
    private final List<TopRankPoint> topRankPoints;
    private Long tournamentId;

    public /* synthetic */ TournamentRankListResponse(List list, List list2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? 0L : l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentRankListResponse copy$default(TournamentRankListResponse tournamentRankListResponse, List list, List list2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tournamentRankListResponse.leaderboardRecords;
        }
        if ((i & 2) != 0) {
            list2 = tournamentRankListResponse.topRankPoints;
        }
        if ((i & 4) != 0) {
            l = tournamentRankListResponse.tournamentId;
        }
        return tournamentRankListResponse.copy(list, list2, l);
    }

    public final List<LeaderboardRecord> component1() {
        return this.leaderboardRecords;
    }

    public final List<TopRankPoint> component2() {
        return this.topRankPoints;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTournamentId() {
        return this.tournamentId;
    }

    public final TournamentRankListResponse copy(List<LeaderboardRecord> leaderboardRecords, List<TopRankPoint> topRankPoints, Long tournamentId) {
        return new TournamentRankListResponse(leaderboardRecords, topRankPoints, tournamentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentRankListResponse)) {
            return false;
        }
        TournamentRankListResponse tournamentRankListResponse = (TournamentRankListResponse) other;
        return Intrinsics.g(this.leaderboardRecords, tournamentRankListResponse.leaderboardRecords) && Intrinsics.g(this.topRankPoints, tournamentRankListResponse.topRankPoints) && Intrinsics.g(this.tournamentId, tournamentRankListResponse.tournamentId);
    }

    public final List<LeaderboardRecord> getLeaderboardRecords() {
        return this.leaderboardRecords;
    }

    public final List<TopRankPoint> getTopRankPoints() {
        return this.topRankPoints;
    }

    public final Long getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        List<LeaderboardRecord> list = this.leaderboardRecords;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopRankPoint> list2 = this.topRankPoints;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.tournamentId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final void setTournamentId(Long l) {
        this.tournamentId = l;
    }

    public String toString() {
        List<LeaderboardRecord> list = this.leaderboardRecords;
        List<TopRankPoint> list2 = this.topRankPoints;
        Long l = this.tournamentId;
        StringBuilder sbA = hfb0.a("TournamentRankListResponse(leaderboardRecords=", ", topRankPoints=", lTGEJfVytU.daEQe, list, list2);
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }

    public TournamentRankListResponse(List<LeaderboardRecord> list, List<TopRankPoint> list2, Long l) {
        this.leaderboardRecords = list;
        this.topRankPoints = list2;
        this.tournamentId = l;
    }
}
