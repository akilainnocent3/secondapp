package com.sportybet.repository.limits.model;

import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/repository/limits/model/ConsumedLimitsResponse;", "", "dailyTime", "", "weeklyTime", "<init>", "(II)V", "getDailyTime", "()I", "getWeeklyTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ConsumedLimitsResponse {
    public static final int $stable = 0;
    private final int dailyTime;
    private final int weeklyTime;

    public ConsumedLimitsResponse(int i, int i2) {
        this.dailyTime = i;
        this.weeklyTime = i2;
    }

    public static /* synthetic */ ConsumedLimitsResponse copy$default(ConsumedLimitsResponse consumedLimitsResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = consumedLimitsResponse.dailyTime;
        }
        if ((i3 & 2) != 0) {
            i2 = consumedLimitsResponse.weeklyTime;
        }
        return consumedLimitsResponse.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDailyTime() {
        return this.dailyTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWeeklyTime() {
        return this.weeklyTime;
    }

    public final ConsumedLimitsResponse copy(int dailyTime, int weeklyTime) {
        return new ConsumedLimitsResponse(dailyTime, weeklyTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumedLimitsResponse)) {
            return false;
        }
        ConsumedLimitsResponse consumedLimitsResponse = (ConsumedLimitsResponse) other;
        return this.dailyTime == consumedLimitsResponse.dailyTime && this.weeklyTime == consumedLimitsResponse.weeklyTime;
    }

    public final int getDailyTime() {
        return this.dailyTime;
    }

    public final int getWeeklyTime() {
        return this.weeklyTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.weeklyTime) + (Integer.hashCode(this.dailyTime) * 31);
    }

    public String toString() {
        return n36.a("ConsumedLimitsResponse(dailyTime=", this.dailyTime, this.weeklyTime, ", weeklyTime=", ")");
    }
}
