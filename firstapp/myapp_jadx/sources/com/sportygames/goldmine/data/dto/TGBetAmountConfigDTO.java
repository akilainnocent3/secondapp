package com.sportygames.goldmine.data.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGBetAmountConfigDTO;", "", "betAmount", "", "Lcom/sportygames/goldmine/data/dto/TGBetAmountDTO;", "autoSpin", "Lcom/sportygames/goldmine/data/dto/TGAutoSpinDTO;", "<init>", "(Ljava/util/List;Lcom/sportygames/goldmine/data/dto/TGAutoSpinDTO;)V", "getBetAmount", "()Ljava/util/List;", "getAutoSpin", "()Lcom/sportygames/goldmine/data/dto/TGAutoSpinDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGBetAmountConfigDTO {
    public static final int $stable = 8;
    private final TGAutoSpinDTO autoSpin;
    private final List<TGBetAmountDTO> betAmount;

    public TGBetAmountConfigDTO(List<TGBetAmountDTO> list, TGAutoSpinDTO tGAutoSpinDTO) {
        list.getClass();
        tGAutoSpinDTO.getClass();
        this.betAmount = list;
        this.autoSpin = tGAutoSpinDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TGBetAmountConfigDTO copy$default(TGBetAmountConfigDTO tGBetAmountConfigDTO, List list, TGAutoSpinDTO tGAutoSpinDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tGBetAmountConfigDTO.betAmount;
        }
        if ((i & 2) != 0) {
            tGAutoSpinDTO = tGBetAmountConfigDTO.autoSpin;
        }
        return tGBetAmountConfigDTO.copy(list, tGAutoSpinDTO);
    }

    public final List<TGBetAmountDTO> component1() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TGAutoSpinDTO getAutoSpin() {
        return this.autoSpin;
    }

    public final TGBetAmountConfigDTO copy(List<TGBetAmountDTO> betAmount, TGAutoSpinDTO autoSpin) {
        betAmount.getClass();
        autoSpin.getClass();
        return new TGBetAmountConfigDTO(betAmount, autoSpin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGBetAmountConfigDTO)) {
            return false;
        }
        TGBetAmountConfigDTO tGBetAmountConfigDTO = (TGBetAmountConfigDTO) other;
        return Intrinsics.g(this.betAmount, tGBetAmountConfigDTO.betAmount) && Intrinsics.g(this.autoSpin, tGBetAmountConfigDTO.autoSpin);
    }

    public final TGAutoSpinDTO getAutoSpin() {
        return this.autoSpin;
    }

    public final List<TGBetAmountDTO> getBetAmount() {
        return this.betAmount;
    }

    public int hashCode() {
        return this.autoSpin.hashCode() + (this.betAmount.hashCode() * 31);
    }

    public String toString() {
        return "TGBetAmountConfigDTO(betAmount=" + this.betAmount + ", autoSpin=" + this.autoSpin + ')';
    }
}
