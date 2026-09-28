package com.sportygames.wheelanddeal.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.nrg0;
import defpackage.org0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00061"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDBetResponseModel;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userSelection", "Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;", "stakeAmount", "", "payoutAmount", "currency", "", "ticketId", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/wheelanddeal/model/WDBetResultModel;", "createTime", "", "giftAmount", "<init>", "(ILcom/sportygames/wheelanddeal/model/WDUserSelectionModel;DDLjava/lang/String;Ljava/lang/String;Lcom/sportygames/wheelanddeal/model/WDBetResultModel;JD)V", "getId", "()I", "getUserSelection", "()Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;", "getStakeAmount", "()D", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getTicketId", "getResult", "()Lcom/sportygames/wheelanddeal/model/WDBetResultModel;", "getCreateTime", "()J", "getGiftAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDBetResponseModel {
    public static final int $stable = 8;
    private final long createTime;
    private final String currency;
    private final double giftAmount;
    private final int id;
    private final double payoutAmount;
    private final WDBetResultModel result;
    private final double stakeAmount;
    private final String ticketId;
    private final WDUserSelectionModel userSelection;

    public WDBetResponseModel(int i, WDUserSelectionModel wDUserSelectionModel, double d, double d2, String str, String str2, WDBetResultModel wDBetResultModel, long j, double d3) {
        wDUserSelectionModel.getClass();
        str.getClass();
        str2.getClass();
        wDBetResultModel.getClass();
        this.id = i;
        this.userSelection = wDUserSelectionModel;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.currency = str;
        this.ticketId = str2;
        this.result = wDBetResultModel;
        this.createTime = j;
        this.giftAmount = d3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WDUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WDBetResultModel getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final WDBetResponseModel copy(int id, WDUserSelectionModel userSelection, double stakeAmount, double payoutAmount, String currency, String ticketId, WDBetResultModel result, long createTime, double giftAmount) {
        userSelection.getClass();
        currency.getClass();
        ticketId.getClass();
        result.getClass();
        return new WDBetResponseModel(id, userSelection, stakeAmount, payoutAmount, currency, ticketId, result, createTime, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDBetResponseModel)) {
            return false;
        }
        WDBetResponseModel wDBetResponseModel = (WDBetResponseModel) other;
        return this.id == wDBetResponseModel.id && Intrinsics.g(this.userSelection, wDBetResponseModel.userSelection) && Double.compare(this.stakeAmount, wDBetResponseModel.stakeAmount) == 0 && Double.compare(this.payoutAmount, wDBetResponseModel.payoutAmount) == 0 && Intrinsics.g(this.currency, wDBetResponseModel.currency) && Intrinsics.g(this.ticketId, wDBetResponseModel.ticketId) && Intrinsics.g(this.result, wDBetResponseModel.result) && this.createTime == wDBetResponseModel.createTime && Double.compare(this.giftAmount, wDBetResponseModel.giftAmount) == 0;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final int getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final WDBetResultModel getResult() {
        return this.result;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final WDUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        return Double.hashCode(this.giftAmount) + f87.a((this.result.hashCode() + gmf0.a(gmf0.a(nrg0.a(nrg0.a((this.userSelection.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.stakeAmount), 31, this.payoutAmount), 31, this.currency), 31, this.ticketId)) * 31, this.createTime, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDBetResponseModel(id=");
        sb.append(this.id);
        sb.append(", userSelection=");
        sb.append(this.userSelection);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", payoutAmount=");
        sb.append(this.payoutAmount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", giftAmount=");
        return org0.a(sb, this.giftAmount, ')');
    }
}
