package com.sporty.android.core.model.cashout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "", "quota", "", "cashoutCountQuota", "", "<init>", "(DI)V", "getQuota", "()D", "getCashoutCountQuota", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FallbackUserCashOutQuota {
    private final int cashoutCountQuota;
    private final double quota;

    public /* synthetic */ FallbackUserCashOutQuota(double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ FallbackUserCashOutQuota copy$default(FallbackUserCashOutQuota fallbackUserCashOutQuota, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = fallbackUserCashOutQuota.quota;
        }
        if ((i2 & 2) != 0) {
            i = fallbackUserCashOutQuota.cashoutCountQuota;
        }
        return fallbackUserCashOutQuota.copy(d, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getQuota() {
        return this.quota;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCashoutCountQuota() {
        return this.cashoutCountQuota;
    }

    public final FallbackUserCashOutQuota copy(double quota, int cashoutCountQuota) {
        return new FallbackUserCashOutQuota(quota, cashoutCountQuota);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackUserCashOutQuota)) {
            return false;
        }
        FallbackUserCashOutQuota fallbackUserCashOutQuota = (FallbackUserCashOutQuota) other;
        return Double.compare(this.quota, fallbackUserCashOutQuota.quota) == 0 && this.cashoutCountQuota == fallbackUserCashOutQuota.cashoutCountQuota;
    }

    public final int getCashoutCountQuota() {
        return this.cashoutCountQuota;
    }

    public final double getQuota() {
        return this.quota;
    }

    public int hashCode() {
        return Integer.hashCode(this.cashoutCountQuota) + (Double.hashCode(this.quota) * 31);
    }

    public String toString() {
        return "FallbackUserCashOutQuota(quota=" + this.quota + ", cashoutCountQuota=" + this.cashoutCountQuota + ")";
    }

    public FallbackUserCashOutQuota(double d, int i) {
        this.quota = d;
        this.cashoutCountQuota = i;
    }

    public FallbackUserCashOutQuota() {
        this(0.0d, 0, 3, null);
    }
}
