package com.sporty.android.core.model.pocket.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/DefaultLimitAmountData;", "", "minimumDepositAmount", "", "maximumDepositAmount", "minimumWithdrawalAmount", "maximumWithdrawalAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getMinimumDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaximumDepositAmount", "getMinimumWithdrawalAmount", "getMaximumWithdrawalAmount", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sporty/android/core/model/pocket/common/DefaultLimitAmountData;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DefaultLimitAmountData {
    private final Double maximumDepositAmount;
    private final Double maximumWithdrawalAmount;
    private final Double minimumDepositAmount;
    private final Double minimumWithdrawalAmount;

    public DefaultLimitAmountData(Double d, Double d2, Double d3, Double d4) {
        this.minimumDepositAmount = d;
        this.maximumDepositAmount = d2;
        this.minimumWithdrawalAmount = d3;
        this.maximumWithdrawalAmount = d4;
    }

    public static /* synthetic */ DefaultLimitAmountData copy$default(DefaultLimitAmountData defaultLimitAmountData, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = defaultLimitAmountData.minimumDepositAmount;
        }
        if ((i & 2) != 0) {
            d2 = defaultLimitAmountData.maximumDepositAmount;
        }
        if ((i & 4) != 0) {
            d3 = defaultLimitAmountData.minimumWithdrawalAmount;
        }
        if ((i & 8) != 0) {
            d4 = defaultLimitAmountData.maximumWithdrawalAmount;
        }
        return defaultLimitAmountData.copy(d, d2, d3, d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getMinimumDepositAmount() {
        return this.minimumDepositAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMaximumDepositAmount() {
        return this.maximumDepositAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMinimumWithdrawalAmount() {
        return this.minimumWithdrawalAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMaximumWithdrawalAmount() {
        return this.maximumWithdrawalAmount;
    }

    public final DefaultLimitAmountData copy(Double minimumDepositAmount, Double maximumDepositAmount, Double minimumWithdrawalAmount, Double maximumWithdrawalAmount) {
        return new DefaultLimitAmountData(minimumDepositAmount, maximumDepositAmount, minimumWithdrawalAmount, maximumWithdrawalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultLimitAmountData)) {
            return false;
        }
        DefaultLimitAmountData defaultLimitAmountData = (DefaultLimitAmountData) other;
        return Intrinsics.g(this.minimumDepositAmount, defaultLimitAmountData.minimumDepositAmount) && Intrinsics.g(this.maximumDepositAmount, defaultLimitAmountData.maximumDepositAmount) && Intrinsics.g(this.minimumWithdrawalAmount, defaultLimitAmountData.minimumWithdrawalAmount) && Intrinsics.g(this.maximumWithdrawalAmount, defaultLimitAmountData.maximumWithdrawalAmount);
    }

    public final Double getMaximumDepositAmount() {
        return this.maximumDepositAmount;
    }

    public final Double getMaximumWithdrawalAmount() {
        return this.maximumWithdrawalAmount;
    }

    public final Double getMinimumDepositAmount() {
        return this.minimumDepositAmount;
    }

    public final Double getMinimumWithdrawalAmount() {
        return this.minimumWithdrawalAmount;
    }

    public int hashCode() {
        Double d = this.minimumDepositAmount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.maximumDepositAmount;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.minimumWithdrawalAmount;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.maximumWithdrawalAmount;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "DefaultLimitAmountData(minimumDepositAmount=" + this.minimumDepositAmount + ", maximumDepositAmount=" + this.maximumDepositAmount + ", minimumWithdrawalAmount=" + this.minimumWithdrawalAmount + ", maximumWithdrawalAmount=" + this.maximumWithdrawalAmount + ")";
    }
}
