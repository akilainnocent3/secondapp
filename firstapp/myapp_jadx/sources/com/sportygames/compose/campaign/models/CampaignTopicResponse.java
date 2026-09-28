package com.sportygames.compose.campaign.models;

import com.appsflyer.internal.m;
import defpackage.d5d;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.tvh;
import defpackage.uqe0;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u0095\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\rHÆ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0012\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010(R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010(R\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010-¨\u0006A"}, d2 = {"Lcom/sportygames/compose/campaign/models/CampaignTopicResponse;", "", "campaignId", "", "campaignStatus", "", "userActivityStatus", "giftCount", "userId", "tierLevel", "isLastCampaignTier", "", "tierProgress", "", "campaignTierId", "messageType", "timeStamp", "", "tierUpgraded", "campaignCompletedJustNow", "lastProgress", "<init>", "(ILjava/lang/String;Ljava/lang/String;IIIZFILjava/lang/String;JZZF)V", "getCampaignId", "()I", "getCampaignStatus", "()Ljava/lang/String;", "getUserActivityStatus", "getGiftCount", "getUserId", "getTierLevel", "()Z", "getTierProgress", "()F", "getCampaignTierId", "getMessageType", "getTimeStamp", "()J", "getTierUpgraded", "setTierUpgraded", "(Z)V", "getCampaignCompletedJustNow", "setCampaignCompletedJustNow", "getLastProgress", "setLastProgress", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignTopicResponse {
    public static final int $stable = 8;
    private boolean campaignCompletedJustNow;
    private final int campaignId;
    private final String campaignStatus;
    private final int campaignTierId;
    private final int giftCount;
    private final boolean isLastCampaignTier;
    private float lastProgress;
    private final String messageType;
    private final int tierLevel;
    private final float tierProgress;
    private boolean tierUpgraded;
    private final long timeStamp;
    private final String userActivityStatus;
    private final int userId;

    public /* synthetic */ CampaignTopicResponse(int i, String str, String str2, int i2, int i3, int i4, boolean z, float f, int i5, String str3, long j, boolean z2, boolean z3, float f2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, i3, i4, z, f, i5, str3, j, (i6 & 2048) != 0 ? false : z2, (i6 & 4096) != 0 ? false : z3, (i6 & 8192) != 0 ? 0.0f : f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getTierUpgraded() {
        return this.tierUpgraded;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getCampaignCompletedJustNow() {
        return this.campaignCompletedJustNow;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getLastProgress() {
        return this.lastProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCampaignStatus() {
        return this.campaignStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserActivityStatus() {
        return this.userActivityStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGiftCount() {
        return this.giftCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTierLevel() {
        return this.tierLevel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLastCampaignTier() {
        return this.isLastCampaignTier;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getTierProgress() {
        return this.tierProgress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCampaignTierId() {
        return this.campaignTierId;
    }

    public final CampaignTopicResponse copy(int campaignId, String campaignStatus, String userActivityStatus, int giftCount, int userId, int tierLevel, boolean isLastCampaignTier, float tierProgress, int campaignTierId, String messageType, long timeStamp, boolean tierUpgraded, boolean campaignCompletedJustNow, float lastProgress) {
        campaignStatus.getClass();
        userActivityStatus.getClass();
        messageType.getClass();
        return new CampaignTopicResponse(campaignId, campaignStatus, userActivityStatus, giftCount, userId, tierLevel, isLastCampaignTier, tierProgress, campaignTierId, messageType, timeStamp, tierUpgraded, campaignCompletedJustNow, lastProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignTopicResponse)) {
            return false;
        }
        CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) other;
        return this.campaignId == campaignTopicResponse.campaignId && Intrinsics.g(this.campaignStatus, campaignTopicResponse.campaignStatus) && Intrinsics.g(this.userActivityStatus, campaignTopicResponse.userActivityStatus) && this.giftCount == campaignTopicResponse.giftCount && this.userId == campaignTopicResponse.userId && this.tierLevel == campaignTopicResponse.tierLevel && this.isLastCampaignTier == campaignTopicResponse.isLastCampaignTier && Float.compare(this.tierProgress, campaignTopicResponse.tierProgress) == 0 && this.campaignTierId == campaignTopicResponse.campaignTierId && Intrinsics.g(this.messageType, campaignTopicResponse.messageType) && this.timeStamp == campaignTopicResponse.timeStamp && this.tierUpgraded == campaignTopicResponse.tierUpgraded && this.campaignCompletedJustNow == campaignTopicResponse.campaignCompletedJustNow && Float.compare(this.lastProgress, campaignTopicResponse.lastProgress) == 0;
    }

    public final boolean getCampaignCompletedJustNow() {
        return this.campaignCompletedJustNow;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final String getCampaignStatus() {
        return this.campaignStatus;
    }

    public final int getCampaignTierId() {
        return this.campaignTierId;
    }

    public final int getGiftCount() {
        return this.giftCount;
    }

    public final float getLastProgress() {
        return this.lastProgress;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final int getTierLevel() {
        return this.tierLevel;
    }

    public final float getTierProgress() {
        return this.tierProgress;
    }

    public final boolean getTierUpgraded() {
        return this.tierUpgraded;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUserActivityStatus() {
        return this.userActivityStatus;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Float.hashCode(this.lastProgress) + mtg0.a(mtg0.a(f87.a(gmf0.a(gpp.a(this.campaignTierId, tvh.a(this.tierProgress, mtg0.a(gpp.a(this.tierLevel, gpp.a(this.userId, gpp.a(this.giftCount, gmf0.a(gmf0.a(Integer.hashCode(this.campaignId) * 31, 31, this.campaignStatus), 31, this.userActivityStatus), 31), 31), 31), 31, this.isLastCampaignTier), 31), 31), 31, this.messageType), this.timeStamp, 31), 31, this.tierUpgraded), 31, this.campaignCompletedJustNow);
    }

    public final boolean isLastCampaignTier() {
        return this.isLastCampaignTier;
    }

    public final void setCampaignCompletedJustNow(boolean z) {
        this.campaignCompletedJustNow = z;
    }

    public final void setLastProgress(float f) {
        this.lastProgress = f;
    }

    public final void setTierUpgraded(boolean z) {
        this.tierUpgraded = z;
    }

    public String toString() {
        int i = this.campaignId;
        String str = this.campaignStatus;
        String str2 = this.userActivityStatus;
        int i2 = this.giftCount;
        int i3 = this.userId;
        int i4 = this.tierLevel;
        boolean z = this.isLastCampaignTier;
        float f = this.tierProgress;
        int i5 = this.campaignTierId;
        String str3 = this.messageType;
        long j = this.timeStamp;
        boolean z2 = this.tierUpgraded;
        boolean z3 = this.campaignCompletedJustNow;
        float f2 = this.lastProgress;
        StringBuilder sbA = uqe0.a(i, "CampaignTopicResponse(campaignId=", ", campaignStatus=", str, ", userActivityStatus=");
        wxa.b(i2, str2, ", giftCount=", ", userId=", sbA);
        d5d.a(sbA, i3, ", tierLevel=", i4, ", isLastCampaignTier=");
        sbA.append(z);
        sbA.append(", tierProgress=");
        sbA.append(f);
        sbA.append(", campaignTierId=");
        f78.b(i5, ", messageType=", str3, ", timeStamp=", sbA);
        sbA.append(j);
        sbA.append(", tierUpgraded=");
        sbA.append(z2);
        sbA.append(", campaignCompletedJustNow=");
        sbA.append(z3);
        sbA.append(", lastProgress=");
        sbA.append(f2);
        sbA.append(")");
        return sbA.toString();
    }

    public CampaignTopicResponse(int i, String str, String str2, int i2, int i3, int i4, boolean z, float f, int i5, String str3, long j, boolean z2, boolean z3, float f2) {
        m.a(str, str2, str3);
        this.campaignId = i;
        this.campaignStatus = str;
        this.userActivityStatus = str2;
        this.giftCount = i2;
        this.userId = i3;
        this.tierLevel = i4;
        this.isLastCampaignTier = z;
        this.tierProgress = f;
        this.campaignTierId = i5;
        this.messageType = str3;
        this.timeStamp = j;
        this.tierUpgraded = z2;
        this.campaignCompletedJustNow = z3;
        this.lastProgress = f2;
    }
}
