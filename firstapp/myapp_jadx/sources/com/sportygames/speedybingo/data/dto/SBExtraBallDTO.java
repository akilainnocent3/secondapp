package com.sportygames.speedybingo.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.uvh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006,"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBExtraBallDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "stakeAmount", "", "giftAmount", "payoutAmount", "currency", "", "ticketId", "", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "createTime", "<init>", "(JDDDLjava/lang/String;ILcom/sportygames/speedybingo/data/dto/SBGameResultDTO;J)V", "getId", "()J", "getStakeAmount", "()D", "getGiftAmount", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getTicketId", "()I", "getResult", "()Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBExtraBallDTO {
    public static final int $stable = 8;
    private final long createTime;
    private final String currency;
    private final double giftAmount;
    private final long id;
    private final double payoutAmount;
    private final SBGameResultDTO result;
    private final double stakeAmount;
    private final int ticketId;

    public SBExtraBallDTO(long j, double d, double d2, double d3, String str, int i, SBGameResultDTO sBGameResultDTO, long j2) {
        str.getClass();
        sBGameResultDTO.getClass();
        this.id = j;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.currency = str;
        this.ticketId = i;
        this.result = sBGameResultDTO;
        this.createTime = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
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
    public final int getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SBGameResultDTO getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final SBExtraBallDTO copy(long id, double stakeAmount, double giftAmount, double payoutAmount, String currency, int ticketId, SBGameResultDTO result, long createTime) {
        currency.getClass();
        result.getClass();
        return new SBExtraBallDTO(id, stakeAmount, giftAmount, payoutAmount, currency, ticketId, result, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBExtraBallDTO)) {
            return false;
        }
        SBExtraBallDTO sBExtraBallDTO = (SBExtraBallDTO) other;
        return this.id == sBExtraBallDTO.id && Double.compare(this.stakeAmount, sBExtraBallDTO.stakeAmount) == 0 && Double.compare(this.giftAmount, sBExtraBallDTO.giftAmount) == 0 && Double.compare(this.payoutAmount, sBExtraBallDTO.payoutAmount) == 0 && Intrinsics.g(this.currency, sBExtraBallDTO.currency) && this.ticketId == sBExtraBallDTO.ticketId && Intrinsics.g(this.result, sBExtraBallDTO.result) && this.createTime == sBExtraBallDTO.createTime;
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

    public final long getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final SBGameResultDTO getResult() {
        return this.result;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final int getTicketId() {
        return this.ticketId;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + ((this.result.hashCode() + gpp.a(this.ticketId, gmf0.a(nrg0.a(nrg0.a(nrg0.a(Long.hashCode(this.id) * 31, 31, this.stakeAmount), 31, this.giftAmount), 31, this.payoutAmount), 31, this.currency), 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBExtraBallDTO(id=");
        sb.append(this.id);
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
