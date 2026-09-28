package com.sporty.android.core.model.autobet;

import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/autobet/LatestHistory;", "", "orderId", "", "triggerOdds", "failedReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getTriggerOdds", "getFailedReason", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LatestHistory {
    private final String failedReason;
    private final String orderId;
    private final String triggerOdds;

    public LatestHistory(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.orderId = str;
        this.triggerOdds = str2;
        this.failedReason = str3;
    }

    public static /* synthetic */ LatestHistory copy$default(LatestHistory latestHistory, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = latestHistory.orderId;
        }
        if ((i & 2) != 0) {
            str2 = latestHistory.triggerOdds;
        }
        if ((i & 4) != 0) {
            str3 = latestHistory.failedReason;
        }
        return latestHistory.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTriggerOdds() {
        return this.triggerOdds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFailedReason() {
        return this.failedReason;
    }

    public final LatestHistory copy(String orderId, String triggerOdds, String failedReason) {
        orderId.getClass();
        triggerOdds.getClass();
        return new LatestHistory(orderId, triggerOdds, failedReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestHistory)) {
            return false;
        }
        LatestHistory latestHistory = (LatestHistory) other;
        return Intrinsics.g(this.orderId, latestHistory.orderId) && Intrinsics.g(this.triggerOdds, latestHistory.triggerOdds) && Intrinsics.g(this.failedReason, latestHistory.failedReason);
    }

    public final String getFailedReason() {
        return this.failedReason;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getTriggerOdds() {
        return this.triggerOdds;
    }

    public int hashCode() {
        int iA = gmf0.a(this.orderId.hashCode() * 31, 31, this.triggerOdds);
        String str = this.failedReason;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.triggerOdds;
        return uf80.a(ux5.a("LatestHistory(orderId=", str, ", triggerOdds=", str2, ", failedReason="), this.failedReason, ")");
    }
}
