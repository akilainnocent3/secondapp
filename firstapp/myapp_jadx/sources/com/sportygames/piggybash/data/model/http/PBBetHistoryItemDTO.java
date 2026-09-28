package com.sportygames.piggybash.data.model.http;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j26;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00014BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJt\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b-\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b.\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b2\u0010\u001b¨\u00065"}, d2 = {"Lcom/sportygames/piggybash/data/model/http/PBBetHistoryItemDTO;", "", "", AnalyticsParam.EVENT_PARAM_ID, "roundId", "", "stakeAmount", "payoutAmount", "majorPrizeAmount", "bonusPrizeAmount", "goldRainAmount", "", "ticketId", "createdAt", "betStatus", "<init>", "(IIDDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "copy", "(IIDDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/piggybash/data/model/http/PBBetHistoryItemDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getRoundId", "D", "getStakeAmount", "getPayoutAmount", "getMajorPrizeAmount", "getBonusPrizeAmount", "getGoldRainAmount", "Ljava/lang/String;", "getTicketId", "getCreatedAt", "getBetStatus", "Companion", "a", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PBBetHistoryItemDTO {
    public static final int $stable = 0;
    public static final String STATUS_CANCELLED = "CANCELLED";
    public static final String STATUS_LOST = "LOST";
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_WON = "WON";
    private final String betStatus;
    private final double bonusPrizeAmount;
    private final String createdAt;
    private final double goldRainAmount;
    private final int id;
    private final double majorPrizeAmount;
    private final double payoutAmount;
    private final int roundId;
    private final double stakeAmount;
    private final String ticketId;

    public PBBetHistoryItemDTO(int i, int i2, double d, double d2, double d3, double d4, double d5, String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.id = i;
        this.roundId = i2;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.majorPrizeAmount = d3;
        this.bonusPrizeAmount = d4;
        this.goldRainAmount = d5;
        this.ticketId = str;
        this.createdAt = str2;
        this.betStatus = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBetStatus() {
        return this.betStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRoundId() {
        return this.roundId;
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
    public final double getMajorPrizeAmount() {
        return this.majorPrizeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getBonusPrizeAmount() {
        return this.bonusPrizeAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getGoldRainAmount() {
        return this.goldRainAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final PBBetHistoryItemDTO copy(int id, int roundId, double stakeAmount, double payoutAmount, double majorPrizeAmount, double bonusPrizeAmount, double goldRainAmount, String ticketId, String createdAt, String betStatus) {
        ticketId.getClass();
        createdAt.getClass();
        betStatus.getClass();
        return new PBBetHistoryItemDTO(id, roundId, stakeAmount, payoutAmount, majorPrizeAmount, bonusPrizeAmount, goldRainAmount, ticketId, createdAt, betStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PBBetHistoryItemDTO)) {
            return false;
        }
        PBBetHistoryItemDTO pBBetHistoryItemDTO = (PBBetHistoryItemDTO) other;
        return this.id == pBBetHistoryItemDTO.id && this.roundId == pBBetHistoryItemDTO.roundId && Double.compare(this.stakeAmount, pBBetHistoryItemDTO.stakeAmount) == 0 && Double.compare(this.payoutAmount, pBBetHistoryItemDTO.payoutAmount) == 0 && Double.compare(this.majorPrizeAmount, pBBetHistoryItemDTO.majorPrizeAmount) == 0 && Double.compare(this.bonusPrizeAmount, pBBetHistoryItemDTO.bonusPrizeAmount) == 0 && Double.compare(this.goldRainAmount, pBBetHistoryItemDTO.goldRainAmount) == 0 && Intrinsics.g(this.ticketId, pBBetHistoryItemDTO.ticketId) && Intrinsics.g(this.createdAt, pBBetHistoryItemDTO.createdAt) && Intrinsics.g(this.betStatus, pBBetHistoryItemDTO.betStatus);
    }

    public final String getBetStatus() {
        return this.betStatus;
    }

    public final double getBonusPrizeAmount() {
        return this.bonusPrizeAmount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final double getGoldRainAmount() {
        return this.goldRainAmount;
    }

    public final int getId() {
        return this.id;
    }

    public final double getMajorPrizeAmount() {
        return this.majorPrizeAmount;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public int hashCode() {
        return this.betStatus.hashCode() + gmf0.a(gmf0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(gpp.a(this.roundId, Integer.hashCode(this.id) * 31, 31), 31, this.stakeAmount), 31, this.payoutAmount), 31, this.majorPrizeAmount), 31, this.bonusPrizeAmount), 31, this.goldRainAmount), 31, this.ticketId), 31, this.createdAt);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PBBetHistoryItemDTO(id=");
        sb.append(this.id);
        sb.append(", roundId=");
        sb.append(this.roundId);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", payoutAmount=");
        sb.append(this.payoutAmount);
        sb.append(", majorPrizeAmount=");
        sb.append(this.majorPrizeAmount);
        sb.append(", bonusPrizeAmount=");
        sb.append(this.bonusPrizeAmount);
        sb.append(", goldRainAmount=");
        sb.append(this.goldRainAmount);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", betStatus=");
        return j26.a(sb, this.betStatus, ')');
    }
}
