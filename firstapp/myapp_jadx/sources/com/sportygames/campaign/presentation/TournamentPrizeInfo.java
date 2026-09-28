package com.sportygames.campaign.presentation;

import defpackage.itu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/sportygames/campaign/presentation/TournamentPrizeInfo;", "", "startRank", "", "endRank", "prize", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "getStartRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndRank", "getPrize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sportygames/campaign/presentation/TournamentPrizeInfo;", "equals", "", "other", "hashCode", "toString", "", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentPrizeInfo {
    public static final int $stable = 0;
    private final Integer endRank;
    private final Double prize;
    private final Integer startRank;

    public TournamentPrizeInfo(Integer num, Integer num2, Double d) {
        this.startRank = num;
        this.endRank = num2;
        this.prize = d;
    }

    public static /* synthetic */ TournamentPrizeInfo copy$default(TournamentPrizeInfo tournamentPrizeInfo, Integer num, Integer num2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tournamentPrizeInfo.startRank;
        }
        if ((i & 2) != 0) {
            num2 = tournamentPrizeInfo.endRank;
        }
        if ((i & 4) != 0) {
            d = tournamentPrizeInfo.prize;
        }
        return tournamentPrizeInfo.copy(num, num2, d);
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
    public final Double getPrize() {
        return this.prize;
    }

    public final TournamentPrizeInfo copy(Integer startRank, Integer endRank, Double prize) {
        return new TournamentPrizeInfo(startRank, endRank, prize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentPrizeInfo)) {
            return false;
        }
        TournamentPrizeInfo tournamentPrizeInfo = (TournamentPrizeInfo) other;
        return Intrinsics.g(this.startRank, tournamentPrizeInfo.startRank) && Intrinsics.g(this.endRank, tournamentPrizeInfo.endRank) && Intrinsics.g(this.prize, tournamentPrizeInfo.prize);
    }

    public final Integer getEndRank() {
        return this.endRank;
    }

    public final Double getPrize() {
        return this.prize;
    }

    public final Integer getStartRank() {
        return this.startRank;
    }

    public int hashCode() {
        Integer num = this.startRank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.endRank;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.prize;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentPrizeInfo(startRank=");
        sb.append(this.startRank);
        sb.append(", endRank=");
        sb.append(this.endRank);
        sb.append(", prize=");
        return itu.a(sb, this.prize, ')');
    }
}
