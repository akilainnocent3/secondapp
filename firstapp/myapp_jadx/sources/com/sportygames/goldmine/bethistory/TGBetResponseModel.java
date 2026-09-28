package com.sportygames.goldmine.bethistory;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.nrg0;
import defpackage.uvh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/sportygames/goldmine/bethistory/TGBetResponseModel;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userSelection", "Lcom/sportygames/goldmine/bethistory/TGUserSelectionModel;", "stakeAmount", "", "giftAmount", "payoutAmount", "currency", "", "ticketId", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/goldmine/bethistory/TGBetResultModel;", "createTime", "", "<init>", "(ILcom/sportygames/goldmine/bethistory/TGUserSelectionModel;DDDLjava/lang/String;Ljava/lang/String;Lcom/sportygames/goldmine/bethistory/TGBetResultModel;J)V", "getId", "()I", "getUserSelection", "()Lcom/sportygames/goldmine/bethistory/TGUserSelectionModel;", "getStakeAmount", "()D", "getGiftAmount", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getTicketId", "getResult", "()Lcom/sportygames/goldmine/bethistory/TGBetResultModel;", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGBetResponseModel {
    public static final int $stable = 0;
    private final long createTime;
    private final String currency;
    private final double giftAmount;
    private final int id;
    private final double payoutAmount;
    private final TGBetResultModel result;
    private final double stakeAmount;
    private final String ticketId;
    private final TGUserSelectionModel userSelection;

    public TGBetResponseModel(int i, TGUserSelectionModel tGUserSelectionModel, double d, double d2, double d3, String str, String str2, TGBetResultModel tGBetResultModel, long j) {
        tGUserSelectionModel.getClass();
        str.getClass();
        str2.getClass();
        tGBetResultModel.getClass();
        this.id = i;
        this.userSelection = tGUserSelectionModel;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.currency = str;
        this.ticketId = str2;
        this.result = tGBetResultModel;
        this.createTime = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TGUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TGBetResultModel getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final TGBetResponseModel copy(int id, TGUserSelectionModel userSelection, double stakeAmount, double giftAmount, double payoutAmount, String currency, String ticketId, TGBetResultModel result, long createTime) {
        userSelection.getClass();
        currency.getClass();
        ticketId.getClass();
        result.getClass();
        return new TGBetResponseModel(id, userSelection, stakeAmount, giftAmount, payoutAmount, currency, ticketId, result, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGBetResponseModel)) {
            return false;
        }
        TGBetResponseModel tGBetResponseModel = (TGBetResponseModel) other;
        return this.id == tGBetResponseModel.id && Intrinsics.g(this.userSelection, tGBetResponseModel.userSelection) && Double.compare(this.stakeAmount, tGBetResponseModel.stakeAmount) == 0 && Double.compare(this.giftAmount, tGBetResponseModel.giftAmount) == 0 && Double.compare(this.payoutAmount, tGBetResponseModel.payoutAmount) == 0 && Intrinsics.g(this.currency, tGBetResponseModel.currency) && Intrinsics.g(this.ticketId, tGBetResponseModel.ticketId) && Intrinsics.g(this.result, tGBetResponseModel.result) && this.createTime == tGBetResponseModel.createTime;
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

    public final TGBetResultModel getResult() {
        return this.result;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final TGUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + ((this.result.hashCode() + gmf0.a(gmf0.a(nrg0.a(nrg0.a(nrg0.a((this.userSelection.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.stakeAmount), 31, this.giftAmount), 31, this.payoutAmount), 31, this.currency), 31, this.ticketId)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGBetResponseModel(id=");
        sb.append(this.id);
        sb.append(", userSelection=");
        sb.append(this.userSelection);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", payoutAmount=");
        sb.append(this.payoutAmount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", createTime=");
        return uvh.a(sb, this.createTime, ')');
    }
}
