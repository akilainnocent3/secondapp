package com.sportygames.campaign.presentation;

import defpackage.itu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/sportygames/campaign/presentation/TournamentUserPlayInfo;", "", "tournamentId", "", "rank", "", "pointsScore", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;)V", "getTournamentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPointsScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sportygames/campaign/presentation/TournamentUserPlayInfo;", "equals", "", "other", "hashCode", "toString", "", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentUserPlayInfo {
    public static final int $stable = 0;
    private final Double pointsScore;
    private final Integer rank;
    private final Long tournamentId;

    public TournamentUserPlayInfo(Long l, Integer num, Double d) {
        this.tournamentId = l;
        this.rank = num;
        this.pointsScore = d;
    }

    public static /* synthetic */ TournamentUserPlayInfo copy$default(TournamentUserPlayInfo tournamentUserPlayInfo, Long l, Integer num, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            l = tournamentUserPlayInfo.tournamentId;
        }
        if ((i & 2) != 0) {
            num = tournamentUserPlayInfo.rank;
        }
        if ((i & 4) != 0) {
            d = tournamentUserPlayInfo.pointsScore;
        }
        return tournamentUserPlayInfo.copy(l, num, d);
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

    public final TournamentUserPlayInfo copy(Long tournamentId, Integer rank, Double pointsScore) {
        return new TournamentUserPlayInfo(tournamentId, rank, pointsScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentUserPlayInfo)) {
            return false;
        }
        TournamentUserPlayInfo tournamentUserPlayInfo = (TournamentUserPlayInfo) other;
        return Intrinsics.g(this.tournamentId, tournamentUserPlayInfo.tournamentId) && Intrinsics.g(this.rank, tournamentUserPlayInfo.rank) && Intrinsics.g(this.pointsScore, tournamentUserPlayInfo.pointsScore);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentUserPlayInfo(tournamentId=");
        sb.append(this.tournamentId);
        sb.append(", rank=");
        sb.append(this.rank);
        sb.append(", pointsScore=");
        return itu.a(sb, this.pointsScore, ')');
    }
}
