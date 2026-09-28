package com.sporty.android.core.model.loyalty;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.bt6;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.mtg0;
import defpackage.uts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010-J¦\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010?J\u0014\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R%\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b()¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010!R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010!Ê\u0001\u0002\bE¨\u0006D"}, d2 = {"Lcom/sporty/android/core/model/loyalty/UserTier;", "", "currency", "", "currentTier", "", "highestTier", "lifeWager", "", "periodWager", "processing", "", AnalyticsParam.EVENT_STATUS, "supportCSName", "supportCSNumber", "userId", "ccfEnough", "tierRewardTimes", "", "Lcom/sporty/android/core/model/loyalty/TierRewardTime;", "isUserTierUnlocked", "nextUpgradeTime", "<init>", "(Ljava/lang/String;IIJJZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLjava/lang/Long;)V", "getCurrency", "()Ljava/lang/String;", "getCurrentTier", "()I", "getHighestTier", "getLifeWager", "()J", "getPeriodWager", "getProcessing", "()Z", "getStatus", "getSupportCSName", "getSupportCSNumber", "getUserId", "getCcfEnough", "Lcom/google/gson/annotations/SerializedName;", "value", "ccfenough", "getTierRewardTimes", "()Ljava/util/List;", "getNextUpgradeTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isProbation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;IIJJZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLjava/lang/Long;)Lcom/sporty/android/core/model/loyalty/UserTier;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserTier {

    @SerializedName("ccfenough")
    private final boolean ccfEnough;
    private final String currency;
    private final int currentTier;
    private final int highestTier;
    private final boolean isUserTierUnlocked;
    private final long lifeWager;
    private final Long nextUpgradeTime;
    private final long periodWager;
    private final boolean processing;
    private final int status;
    private final String supportCSName;
    private final String supportCSNumber;
    private final List<TierRewardTime> tierRewardTimes;
    private final String userId;

    public UserTier(String str, int i, int i2, long j, long j2, boolean z, int i3, String str2, String str3, String str4, boolean z2, List<TierRewardTime> list, boolean z3, Long l) {
        bt6.a(str, str4, list);
        this.currency = str;
        this.currentTier = i;
        this.highestTier = i2;
        this.lifeWager = j;
        this.periodWager = j2;
        this.processing = z;
        this.status = i3;
        this.supportCSName = str2;
        this.supportCSNumber = str3;
        this.userId = str4;
        this.ccfEnough = z2;
        this.tierRewardTimes = list;
        this.isUserTierUnlocked = z3;
        this.nextUpgradeTime = l;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCcfEnough() {
        return this.ccfEnough;
    }

    public final List<TierRewardTime> component12() {
        return this.tierRewardTimes;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsUserTierUnlocked() {
        return this.isUserTierUnlocked;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getNextUpgradeTime() {
        return this.nextUpgradeTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentTier() {
        return this.currentTier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHighestTier() {
        return this.highestTier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLifeWager() {
        return this.lifeWager;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPeriodWager() {
        return this.periodWager;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getProcessing() {
        return this.processing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSupportCSName() {
        return this.supportCSName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSupportCSNumber() {
        return this.supportCSNumber;
    }

    public final UserTier copy(String currency, int currentTier, int highestTier, long lifeWager, long periodWager, boolean processing, int status, String supportCSName, String supportCSNumber, String userId, boolean ccfEnough, List<TierRewardTime> tierRewardTimes, boolean isUserTierUnlocked, Long nextUpgradeTime) {
        currency.getClass();
        userId.getClass();
        tierRewardTimes.getClass();
        return new UserTier(currency, currentTier, highestTier, lifeWager, periodWager, processing, status, supportCSName, supportCSNumber, userId, ccfEnough, tierRewardTimes, isUserTierUnlocked, nextUpgradeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTier)) {
            return false;
        }
        UserTier userTier = (UserTier) other;
        return Intrinsics.g(this.currency, userTier.currency) && this.currentTier == userTier.currentTier && this.highestTier == userTier.highestTier && this.lifeWager == userTier.lifeWager && this.periodWager == userTier.periodWager && this.processing == userTier.processing && this.status == userTier.status && Intrinsics.g(this.supportCSName, userTier.supportCSName) && Intrinsics.g(this.supportCSNumber, userTier.supportCSNumber) && Intrinsics.g(this.userId, userTier.userId) && this.ccfEnough == userTier.ccfEnough && Intrinsics.g(this.tierRewardTimes, userTier.tierRewardTimes) && this.isUserTierUnlocked == userTier.isUserTierUnlocked && Intrinsics.g(this.nextUpgradeTime, userTier.nextUpgradeTime);
    }

    public final boolean getCcfEnough() {
        return this.ccfEnough;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getCurrentTier() {
        return this.currentTier;
    }

    public final int getHighestTier() {
        return this.highestTier;
    }

    public final long getLifeWager() {
        return this.lifeWager;
    }

    public final Long getNextUpgradeTime() {
        return this.nextUpgradeTime;
    }

    public final long getPeriodWager() {
        return this.periodWager;
    }

    public final boolean getProcessing() {
        return this.processing;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSupportCSName() {
        return this.supportCSName;
    }

    public final String getSupportCSNumber() {
        return this.supportCSNumber;
    }

    public final List<TierRewardTime> getTierRewardTimes() {
        return this.tierRewardTimes;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gpp.a(this.status, mtg0.a(f87.a(f87.a(gpp.a(this.highestTier, gpp.a(this.currentTier, this.currency.hashCode() * 31, 31), 31), this.lifeWager, 31), this.periodWager, 31), 31, this.processing), 31);
        String str = this.supportCSName;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.supportCSNumber;
        int iA2 = mtg0.a(ai50.a(mtg0.a(gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.userId), 31, this.ccfEnough), 31, this.tierRewardTimes), 31, this.isUserTierUnlocked);
        Long l = this.nextUpgradeTime;
        return iA2 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isProbation() {
        return this.status == 1;
    }

    public final boolean isUserTierUnlocked() {
        return this.isUserTierUnlocked;
    }

    public String toString() {
        String str = this.currency;
        int i = this.currentTier;
        int i2 = this.highestTier;
        long j = this.lifeWager;
        long j2 = this.periodWager;
        boolean z = this.processing;
        int i3 = this.status;
        String str2 = this.supportCSName;
        String str3 = this.supportCSNumber;
        String str4 = this.userId;
        boolean z2 = this.ccfEnough;
        List<TierRewardTime> list = this.tierRewardTimes;
        boolean z3 = this.isUserTierUnlocked;
        Long l = this.nextUpgradeTime;
        StringBuilder sbA = ml5.a(i, "UserTier(currency=", str, ", currentTier=", ", highestTier=");
        sbA.append(i2);
        sbA.append(", lifeWager=");
        sbA.append(j);
        g41.a(j2, ", periodWager=", ", processing=", sbA);
        sbA.append(z);
        sbA.append(", status=");
        sbA.append(i3);
        sbA.append(", supportCSName=");
        hxa.c(sbA, str2, ", supportCSNumber=", str3, ", userId=");
        uts.b(str4, ", ccfEnough=", ", tierRewardTimes=", sbA, z2);
        sbA.append(list);
        sbA.append(", isUserTierUnlocked=");
        sbA.append(z3);
        sbA.append(", nextUpgradeTime=");
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }
}
