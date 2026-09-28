package com.sporty.android.core.model.loyalty;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.m2g;
import defpackage.mq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/sporty/android/core/model/loyalty/LoyaltyAggregateHintData;", "", "availableMissionCount", "", "availableProgramRewardCount", "availableMissionInfoList", "", "Lcom/sporty/android/core/model/loyalty/LoyaltyMissionInfo;", "loyaltyClientBannerDisplaySetting", "Lcom/sporty/android/core/model/loyalty/LoyaltyClientBannerDisplaySetting;", "availableChallengeCount", "availableChallengeInfoList", "Lcom/sporty/android/core/model/loyalty/ChallengeInfo;", "showChallengeEntrance", "", "<init>", "(IILjava/util/List;Lcom/sporty/android/core/model/loyalty/LoyaltyClientBannerDisplaySetting;ILjava/util/List;Z)V", "getAvailableMissionCount", "()I", "getAvailableProgramRewardCount", "getAvailableMissionInfoList", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLoyaltyClientBannerDisplaySetting", "()Lcom/sporty/android/core/model/loyalty/LoyaltyClientBannerDisplaySetting;", "getAvailableChallengeCount", "getAvailableChallengeInfoList", "getShowChallengeEntrance", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyAggregateHintData {

    @SerializedName("availableChallengeCount")
    private final int availableChallengeCount;

    @SerializedName("availableChallengeInfoList")
    private final List<ChallengeInfo> availableChallengeInfoList;
    private final int availableMissionCount;

    @SerializedName("availableMissionInfoList")
    private final List<LoyaltyMissionInfo> availableMissionInfoList;
    private final int availableProgramRewardCount;

    @SerializedName("loyaltyClientBannerDisplaySetting")
    private final LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting;

    @SerializedName("showChallengeEntrance")
    private final boolean showChallengeEntrance;

    public LoyaltyAggregateHintData(int i, int i2, List list, LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting, int i3, List list2, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, (i4 & 8) != 0 ? null : loyaltyClientBannerDisplaySetting, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? m2g.a : list2, (i4 & 64) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyAggregateHintData copy$default(LoyaltyAggregateHintData loyaltyAggregateHintData, int i, int i2, List list, LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting, int i3, List list2, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = loyaltyAggregateHintData.availableMissionCount;
        }
        if ((i4 & 2) != 0) {
            i2 = loyaltyAggregateHintData.availableProgramRewardCount;
        }
        if ((i4 & 4) != 0) {
            list = loyaltyAggregateHintData.availableMissionInfoList;
        }
        if ((i4 & 8) != 0) {
            loyaltyClientBannerDisplaySetting = loyaltyAggregateHintData.loyaltyClientBannerDisplaySetting;
        }
        if ((i4 & 16) != 0) {
            i3 = loyaltyAggregateHintData.availableChallengeCount;
        }
        if ((i4 & 32) != 0) {
            list2 = loyaltyAggregateHintData.availableChallengeInfoList;
        }
        if ((i4 & 64) != 0) {
            z = loyaltyAggregateHintData.showChallengeEntrance;
        }
        List list3 = list2;
        boolean z2 = z;
        int i5 = i3;
        List list4 = list;
        return loyaltyAggregateHintData.copy(i, i2, list4, loyaltyClientBannerDisplaySetting, i5, list3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvailableMissionCount() {
        return this.availableMissionCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvailableProgramRewardCount() {
        return this.availableProgramRewardCount;
    }

    public final List<LoyaltyMissionInfo> component3() {
        return this.availableMissionInfoList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LoyaltyClientBannerDisplaySetting getLoyaltyClientBannerDisplaySetting() {
        return this.loyaltyClientBannerDisplaySetting;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvailableChallengeCount() {
        return this.availableChallengeCount;
    }

    public final List<ChallengeInfo> component6() {
        return this.availableChallengeInfoList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowChallengeEntrance() {
        return this.showChallengeEntrance;
    }

    public final LoyaltyAggregateHintData copy(int availableMissionCount, int availableProgramRewardCount, List<LoyaltyMissionInfo> availableMissionInfoList, LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting, int availableChallengeCount, List<ChallengeInfo> availableChallengeInfoList, boolean showChallengeEntrance) {
        availableMissionInfoList.getClass();
        availableChallengeInfoList.getClass();
        return new LoyaltyAggregateHintData(availableMissionCount, availableProgramRewardCount, availableMissionInfoList, loyaltyClientBannerDisplaySetting, availableChallengeCount, availableChallengeInfoList, showChallengeEntrance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyAggregateHintData)) {
            return false;
        }
        LoyaltyAggregateHintData loyaltyAggregateHintData = (LoyaltyAggregateHintData) other;
        return this.availableMissionCount == loyaltyAggregateHintData.availableMissionCount && this.availableProgramRewardCount == loyaltyAggregateHintData.availableProgramRewardCount && Intrinsics.g(this.availableMissionInfoList, loyaltyAggregateHintData.availableMissionInfoList) && Intrinsics.g(this.loyaltyClientBannerDisplaySetting, loyaltyAggregateHintData.loyaltyClientBannerDisplaySetting) && this.availableChallengeCount == loyaltyAggregateHintData.availableChallengeCount && Intrinsics.g(this.availableChallengeInfoList, loyaltyAggregateHintData.availableChallengeInfoList) && this.showChallengeEntrance == loyaltyAggregateHintData.showChallengeEntrance;
    }

    public final int getAvailableChallengeCount() {
        return this.availableChallengeCount;
    }

    public final List<ChallengeInfo> getAvailableChallengeInfoList() {
        return this.availableChallengeInfoList;
    }

    public final int getAvailableMissionCount() {
        return this.availableMissionCount;
    }

    public final List<LoyaltyMissionInfo> getAvailableMissionInfoList() {
        return this.availableMissionInfoList;
    }

    public final int getAvailableProgramRewardCount() {
        return this.availableProgramRewardCount;
    }

    public final LoyaltyClientBannerDisplaySetting getLoyaltyClientBannerDisplaySetting() {
        return this.loyaltyClientBannerDisplaySetting;
    }

    public final boolean getShowChallengeEntrance() {
        return this.showChallengeEntrance;
    }

    public int hashCode() {
        int iA = ai50.a(gpp.a(this.availableProgramRewardCount, Integer.hashCode(this.availableMissionCount) * 31, 31), 31, this.availableMissionInfoList);
        LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting = this.loyaltyClientBannerDisplaySetting;
        return Boolean.hashCode(this.showChallengeEntrance) + ai50.a(gpp.a(this.availableChallengeCount, (iA + (loyaltyClientBannerDisplaySetting == null ? 0 : loyaltyClientBannerDisplaySetting.hashCode())) * 31, 31), 31, this.availableChallengeInfoList);
    }

    public String toString() {
        int i = this.availableMissionCount;
        int i2 = this.availableProgramRewardCount;
        List<LoyaltyMissionInfo> list = this.availableMissionInfoList;
        LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting = this.loyaltyClientBannerDisplaySetting;
        int i3 = this.availableChallengeCount;
        List<ChallengeInfo> list2 = this.availableChallengeInfoList;
        boolean z = this.showChallengeEntrance;
        StringBuilder sbA = dy5.a("LoyaltyAggregateHintData(availableMissionCount=", i, i2, ", availableProgramRewardCount=", ", availableMissionInfoList=");
        sbA.append(list);
        sbA.append(", loyaltyClientBannerDisplaySetting=");
        sbA.append(loyaltyClientBannerDisplaySetting);
        sbA.append(", availableChallengeCount=");
        sbA.append(i3);
        sbA.append(", availableChallengeInfoList=");
        sbA.append(list2);
        sbA.append(", showChallengeEntrance=");
        return mq0.a(sbA, z, ")");
    }

    public LoyaltyAggregateHintData(int i, int i2, List<LoyaltyMissionInfo> list, LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting, int i3, List<ChallengeInfo> list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.availableMissionCount = i;
        this.availableProgramRewardCount = i2;
        this.availableMissionInfoList = list;
        this.loyaltyClientBannerDisplaySetting = loyaltyClientBannerDisplaySetting;
        this.availableChallengeCount = i3;
        this.availableChallengeInfoList = list2;
        this.showChallengeEntrance = z;
    }
}
