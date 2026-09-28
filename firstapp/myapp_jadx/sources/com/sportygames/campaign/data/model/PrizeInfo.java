package com.sportygames.campaign.data.model;

import defpackage.ekw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/sportygames/campaign/data/model/PrizeInfo;", "", "startRank", "", "endRank", "prize", "", "giftPlanId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;)V", "getStartRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndRank", "getPrize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftPlanId", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;)Lcom/sportygames/campaign/data/model/PrizeInfo;", "equals", "", "other", "hashCode", "toString", "", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrizeInfo {
    public static final int $stable = 8;
    private final Integer endRank;
    private final Object giftPlanId;
    private final Double prize;
    private final Integer startRank;

    public PrizeInfo(Integer num, Integer num2, Double d, Object obj) {
        this.startRank = num;
        this.endRank = num2;
        this.prize = d;
        this.giftPlanId = obj;
    }

    public static /* synthetic */ PrizeInfo copy$default(PrizeInfo prizeInfo, Integer num, Integer num2, Double d, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = prizeInfo.startRank;
        }
        if ((i & 2) != 0) {
            num2 = prizeInfo.endRank;
        }
        if ((i & 4) != 0) {
            d = prizeInfo.prize;
        }
        if ((i & 8) != 0) {
            obj = prizeInfo.giftPlanId;
        }
        return prizeInfo.copy(num, num2, d, obj);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getGiftPlanId() {
        return this.giftPlanId;
    }

    public final PrizeInfo copy(Integer startRank, Integer endRank, Double prize, Object giftPlanId) {
        return new PrizeInfo(startRank, endRank, prize, giftPlanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeInfo)) {
            return false;
        }
        PrizeInfo prizeInfo = (PrizeInfo) other;
        return Intrinsics.g(this.startRank, prizeInfo.startRank) && Intrinsics.g(this.endRank, prizeInfo.endRank) && Intrinsics.g(this.prize, prizeInfo.prize) && Intrinsics.g(this.giftPlanId, prizeInfo.giftPlanId);
    }

    public final Integer getEndRank() {
        return this.endRank;
    }

    public final Object getGiftPlanId() {
        return this.giftPlanId;
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
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Object obj = this.giftPlanId;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrizeInfo(startRank=");
        sb.append(this.startRank);
        sb.append(", endRank=");
        sb.append(this.endRank);
        sb.append(", prize=");
        sb.append(this.prize);
        sb.append(", giftPlanId=");
        return ekw.a(sb, this.giftPlanId, ')');
    }
}
