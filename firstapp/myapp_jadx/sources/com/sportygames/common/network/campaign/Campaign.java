package com.sportygames.common.network.campaign;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.itu;
import defpackage.sa6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010.R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b/\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001a¨\u00062"}, d2 = {"Lcom/sportygames/common/network/campaign/Campaign;", "", "", "currentTierLevel", "Lcom/sportygames/common/network/campaign/CampaignInfo;", "campaign", "", "Lcom/sportygames/common/network/campaign/CampaignTier;", "tiers", "tierIdRecentlyGiftCollected", "Lsa6;", "upcomingGames", "", "totalWinningAmount", "<init>", "(ILcom/sportygames/common/network/campaign/CampaignInfo;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Double;)V", "component1", "()I", "component2", "()Lcom/sportygames/common/network/campaign/CampaignInfo;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/lang/Double;", "copy", "(ILcom/sportygames/common/network/campaign/CampaignInfo;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Double;)Lcom/sportygames/common/network/campaign/Campaign;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentTierLevel", "Lcom/sportygames/common/network/campaign/CampaignInfo;", "getCampaign", "Ljava/util/List;", "getTiers", "Ljava/lang/Integer;", "getTierIdRecentlyGiftCollected", "setTierIdRecentlyGiftCollected", "(Ljava/lang/Integer;)V", "getUpcomingGames", "Ljava/lang/Double;", "getTotalWinningAmount", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Campaign {
    private final CampaignInfo campaign;
    private final int currentTierLevel;
    private Integer tierIdRecentlyGiftCollected;
    private final List<CampaignTier> tiers;

    @SerializedName("totalWinningAmount")
    private final Double totalWinningAmount;

    @SerializedName("upcomingVaultGames")
    private final List<sa6> upcomingGames;

    public Campaign(int i, CampaignInfo campaignInfo, List<CampaignTier> list, Integer num, List<sa6> list2, Double d) {
        campaignInfo.getClass();
        list.getClass();
        this.currentTierLevel = i;
        this.campaign = campaignInfo;
        this.tiers = list;
        this.tierIdRecentlyGiftCollected = num;
        this.upcomingGames = list2;
        this.totalWinningAmount = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Campaign copy$default(Campaign campaign, int i, CampaignInfo campaignInfo, List list, Integer num, List list2, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = campaign.currentTierLevel;
        }
        if ((i2 & 2) != 0) {
            campaignInfo = campaign.campaign;
        }
        if ((i2 & 4) != 0) {
            list = campaign.tiers;
        }
        if ((i2 & 8) != 0) {
            num = campaign.tierIdRecentlyGiftCollected;
        }
        if ((i2 & 16) != 0) {
            list2 = campaign.upcomingGames;
        }
        if ((i2 & 32) != 0) {
            d = campaign.totalWinningAmount;
        }
        List list3 = list2;
        Double d2 = d;
        return campaign.copy(i, campaignInfo, list, num, list3, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentTierLevel() {
        return this.currentTierLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CampaignInfo getCampaign() {
        return this.campaign;
    }

    public final List<CampaignTier> component3() {
        return this.tiers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTierIdRecentlyGiftCollected() {
        return this.tierIdRecentlyGiftCollected;
    }

    public final List<sa6> component5() {
        return this.upcomingGames;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getTotalWinningAmount() {
        return this.totalWinningAmount;
    }

    public final Campaign copy(int currentTierLevel, CampaignInfo campaign, List<CampaignTier> tiers, Integer tierIdRecentlyGiftCollected, List<sa6> upcomingGames, Double totalWinningAmount) {
        campaign.getClass();
        tiers.getClass();
        return new Campaign(currentTierLevel, campaign, tiers, tierIdRecentlyGiftCollected, upcomingGames, totalWinningAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) other;
        return this.currentTierLevel == campaign.currentTierLevel && Intrinsics.g(this.campaign, campaign.campaign) && Intrinsics.g(this.tiers, campaign.tiers) && Intrinsics.g(this.tierIdRecentlyGiftCollected, campaign.tierIdRecentlyGiftCollected) && Intrinsics.g(this.upcomingGames, campaign.upcomingGames) && Intrinsics.g(this.totalWinningAmount, campaign.totalWinningAmount);
    }

    public final CampaignInfo getCampaign() {
        return this.campaign;
    }

    public final int getCurrentTierLevel() {
        return this.currentTierLevel;
    }

    public final Integer getTierIdRecentlyGiftCollected() {
        return this.tierIdRecentlyGiftCollected;
    }

    public final List<CampaignTier> getTiers() {
        return this.tiers;
    }

    public final Double getTotalWinningAmount() {
        return this.totalWinningAmount;
    }

    public final List<sa6> getUpcomingGames() {
        return this.upcomingGames;
    }

    public int hashCode() {
        int iA = ai50.a((this.campaign.hashCode() + (Integer.hashCode(this.currentTierLevel) * 31)) * 31, 31, this.tiers);
        Integer num = this.tierIdRecentlyGiftCollected;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        List<sa6> list = this.upcomingGames;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.totalWinningAmount;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final void setTierIdRecentlyGiftCollected(Integer num) {
        this.tierIdRecentlyGiftCollected = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Campaign(currentTierLevel=");
        sb.append(this.currentTierLevel);
        sb.append(", campaign=");
        sb.append(this.campaign);
        sb.append(", tiers=");
        sb.append(this.tiers);
        sb.append(", tierIdRecentlyGiftCollected=");
        sb.append(this.tierIdRecentlyGiftCollected);
        sb.append(", upcomingGames=");
        sb.append(this.upcomingGames);
        sb.append(", totalWinningAmount=");
        return itu.a(sb, this.totalWinningAmount, ')');
    }

    public /* synthetic */ Campaign(int i, CampaignInfo campaignInfo, List list, Integer num, List list2, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, campaignInfo, list, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : d);
    }
}
