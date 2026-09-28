package com.sportybet.repository.limits.model;

import defpackage.cv7;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.oxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011Jj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bÊ\u0001\u0002\b,Ê\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0002¨\u0006+"}, d2 = {"Lcom/sportybet/repository/limits/model/LimitResponse;", "", "limitType", "", "gameType", "dailyLimit", "consumedDailyLimit", "weeklyLimit", "consumedWeeklyLimit", "monthlyLimit", "consumedMonthlyLimit", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLimitType", "()I", "getGameType", "getDailyLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConsumedDailyLimit", "getWeeklyLimit", "getConsumedWeeklyLimit", "getMonthlyLimit", "getConsumedMonthlyLimit", "hasReachedLimits", "", "getHasReachedLimits", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/repository/limits/model/LimitResponse;", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LimitResponse {
    public static final int $stable = 0;
    private final Integer consumedDailyLimit;
    private final Integer consumedMonthlyLimit;
    private final Integer consumedWeeklyLimit;
    private final Integer dailyLimit;
    private final int gameType;
    private final int limitType;
    private final Integer monthlyLimit;
    private final Integer weeklyLimit;

    public LimitResponse(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.limitType = i;
        this.gameType = i2;
        this.dailyLimit = num;
        this.consumedDailyLimit = num2;
        this.weeklyLimit = num3;
        this.consumedWeeklyLimit = num4;
        this.monthlyLimit = num5;
        this.consumedMonthlyLimit = num6;
    }

    public static /* synthetic */ LimitResponse copy$default(LimitResponse limitResponse, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = limitResponse.limitType;
        }
        if ((i3 & 2) != 0) {
            i2 = limitResponse.gameType;
        }
        if ((i3 & 4) != 0) {
            num = limitResponse.dailyLimit;
        }
        if ((i3 & 8) != 0) {
            num2 = limitResponse.consumedDailyLimit;
        }
        if ((i3 & 16) != 0) {
            num3 = limitResponse.weeklyLimit;
        }
        if ((i3 & 32) != 0) {
            num4 = limitResponse.consumedWeeklyLimit;
        }
        if ((i3 & 64) != 0) {
            num5 = limitResponse.monthlyLimit;
        }
        if ((i3 & 128) != 0) {
            num6 = limitResponse.consumedMonthlyLimit;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        Integer num9 = num3;
        Integer num10 = num4;
        return limitResponse.copy(i, i2, num, num2, num9, num10, num7, num8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimitType() {
        return this.limitType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGameType() {
        return this.gameType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDailyLimit() {
        return this.dailyLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getConsumedDailyLimit() {
        return this.consumedDailyLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWeeklyLimit() {
        return this.weeklyLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getConsumedWeeklyLimit() {
        return this.consumedWeeklyLimit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMonthlyLimit() {
        return this.monthlyLimit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getConsumedMonthlyLimit() {
        return this.consumedMonthlyLimit;
    }

    public final LimitResponse copy(int limitType, int gameType, Integer dailyLimit, Integer consumedDailyLimit, Integer weeklyLimit, Integer consumedWeeklyLimit, Integer monthlyLimit, Integer consumedMonthlyLimit) {
        return new LimitResponse(limitType, gameType, dailyLimit, consumedDailyLimit, weeklyLimit, consumedWeeklyLimit, monthlyLimit, consumedMonthlyLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitResponse)) {
            return false;
        }
        LimitResponse limitResponse = (LimitResponse) other;
        return this.limitType == limitResponse.limitType && this.gameType == limitResponse.gameType && Intrinsics.g(this.dailyLimit, limitResponse.dailyLimit) && Intrinsics.g(this.consumedDailyLimit, limitResponse.consumedDailyLimit) && Intrinsics.g(this.weeklyLimit, limitResponse.weeklyLimit) && Intrinsics.g(this.consumedWeeklyLimit, limitResponse.consumedWeeklyLimit) && Intrinsics.g(this.monthlyLimit, limitResponse.monthlyLimit) && Intrinsics.g(this.consumedMonthlyLimit, limitResponse.consumedMonthlyLimit);
    }

    public final Integer getConsumedDailyLimit() {
        return this.consumedDailyLimit;
    }

    public final Integer getConsumedMonthlyLimit() {
        return this.consumedMonthlyLimit;
    }

    public final Integer getConsumedWeeklyLimit() {
        return this.consumedWeeklyLimit;
    }

    public final Integer getDailyLimit() {
        return this.dailyLimit;
    }

    public final int getGameType() {
        return this.gameType;
    }

    public final boolean getHasReachedLimits() {
        if (this.dailyLimit != null && oxo.b(this.consumedDailyLimit) >= oxo.b(this.dailyLimit)) {
            return true;
        }
        if (this.weeklyLimit == null || oxo.b(this.consumedWeeklyLimit) < oxo.b(this.weeklyLimit)) {
            return this.monthlyLimit != null && oxo.b(this.consumedMonthlyLimit) >= oxo.b(this.monthlyLimit);
        }
        return true;
    }

    public final int getLimitType() {
        return this.limitType;
    }

    public final Integer getMonthlyLimit() {
        return this.monthlyLimit;
    }

    public final Integer getWeeklyLimit() {
        return this.weeklyLimit;
    }

    public int hashCode() {
        int iA = gpp.a(this.gameType, Integer.hashCode(this.limitType) * 31, 31);
        Integer num = this.dailyLimit;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.consumedDailyLimit;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.weeklyLimit;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.consumedWeeklyLimit;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.monthlyLimit;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.consumedMonthlyLimit;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        int i = this.limitType;
        int i2 = this.gameType;
        Integer num = this.dailyLimit;
        Integer num2 = this.consumedDailyLimit;
        Integer num3 = this.weeklyLimit;
        Integer num4 = this.consumedWeeklyLimit;
        Integer num5 = this.monthlyLimit;
        Integer num6 = this.consumedMonthlyLimit;
        StringBuilder sbA = dy5.a("LimitResponse(limitType=", i, i2, ", gameType=", ", dailyLimit=");
        cv7.a(sbA, num, ", consumedDailyLimit=", num2, ", weeklyLimit=");
        cv7.a(sbA, num3, ", consumedWeeklyLimit=", num4, ", monthlyLimit=");
        sbA.append(num5);
        sbA.append(", consumedMonthlyLimit=");
        sbA.append(num6);
        sbA.append(")");
        return sbA.toString();
    }
}
