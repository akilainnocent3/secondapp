package com.sportygames.speedybingo.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jv\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBBetHistoryItemDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userSelection", "Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;", "giftAmount", "", "stakeAmount", "payoutAmount", "currency", "", "ticketId", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "createTime", "", "extra", "Lcom/sportygames/speedybingo/data/dto/SBExtraDTO;", "<init>", "(ILcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;Ljava/lang/Double;DDLjava/lang/String;Ljava/lang/String;Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;JLcom/sportygames/speedybingo/data/dto/SBExtraDTO;)V", "getId", "()I", "getUserSelection", "()Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStakeAmount", "()D", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getTicketId", "getResult", "()Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "getCreateTime", "()J", "getExtra", "()Lcom/sportygames/speedybingo/data/dto/SBExtraDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;Ljava/lang/Double;DDLjava/lang/String;Ljava/lang/String;Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;JLcom/sportygames/speedybingo/data/dto/SBExtraDTO;)Lcom/sportygames/speedybingo/data/dto/SBBetHistoryItemDTO;", "equals", "", "other", "hashCode", "toString", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBBetHistoryItemDTO {
    public static final int $stable = 8;
    private final long createTime;
    private final String currency;
    private final SBExtraDTO extra;
    private final Double giftAmount;
    private final int id;
    private final double payoutAmount;
    private final SBGameResultDTO result;
    private final double stakeAmount;
    private final String ticketId;
    private final SBUserSelectionDTO userSelection;

    public SBBetHistoryItemDTO(int i, SBUserSelectionDTO sBUserSelectionDTO, Double d, double d2, double d3, String str, String str2, SBGameResultDTO sBGameResultDTO, long j, SBExtraDTO sBExtraDTO) {
        sBUserSelectionDTO.getClass();
        str.getClass();
        str2.getClass();
        sBGameResultDTO.getClass();
        this.id = i;
        this.userSelection = sBUserSelectionDTO;
        this.giftAmount = d;
        this.stakeAmount = d2;
        this.payoutAmount = d3;
        this.currency = str;
        this.ticketId = str2;
        this.result = sBGameResultDTO;
        this.createTime = j;
        this.extra = sBExtraDTO;
    }

    public static /* synthetic */ SBBetHistoryItemDTO copy$default(SBBetHistoryItemDTO sBBetHistoryItemDTO, int i, SBUserSelectionDTO sBUserSelectionDTO, Double d, double d2, double d3, String str, String str2, SBGameResultDTO sBGameResultDTO, long j, SBExtraDTO sBExtraDTO, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sBBetHistoryItemDTO.id;
        }
        return sBBetHistoryItemDTO.copy(i, (i2 & 2) != 0 ? sBBetHistoryItemDTO.userSelection : sBUserSelectionDTO, (i2 & 4) != 0 ? sBBetHistoryItemDTO.giftAmount : d, (i2 & 8) != 0 ? sBBetHistoryItemDTO.stakeAmount : d2, (i2 & 16) != 0 ? sBBetHistoryItemDTO.payoutAmount : d3, (i2 & 32) != 0 ? sBBetHistoryItemDTO.currency : str, (i2 & 64) != 0 ? sBBetHistoryItemDTO.ticketId : str2, (i2 & 128) != 0 ? sBBetHistoryItemDTO.result : sBGameResultDTO, (i2 & 256) != 0 ? sBBetHistoryItemDTO.createTime : j, (i2 & 512) != 0 ? sBBetHistoryItemDTO.extra : sBExtraDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SBExtraDTO getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SBUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
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
    public final SBGameResultDTO getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final SBBetHistoryItemDTO copy(int id, SBUserSelectionDTO userSelection, Double giftAmount, double stakeAmount, double payoutAmount, String currency, String ticketId, SBGameResultDTO result, long createTime, SBExtraDTO extra) {
        userSelection.getClass();
        currency.getClass();
        ticketId.getClass();
        result.getClass();
        return new SBBetHistoryItemDTO(id, userSelection, giftAmount, stakeAmount, payoutAmount, currency, ticketId, result, createTime, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBBetHistoryItemDTO)) {
            return false;
        }
        SBBetHistoryItemDTO sBBetHistoryItemDTO = (SBBetHistoryItemDTO) other;
        return this.id == sBBetHistoryItemDTO.id && Intrinsics.g(this.userSelection, sBBetHistoryItemDTO.userSelection) && Intrinsics.g(this.giftAmount, sBBetHistoryItemDTO.giftAmount) && Double.compare(this.stakeAmount, sBBetHistoryItemDTO.stakeAmount) == 0 && Double.compare(this.payoutAmount, sBBetHistoryItemDTO.payoutAmount) == 0 && Intrinsics.g(this.currency, sBBetHistoryItemDTO.currency) && Intrinsics.g(this.ticketId, sBBetHistoryItemDTO.ticketId) && Intrinsics.g(this.result, sBBetHistoryItemDTO.result) && this.createTime == sBBetHistoryItemDTO.createTime && Intrinsics.g(this.extra, sBBetHistoryItemDTO.extra);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final SBExtraDTO getExtra() {
        return this.extra;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final int getId() {
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

    public final String getTicketId() {
        return this.ticketId;
    }

    public final SBUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        int iHashCode = (this.userSelection.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Double d = this.giftAmount;
        int iA = f87.a((this.result.hashCode() + gmf0.a(gmf0.a(nrg0.a(nrg0.a((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.stakeAmount), 31, this.payoutAmount), 31, this.currency), 31, this.ticketId)) * 31, this.createTime, 31);
        SBExtraDTO sBExtraDTO = this.extra;
        return iA + (sBExtraDTO != null ? sBExtraDTO.hashCode() : 0);
    }

    public String toString() {
        return "SBBetHistoryItemDTO(id=" + this.id + ", userSelection=" + this.userSelection + ", giftAmount=" + this.giftAmount + ", stakeAmount=" + this.stakeAmount + ", payoutAmount=" + this.payoutAmount + ", currency=" + this.currency + ", ticketId=" + this.ticketId + ", result=" + this.result + ", createTime=" + this.createTime + ", extra=" + this.extra + ')';
    }
}
