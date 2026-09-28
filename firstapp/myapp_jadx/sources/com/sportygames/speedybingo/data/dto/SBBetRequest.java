package com.sportygames.speedybingo.data.dto;

import defpackage.uvh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBBetRequest;", "", "userSelection", "Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;", "stakeAmount", "", "giftAmount", "giftId", "", "configTimestamp", "", "<init>", "(Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;J)V", "getUserSelection", "()Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftAmount", "getGiftId", "()Ljava/lang/String;", "getConfigTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sportygames/speedybingo/data/dto/SBUserSelectionDTO;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;J)Lcom/sportygames/speedybingo/data/dto/SBBetRequest;", "equals", "", "other", "hashCode", "", "toString", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBBetRequest {
    public static final int $stable = 8;
    private final long configTimestamp;
    private final Double giftAmount;
    private final String giftId;
    private final Double stakeAmount;
    private final SBUserSelectionDTO userSelection;

    public /* synthetic */ SBBetRequest(SBUserSelectionDTO sBUserSelectionDTO, Double d, Double d2, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sBUserSelectionDTO, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : str, j);
    }

    public static /* synthetic */ SBBetRequest copy$default(SBBetRequest sBBetRequest, SBUserSelectionDTO sBUserSelectionDTO, Double d, Double d2, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            sBUserSelectionDTO = sBBetRequest.userSelection;
        }
        if ((i & 2) != 0) {
            d = sBBetRequest.stakeAmount;
        }
        if ((i & 4) != 0) {
            d2 = sBBetRequest.giftAmount;
        }
        if ((i & 8) != 0) {
            str = sBBetRequest.giftId;
        }
        if ((i & 16) != 0) {
            j = sBBetRequest.configTimestamp;
        }
        long j2 = j;
        return sBBetRequest.copy(sBUserSelectionDTO, d, d2, str, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SBUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getConfigTimestamp() {
        return this.configTimestamp;
    }

    public final SBBetRequest copy(SBUserSelectionDTO userSelection, Double stakeAmount, Double giftAmount, String giftId, long configTimestamp) {
        userSelection.getClass();
        return new SBBetRequest(userSelection, stakeAmount, giftAmount, giftId, configTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBBetRequest)) {
            return false;
        }
        SBBetRequest sBBetRequest = (SBBetRequest) other;
        return Intrinsics.g(this.userSelection, sBBetRequest.userSelection) && Intrinsics.g(this.stakeAmount, sBBetRequest.stakeAmount) && Intrinsics.g(this.giftAmount, sBBetRequest.giftAmount) && Intrinsics.g(this.giftId, sBBetRequest.giftId) && this.configTimestamp == sBBetRequest.configTimestamp;
    }

    public final long getConfigTimestamp() {
        return this.configTimestamp;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final SBUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        int iHashCode = this.userSelection.hashCode() * 31;
        Double d = this.stakeAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.giftId;
        return Long.hashCode(this.configTimestamp) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBBetRequest(userSelection=");
        sb.append(this.userSelection);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", giftId=");
        sb.append(this.giftId);
        sb.append(", configTimestamp=");
        return uvh.a(sb, this.configTimestamp, ')');
    }

    public SBBetRequest(SBUserSelectionDTO sBUserSelectionDTO, Double d, Double d2, String str, long j) {
        sBUserSelectionDTO.getClass();
        this.userSelection = sBUserSelectionDTO;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.giftId = str;
        this.configTimestamp = j;
    }
}
