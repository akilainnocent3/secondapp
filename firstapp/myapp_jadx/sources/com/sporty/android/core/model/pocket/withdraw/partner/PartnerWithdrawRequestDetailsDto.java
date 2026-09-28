package com.sporty.android.core.model.pocket.withdraw.partner;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.oie;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\nHÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015Ê\u0001\u0002\b;¨\u0006:"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawRequestDetailsDto;", "", "tradeId", "", "requestTime", "", "ptnCode", "initAmount", "currency", AnalyticsParam.EVENT_STATUS, "", "pin", "cancelFee", "ptnFee", "ptnInfo", "approveTime", "finishTime", "playerPhone", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getTradeId", "()Ljava/lang/String;", "getRequestTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPtnCode", "getInitAmount", "getCurrency", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPin", "getCancelFee", "getPtnFee", "getPtnInfo", "getApproveTime", "getFinishTime", "getPlayerPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawRequestDetailsDto;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PartnerWithdrawRequestDetailsDto {
    private final Long approveTime;
    private final Long cancelFee;
    private final String currency;
    private final Long finishTime;
    private final Long initAmount;
    private final String pin;
    private final String playerPhone;
    private final String ptnCode;
    private final Long ptnFee;
    private final String ptnInfo;
    private final Long requestTime;
    private final Integer status;
    private final String tradeId;

    public PartnerWithdrawRequestDetailsDto(String str, Long l, String str2, Long l2, String str3, Integer num, String str4, Long l3, Long l4, String str5, Long l5, Long l6, String str6) {
        this.tradeId = str;
        this.requestTime = l;
        this.ptnCode = str2;
        this.initAmount = l2;
        this.currency = str3;
        this.status = num;
        this.pin = str4;
        this.cancelFee = l3;
        this.ptnFee = l4;
        this.ptnInfo = str5;
        this.approveTime = l5;
        this.finishTime = l6;
        this.playerPhone = str6;
    }

    public static /* synthetic */ PartnerWithdrawRequestDetailsDto copy$default(PartnerWithdrawRequestDetailsDto partnerWithdrawRequestDetailsDto, String str, Long l, String str2, Long l2, String str3, Integer num, String str4, Long l3, Long l4, String str5, Long l5, Long l6, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerWithdrawRequestDetailsDto.tradeId;
        }
        return partnerWithdrawRequestDetailsDto.copy(str, (i & 2) != 0 ? partnerWithdrawRequestDetailsDto.requestTime : l, (i & 4) != 0 ? partnerWithdrawRequestDetailsDto.ptnCode : str2, (i & 8) != 0 ? partnerWithdrawRequestDetailsDto.initAmount : l2, (i & 16) != 0 ? partnerWithdrawRequestDetailsDto.currency : str3, (i & 32) != 0 ? partnerWithdrawRequestDetailsDto.status : num, (i & 64) != 0 ? partnerWithdrawRequestDetailsDto.pin : str4, (i & 128) != 0 ? partnerWithdrawRequestDetailsDto.cancelFee : l3, (i & 256) != 0 ? partnerWithdrawRequestDetailsDto.ptnFee : l4, (i & 512) != 0 ? partnerWithdrawRequestDetailsDto.ptnInfo : str5, (i & 1024) != 0 ? partnerWithdrawRequestDetailsDto.approveTime : l5, (i & 2048) != 0 ? partnerWithdrawRequestDetailsDto.finishTime : l6, (i & 4096) != 0 ? partnerWithdrawRequestDetailsDto.playerPhone : str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPtnInfo() {
        return this.ptnInfo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getApproveTime() {
        return this.approveTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getFinishTime() {
        return this.finishTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPlayerPhone() {
        return this.playerPhone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRequestTime() {
        return this.requestTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPtnCode() {
        return this.ptnCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getInitAmount() {
        return this.initAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getCancelFee() {
        return this.cancelFee;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getPtnFee() {
        return this.ptnFee;
    }

    public final PartnerWithdrawRequestDetailsDto copy(String tradeId, Long requestTime, String ptnCode, Long initAmount, String currency, Integer status, String pin, Long cancelFee, Long ptnFee, String ptnInfo, Long approveTime, Long finishTime, String playerPhone) {
        return new PartnerWithdrawRequestDetailsDto(tradeId, requestTime, ptnCode, initAmount, currency, status, pin, cancelFee, ptnFee, ptnInfo, approveTime, finishTime, playerPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerWithdrawRequestDetailsDto)) {
            return false;
        }
        PartnerWithdrawRequestDetailsDto partnerWithdrawRequestDetailsDto = (PartnerWithdrawRequestDetailsDto) other;
        return Intrinsics.g(this.tradeId, partnerWithdrawRequestDetailsDto.tradeId) && Intrinsics.g(this.requestTime, partnerWithdrawRequestDetailsDto.requestTime) && Intrinsics.g(this.ptnCode, partnerWithdrawRequestDetailsDto.ptnCode) && Intrinsics.g(this.initAmount, partnerWithdrawRequestDetailsDto.initAmount) && Intrinsics.g(this.currency, partnerWithdrawRequestDetailsDto.currency) && Intrinsics.g(this.status, partnerWithdrawRequestDetailsDto.status) && Intrinsics.g(this.pin, partnerWithdrawRequestDetailsDto.pin) && Intrinsics.g(this.cancelFee, partnerWithdrawRequestDetailsDto.cancelFee) && Intrinsics.g(this.ptnFee, partnerWithdrawRequestDetailsDto.ptnFee) && Intrinsics.g(this.ptnInfo, partnerWithdrawRequestDetailsDto.ptnInfo) && Intrinsics.g(this.approveTime, partnerWithdrawRequestDetailsDto.approveTime) && Intrinsics.g(this.finishTime, partnerWithdrawRequestDetailsDto.finishTime) && Intrinsics.g(this.playerPhone, partnerWithdrawRequestDetailsDto.playerPhone);
    }

    public final Long getApproveTime() {
        return this.approveTime;
    }

    public final Long getCancelFee() {
        return this.cancelFee;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getFinishTime() {
        return this.finishTime;
    }

    public final Long getInitAmount() {
        return this.initAmount;
    }

    public final String getPin() {
        return this.pin;
    }

    public final String getPlayerPhone() {
        return this.playerPhone;
    }

    public final String getPtnCode() {
        return this.ptnCode;
    }

    public final Long getPtnFee() {
        return this.ptnFee;
    }

    public final String getPtnInfo() {
        return this.ptnInfo;
    }

    public final Long getRequestTime() {
        return this.requestTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.requestTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.ptnCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.initAmount;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.pin;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.cancelFee;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.ptnFee;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.ptnInfo;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l5 = this.approveTime;
        int iHashCode11 = (iHashCode10 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.finishTime;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str6 = this.playerPhone;
        return iHashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.tradeId;
        Long l = this.requestTime;
        String str2 = this.ptnCode;
        Long l2 = this.initAmount;
        String str3 = this.currency;
        Integer num = this.status;
        String str4 = this.pin;
        Long l3 = this.cancelFee;
        Long l4 = this.ptnFee;
        String str5 = this.ptnInfo;
        Long l5 = this.approveTime;
        Long l6 = this.finishTime;
        String str6 = this.playerPhone;
        StringBuilder sb = new StringBuilder("PartnerWithdrawRequestDetailsDto(tradeId=");
        sb.append(str);
        sb.append(", requestTime=");
        sb.append(l);
        sb.append(", ptnCode=");
        sb.append(str2);
        sb.append(", initAmount=");
        sb.append(l2);
        sb.append(", currency=");
        oie.a(num, str3, ", status=", ", pin=", sb);
        sb.append(str4);
        sb.append(", cancelFee=");
        sb.append(l3);
        sb.append(", ptnFee=");
        sb.append(l4);
        sb.append(", ptnInfo=");
        sb.append(str5);
        sb.append(", approveTime=");
        sb.append(l5);
        sb.append(", finishTime=");
        sb.append(l6);
        sb.append(", playerPhone=");
        return uf80.a(sb, str6, ")");
    }
}
