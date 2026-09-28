package com.sportygames.speedybingo.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBBetConfigDTO;", "", "betAmount", "Lcom/sportygames/speedybingo/data/dto/SBBetAmountDTO;", "autoSpin", "Lcom/sportygames/speedybingo/data/dto/SBAutoSpinDTO;", "<init>", "(Lcom/sportygames/speedybingo/data/dto/SBBetAmountDTO;Lcom/sportygames/speedybingo/data/dto/SBAutoSpinDTO;)V", "getBetAmount", "()Lcom/sportygames/speedybingo/data/dto/SBBetAmountDTO;", "getAutoSpin", "()Lcom/sportygames/speedybingo/data/dto/SBAutoSpinDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBBetConfigDTO {
    public static final int $stable = 8;
    private final SBAutoSpinDTO autoSpin;
    private final SBBetAmountDTO betAmount;

    public SBBetConfigDTO(SBBetAmountDTO sBBetAmountDTO, SBAutoSpinDTO sBAutoSpinDTO) {
        sBBetAmountDTO.getClass();
        sBAutoSpinDTO.getClass();
        this.betAmount = sBBetAmountDTO;
        this.autoSpin = sBAutoSpinDTO;
    }

    public static /* synthetic */ SBBetConfigDTO copy$default(SBBetConfigDTO sBBetConfigDTO, SBBetAmountDTO sBBetAmountDTO, SBAutoSpinDTO sBAutoSpinDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            sBBetAmountDTO = sBBetConfigDTO.betAmount;
        }
        if ((i & 2) != 0) {
            sBAutoSpinDTO = sBBetConfigDTO.autoSpin;
        }
        return sBBetConfigDTO.copy(sBBetAmountDTO, sBAutoSpinDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SBBetAmountDTO getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SBAutoSpinDTO getAutoSpin() {
        return this.autoSpin;
    }

    public final SBBetConfigDTO copy(SBBetAmountDTO betAmount, SBAutoSpinDTO autoSpin) {
        betAmount.getClass();
        autoSpin.getClass();
        return new SBBetConfigDTO(betAmount, autoSpin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBBetConfigDTO)) {
            return false;
        }
        SBBetConfigDTO sBBetConfigDTO = (SBBetConfigDTO) other;
        return Intrinsics.g(this.betAmount, sBBetConfigDTO.betAmount) && Intrinsics.g(this.autoSpin, sBBetConfigDTO.autoSpin);
    }

    public final SBAutoSpinDTO getAutoSpin() {
        return this.autoSpin;
    }

    public final SBBetAmountDTO getBetAmount() {
        return this.betAmount;
    }

    public int hashCode() {
        return this.autoSpin.hashCode() + (this.betAmount.hashCode() * 31);
    }

    public String toString() {
        return "SBBetConfigDTO(betAmount=" + this.betAmount + ", autoSpin=" + this.autoSpin + ')';
    }
}
