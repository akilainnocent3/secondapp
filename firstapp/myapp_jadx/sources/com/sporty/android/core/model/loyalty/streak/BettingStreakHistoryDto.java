package com.sporty.android.core.model.loyalty.streak;

import defpackage.at6;
import defpackage.dy5;
import defpackage.gpp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/BettingStreakHistoryDto;", "", "longestStreakDays", "", "currentStreakDays", "currentStreakLevel", "streakJourney", "", "Lcom/sporty/android/core/model/loyalty/streak/StreakHistoryRecord;", "<init>", "(IIILjava/util/List;)V", "getLongestStreakDays", "()I", "getCurrentStreakDays", "getCurrentStreakLevel", "getStreakJourney", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakHistoryDto {
    private final int currentStreakDays;
    private final int currentStreakLevel;
    private final int longestStreakDays;
    private final List<StreakHistoryRecord> streakJourney;

    public BettingStreakHistoryDto(int i, int i2, int i3, List<StreakHistoryRecord> list) {
        list.getClass();
        this.longestStreakDays = i;
        this.currentStreakDays = i2;
        this.currentStreakLevel = i3;
        this.streakJourney = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BettingStreakHistoryDto copy$default(BettingStreakHistoryDto bettingStreakHistoryDto, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bettingStreakHistoryDto.longestStreakDays;
        }
        if ((i4 & 2) != 0) {
            i2 = bettingStreakHistoryDto.currentStreakDays;
        }
        if ((i4 & 4) != 0) {
            i3 = bettingStreakHistoryDto.currentStreakLevel;
        }
        if ((i4 & 8) != 0) {
            list = bettingStreakHistoryDto.streakJourney;
        }
        return bettingStreakHistoryDto.copy(i, i2, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLongestStreakDays() {
        return this.longestStreakDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    public final List<StreakHistoryRecord> component4() {
        return this.streakJourney;
    }

    public final BettingStreakHistoryDto copy(int longestStreakDays, int currentStreakDays, int currentStreakLevel, List<StreakHistoryRecord> streakJourney) {
        streakJourney.getClass();
        return new BettingStreakHistoryDto(longestStreakDays, currentStreakDays, currentStreakLevel, streakJourney);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakHistoryDto)) {
            return false;
        }
        BettingStreakHistoryDto bettingStreakHistoryDto = (BettingStreakHistoryDto) other;
        return this.longestStreakDays == bettingStreakHistoryDto.longestStreakDays && this.currentStreakDays == bettingStreakHistoryDto.currentStreakDays && this.currentStreakLevel == bettingStreakHistoryDto.currentStreakLevel && Intrinsics.g(this.streakJourney, bettingStreakHistoryDto.streakJourney);
    }

    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    public final int getCurrentStreakLevel() {
        return this.currentStreakLevel;
    }

    public final int getLongestStreakDays() {
        return this.longestStreakDays;
    }

    public final List<StreakHistoryRecord> getStreakJourney() {
        return this.streakJourney;
    }

    public int hashCode() {
        return this.streakJourney.hashCode() + gpp.a(this.currentStreakLevel, gpp.a(this.currentStreakDays, Integer.hashCode(this.longestStreakDays) * 31, 31), 31);
    }

    public String toString() {
        int i = this.longestStreakDays;
        int i2 = this.currentStreakDays;
        return at6.b(dy5.a("BettingStreakHistoryDto(longestStreakDays=", i, i2, ", currentStreakDays=", ", currentStreakLevel="), this.currentStreakLevel, ", streakJourney=", this.streakJourney, ")");
    }
}
