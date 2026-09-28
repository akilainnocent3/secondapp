package com.sporty.android.core.model.loyalty.streak;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/BettingStreakAchievementDto;", "", "currentStreakLevel", "", "levels", "", "Lcom/sporty/android/core/model/loyalty/streak/LoyaltyBettingStreakLevel;", "<init>", "(ILjava/util/List;)V", "getCurrentStreakLevel", "()I", "getLevels", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakAchievementDto {
    private final int currentStreakLevel;
    private final List<LoyaltyBettingStreakLevel> levels;

    public BettingStreakAchievementDto(int i, List<LoyaltyBettingStreakLevel> list) {
        list.getClass();
        this.currentStreakLevel = i;
        this.levels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BettingStreakAchievementDto copy$default(BettingStreakAchievementDto bettingStreakAchievementDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bettingStreakAchievementDto.currentStreakLevel;
        }
        if ((i2 & 2) != 0) {
            list = bettingStreakAchievementDto.levels;
        }
        return bettingStreakAchievementDto.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    public final List<LoyaltyBettingStreakLevel> component2() {
        return this.levels;
    }

    public final BettingStreakAchievementDto copy(int currentStreakLevel, List<LoyaltyBettingStreakLevel> levels) {
        levels.getClass();
        return new BettingStreakAchievementDto(currentStreakLevel, levels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakAchievementDto)) {
            return false;
        }
        BettingStreakAchievementDto bettingStreakAchievementDto = (BettingStreakAchievementDto) other;
        return this.currentStreakLevel == bettingStreakAchievementDto.currentStreakLevel && Intrinsics.g(this.levels, bettingStreakAchievementDto.levels);
    }

    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    public final List<LoyaltyBettingStreakLevel> getLevels() {
        return this.levels;
    }

    public int hashCode() {
        return this.levels.hashCode() + (Integer.hashCode(this.currentStreakLevel) * 31);
    }

    public String toString() {
        return "BettingStreakAchievementDto(currentStreakLevel=" + this.currentStreakLevel + ", levels=" + this.levels + ")";
    }
}
