package com.sporty.android.core.model.loyalty.streak;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/StreakWeekDto;", "", "displayWeek", "", "days", "", "Lcom/sporty/android/core/model/loyalty/streak/LoyaltyBettingStreakDayStatus;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDisplayWeek", "()Ljava/lang/String;", "getDays", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StreakWeekDto {
    private final List<LoyaltyBettingStreakDayStatus> days;
    private final String displayWeek;

    /* JADX WARN: Multi-variable type inference failed */
    public StreakWeekDto(String str, List<? extends LoyaltyBettingStreakDayStatus> list) {
        str.getClass();
        list.getClass();
        this.displayWeek = str;
        this.days = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreakWeekDto copy$default(StreakWeekDto streakWeekDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streakWeekDto.displayWeek;
        }
        if ((i & 2) != 0) {
            list = streakWeekDto.days;
        }
        return streakWeekDto.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayWeek() {
        return this.displayWeek;
    }

    public final List<LoyaltyBettingStreakDayStatus> component2() {
        return this.days;
    }

    public final StreakWeekDto copy(String displayWeek, List<? extends LoyaltyBettingStreakDayStatus> days) {
        displayWeek.getClass();
        days.getClass();
        return new StreakWeekDto(displayWeek, days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreakWeekDto)) {
            return false;
        }
        StreakWeekDto streakWeekDto = (StreakWeekDto) other;
        return Intrinsics.g(this.displayWeek, streakWeekDto.displayWeek) && Intrinsics.g(this.days, streakWeekDto.days);
    }

    public final List<LoyaltyBettingStreakDayStatus> getDays() {
        return this.days;
    }

    public final String getDisplayWeek() {
        return this.displayWeek;
    }

    public int hashCode() {
        return this.days.hashCode() + (this.displayWeek.hashCode() * 31);
    }

    public String toString() {
        return nf.b("StreakWeekDto(displayWeek=", this.displayWeek, ", days=", ")", this.days);
    }
}
