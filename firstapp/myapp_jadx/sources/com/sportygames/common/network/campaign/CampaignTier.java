package com.sportygames.common.network.campaign;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.h46;
import defpackage.rjk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b$\u0010\u001dR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignTier;", "", "", "tierLevel", "tierGiftCount", "userGiftCount", "campaignTierId", "", AnalyticsParam.EVENT_STATUS, "", "Lcom/sportygames/common/network/campaign/CampaignTierCriteria;", "criteria", "Lrjk;", "giftDetails", "selectedGame", "Lh46;", "availableGames", "<init>", "(ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lrjk;Ljava/lang/String;Ljava/util/List;)V", "I", "getTierLevel", "()I", "Ljava/lang/Integer;", "getTierGiftCount", "()Ljava/lang/Integer;", "getUserGiftCount", "getCampaignTierId", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Ljava/util/List;", "getCriteria", "()Ljava/util/List;", "Lrjk;", "getGiftDetails", "()Lrjk;", "getSelectedGame", "getAvailableGames", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CampaignTier {

    @SerializedName("availableGames")
    private final List<h46> availableGames;
    private final Integer campaignTierId;
    private final List<CampaignTierCriteria> criteria;

    @SerializedName("giftDetails")
    private final rjk giftDetails;

    @SerializedName("selectedGame")
    private final String selectedGame;
    private final String status;
    private final Integer tierGiftCount;
    private final int tierLevel;
    private final int userGiftCount;

    public CampaignTier(int i, Integer num, int i2, Integer num2, String str, List<CampaignTierCriteria> list, rjk rjkVar, String str2, List<h46> list2) {
        this.tierLevel = i;
        this.tierGiftCount = num;
        this.userGiftCount = i2;
        this.campaignTierId = num2;
        this.status = str;
        this.criteria = list;
        this.giftDetails = rjkVar;
        this.selectedGame = str2;
        this.availableGames = list2;
    }

    public final List<h46> getAvailableGames() {
        return this.availableGames;
    }

    public final Integer getCampaignTierId() {
        return this.campaignTierId;
    }

    public final List<CampaignTierCriteria> getCriteria() {
        return this.criteria;
    }

    public final rjk getGiftDetails() {
        return this.giftDetails;
    }

    public final String getSelectedGame() {
        return this.selectedGame;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getTierGiftCount() {
        return this.tierGiftCount;
    }

    public final int getTierLevel() {
        return this.tierLevel;
    }

    public final int getUserGiftCount() {
        return this.userGiftCount;
    }

    public /* synthetic */ CampaignTier(int i, Integer num, int i2, Integer num2, String str, List list, rjk rjkVar, String str2, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, i2, num2, str, list, rjkVar, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : list2);
    }
}
