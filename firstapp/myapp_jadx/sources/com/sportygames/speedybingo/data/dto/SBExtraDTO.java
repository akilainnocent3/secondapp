package com.sportygames.speedybingo.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.nrg0;
import defpackage.org0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBExtraDTO;", "", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "ticketId", "", "stakeAmount", "", "payoutAmount", "<init>", "(Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;Ljava/lang/String;DD)V", "getResult", "()Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "getTicketId", "()Ljava/lang/String;", "getStakeAmount", "()D", "getPayoutAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBExtraDTO {
    public static final int $stable = 8;
    private final double payoutAmount;
    private final SBGameResultDTO result;
    private final double stakeAmount;
    private final String ticketId;

    public SBExtraDTO(SBGameResultDTO sBGameResultDTO, String str, double d, double d2) {
        sBGameResultDTO.getClass();
        str.getClass();
        this.result = sBGameResultDTO;
        this.ticketId = str;
        this.stakeAmount = d;
        this.payoutAmount = d2;
    }

    public static /* synthetic */ SBExtraDTO copy$default(SBExtraDTO sBExtraDTO, SBGameResultDTO sBGameResultDTO, String str, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            sBGameResultDTO = sBExtraDTO.result;
        }
        if ((i & 2) != 0) {
            str = sBExtraDTO.ticketId;
        }
        if ((i & 4) != 0) {
            d = sBExtraDTO.stakeAmount;
        }
        if ((i & 8) != 0) {
            d2 = sBExtraDTO.payoutAmount;
        }
        double d3 = d2;
        return sBExtraDTO.copy(sBGameResultDTO, str, d, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SBGameResultDTO getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final SBExtraDTO copy(SBGameResultDTO result, String ticketId, double stakeAmount, double payoutAmount) {
        result.getClass();
        ticketId.getClass();
        return new SBExtraDTO(result, ticketId, stakeAmount, payoutAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBExtraDTO)) {
            return false;
        }
        SBExtraDTO sBExtraDTO = (SBExtraDTO) other;
        return Intrinsics.g(this.result, sBExtraDTO.result) && Intrinsics.g(this.ticketId, sBExtraDTO.ticketId) && Double.compare(this.stakeAmount, sBExtraDTO.stakeAmount) == 0 && Double.compare(this.payoutAmount, sBExtraDTO.payoutAmount) == 0;
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

    public int hashCode() {
        return Double.hashCode(this.payoutAmount) + nrg0.a(gmf0.a(this.result.hashCode() * 31, 31, this.ticketId), 31, this.stakeAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBExtraDTO(result=");
        sb.append(this.result);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", payoutAmount=");
        return org0.a(sb, this.payoutAmount, ')');
    }
}
