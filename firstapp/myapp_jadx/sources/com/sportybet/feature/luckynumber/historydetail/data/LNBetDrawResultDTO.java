package com.sportybet.feature.luckynumber.historydetail.data;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetDrawResultDTO;", "", "mainNumbers", "", "", "bonusNumbers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getMainNumbers", "()Ljava/util/List;", "getBonusNumbers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetDrawResultDTO {
    public static final int $stable = 0;
    private final List<Integer> bonusNumbers;
    private final List<Integer> mainNumbers;

    public LNBetDrawResultDTO(List<Integer> list, List<Integer> list2) {
        list.getClass();
        list2.getClass();
        this.mainNumbers = list;
        this.bonusNumbers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNBetDrawResultDTO copy$default(LNBetDrawResultDTO lNBetDrawResultDTO, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNBetDrawResultDTO.mainNumbers;
        }
        if ((i & 2) != 0) {
            list2 = lNBetDrawResultDTO.bonusNumbers;
        }
        return lNBetDrawResultDTO.copy(list, list2);
    }

    public final List<Integer> component1() {
        return this.mainNumbers;
    }

    public final List<Integer> component2() {
        return this.bonusNumbers;
    }

    public final LNBetDrawResultDTO copy(List<Integer> mainNumbers, List<Integer> bonusNumbers) {
        mainNumbers.getClass();
        bonusNumbers.getClass();
        return new LNBetDrawResultDTO(mainNumbers, bonusNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetDrawResultDTO)) {
            return false;
        }
        LNBetDrawResultDTO lNBetDrawResultDTO = (LNBetDrawResultDTO) other;
        return Intrinsics.g(this.mainNumbers, lNBetDrawResultDTO.mainNumbers) && Intrinsics.g(this.bonusNumbers, lNBetDrawResultDTO.bonusNumbers);
    }

    public final List<Integer> getBonusNumbers() {
        return this.bonusNumbers;
    }

    public final List<Integer> getMainNumbers() {
        return this.mainNumbers;
    }

    public int hashCode() {
        return this.bonusNumbers.hashCode() + (this.mainNumbers.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("LNBetDrawResultDTO(mainNumbers=", ", bonusNumbers=", ")", this.mainNumbers, this.bonusNumbers);
    }
}
