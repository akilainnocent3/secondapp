package com.sportygames.nightnday.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j26;
import defpackage.nrg0;
import defpackage.qn4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u0088\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u00067"}, d2 = {"Lcom/sportygames/nightnday/data/dto/NNDBetHistoryDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "stakeAmount", "", "giftAmount", "payoutAmount", "actualDebitedAmount", "actualCreditedAmount", "userPick", "", "houseDraw", "ticketId", "currency", "createdAt", "<init>", "(IIDLjava/lang/Double;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getUserId", "getStakeAmount", "()D", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPayoutAmount", "getActualDebitedAmount", "getActualCreditedAmount", "getUserPick", "()Ljava/lang/String;", "getHouseDraw", "getTicketId", "getCurrency", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(IIDLjava/lang/Double;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/nightnday/data/dto/NNDBetHistoryDTO;", "equals", "", "other", "hashCode", "toString", "game-nightnday_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NNDBetHistoryDTO {
    public static final int $stable = 0;
    private final double actualCreditedAmount;
    private final double actualDebitedAmount;
    private final String createdAt;
    private final String currency;
    private final Double giftAmount;
    private final String houseDraw;
    private final int id;
    private final double payoutAmount;
    private final double stakeAmount;
    private final String ticketId;
    private final int userId;
    private final String userPick;

    public NNDBetHistoryDTO(int i, int i2, double d, Double d2, double d3, double d4, double d5, String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.id = i;
        this.userId = i2;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.actualDebitedAmount = d4;
        this.actualCreditedAmount = d5;
        this.userPick = str;
        this.houseDraw = str2;
        this.ticketId = str3;
        this.currency = str4;
        this.createdAt = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTicketId() {
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

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHouseDraw() {
        return this.houseDraw;
    }

    public final NNDBetHistoryDTO copy(int id, int userId, double stakeAmount, Double giftAmount, double payoutAmount, double actualDebitedAmount, double actualCreditedAmount, String userPick, String houseDraw, String ticketId, String currency, String createdAt) {
        userPick.getClass();
        houseDraw.getClass();
        ticketId.getClass();
        currency.getClass();
        createdAt.getClass();
        return new NNDBetHistoryDTO(id, userId, stakeAmount, giftAmount, payoutAmount, actualDebitedAmount, actualCreditedAmount, userPick, houseDraw, ticketId, currency, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NNDBetHistoryDTO)) {
            return false;
        }
        NNDBetHistoryDTO nNDBetHistoryDTO = (NNDBetHistoryDTO) other;
        return this.id == nNDBetHistoryDTO.id && this.userId == nNDBetHistoryDTO.userId && Double.compare(this.stakeAmount, nNDBetHistoryDTO.stakeAmount) == 0 && Intrinsics.g(this.giftAmount, nNDBetHistoryDTO.giftAmount) && Double.compare(this.payoutAmount, nNDBetHistoryDTO.payoutAmount) == 0 && Double.compare(this.actualDebitedAmount, nNDBetHistoryDTO.actualDebitedAmount) == 0 && Double.compare(this.actualCreditedAmount, nNDBetHistoryDTO.actualCreditedAmount) == 0 && Intrinsics.g(this.userPick, nNDBetHistoryDTO.userPick) && Intrinsics.g(this.houseDraw, nNDBetHistoryDTO.houseDraw) && Intrinsics.g(this.ticketId, nNDBetHistoryDTO.ticketId) && Intrinsics.g(this.currency, nNDBetHistoryDTO.currency) && Intrinsics.g(this.createdAt, nNDBetHistoryDTO.createdAt);
    }

    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final double getActualDebitedAmount() {
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

    public final String getHouseDraw() {
        return this.houseDraw;
    }

    public final int getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = nrg0.a(gpp.a(this.userId, Integer.hashCode(this.id) * 31, 31), 31, this.stakeAmount);
        Double d = this.giftAmount;
        return this.createdAt.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(nrg0.a(nrg0.a(nrg0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.payoutAmount), 31, this.actualDebitedAmount), 31, this.actualCreditedAmount), 31, this.userPick), 31, this.houseDraw), 31, this.ticketId), 31, this.currency);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NNDBetHistoryDTO(id=");
        sb.append(this.id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", payoutAmount=");
        sb.append(this.payoutAmount);
        sb.append(", actualDebitedAmount=");
        sb.append(this.actualDebitedAmount);
        sb.append(", actualCreditedAmount=");
        sb.append(this.actualCreditedAmount);
        sb.append(", userPick=");
        sb.append(this.userPick);
        sb.append(", houseDraw=");
        sb.append(this.houseDraw);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", createdAt=");
        return j26.a(sb, this.createdAt, ')');
    }
}
