package com.sportygames.multilevel.common.model;

import com.appsflyer.internal.w;
import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u0092\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u00068"}, d2 = {"Lcom/sportygames/multilevel/common/model/UserLevelProgressDto;", "", "level", "", "normalRounds", "completedNormalRounds", "bonusPercentage", "", "isNextBonusRound", "", "stakeAmountCapForNextRound", "bonusMeterRounds", "completedBonusMeterRounds", "isBonusMeterVisible", "fbgExpiryInDays", "resetProgressInDays", "fbgHighestAwardedLevel", "lastLevelReset", "<init>", "(IIIDZLjava/lang/Double;IIZIIIZ)V", "getLevel", "()I", "getNormalRounds", "getCompletedNormalRounds", "getBonusPercentage", "()D", "()Z", "getStakeAmountCapForNextRound", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBonusMeterRounds", "getCompletedBonusMeterRounds", "getFbgExpiryInDays", "getResetProgressInDays", "getFbgHighestAwardedLevel", "getLastLevelReset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(IIIDZLjava/lang/Double;IIZIIIZ)Lcom/sportygames/multilevel/common/model/UserLevelProgressDto;", "equals", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserLevelProgressDto {
    public static final int $stable = 0;

    @SerializedName("bonusMeterRounds")
    private final int bonusMeterRounds;

    @SerializedName("bonusPercentage")
    private final double bonusPercentage;

    @SerializedName("completedBonusMeterRounds")
    private final int completedBonusMeterRounds;

    @SerializedName("completedNormalRounds")
    private final int completedNormalRounds;

    @SerializedName("fbgExpiryInDays")
    private final int fbgExpiryInDays;

    @SerializedName("fbgHighestAwardedLevel")
    private final int fbgHighestAwardedLevel;

    @SerializedName("isBonusMeterVisible")
    private final boolean isBonusMeterVisible;

    @SerializedName("isNextBonusRound")
    private final boolean isNextBonusRound;

    @SerializedName("lastLevelReset")
    private final boolean lastLevelReset;

    @SerializedName("level")
    private final int level;

    @SerializedName("normalRounds")
    private final int normalRounds;

    @SerializedName(alternate = {"levelResetDays"}, value = "resetProgressInDays")
    private final int resetProgressInDays;

    @SerializedName("stakeAmountCapForNextRound")
    private final Double stakeAmountCapForNextRound;

    public UserLevelProgressDto(int i, int i2, int i3, double d, boolean z, Double d2, int i4, int i5, boolean z2, int i6, int i7, int i8, boolean z3) {
        this.level = i;
        this.normalRounds = i2;
        this.completedNormalRounds = i3;
        this.bonusPercentage = d;
        this.isNextBonusRound = z;
        this.stakeAmountCapForNextRound = d2;
        this.bonusMeterRounds = i4;
        this.completedBonusMeterRounds = i5;
        this.isBonusMeterVisible = z2;
        this.fbgExpiryInDays = i6;
        this.resetProgressInDays = i7;
        this.fbgHighestAwardedLevel = i8;
        this.lastLevelReset = z3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFbgExpiryInDays() {
        return this.fbgExpiryInDays;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getResetProgressInDays() {
        return this.resetProgressInDays;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFbgHighestAwardedLevel() {
        return this.fbgHighestAwardedLevel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getLastLevelReset() {
        return this.lastLevelReset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNormalRounds() {
        return this.normalRounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompletedNormalRounds() {
        return this.completedNormalRounds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getBonusPercentage() {
        return this.bonusPercentage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNextBonusRound() {
        return this.isNextBonusRound;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getStakeAmountCapForNextRound() {
        return this.stakeAmountCapForNextRound;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBonusMeterRounds() {
        return this.bonusMeterRounds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCompletedBonusMeterRounds() {
        return this.completedBonusMeterRounds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsBonusMeterVisible() {
        return this.isBonusMeterVisible;
    }

    public final UserLevelProgressDto copy(int level, int normalRounds, int completedNormalRounds, double bonusPercentage, boolean isNextBonusRound, Double stakeAmountCapForNextRound, int bonusMeterRounds, int completedBonusMeterRounds, boolean isBonusMeterVisible, int fbgExpiryInDays, int resetProgressInDays, int fbgHighestAwardedLevel, boolean lastLevelReset) {
        return new UserLevelProgressDto(level, normalRounds, completedNormalRounds, bonusPercentage, isNextBonusRound, stakeAmountCapForNextRound, bonusMeterRounds, completedBonusMeterRounds, isBonusMeterVisible, fbgExpiryInDays, resetProgressInDays, fbgHighestAwardedLevel, lastLevelReset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLevelProgressDto)) {
            return false;
        }
        UserLevelProgressDto userLevelProgressDto = (UserLevelProgressDto) other;
        return this.level == userLevelProgressDto.level && this.normalRounds == userLevelProgressDto.normalRounds && this.completedNormalRounds == userLevelProgressDto.completedNormalRounds && Double.compare(this.bonusPercentage, userLevelProgressDto.bonusPercentage) == 0 && this.isNextBonusRound == userLevelProgressDto.isNextBonusRound && Intrinsics.g(this.stakeAmountCapForNextRound, userLevelProgressDto.stakeAmountCapForNextRound) && this.bonusMeterRounds == userLevelProgressDto.bonusMeterRounds && this.completedBonusMeterRounds == userLevelProgressDto.completedBonusMeterRounds && this.isBonusMeterVisible == userLevelProgressDto.isBonusMeterVisible && this.fbgExpiryInDays == userLevelProgressDto.fbgExpiryInDays && this.resetProgressInDays == userLevelProgressDto.resetProgressInDays && this.fbgHighestAwardedLevel == userLevelProgressDto.fbgHighestAwardedLevel && this.lastLevelReset == userLevelProgressDto.lastLevelReset;
    }

    public final int getBonusMeterRounds() {
        return this.bonusMeterRounds;
    }

    public final double getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final int getCompletedBonusMeterRounds() {
        return this.completedBonusMeterRounds;
    }

    public final int getCompletedNormalRounds() {
        return this.completedNormalRounds;
    }

    public final int getFbgExpiryInDays() {
        return this.fbgExpiryInDays;
    }

    public final int getFbgHighestAwardedLevel() {
        return this.fbgHighestAwardedLevel;
    }

    public final boolean getLastLevelReset() {
        return this.lastLevelReset;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getNormalRounds() {
        return this.normalRounds;
    }

    public final int getResetProgressInDays() {
        return this.resetProgressInDays;
    }

    public final Double getStakeAmountCapForNextRound() {
        return this.stakeAmountCapForNextRound;
    }

    public int hashCode() {
        int iA = mtg0.a(nrg0.a(gpp.a(this.completedNormalRounds, gpp.a(this.normalRounds, Integer.hashCode(this.level) * 31, 31), 31), 31, this.bonusPercentage), 31, this.isNextBonusRound);
        Double d = this.stakeAmountCapForNextRound;
        return Boolean.hashCode(this.lastLevelReset) + gpp.a(this.fbgHighestAwardedLevel, gpp.a(this.resetProgressInDays, gpp.a(this.fbgExpiryInDays, mtg0.a(gpp.a(this.completedBonusMeterRounds, gpp.a(this.bonusMeterRounds, (iA + (d == null ? 0 : d.hashCode())) * 31, 31), 31), 31, this.isBonusMeterVisible), 31), 31), 31);
    }

    public final boolean isBonusMeterVisible() {
        return this.isBonusMeterVisible;
    }

    public final boolean isNextBonusRound() {
        return this.isNextBonusRound;
    }

    public String toString() {
        int i = this.level;
        int i2 = this.normalRounds;
        int i3 = this.completedNormalRounds;
        double d = this.bonusPercentage;
        boolean z = this.isNextBonusRound;
        Double d2 = this.stakeAmountCapForNextRound;
        int i4 = this.bonusMeterRounds;
        int i5 = this.completedBonusMeterRounds;
        boolean z2 = this.isBonusMeterVisible;
        int i6 = this.fbgExpiryInDays;
        int i7 = this.resetProgressInDays;
        int i8 = this.fbgHighestAwardedLevel;
        boolean z3 = this.lastLevelReset;
        StringBuilder sbA = dy5.a("UserLevelProgressDto(level=", i, i2, ", normalRounds=", ", completedNormalRounds=");
        sbA.append(i3);
        sbA.append(", bonusPercentage=");
        sbA.append(d);
        sbA.append(", isNextBonusRound=");
        sbA.append(z);
        sbA.append(", stakeAmountCapForNextRound=");
        sbA.append(d2);
        sbA.append(", bonusMeterRounds=");
        sbA.append(i4);
        sbA.append(", completedBonusMeterRounds=");
        sbA.append(i5);
        sbA.append(", isBonusMeterVisible=");
        sbA.append(z2);
        sbA.append(", fbgExpiryInDays=");
        sbA.append(i6);
        sbA.append(LGxrN.NLhDvMSrJTWQx);
        sbA.append(i7);
        sbA.append(", fbgHighestAwardedLevel=");
        sbA.append(i8);
        return w.a(sbA, ", lastLevelReset=", z3, ")");
    }
}
