package com.sportybet.repository.limits.model;

import com.appsflyer.internal.v;
import defpackage.cv7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rÊ\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/repository/limits/model/SaveLimitsResponse;", "", "limitType", "", "gameType", "dailyLimit", "weeklyLimit", "monthlyLimit", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLimitType", "()I", "getGameType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyLimit", "getWeeklyLimit", "getMonthlyLimit", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/repository/limits/model/SaveLimitsResponse;", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SaveLimitsResponse {
    public static final int $stable = 0;
    private final Integer dailyLimit;
    private final Integer gameType;
    private final int limitType;
    private final Integer monthlyLimit;
    private final Integer weeklyLimit;

    public SaveLimitsResponse(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        this.limitType = i;
        this.gameType = num;
        this.dailyLimit = num2;
        this.weeklyLimit = num3;
        this.monthlyLimit = num4;
    }

    public static /* synthetic */ SaveLimitsResponse copy$default(SaveLimitsResponse saveLimitsResponse, int i, Integer num, Integer num2, Integer num3, Integer num4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = saveLimitsResponse.limitType;
        }
        if ((i2 & 2) != 0) {
            num = saveLimitsResponse.gameType;
        }
        if ((i2 & 4) != 0) {
            num2 = saveLimitsResponse.dailyLimit;
        }
        if ((i2 & 8) != 0) {
            num3 = saveLimitsResponse.weeklyLimit;
        }
        if ((i2 & 16) != 0) {
            num4 = saveLimitsResponse.monthlyLimit;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return saveLimitsResponse.copy(i, num, num6, num3, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimitType() {
        return this.limitType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGameType() {
        return this.gameType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDailyLimit() {
        return this.dailyLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getWeeklyLimit() {
        return this.weeklyLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMonthlyLimit() {
        return this.monthlyLimit;
    }

    public final SaveLimitsResponse copy(int limitType, Integer gameType, Integer dailyLimit, Integer weeklyLimit, Integer monthlyLimit) {
        return new SaveLimitsResponse(limitType, gameType, dailyLimit, weeklyLimit, monthlyLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveLimitsResponse)) {
            return false;
        }
        SaveLimitsResponse saveLimitsResponse = (SaveLimitsResponse) other;
        return this.limitType == saveLimitsResponse.limitType && Intrinsics.g(this.gameType, saveLimitsResponse.gameType) && Intrinsics.g(this.dailyLimit, saveLimitsResponse.dailyLimit) && Intrinsics.g(this.weeklyLimit, saveLimitsResponse.weeklyLimit) && Intrinsics.g(this.monthlyLimit, saveLimitsResponse.monthlyLimit);
    }

    public final Integer getDailyLimit() {
        return this.dailyLimit;
    }

    public final Integer getGameType() {
        return this.gameType;
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
        int iHashCode = Integer.hashCode(this.limitType) * 31;
        Integer num = this.gameType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dailyLimit;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.weeklyLimit;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.monthlyLimit;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        int i = this.limitType;
        Integer num = this.gameType;
        Integer num2 = this.dailyLimit;
        Integer num3 = this.weeklyLimit;
        Integer num4 = this.monthlyLimit;
        StringBuilder sb = new StringBuilder("SaveLimitsResponse(limitType=");
        sb.append(i);
        sb.append(", gameType=");
        sb.append(num);
        sb.append(", dailyLimit=");
        cv7.a(sb, num2, ", weeklyLimit=", num3, ", monthlyLimit=");
        return v.a(sb, num4, ")");
    }
}
