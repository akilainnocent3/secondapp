package com.sportygames.goldmine.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.uvh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGBetDTO;", "", "userSelection", "Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;", "stakeAmount", "", "giftAmount", "payoutAmount", "currency", "", "ticketId", "", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/goldmine/data/dto/TGBetResultDTO;", "createTime", "", "<init>", "(Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;DDDLjava/lang/String;ILcom/sportygames/goldmine/data/dto/TGBetResultDTO;J)V", "getUserSelection", "()Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;", "getStakeAmount", "()D", "getGiftAmount", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getTicketId", "()I", "getResult", "()Lcom/sportygames/goldmine/data/dto/TGBetResultDTO;", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGBetDTO {
    public static final int $stable = 0;
    private final long createTime;
    private final String currency;
    private final double giftAmount;
    private final double payoutAmount;
    private final TGBetResultDTO result;
    private final double stakeAmount;
    private final int ticketId;
    private final TGUserSelectionDTO userSelection;

    public TGBetDTO(TGUserSelectionDTO tGUserSelectionDTO, double d, double d2, double d3, String str, int i, TGBetResultDTO tGBetResultDTO, long j) {
        tGUserSelectionDTO.getClass();
        str.getClass();
        tGBetResultDTO.getClass();
        this.userSelection = tGUserSelectionDTO;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.currency = str;
        this.ticketId = i;
        this.result = tGBetResultDTO;
        this.createTime = j;
    }

    public static /* synthetic */ TGBetDTO copy$default(TGBetDTO tGBetDTO, TGUserSelectionDTO tGUserSelectionDTO, double d, double d2, double d3, String str, int i, TGBetResultDTO tGBetResultDTO, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tGUserSelectionDTO = tGBetDTO.userSelection;
        }
        if ((i2 & 2) != 0) {
            d = tGBetDTO.stakeAmount;
        }
        if ((i2 & 4) != 0) {
            d2 = tGBetDTO.giftAmount;
        }
        if ((i2 & 8) != 0) {
            d3 = tGBetDTO.payoutAmount;
        }
        if ((i2 & 16) != 0) {
            str = tGBetDTO.currency;
        }
        if ((i2 & 32) != 0) {
            i = tGBetDTO.ticketId;
        }
        if ((i2 & 64) != 0) {
            tGBetResultDTO = tGBetDTO.result;
        }
        if ((i2 & 128) != 0) {
            j = tGBetDTO.createTime;
        }
        TGBetResultDTO tGBetResultDTO2 = tGBetResultDTO;
        String str2 = str;
        double d4 = d3;
        double d5 = d2;
        return tGBetDTO.copy(tGUserSelectionDTO, d, d5, d4, str2, i, tGBetResultDTO2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TGUserSelectionDTO getUserSelection() {
        return this.userSelection;
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
    public final TGBetResultDTO getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final TGBetDTO copy(TGUserSelectionDTO userSelection, double stakeAmount, double giftAmount, double payoutAmount, String currency, int ticketId, TGBetResultDTO result, long createTime) {
        userSelection.getClass();
        currency.getClass();
        result.getClass();
        return new TGBetDTO(userSelection, stakeAmount, giftAmount, payoutAmount, currency, ticketId, result, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGBetDTO)) {
            return false;
        }
        TGBetDTO tGBetDTO = (TGBetDTO) other;
        return Intrinsics.g(this.userSelection, tGBetDTO.userSelection) && Double.compare(this.stakeAmount, tGBetDTO.stakeAmount) == 0 && Double.compare(this.giftAmount, tGBetDTO.giftAmount) == 0 && Double.compare(this.payoutAmount, tGBetDTO.payoutAmount) == 0 && Intrinsics.g(this.currency, tGBetDTO.currency) && this.ticketId == tGBetDTO.ticketId && Intrinsics.g(this.result, tGBetDTO.result) && this.createTime == tGBetDTO.createTime;
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

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final TGBetResultDTO getResult() {
        return this.result;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final int getTicketId() {
        return this.ticketId;
    }

    public final TGUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + ((this.result.hashCode() + gpp.a(this.ticketId, gmf0.a(nrg0.a(nrg0.a(nrg0.a(this.userSelection.hashCode() * 31, 31, this.stakeAmount), 31, this.giftAmount), 31, this.payoutAmount), 31, this.currency), 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGBetDTO(userSelection=");
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
