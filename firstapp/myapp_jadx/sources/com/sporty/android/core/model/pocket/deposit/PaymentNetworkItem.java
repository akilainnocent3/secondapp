package com.sporty.android.core.model.pocket.deposit;

import defpackage.k800;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/PaymentNetworkItem;", "", "network", "", "displayAlert", "", "successRate", "rateDropLimit", "", "autoFailoverRate", "assetAction", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getNetwork", "()Ljava/lang/String;", "getDisplayAlert", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuccessRate", "getRateDropLimit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAutoFailoverRate", "getAssetAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/PaymentNetworkItem;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PaymentNetworkItem {
    private final String assetAction;
    private final Double autoFailoverRate;
    private final Boolean displayAlert;
    private final String network;
    private final Double rateDropLimit;
    private final String successRate;

    public PaymentNetworkItem(String str, Boolean bool, String str2, Double d, Double d2, String str3) {
        this.network = str;
        this.displayAlert = bool;
        this.successRate = str2;
        this.rateDropLimit = d;
        this.autoFailoverRate = d2;
        this.assetAction = str3;
    }

    public static /* synthetic */ PaymentNetworkItem copy$default(PaymentNetworkItem paymentNetworkItem, String str, Boolean bool, String str2, Double d, Double d2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentNetworkItem.network;
        }
        if ((i & 2) != 0) {
            bool = paymentNetworkItem.displayAlert;
        }
        if ((i & 4) != 0) {
            str2 = paymentNetworkItem.successRate;
        }
        if ((i & 8) != 0) {
            d = paymentNetworkItem.rateDropLimit;
        }
        if ((i & 16) != 0) {
            d2 = paymentNetworkItem.autoFailoverRate;
        }
        if ((i & 32) != 0) {
            str3 = paymentNetworkItem.assetAction;
        }
        Double d3 = d2;
        String str4 = str3;
        return paymentNetworkItem.copy(str, bool, str2, d, d3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDisplayAlert() {
        return this.displayAlert;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuccessRate() {
        return this.successRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getRateDropLimit() {
        return this.rateDropLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAutoFailoverRate() {
        return this.autoFailoverRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAssetAction() {
        return this.assetAction;
    }

    public final PaymentNetworkItem copy(String network, Boolean displayAlert, String successRate, Double rateDropLimit, Double autoFailoverRate, String assetAction) {
        return new PaymentNetworkItem(network, displayAlert, successRate, rateDropLimit, autoFailoverRate, assetAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentNetworkItem)) {
            return false;
        }
        PaymentNetworkItem paymentNetworkItem = (PaymentNetworkItem) other;
        return Intrinsics.g(this.network, paymentNetworkItem.network) && Intrinsics.g(this.displayAlert, paymentNetworkItem.displayAlert) && Intrinsics.g(this.successRate, paymentNetworkItem.successRate) && Intrinsics.g(this.rateDropLimit, paymentNetworkItem.rateDropLimit) && Intrinsics.g(this.autoFailoverRate, paymentNetworkItem.autoFailoverRate) && Intrinsics.g(this.assetAction, paymentNetworkItem.assetAction);
    }

    public final String getAssetAction() {
        return this.assetAction;
    }

    public final Double getAutoFailoverRate() {
        return this.autoFailoverRate;
    }

    public final Boolean getDisplayAlert() {
        return this.displayAlert;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final Double getRateDropLimit() {
        return this.rateDropLimit;
    }

    public final String getSuccessRate() {
        return this.successRate;
    }

    public int hashCode() {
        String str = this.network;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.displayAlert;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.successRate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.rateDropLimit;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.autoFailoverRate;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.assetAction;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.network;
        Boolean bool = this.displayAlert;
        String str2 = this.successRate;
        Double d = this.rateDropLimit;
        Double d2 = this.autoFailoverRate;
        String str3 = this.assetAction;
        StringBuilder sb = new StringBuilder("PaymentNetworkItem(network=");
        sb.append(str);
        sb.append(", displayAlert=");
        sb.append(bool);
        sb.append(", successRate=");
        k800.a(d, str2, ", rateDropLimit=", ", autoFailoverRate=", sb);
        sb.append(d2);
        sb.append(", assetAction=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
