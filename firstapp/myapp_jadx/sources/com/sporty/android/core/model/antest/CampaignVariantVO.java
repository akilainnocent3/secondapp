package com.sporty.android.core.model.antest;

import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/antest/CampaignVariantVO;", "", "campaignId", "", "variantId", "variantValue", "", "variantName", "canConvert", "", "expiryTime", "", "<init>", "(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V", "getCampaignId", "()I", "getVariantId", "getVariantValue", "()Ljava/lang/String;", "getVariantName", "getCanConvert", "()Z", "getExpiryTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)Lcom/sporty/android/core/model/antest/CampaignVariantVO;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CampaignVariantVO {
    private final int campaignId;
    private final boolean canConvert;
    private final Long expiryTime;
    private final int variantId;
    private final String variantName;
    private final String variantValue;

    public CampaignVariantVO(int i, int i2, String str, String str2, boolean z, Long l) {
        str.getClass();
        str2.getClass();
        this.campaignId = i;
        this.variantId = i2;
        this.variantValue = str;
        this.variantName = str2;
        this.canConvert = z;
        this.expiryTime = l;
    }

    public static /* synthetic */ CampaignVariantVO copy$default(CampaignVariantVO campaignVariantVO, int i, int i2, String str, String str2, boolean z, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = campaignVariantVO.campaignId;
        }
        if ((i3 & 2) != 0) {
            i2 = campaignVariantVO.variantId;
        }
        if ((i3 & 4) != 0) {
            str = campaignVariantVO.variantValue;
        }
        if ((i3 & 8) != 0) {
            str2 = campaignVariantVO.variantName;
        }
        if ((i3 & 16) != 0) {
            z = campaignVariantVO.canConvert;
        }
        if ((i3 & 32) != 0) {
            l = campaignVariantVO.expiryTime;
        }
        boolean z2 = z;
        Long l2 = l;
        return campaignVariantVO.copy(i, i2, str, str2, z2, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVariantId() {
        return this.variantId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVariantValue() {
        return this.variantValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVariantName() {
        return this.variantName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanConvert() {
        return this.canConvert;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getExpiryTime() {
        return this.expiryTime;
    }

    public final CampaignVariantVO copy(int campaignId, int variantId, String variantValue, String variantName, boolean canConvert, Long expiryTime) {
        variantValue.getClass();
        variantName.getClass();
        return new CampaignVariantVO(campaignId, variantId, variantValue, variantName, canConvert, expiryTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignVariantVO)) {
            return false;
        }
        CampaignVariantVO campaignVariantVO = (CampaignVariantVO) other;
        return this.campaignId == campaignVariantVO.campaignId && this.variantId == campaignVariantVO.variantId && Intrinsics.g(this.variantValue, campaignVariantVO.variantValue) && Intrinsics.g(this.variantName, campaignVariantVO.variantName) && this.canConvert == campaignVariantVO.canConvert && Intrinsics.g(this.expiryTime, campaignVariantVO.expiryTime);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final boolean getCanConvert() {
        return this.canConvert;
    }

    public final Long getExpiryTime() {
        return this.expiryTime;
    }

    public final int getVariantId() {
        return this.variantId;
    }

    public final String getVariantName() {
        return this.variantName;
    }

    public final String getVariantValue() {
        return this.variantValue;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(gmf0.a(gpp.a(this.variantId, Integer.hashCode(this.campaignId) * 31, 31), 31, this.variantValue), 31, this.variantName), 31, this.canConvert);
        Long l = this.expiryTime;
        return iA + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        int i = this.campaignId;
        int i2 = this.variantId;
        String str = this.variantValue;
        String str2 = this.variantName;
        boolean z = this.canConvert;
        Long l = this.expiryTime;
        StringBuilder sbA = dy5.a("CampaignVariantVO(campaignId=", i, i2, ", variantId=", ", variantValue=");
        hxa.c(sbA, str, ", variantName=", str2, ", canConvert=");
        sbA.append(z);
        sbA.append(", expiryTime=");
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }
}
