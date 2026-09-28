package com.sporty.android.core.model.cashout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/cashout/FallbackQuota;", "", "quota", "", "<init>", "(D)V", "getQuota", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FallbackQuota {
    private final double quota;

    public /* synthetic */ FallbackQuota(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d);
    }

    public static /* synthetic */ FallbackQuota copy$default(FallbackQuota fallbackQuota, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fallbackQuota.quota;
        }
        return fallbackQuota.copy(d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getQuota() {
        return this.quota;
    }

    public final FallbackQuota copy(double quota) {
        return new FallbackQuota(quota);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FallbackQuota) && Double.compare(this.quota, ((FallbackQuota) other).quota) == 0;
    }

    public final double getQuota() {
        return this.quota;
    }

    public int hashCode() {
        return Double.hashCode(this.quota);
    }

    public String toString() {
        return "FallbackQuota(quota=" + this.quota + ")";
    }

    public FallbackQuota(double d) {
        this.quota = d;
    }

    public FallbackQuota() {
        this(0.0d, 1, null);
    }
}
