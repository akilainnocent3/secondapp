package com.sporty.android.core.model.antest;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/antest/ConversionResVO;", "", "campaignStatus", "Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "<init>", "(Lcom/sporty/android/core/model/antest/CampaignStatusEnum;)V", "getCampaignStatus", "()Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ConversionResVO {
    private final CampaignStatusEnum campaignStatus;

    public ConversionResVO(CampaignStatusEnum campaignStatusEnum) {
        campaignStatusEnum.getClass();
        this.campaignStatus = campaignStatusEnum;
    }

    public static /* synthetic */ ConversionResVO copy$default(ConversionResVO conversionResVO, CampaignStatusEnum campaignStatusEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            campaignStatusEnum = conversionResVO.campaignStatus;
        }
        return conversionResVO.copy(campaignStatusEnum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    public final ConversionResVO copy(CampaignStatusEnum campaignStatus) {
        campaignStatus.getClass();
        return new ConversionResVO(campaignStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConversionResVO) && this.campaignStatus == ((ConversionResVO) other).campaignStatus;
    }

    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    public int hashCode() {
        return this.campaignStatus.hashCode();
    }

    public String toString() {
        return "ConversionResVO(campaignStatus=" + this.campaignStatus + ")";
    }
}
