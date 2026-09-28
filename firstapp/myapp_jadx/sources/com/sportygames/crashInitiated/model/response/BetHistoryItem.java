package com.sportygames.crashInitiated.model.response;

import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.hxa;
import defpackage.lsv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J¦\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010*\"\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/sportygames/crashInitiated/model/response/BetHistoryItem;", "Lcom/sportygames/commons/models/BetHistoryBase;", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "stakeAmount", "", "giftAmount", "payoutAmount", "actualDebitedAmount", "actualCreditedAmount", "houseCoefficient", "userCoefficient", "ticketId", "currency", "", "createdAt", "isExpanded", "", "<init>", "(JLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "setId", "(J)V", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftAmount", "getPayoutAmount", "getActualDebitedAmount", "getActualCreditedAmount", "getHouseCoefficient", "getUserCoefficient", "getTicketId", "getCurrency", "()Ljava/lang/String;", "getCreatedAt", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(JLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Lcom/sportygames/crashInitiated/model/response/BetHistoryItem;", "equals", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements BetHistoryBase {
    public static final int $stable = 8;
    private final Double actualCreditedAmount;
    private final Double actualDebitedAmount;
    private final String createdAt;
    private final String currency;
    private final Double giftAmount;
    private final Double houseCoefficient;
    private long id;
    private boolean isExpanded;
    private final Double payoutAmount;
    private final Double stakeAmount;
    private final Integer ticketId;
    private final Double userCoefficient;
    private final Integer userId;

    public BetHistoryItem(long j, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num2, String str, String str2, boolean z) {
        this.id = j;
        this.userId = num;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.actualDebitedAmount = d4;
        this.actualCreditedAmount = d5;
        this.houseCoefficient = d6;
        this.userCoefficient = d7;
        this.ticketId = num2;
        this.currency = str;
        this.createdAt = str2;
        this.isExpanded = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getUserCoefficient() {
        return this.userCoefficient;
    }

    public final BetHistoryItem copy(long id, Integer userId, Double stakeAmount, Double giftAmount, Double payoutAmount, Double actualDebitedAmount, Double actualCreditedAmount, Double houseCoefficient, Double userCoefficient, Integer ticketId, String currency, String createdAt, boolean isExpanded) {
        return new BetHistoryItem(id, userId, stakeAmount, giftAmount, payoutAmount, actualDebitedAmount, actualCreditedAmount, houseCoefficient, userCoefficient, ticketId, currency, createdAt, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return this.id == betHistoryItem.id && Intrinsics.g(this.userId, betHistoryItem.userId) && Intrinsics.g(this.stakeAmount, betHistoryItem.stakeAmount) && Intrinsics.g(this.giftAmount, betHistoryItem.giftAmount) && Intrinsics.g(this.payoutAmount, betHistoryItem.payoutAmount) && Intrinsics.g(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) && Intrinsics.g(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) && Intrinsics.g(this.houseCoefficient, betHistoryItem.houseCoefficient) && Intrinsics.g(this.userCoefficient, betHistoryItem.userCoefficient) && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.currency, betHistoryItem.currency) && Intrinsics.g(this.createdAt, betHistoryItem.createdAt) && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final Double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final Double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Integer getTicketId() {
        return this.ticketId;
    }

    public final Double getUserCoefficient() {
        return this.userCoefficient;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        Integer num = this.userId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.payoutAmount;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.actualDebitedAmount;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.actualCreditedAmount;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.houseCoefficient;
        int iHashCode8 = (iHashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.userCoefficient;
        int iHashCode9 = (iHashCode8 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num2 = this.ticketId;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdAt;
        return Boolean.hashCode(this.isExpanded) + ((iHashCode11 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String toString() {
        long j = this.id;
        Integer num = this.userId;
        Double d = this.stakeAmount;
        Double d2 = this.giftAmount;
        Double d3 = this.payoutAmount;
        Double d4 = this.actualDebitedAmount;
        Double d5 = this.actualCreditedAmount;
        Double d6 = this.houseCoefficient;
        Double d7 = this.userCoefficient;
        Integer num2 = this.ticketId;
        String str = this.currency;
        String str2 = this.createdAt;
        boolean z = this.isExpanded;
        StringBuilder sb = new StringBuilder("BetHistoryItem(id=");
        sb.append(j);
        sb.append(", userId=");
        sb.append(num);
        lsv.a(d, d2, ", stakeAmount=", ", giftAmount=", sb);
        lsv.a(d3, d4, ", payoutAmount=", ", actualDebitedAmount=", sb);
        lsv.a(d5, d6, ", actualCreditedAmount=", ", houseCoefficient=", sb);
        sb.append(", userCoefficient=");
        sb.append(d7);
        sb.append(", ticketId=");
        sb.append(num2);
        hxa.c(sb, ", currency=", str, ", createdAt=", str2);
        return w.a(sb, ", isExpanded=", z, ")");
    }
}
