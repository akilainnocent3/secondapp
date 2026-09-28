package com.sportygames.common.network.campaign;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j26;
import defpackage.mtg0;
import defpackage.tvh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0015HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J¤\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\t\u0010C\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001f¨\u0006D"}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignsData;", "", "user", "Lcom/sportygames/common/network/campaign/User;", "activeOrPausedCampaignId", "", "campaignStatus", "", "campaignName", "campaignDisplayName", "activeOrPausedCampaignTier", "Lcom/sportygames/common/network/campaign/CampaignsTierData;", "games", "", "newRegistration", "", "maxCampaignWinnings", "", "firstTimeRegistration", "userActivityStatus", "tierProgress", "", "isLastCampaignTier", "rewardType", "<init>", "(Lcom/sportygames/common/network/campaign/User;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/common/network/campaign/CampaignsTierData;Ljava/util/List;ZLjava/lang/Double;ZLjava/lang/String;FZLjava/lang/String;)V", "getUser", "()Lcom/sportygames/common/network/campaign/User;", "getActiveOrPausedCampaignId", "()I", "getCampaignStatus", "()Ljava/lang/String;", "getCampaignName", "getCampaignDisplayName", "getActiveOrPausedCampaignTier", "()Lcom/sportygames/common/network/campaign/CampaignsTierData;", "getGames", "()Ljava/util/List;", "getNewRegistration", "()Z", "getMaxCampaignWinnings", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFirstTimeRegistration", "getUserActivityStatus", "getTierProgress", "()F", "getRewardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lcom/sportygames/common/network/campaign/User;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/common/network/campaign/CampaignsTierData;Ljava/util/List;ZLjava/lang/Double;ZLjava/lang/String;FZLjava/lang/String;)Lcom/sportygames/common/network/campaign/CampaignsData;", "equals", "other", "hashCode", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignsData {
    private final int activeOrPausedCampaignId;
    private final CampaignsTierData activeOrPausedCampaignTier;
    private final String campaignDisplayName;
    private final String campaignName;
    private final String campaignStatus;
    private final boolean firstTimeRegistration;
    private final List<String> games;
    private final boolean isLastCampaignTier;

    @SerializedName("maxCampaignWinnings")
    private final Double maxCampaignWinnings;
    private final boolean newRegistration;
    private final String rewardType;
    private final float tierProgress;
    private final User user;
    private final String userActivityStatus;

    public CampaignsData(User user, int i, String str, String str2, String str3, CampaignsTierData campaignsTierData, List<String> list, boolean z, Double d, boolean z2, String str4, float f, boolean z3, String str5) {
        user.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        campaignsTierData.getClass();
        list.getClass();
        str4.getClass();
        this.user = user;
        this.activeOrPausedCampaignId = i;
        this.campaignStatus = str;
        this.campaignName = str2;
        this.campaignDisplayName = str3;
        this.activeOrPausedCampaignTier = campaignsTierData;
        this.games = list;
        this.newRegistration = z;
        this.maxCampaignWinnings = d;
        this.firstTimeRegistration = z2;
        this.userActivityStatus = str4;
        this.tierProgress = f;
        this.isLastCampaignTier = z3;
        this.rewardType = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getFirstTimeRegistration() {
        return this.firstTimeRegistration;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserActivityStatus() {
        return this.userActivityStatus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getTierProgress() {
        return this.tierProgress;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsLastCampaignTier() {
        return this.isLastCampaignTier;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getActiveOrPausedCampaignId() {
        return this.activeOrPausedCampaignId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCampaignStatus() {
        return this.campaignStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCampaignName() {
        return this.campaignName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCampaignDisplayName() {
        return this.campaignDisplayName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CampaignsTierData getActiveOrPausedCampaignTier() {
        return this.activeOrPausedCampaignTier;
    }

    public final List<String> component7() {
        return this.games;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getNewRegistration() {
        return this.newRegistration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getMaxCampaignWinnings() {
        return this.maxCampaignWinnings;
    }

    public final CampaignsData copy(User user, int activeOrPausedCampaignId, String campaignStatus, String campaignName, String campaignDisplayName, CampaignsTierData activeOrPausedCampaignTier, List<String> games, boolean newRegistration, Double maxCampaignWinnings, boolean firstTimeRegistration, String userActivityStatus, float tierProgress, boolean isLastCampaignTier, String rewardType) {
        user.getClass();
        campaignStatus.getClass();
        campaignName.getClass();
        campaignDisplayName.getClass();
        activeOrPausedCampaignTier.getClass();
        games.getClass();
        userActivityStatus.getClass();
        return new CampaignsData(user, activeOrPausedCampaignId, campaignStatus, campaignName, campaignDisplayName, activeOrPausedCampaignTier, games, newRegistration, maxCampaignWinnings, firstTimeRegistration, userActivityStatus, tierProgress, isLastCampaignTier, rewardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignsData)) {
            return false;
        }
        CampaignsData campaignsData = (CampaignsData) other;
        return Intrinsics.g(this.user, campaignsData.user) && this.activeOrPausedCampaignId == campaignsData.activeOrPausedCampaignId && Intrinsics.g(this.campaignStatus, campaignsData.campaignStatus) && Intrinsics.g(this.campaignName, campaignsData.campaignName) && Intrinsics.g(this.campaignDisplayName, campaignsData.campaignDisplayName) && Intrinsics.g(this.activeOrPausedCampaignTier, campaignsData.activeOrPausedCampaignTier) && Intrinsics.g(this.games, campaignsData.games) && this.newRegistration == campaignsData.newRegistration && Intrinsics.g(this.maxCampaignWinnings, campaignsData.maxCampaignWinnings) && this.firstTimeRegistration == campaignsData.firstTimeRegistration && Intrinsics.g(this.userActivityStatus, campaignsData.userActivityStatus) && Float.compare(this.tierProgress, campaignsData.tierProgress) == 0 && this.isLastCampaignTier == campaignsData.isLastCampaignTier && Intrinsics.g(this.rewardType, campaignsData.rewardType);
    }

    public final int getActiveOrPausedCampaignId() {
        return this.activeOrPausedCampaignId;
    }

    public final CampaignsTierData getActiveOrPausedCampaignTier() {
        return this.activeOrPausedCampaignTier;
    }

    public final String getCampaignDisplayName() {
        return this.campaignDisplayName;
    }

    public final String getCampaignName() {
        return this.campaignName;
    }

    public final String getCampaignStatus() {
        return this.campaignStatus;
    }

    public final boolean getFirstTimeRegistration() {
        return this.firstTimeRegistration;
    }

    public final List<String> getGames() {
        return this.games;
    }

    public final Double getMaxCampaignWinnings() {
        return this.maxCampaignWinnings;
    }

    public final boolean getNewRegistration() {
        return this.newRegistration;
    }

    public final String getRewardType() {
        return this.rewardType;
    }

    public final float getTierProgress() {
        return this.tierProgress;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserActivityStatus() {
        return this.userActivityStatus;
    }

    public int hashCode() {
        int iA = mtg0.a(ai50.a((this.activeOrPausedCampaignTier.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.activeOrPausedCampaignId, this.user.hashCode() * 31, 31), 31, this.campaignStatus), 31, this.campaignName), 31, this.campaignDisplayName)) * 31, 31, this.games), 31, this.newRegistration);
        Double d = this.maxCampaignWinnings;
        int iA2 = mtg0.a(tvh.a(this.tierProgress, gmf0.a(mtg0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.firstTimeRegistration), 31, this.userActivityStatus), 31), 31, this.isLastCampaignTier);
        String str = this.rewardType;
        return iA2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isLastCampaignTier() {
        return this.isLastCampaignTier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignsData(user=");
        sb.append(this.user);
        sb.append(", activeOrPausedCampaignId=");
        sb.append(this.activeOrPausedCampaignId);
        sb.append(", campaignStatus=");
        sb.append(this.campaignStatus);
        sb.append(", campaignName=");
        sb.append(this.campaignName);
        sb.append(", campaignDisplayName=");
        sb.append(this.campaignDisplayName);
        sb.append(", activeOrPausedCampaignTier=");
        sb.append(this.activeOrPausedCampaignTier);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", newRegistration=");
        sb.append(this.newRegistration);
        sb.append(", maxCampaignWinnings=");
        sb.append(this.maxCampaignWinnings);
        sb.append(", firstTimeRegistration=");
        sb.append(this.firstTimeRegistration);
        sb.append(", userActivityStatus=");
        sb.append(this.userActivityStatus);
        sb.append(", tierProgress=");
        sb.append(this.tierProgress);
        sb.append(", isLastCampaignTier=");
        sb.append(this.isLastCampaignTier);
        sb.append(", rewardType=");
        return j26.a(sb, this.rewardType, ')');
    }

    public /* synthetic */ CampaignsData(User user, int i, String str, String str2, String str3, CampaignsTierData campaignsTierData, List list, boolean z, Double d, boolean z2, String str4, float f, boolean z3, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, i, str, str2, str3, campaignsTierData, list, z, (i2 & 256) != 0 ? null : d, z2, str4, f, z3, (i2 & 8192) != 0 ? null : str5);
    }
}
