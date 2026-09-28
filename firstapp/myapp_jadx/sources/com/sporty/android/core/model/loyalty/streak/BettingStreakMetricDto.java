package com.sporty.android.core.model.loyalty.streak;

import com.appsflyer.internal.w;
import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010%\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/BettingStreakMetricDto;", "", "level1Threshold", "", "currentStreakDays", "currentStreakLevel", "currentStreakBoost", "", "rewardCap", "", "currentStreakRepairToolAmount", "notifyKeepStreak", "", "<init>", "(IIIDLjava/lang/String;IZ)V", "getLevel1Threshold", "()I", "getCurrentStreakDays", "getCurrentStreakLevel", "getCurrentStreakBoost", "()D", "getRewardCap", "()Ljava/lang/String;", "getCurrentStreakRepairToolAmount", "getNotifyKeepStreak", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakMetricDto {
    private final double currentStreakBoost;
    private final int currentStreakDays;
    private final int currentStreakLevel;
    private final int currentStreakRepairToolAmount;
    private final int level1Threshold;
    private final boolean notifyKeepStreak;
    private final String rewardCap;

    public BettingStreakMetricDto(int i, int i2, int i3, double d, String str, int i4, boolean z) {
        str.getClass();
        this.level1Threshold = i;
        this.currentStreakDays = i2;
        this.currentStreakLevel = i3;
        this.currentStreakBoost = d;
        this.rewardCap = str;
        this.currentStreakRepairToolAmount = i4;
        this.notifyKeepStreak = z;
    }

    public static /* synthetic */ BettingStreakMetricDto copy$default(BettingStreakMetricDto bettingStreakMetricDto, int i, int i2, int i3, double d, String str, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bettingStreakMetricDto.level1Threshold;
        }
        if ((i5 & 2) != 0) {
            i2 = bettingStreakMetricDto.currentStreakDays;
        }
        if ((i5 & 4) != 0) {
            i3 = bettingStreakMetricDto.currentStreakLevel;
        }
        if ((i5 & 8) != 0) {
            d = bettingStreakMetricDto.currentStreakBoost;
        }
        if ((i5 & 16) != 0) {
            str = bettingStreakMetricDto.rewardCap;
        }
        if ((i5 & 32) != 0) {
            i4 = bettingStreakMetricDto.currentStreakRepairToolAmount;
        }
        if ((i5 & 64) != 0) {
            z = bettingStreakMetricDto.notifyKeepStreak;
        }
        boolean z2 = z;
        String str2 = str;
        double d2 = d;
        int i6 = i3;
        return bettingStreakMetricDto.copy(i, i2, i6, d2, str2, i4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel1Threshold() {
        return this.level1Threshold;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getCurrentStreakBoost() {
        return this.currentStreakBoost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRewardCap() {
        return this.rewardCap;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCurrentStreakRepairToolAmount() {
        return this.currentStreakRepairToolAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNotifyKeepStreak() {
        return this.notifyKeepStreak;
    }

    public final BettingStreakMetricDto copy(int level1Threshold, int currentStreakDays, int currentStreakLevel, double currentStreakBoost, String rewardCap, int currentStreakRepairToolAmount, boolean notifyKeepStreak) {
        rewardCap.getClass();
        return new BettingStreakMetricDto(level1Threshold, currentStreakDays, currentStreakLevel, currentStreakBoost, rewardCap, currentStreakRepairToolAmount, notifyKeepStreak);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakMetricDto)) {
            return false;
        }
        BettingStreakMetricDto bettingStreakMetricDto = (BettingStreakMetricDto) other;
        return this.level1Threshold == bettingStreakMetricDto.level1Threshold && this.currentStreakDays == bettingStreakMetricDto.currentStreakDays && this.currentStreakLevel == bettingStreakMetricDto.currentStreakLevel && Double.compare(this.currentStreakBoost, bettingStreakMetricDto.currentStreakBoost) == 0 && Intrinsics.g(this.rewardCap, bettingStreakMetricDto.rewardCap) && this.currentStreakRepairToolAmount == bettingStreakMetricDto.currentStreakRepairToolAmount && this.notifyKeepStreak == bettingStreakMetricDto.notifyKeepStreak;
    }

    public final double getCurrentStreakBoost() {
        return this.currentStreakBoost;
    }

    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    public final int getCurrentStreakRepairToolAmount() {
        return this.currentStreakRepairToolAmount;
    }

    public final int getLevel1Threshold() {
        return this.level1Threshold;
    }

    public final boolean getNotifyKeepStreak() {
        return this.notifyKeepStreak;
    }

    public final String getRewardCap() {
        return this.rewardCap;
    }

    public int hashCode() {
        return Boolean.hashCode(this.notifyKeepStreak) + gpp.a(this.currentStreakRepairToolAmount, gmf0.a(nrg0.a(gpp.a(this.currentStreakLevel, gpp.a(this.currentStreakDays, Integer.hashCode(this.level1Threshold) * 31, 31), 31), 31, this.currentStreakBoost), 31, this.rewardCap), 31);
    }

    public String toString() {
        int i = this.level1Threshold;
        int i2 = this.currentStreakDays;
        int i3 = this.currentStreakLevel;
        double d = this.currentStreakBoost;
        String str = this.rewardCap;
        int i4 = this.currentStreakRepairToolAmount;
        boolean z = this.notifyKeepStreak;
        StringBuilder sbA = dy5.a("BettingStreakMetricDto(level1Threshold=", i, i2, ", currentStreakDays=", ", currentStreakLevel=");
        sbA.append(i3);
        sbA.append(", currentStreakBoost=");
        sbA.append(d);
        sbA.append(", rewardCap=");
        sbA.append(str);
        sbA.append(", currentStreakRepairToolAmount=");
        sbA.append(i4);
        return w.a(sbA, ", notifyKeepStreak=", z, ")");
    }
}
