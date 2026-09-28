package com.sporty.android.core.model.antest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/antest/VisitorResVO;", "", "currentRound", "", "campaignStatus", "Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "<init>", "(Ljava/lang/Integer;Lcom/sporty/android/core/model/antest/CampaignStatusEnum;)V", "getCurrentRound", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCampaignStatus", "()Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/sporty/android/core/model/antest/CampaignStatusEnum;)Lcom/sporty/android/core/model/antest/VisitorResVO;", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VisitorResVO {
    private final CampaignStatusEnum campaignStatus;
    private final Integer currentRound;

    public VisitorResVO(Integer num, CampaignStatusEnum campaignStatusEnum) {
        campaignStatusEnum.getClass();
        this.currentRound = num;
        this.campaignStatus = campaignStatusEnum;
    }

    public static /* synthetic */ VisitorResVO copy$default(VisitorResVO visitorResVO, Integer num, CampaignStatusEnum campaignStatusEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            num = visitorResVO.currentRound;
        }
        if ((i & 2) != 0) {
            campaignStatusEnum = visitorResVO.campaignStatus;
        }
        return visitorResVO.copy(num, campaignStatusEnum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentRound() {
        return this.currentRound;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    public final VisitorResVO copy(Integer currentRound, CampaignStatusEnum campaignStatus) {
        campaignStatus.getClass();
        return new VisitorResVO(currentRound, campaignStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisitorResVO)) {
            return false;
        }
        VisitorResVO visitorResVO = (VisitorResVO) other;
        return Intrinsics.g(this.currentRound, visitorResVO.currentRound) && this.campaignStatus == visitorResVO.campaignStatus;
    }

    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    public final Integer getCurrentRound() {
        return this.currentRound;
    }

    public int hashCode() {
        Integer num = this.currentRound;
        return this.campaignStatus.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public String toString() {
        return "VisitorResVO(currentRound=" + this.currentRound + ", campaignStatus=" + this.campaignStatus + ")";
    }
}
