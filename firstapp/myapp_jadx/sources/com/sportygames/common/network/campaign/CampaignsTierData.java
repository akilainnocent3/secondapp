package com.sportygames.common.network.campaign;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.rr1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignsTierData;", "", AnalyticsParam.EVENT_PARAM_ID, "", "campaignId", "giftPlanId", "", "tierLevel", "maxUserCount", AnalyticsParam.EVENT_STATUS, "<init>", "(IILjava/lang/String;III)V", "getId", "()I", "getCampaignId", "getGiftPlanId", "()Ljava/lang/String;", "getTierLevel", "getMaxUserCount", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignsTierData {
    private final int campaignId;
    private final String giftPlanId;
    private final int id;
    private final int maxUserCount;
    private final int status;
    private final int tierLevel;

    public CampaignsTierData(int i, int i2, String str, int i3, int i4, int i5) {
        str.getClass();
        this.id = i;
        this.campaignId = i2;
        this.giftPlanId = str;
        this.tierLevel = i3;
        this.maxUserCount = i4;
        this.status = i5;
    }

    public static /* synthetic */ CampaignsTierData copy$default(CampaignsTierData campaignsTierData, int i, int i2, String str, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = campaignsTierData.id;
        }
        if ((i6 & 2) != 0) {
            i2 = campaignsTierData.campaignId;
        }
        if ((i6 & 4) != 0) {
            str = campaignsTierData.giftPlanId;
        }
        if ((i6 & 8) != 0) {
            i3 = campaignsTierData.tierLevel;
        }
        if ((i6 & 16) != 0) {
            i4 = campaignsTierData.maxUserCount;
        }
        if ((i6 & 32) != 0) {
            i5 = campaignsTierData.status;
        }
        int i7 = i4;
        int i8 = i5;
        return campaignsTierData.copy(i, i2, str, i3, i7, i8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGiftPlanId() {
        return this.giftPlanId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTierLevel() {
        return this.tierLevel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxUserCount() {
        return this.maxUserCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final CampaignsTierData copy(int id, int campaignId, String giftPlanId, int tierLevel, int maxUserCount, int status) {
        giftPlanId.getClass();
        return new CampaignsTierData(id, campaignId, giftPlanId, tierLevel, maxUserCount, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignsTierData)) {
            return false;
        }
        CampaignsTierData campaignsTierData = (CampaignsTierData) other;
        return this.id == campaignsTierData.id && this.campaignId == campaignsTierData.campaignId && Intrinsics.g(this.giftPlanId, campaignsTierData.giftPlanId) && this.tierLevel == campaignsTierData.tierLevel && this.maxUserCount == campaignsTierData.maxUserCount && this.status == campaignsTierData.status;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final String getGiftPlanId() {
        return this.giftPlanId;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMaxUserCount() {
        return this.maxUserCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTierLevel() {
        return this.tierLevel;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + gpp.a(this.maxUserCount, gpp.a(this.tierLevel, gmf0.a(gpp.a(this.campaignId, Integer.hashCode(this.id) * 31, 31), 31, this.giftPlanId), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignsTierData(id=");
        sb.append(this.id);
        sb.append(", campaignId=");
        sb.append(this.campaignId);
        sb.append(", giftPlanId=");
        sb.append(this.giftPlanId);
        sb.append(", tierLevel=");
        sb.append(this.tierLevel);
        sb.append(", maxUserCount=");
        sb.append(this.maxUserCount);
        sb.append(", status=");
        return rr1.b(sb, this.status, ')');
    }
}
