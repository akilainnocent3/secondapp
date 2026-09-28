package com.sporty.android.core.model.promotion;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/promotion/PromotionInfo;", "", "ongoingCount", "", "activityItemPageable", "Lcom/sporty/android/core/model/promotion/PromotionData;", "<init>", "(ILcom/sporty/android/core/model/promotion/PromotionData;)V", "getOngoingCount", "()I", "getActivityItemPageable", "()Lcom/sporty/android/core/model/promotion/PromotionData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PromotionInfo {
    private final PromotionData activityItemPageable;
    private final int ongoingCount;

    public PromotionInfo(int i, PromotionData promotionData) {
        promotionData.getClass();
        this.ongoingCount = i;
        this.activityItemPageable = promotionData;
    }

    public static /* synthetic */ PromotionInfo copy$default(PromotionInfo promotionInfo, int i, PromotionData promotionData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = promotionInfo.ongoingCount;
        }
        if ((i2 & 2) != 0) {
            promotionData = promotionInfo.activityItemPageable;
        }
        return promotionInfo.copy(i, promotionData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOngoingCount() {
        return this.ongoingCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PromotionData getActivityItemPageable() {
        return this.activityItemPageable;
    }

    public final PromotionInfo copy(int ongoingCount, PromotionData activityItemPageable) {
        activityItemPageable.getClass();
        return new PromotionInfo(ongoingCount, activityItemPageable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionInfo)) {
            return false;
        }
        PromotionInfo promotionInfo = (PromotionInfo) other;
        return this.ongoingCount == promotionInfo.ongoingCount && Intrinsics.g(this.activityItemPageable, promotionInfo.activityItemPageable);
    }

    public final PromotionData getActivityItemPageable() {
        return this.activityItemPageable;
    }

    public final int getOngoingCount() {
        return this.ongoingCount;
    }

    public int hashCode() {
        return this.activityItemPageable.hashCode() + (Integer.hashCode(this.ongoingCount) * 31);
    }

    public String toString() {
        return "PromotionInfo(ongoingCount=" + this.ongoingCount + ", activityItemPageable=" + this.activityItemPageable + ")";
    }
}
