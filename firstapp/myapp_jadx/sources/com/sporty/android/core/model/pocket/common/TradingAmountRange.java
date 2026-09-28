package com.sporty.android.core.model.pocket.common;

import defpackage.nrz;
import defpackage.q6a0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/TradingAmountRange;", "", "min", "", "max", "<init>", "(JJ)V", "getMin", "()J", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TradingAmountRange {
    private final long max;
    private final long min;

    public TradingAmountRange(long j, long j2) {
        this.min = j;
        this.max = j2;
    }

    public static /* synthetic */ TradingAmountRange copy$default(TradingAmountRange tradingAmountRange, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tradingAmountRange.min;
        }
        if ((i & 2) != 0) {
            j2 = tradingAmountRange.max;
        }
        return tradingAmountRange.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    public final TradingAmountRange copy(long min, long max) {
        return new TradingAmountRange(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingAmountRange)) {
            return false;
        }
        TradingAmountRange tradingAmountRange = (TradingAmountRange) other;
        return this.min == tradingAmountRange.min && this.max == tradingAmountRange.max;
    }

    public final long getMax() {
        return this.max;
    }

    public final long getMin() {
        return this.min;
    }

    public int hashCode() {
        return Long.hashCode(this.max) + (Long.hashCode(this.min) * 31);
    }

    public String toString() {
        return nrz.a(this.max, ")", q6a0.a(this.min, "TradingAmountRange(min=", ", max="));
    }
}
