package com.sporty.android.core.model.cashout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/cashout/FallbackSelectionCashOutQuota;", "", "quota", "", "ctr", "Lcom/sporty/android/core/model/cashout/FallbackCtr;", "<init>", "(Ljava/lang/Double;Lcom/sporty/android/core/model/cashout/FallbackCtr;)V", "getQuota", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCtr", "()Lcom/sporty/android/core/model/cashout/FallbackCtr;", "component1", "component2", "copy", "(Ljava/lang/Double;Lcom/sporty/android/core/model/cashout/FallbackCtr;)Lcom/sporty/android/core/model/cashout/FallbackSelectionCashOutQuota;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FallbackSelectionCashOutQuota {
    private final FallbackCtr ctr;
    private final Double quota;

    public /* synthetic */ FallbackSelectionCashOutQuota(Double d, FallbackCtr fallbackCtr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : fallbackCtr);
    }

    public static /* synthetic */ FallbackSelectionCashOutQuota copy$default(FallbackSelectionCashOutQuota fallbackSelectionCashOutQuota, Double d, FallbackCtr fallbackCtr, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fallbackSelectionCashOutQuota.quota;
        }
        if ((i & 2) != 0) {
            fallbackCtr = fallbackSelectionCashOutQuota.ctr;
        }
        return fallbackSelectionCashOutQuota.copy(d, fallbackCtr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getQuota() {
        return this.quota;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FallbackCtr getCtr() {
        return this.ctr;
    }

    public final FallbackSelectionCashOutQuota copy(Double quota, FallbackCtr ctr) {
        return new FallbackSelectionCashOutQuota(quota, ctr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackSelectionCashOutQuota)) {
            return false;
        }
        FallbackSelectionCashOutQuota fallbackSelectionCashOutQuota = (FallbackSelectionCashOutQuota) other;
        return Intrinsics.g(this.quota, fallbackSelectionCashOutQuota.quota) && Intrinsics.g(this.ctr, fallbackSelectionCashOutQuota.ctr);
    }

    public final FallbackCtr getCtr() {
        return this.ctr;
    }

    public final Double getQuota() {
        return this.quota;
    }

    public int hashCode() {
        Double d = this.quota;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        FallbackCtr fallbackCtr = this.ctr;
        return iHashCode + (fallbackCtr != null ? fallbackCtr.hashCode() : 0);
    }

    public String toString() {
        return "FallbackSelectionCashOutQuota(quota=" + this.quota + ", ctr=" + this.ctr + ")";
    }

    public FallbackSelectionCashOutQuota(Double d, FallbackCtr fallbackCtr) {
        this.quota = d;
        this.ctr = fallbackCtr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FallbackSelectionCashOutQuota() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
