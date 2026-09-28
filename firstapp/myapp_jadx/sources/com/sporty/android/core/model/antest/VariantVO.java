package com.sporty.android.core.model.antest;

import defpackage.gpp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/antest/VariantVO;", "", "campaignId", "", "campaignStatus", "Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "variantId", "variantValue", "", "<init>", "(ILcom/sporty/android/core/model/antest/CampaignStatusEnum;ILjava/lang/String;)V", "getCampaignId", "()I", "getCampaignStatus", "()Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "getVariantId", "getVariantValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VariantVO {
    private final int campaignId;
    private final CampaignStatusEnum campaignStatus;
    private final int variantId;
    private final String variantValue;

    public VariantVO(int i, CampaignStatusEnum campaignStatusEnum, int i2, String str) {
        campaignStatusEnum.getClass();
        str.getClass();
        this.campaignId = i;
        this.campaignStatus = campaignStatusEnum;
        this.variantId = i2;
        this.variantValue = str;
    }

    public static /* synthetic */ VariantVO copy$default(VariantVO variantVO, int i, CampaignStatusEnum campaignStatusEnum, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = variantVO.campaignId;
        }
        if ((i3 & 2) != 0) {
            campaignStatusEnum = variantVO.campaignStatus;
        }
        if ((i3 & 4) != 0) {
            i2 = variantVO.variantId;
        }
        if ((i3 & 8) != 0) {
            str = variantVO.variantValue;
        }
        return variantVO.copy(i, campaignStatusEnum, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVariantId() {
        return this.variantId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVariantValue() {
        return this.variantValue;
    }

    public final VariantVO copy(int campaignId, CampaignStatusEnum campaignStatus, int variantId, String variantValue) {
        campaignStatus.getClass();
        variantValue.getClass();
        return new VariantVO(campaignId, campaignStatus, variantId, variantValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantVO)) {
            return false;
        }
        VariantVO variantVO = (VariantVO) other;
        return this.campaignId == variantVO.campaignId && this.campaignStatus == variantVO.campaignStatus && this.variantId == variantVO.variantId && Intrinsics.g(this.variantValue, variantVO.variantValue);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }

    public final int getVariantId() {
        return this.variantId;
    }

    public final String getVariantValue() {
        return this.variantValue;
    }

    public int hashCode() {
        return this.variantValue.hashCode() + gpp.a(this.variantId, (this.campaignStatus.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31, 31);
    }

    public String toString() {
        return "VariantVO(campaignId=" + this.campaignId + ", campaignStatus=" + this.campaignStatus + ", variantId=" + this.variantId + ", variantValue=" + this.variantValue + ")";
    }
}
