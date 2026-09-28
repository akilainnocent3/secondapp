package com.sportygames.commons.tournament.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/sportygames/commons/tournament/model/TopRankPoint;", "", "startRank", "", "endRank", "startPoints", "", "endPoints", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getStartRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndRank", "getStartPoints", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEndPoints", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/commons/tournament/model/TopRankPoint;", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopRankPoint {
    public static final int $stable = 0;
    private final Double endPoints;
    private final Integer endRank;
    private final Double startPoints;
    private final Integer startRank;

    public TopRankPoint(Integer num, Integer num2, Double d, Double d2) {
        this.startRank = num;
        this.endRank = num2;
        this.startPoints = d;
        this.endPoints = d2;
    }

    public static /* synthetic */ TopRankPoint copy$default(TopRankPoint topRankPoint, Integer num, Integer num2, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = topRankPoint.startRank;
        }
        if ((i & 2) != 0) {
            num2 = topRankPoint.endRank;
        }
        if ((i & 4) != 0) {
            d = topRankPoint.startPoints;
        }
        if ((i & 8) != 0) {
            d2 = topRankPoint.endPoints;
        }
        return topRankPoint.copy(num, num2, d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStartRank() {
        return this.startRank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getEndRank() {
        return this.endRank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStartPoints() {
        return this.startPoints;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getEndPoints() {
        return this.endPoints;
    }

    public final TopRankPoint copy(Integer startRank, Integer endRank, Double startPoints, Double endPoints) {
        return new TopRankPoint(startRank, endRank, startPoints, endPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopRankPoint)) {
            return false;
        }
        TopRankPoint topRankPoint = (TopRankPoint) other;
        return Intrinsics.g(this.startRank, topRankPoint.startRank) && Intrinsics.g(this.endRank, topRankPoint.endRank) && Intrinsics.g(this.startPoints, topRankPoint.startPoints) && Intrinsics.g(this.endPoints, topRankPoint.endPoints);
    }

    public final Double getEndPoints() {
        return this.endPoints;
    }

    public final Integer getEndRank() {
        return this.endRank;
    }

    public final Double getStartPoints() {
        return this.startPoints;
    }

    public final Integer getStartRank() {
        return this.startRank;
    }

    public int hashCode() {
        Integer num = this.startRank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.endRank;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.startPoints;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.endPoints;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "TopRankPoint(startRank=" + this.startRank + ", endRank=" + this.endRank + ", startPoints=" + this.startPoints + ", endPoints=" + this.endPoints + ")";
    }
}
