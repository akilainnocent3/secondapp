package com.sportygames.commons.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/sportygames/commons/models/UserPlayInfo;", "", "tournamentId", "", "rank", "", "pointsScore", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;)V", "getTournamentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRank", "()Ljava/lang/Integer;", "setRank", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPointsScore", "()Ljava/lang/Double;", "setPointsScore", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sportygames/commons/models/UserPlayInfo;", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserPlayInfo {
    public static final int $stable = 8;
    private Double pointsScore;
    private Integer rank;
    private final Long tournamentId;

    public UserPlayInfo(Long l, Integer num, Double d) {
        this.tournamentId = l;
        this.rank = num;
        this.pointsScore = d;
    }

    public static /* synthetic */ UserPlayInfo copy$default(UserPlayInfo userPlayInfo, Long l, Integer num, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            l = userPlayInfo.tournamentId;
        }
        if ((i & 2) != 0) {
            num = userPlayInfo.rank;
        }
        if ((i & 4) != 0) {
            d = userPlayInfo.pointsScore;
        }
        return userPlayInfo.copy(l, num, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getPointsScore() {
        return this.pointsScore;
    }

    public final UserPlayInfo copy(Long tournamentId, Integer rank, Double pointsScore) {
        return new UserPlayInfo(tournamentId, rank, pointsScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPlayInfo)) {
            return false;
        }
        UserPlayInfo userPlayInfo = (UserPlayInfo) other;
        return Intrinsics.g(this.tournamentId, userPlayInfo.tournamentId) && Intrinsics.g(this.rank, userPlayInfo.rank) && Intrinsics.g(this.pointsScore, userPlayInfo.pointsScore);
    }

    public final Double getPointsScore() {
        return this.pointsScore;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final Long getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        Long l = this.tournamentId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.rank;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.pointsScore;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final void setPointsScore(Double d) {
        this.pointsScore = d;
    }

    public final void setRank(Integer num) {
        this.rank = num;
    }

    public String toString() {
        return "UserPlayInfo(tournamentId=" + this.tournamentId + ", rank=" + this.rank + ", pointsScore=" + this.pointsScore + ")";
    }
}
