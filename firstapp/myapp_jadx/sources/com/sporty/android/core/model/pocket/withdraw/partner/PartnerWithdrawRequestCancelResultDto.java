package com.sporty.android.core.model.pocket.withdraw.partner;

import com.appsflyer.internal.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\tHÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b#¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawRequestCancelResultDto;", "", "tradeId", "", "acceptTime", "", "initAmount", "cancelFee", "flowStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)V", "getTradeId", "()Ljava/lang/String;", "getAcceptTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInitAmount", "getCancelFee", "getFlowStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawRequestCancelResultDto;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PartnerWithdrawRequestCancelResultDto {
    private final Long acceptTime;
    private final Long cancelFee;
    private final Integer flowStatus;
    private final Long initAmount;
    private final String tradeId;

    public PartnerWithdrawRequestCancelResultDto(String str, Long l, Long l2, Long l3, Integer num) {
        this.tradeId = str;
        this.acceptTime = l;
        this.initAmount = l2;
        this.cancelFee = l3;
        this.flowStatus = num;
    }

    public static /* synthetic */ PartnerWithdrawRequestCancelResultDto copy$default(PartnerWithdrawRequestCancelResultDto partnerWithdrawRequestCancelResultDto, String str, Long l, Long l2, Long l3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerWithdrawRequestCancelResultDto.tradeId;
        }
        if ((i & 2) != 0) {
            l = partnerWithdrawRequestCancelResultDto.acceptTime;
        }
        if ((i & 4) != 0) {
            l2 = partnerWithdrawRequestCancelResultDto.initAmount;
        }
        if ((i & 8) != 0) {
            l3 = partnerWithdrawRequestCancelResultDto.cancelFee;
        }
        if ((i & 16) != 0) {
            num = partnerWithdrawRequestCancelResultDto.flowStatus;
        }
        Integer num2 = num;
        Long l4 = l2;
        return partnerWithdrawRequestCancelResultDto.copy(str, l, l4, l3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAcceptTime() {
        return this.acceptTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getInitAmount() {
        return this.initAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCancelFee() {
        return this.cancelFee;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFlowStatus() {
        return this.flowStatus;
    }

    public final PartnerWithdrawRequestCancelResultDto copy(String tradeId, Long acceptTime, Long initAmount, Long cancelFee, Integer flowStatus) {
        return new PartnerWithdrawRequestCancelResultDto(tradeId, acceptTime, initAmount, cancelFee, flowStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerWithdrawRequestCancelResultDto)) {
            return false;
        }
        PartnerWithdrawRequestCancelResultDto partnerWithdrawRequestCancelResultDto = (PartnerWithdrawRequestCancelResultDto) other;
        return Intrinsics.g(this.tradeId, partnerWithdrawRequestCancelResultDto.tradeId) && Intrinsics.g(this.acceptTime, partnerWithdrawRequestCancelResultDto.acceptTime) && Intrinsics.g(this.initAmount, partnerWithdrawRequestCancelResultDto.initAmount) && Intrinsics.g(this.cancelFee, partnerWithdrawRequestCancelResultDto.cancelFee) && Intrinsics.g(this.flowStatus, partnerWithdrawRequestCancelResultDto.flowStatus);
    }

    public final Long getAcceptTime() {
        return this.acceptTime;
    }

    public final Long getCancelFee() {
        return this.cancelFee;
    }

    public final Integer getFlowStatus() {
        return this.flowStatus;
    }

    public final Long getInitAmount() {
        return this.initAmount;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.acceptTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.initAmount;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.cancelFee;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.flowStatus;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.tradeId;
        Long l = this.acceptTime;
        Long l2 = this.initAmount;
        Long l3 = this.cancelFee;
        Integer num = this.flowStatus;
        StringBuilder sb = new StringBuilder("PartnerWithdrawRequestCancelResultDto(tradeId=");
        sb.append(str);
        sb.append(", acceptTime=");
        sb.append(l);
        sb.append(", initAmount=");
        sb.append(l2);
        sb.append(", cancelFee=");
        sb.append(l3);
        sb.append(", flowStatus=");
        return v.a(sb, num, ")");
    }
}
