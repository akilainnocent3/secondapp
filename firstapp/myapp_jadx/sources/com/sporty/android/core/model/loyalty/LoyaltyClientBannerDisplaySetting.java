package com.sporty.android.core.model.loyalty;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/LoyaltyClientBannerDisplaySetting;", "", "sumOfRewardAmount", "", "bannerPotentialRewardValueDisplay", "", "<init>", "(IZ)V", "getSumOfRewardAmount", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getBannerPotentialRewardValueDisplay", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyClientBannerDisplaySetting {

    @SerializedName("bannerPotentialRewardValueDisplay")
    private final boolean bannerPotentialRewardValueDisplay;

    @SerializedName("sumOfRewardAmount")
    private final int sumOfRewardAmount;

    public LoyaltyClientBannerDisplaySetting(int i, boolean z) {
        this.sumOfRewardAmount = i;
        this.bannerPotentialRewardValueDisplay = z;
    }

    public static /* synthetic */ LoyaltyClientBannerDisplaySetting copy$default(LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loyaltyClientBannerDisplaySetting.sumOfRewardAmount;
        }
        if ((i2 & 2) != 0) {
            z = loyaltyClientBannerDisplaySetting.bannerPotentialRewardValueDisplay;
        }
        return loyaltyClientBannerDisplaySetting.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSumOfRewardAmount() {
        return this.sumOfRewardAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBannerPotentialRewardValueDisplay() {
        return this.bannerPotentialRewardValueDisplay;
    }

    public final LoyaltyClientBannerDisplaySetting copy(int sumOfRewardAmount, boolean bannerPotentialRewardValueDisplay) {
        return new LoyaltyClientBannerDisplaySetting(sumOfRewardAmount, bannerPotentialRewardValueDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyClientBannerDisplaySetting)) {
            return false;
        }
        LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting = (LoyaltyClientBannerDisplaySetting) other;
        return this.sumOfRewardAmount == loyaltyClientBannerDisplaySetting.sumOfRewardAmount && this.bannerPotentialRewardValueDisplay == loyaltyClientBannerDisplaySetting.bannerPotentialRewardValueDisplay;
    }

    public final boolean getBannerPotentialRewardValueDisplay() {
        return this.bannerPotentialRewardValueDisplay;
    }

    public final int getSumOfRewardAmount() {
        return this.sumOfRewardAmount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.bannerPotentialRewardValueDisplay) + (Integer.hashCode(this.sumOfRewardAmount) * 31);
    }

    public String toString() {
        return "LoyaltyClientBannerDisplaySetting(sumOfRewardAmount=" + this.sumOfRewardAmount + ", bannerPotentialRewardValueDisplay=" + this.bannerPotentialRewardValueDisplay + ")";
    }
}
