package com.sporty.android.core.model.patron;

import com.appsflyer.internal.v;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b#¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/patron/ReachedLimit;", "", "limitType", "", "reachedDailyLimit", "", "reachedWeeklyLimit", "reachedMonthlyLimit", "gameType", "<init>", "(IZZLjava/lang/Boolean;Ljava/lang/Integer;)V", "getLimitType", "()I", "getReachedDailyLimit", "()Z", "getReachedWeeklyLimit", "getReachedMonthlyLimit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGameType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(IZZLjava/lang/Boolean;Ljava/lang/Integer;)Lcom/sporty/android/core/model/patron/ReachedLimit;", "equals", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReachedLimit {
    private final Integer gameType;
    private final int limitType;
    private final boolean reachedDailyLimit;
    private final Boolean reachedMonthlyLimit;
    private final boolean reachedWeeklyLimit;

    public /* synthetic */ ReachedLimit(int i, boolean z, boolean z2, Boolean bool, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : num);
    }

    public static /* synthetic */ ReachedLimit copy$default(ReachedLimit reachedLimit, int i, boolean z, boolean z2, Boolean bool, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reachedLimit.limitType;
        }
        if ((i2 & 2) != 0) {
            z = reachedLimit.reachedDailyLimit;
        }
        if ((i2 & 4) != 0) {
            z2 = reachedLimit.reachedWeeklyLimit;
        }
        if ((i2 & 8) != 0) {
            bool = reachedLimit.reachedMonthlyLimit;
        }
        if ((i2 & 16) != 0) {
            num = reachedLimit.gameType;
        }
        Integer num2 = num;
        boolean z3 = z2;
        return reachedLimit.copy(i, z, z3, bool, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimitType() {
        return this.limitType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReachedDailyLimit() {
        return this.reachedDailyLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getReachedWeeklyLimit() {
        return this.reachedWeeklyLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getReachedMonthlyLimit() {
        return this.reachedMonthlyLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getGameType() {
        return this.gameType;
    }

    public final ReachedLimit copy(int limitType, boolean reachedDailyLimit, boolean reachedWeeklyLimit, Boolean reachedMonthlyLimit, Integer gameType) {
        return new ReachedLimit(limitType, reachedDailyLimit, reachedWeeklyLimit, reachedMonthlyLimit, gameType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReachedLimit)) {
            return false;
        }
        ReachedLimit reachedLimit = (ReachedLimit) other;
        return this.limitType == reachedLimit.limitType && this.reachedDailyLimit == reachedLimit.reachedDailyLimit && this.reachedWeeklyLimit == reachedLimit.reachedWeeklyLimit && Intrinsics.g(this.reachedMonthlyLimit, reachedLimit.reachedMonthlyLimit) && Intrinsics.g(this.gameType, reachedLimit.gameType);
    }

    public final Integer getGameType() {
        return this.gameType;
    }

    public final int getLimitType() {
        return this.limitType;
    }

    public final boolean getReachedDailyLimit() {
        return this.reachedDailyLimit;
    }

    public final Boolean getReachedMonthlyLimit() {
        return this.reachedMonthlyLimit;
    }

    public final boolean getReachedWeeklyLimit() {
        return this.reachedWeeklyLimit;
    }

    public int hashCode() {
        int iA = mtg0.a(mtg0.a(Integer.hashCode(this.limitType) * 31, 31, this.reachedDailyLimit), 31, this.reachedWeeklyLimit);
        Boolean bool = this.reachedMonthlyLimit;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.gameType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = this.limitType;
        boolean z = this.reachedDailyLimit;
        boolean z2 = this.reachedWeeklyLimit;
        Boolean bool = this.reachedMonthlyLimit;
        Integer num = this.gameType;
        StringBuilder sb = new StringBuilder("ReachedLimit(limitType=");
        sb.append(i);
        sb.append(", reachedDailyLimit=");
        sb.append(z);
        sb.append(", reachedWeeklyLimit=");
        sb.append(z2);
        sb.append(", reachedMonthlyLimit=");
        sb.append(bool);
        sb.append(", gameType=");
        return v.a(sb, num, ")");
    }

    public ReachedLimit(int i, boolean z, boolean z2, Boolean bool, Integer num) {
        this.limitType = i;
        this.reachedDailyLimit = z;
        this.reachedWeeklyLimit = z2;
        this.reachedMonthlyLimit = bool;
        this.gameType = num;
    }
}
