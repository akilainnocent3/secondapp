package com.sporty.android.core.model.security.sportypin;

import com.appsflyer.internal.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusConfig;", "", "maxUnmatchedTimes", "", "blockTime", "", "<init>", "(IJ)V", "getMaxUnmatchedTimes", "()I", "getBlockTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WithdrawalPinStatusConfig {
    private final long blockTime;
    private final int maxUnmatchedTimes;

    public /* synthetic */ WithdrawalPinStatusConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ WithdrawalPinStatusConfig copy$default(WithdrawalPinStatusConfig withdrawalPinStatusConfig, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = withdrawalPinStatusConfig.maxUnmatchedTimes;
        }
        if ((i2 & 2) != 0) {
            j = withdrawalPinStatusConfig.blockTime;
        }
        return withdrawalPinStatusConfig.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxUnmatchedTimes() {
        return this.maxUnmatchedTimes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBlockTime() {
        return this.blockTime;
    }

    public final WithdrawalPinStatusConfig copy(int maxUnmatchedTimes, long blockTime) {
        return new WithdrawalPinStatusConfig(maxUnmatchedTimes, blockTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawalPinStatusConfig)) {
            return false;
        }
        WithdrawalPinStatusConfig withdrawalPinStatusConfig = (WithdrawalPinStatusConfig) other;
        return this.maxUnmatchedTimes == withdrawalPinStatusConfig.maxUnmatchedTimes && this.blockTime == withdrawalPinStatusConfig.blockTime;
    }

    public final long getBlockTime() {
        return this.blockTime;
    }

    public final int getMaxUnmatchedTimes() {
        return this.maxUnmatchedTimes;
    }

    public int hashCode() {
        return Long.hashCode(this.blockTime) + (Integer.hashCode(this.maxUnmatchedTimes) * 31);
    }

    public String toString() {
        StringBuilder sbA = a0.a("WithdrawalPinStatusConfig(maxUnmatchedTimes=", ", blockTime=", this.maxUnmatchedTimes, this.blockTime);
        sbA.append(")");
        return sbA.toString();
    }

    public WithdrawalPinStatusConfig(int i, long j) {
        this.maxUnmatchedTimes = i;
        this.blockTime = j;
    }

    public WithdrawalPinStatusConfig() {
        this(0, 0L, 3, null);
    }
}
