package com.sporty.android.core.model.pocket.withdraw.partner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\u0002\b#¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawResponse;", "", "tradeId", "", "initAmount", "", "feeType", "", "feeAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;)V", "getTradeId", "()Ljava/lang/String;", "getInitAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFeeType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeeAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawResponse;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PartnerWithdrawResponse {
    private final Long feeAmount;
    private final Integer feeType;
    private final Double initAmount;
    private final String tradeId;

    public PartnerWithdrawResponse(String str, Double d, Integer num, Long l) {
        this.tradeId = str;
        this.initAmount = d;
        this.feeType = num;
        this.feeAmount = l;
    }

    public static /* synthetic */ PartnerWithdrawResponse copy$default(PartnerWithdrawResponse partnerWithdrawResponse, String str, Double d, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerWithdrawResponse.tradeId;
        }
        if ((i & 2) != 0) {
            d = partnerWithdrawResponse.initAmount;
        }
        if ((i & 4) != 0) {
            num = partnerWithdrawResponse.feeType;
        }
        if ((i & 8) != 0) {
            l = partnerWithdrawResponse.feeAmount;
        }
        return partnerWithdrawResponse.copy(str, d, num, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getInitAmount() {
        return this.initAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFeeType() {
        return this.feeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getFeeAmount() {
        return this.feeAmount;
    }

    public final PartnerWithdrawResponse copy(String tradeId, Double initAmount, Integer feeType, Long feeAmount) {
        return new PartnerWithdrawResponse(tradeId, initAmount, feeType, feeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerWithdrawResponse)) {
            return false;
        }
        PartnerWithdrawResponse partnerWithdrawResponse = (PartnerWithdrawResponse) other;
        return Intrinsics.g(this.tradeId, partnerWithdrawResponse.tradeId) && Intrinsics.g(this.initAmount, partnerWithdrawResponse.initAmount) && Intrinsics.g(this.feeType, partnerWithdrawResponse.feeType) && Intrinsics.g(this.feeAmount, partnerWithdrawResponse.feeAmount);
    }

    public final Long getFeeAmount() {
        return this.feeAmount;
    }

    public final Integer getFeeType() {
        return this.feeType;
    }

    public final Double getInitAmount() {
        return this.initAmount;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.initAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.feeType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.feeAmount;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "PartnerWithdrawResponse(tradeId=" + this.tradeId + ", initAmount=" + this.initAmount + ", feeType=" + this.feeType + ", feeAmount=" + this.feeAmount + ")";
    }
}
