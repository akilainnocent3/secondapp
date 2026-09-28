package com.sportygames.goldmine.data.dto;

import defpackage.nrg0;
import defpackage.uvh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGBetRequestDTO;", "", "userSelection", "Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;", "stakeAmount", "", "giftId", "", "giftAmount", "configTimestamp", "", "<init>", "(Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;DLjava/lang/String;Ljava/lang/Double;J)V", "getUserSelection", "()Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;", "getStakeAmount", "()D", "getGiftId", "()Ljava/lang/String;", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getConfigTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sportygames/goldmine/data/dto/TGUserSelectionDTO;DLjava/lang/String;Ljava/lang/Double;J)Lcom/sportygames/goldmine/data/dto/TGBetRequestDTO;", "equals", "", "other", "hashCode", "", "toString", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGBetRequestDTO {
    public static final int $stable = 0;
    private final long configTimestamp;
    private final Double giftAmount;
    private final String giftId;
    private final double stakeAmount;
    private final TGUserSelectionDTO userSelection;

    public TGBetRequestDTO(TGUserSelectionDTO tGUserSelectionDTO, double d, String str, Double d2, long j) {
        tGUserSelectionDTO.getClass();
        this.userSelection = tGUserSelectionDTO;
        this.stakeAmount = d;
        this.giftId = str;
        this.giftAmount = d2;
        this.configTimestamp = j;
    }

    public static /* synthetic */ TGBetRequestDTO copy$default(TGBetRequestDTO tGBetRequestDTO, TGUserSelectionDTO tGUserSelectionDTO, double d, String str, Double d2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            tGUserSelectionDTO = tGBetRequestDTO.userSelection;
        }
        if ((i & 2) != 0) {
            d = tGBetRequestDTO.stakeAmount;
        }
        if ((i & 4) != 0) {
            str = tGBetRequestDTO.giftId;
        }
        if ((i & 8) != 0) {
            d2 = tGBetRequestDTO.giftAmount;
        }
        if ((i & 16) != 0) {
            j = tGBetRequestDTO.configTimestamp;
        }
        return tGBetRequestDTO.copy(tGUserSelectionDTO, d, str, d2, j);
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
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getConfigTimestamp() {
        return this.configTimestamp;
    }

    public final TGBetRequestDTO copy(TGUserSelectionDTO userSelection, double stakeAmount, String giftId, Double giftAmount, long configTimestamp) {
        userSelection.getClass();
        return new TGBetRequestDTO(userSelection, stakeAmount, giftId, giftAmount, configTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGBetRequestDTO)) {
            return false;
        }
        TGBetRequestDTO tGBetRequestDTO = (TGBetRequestDTO) other;
        return Intrinsics.g(this.userSelection, tGBetRequestDTO.userSelection) && Double.compare(this.stakeAmount, tGBetRequestDTO.stakeAmount) == 0 && Intrinsics.g(this.giftId, tGBetRequestDTO.giftId) && Intrinsics.g(this.giftAmount, tGBetRequestDTO.giftAmount) && this.configTimestamp == tGBetRequestDTO.configTimestamp;
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

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final TGUserSelectionDTO getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        int iA = nrg0.a(this.userSelection.hashCode() * 31, 31, this.stakeAmount);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        return Long.hashCode(this.configTimestamp) + ((iHashCode + (d != null ? d.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGBetRequestDTO(userSelection=");
        sb.append(this.userSelection);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", giftId=");
        sb.append(this.giftId);
        sb.append(", giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", configTimestamp=");
        return uvh.a(sb, this.configTimestamp, ')');
    }

    public /* synthetic */ TGBetRequestDTO(TGUserSelectionDTO tGUserSelectionDTO, double d, String str, Double d2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tGUserSelectionDTO, d, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : d2, j);
    }
}
