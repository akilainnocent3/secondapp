package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.ai50;
import defpackage.f87;
import defpackage.hfb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNBetDTO;", "", "selectionRefs", "", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNSelectionRefDTO;", "selectedSystems", "", "stakeAmount", "", "favor", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;JLcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorDTO;)V", "getSelectionRefs", "()Ljava/util/List;", "getSelectedSystems", "getStakeAmount", "()J", "getFavor", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetDTO {
    public static final int $stable = LNFavorDTO.$stable;
    private final LNFavorDTO favor;
    private final List<Integer> selectedSystems;
    private final List<LNSelectionRefDTO> selectionRefs;
    private final long stakeAmount;

    public LNBetDTO(List<LNSelectionRefDTO> list, List<Integer> list2, long j, LNFavorDTO lNFavorDTO) {
        list.getClass();
        list2.getClass();
        lNFavorDTO.getClass();
        this.selectionRefs = list;
        this.selectedSystems = list2;
        this.stakeAmount = j;
        this.favor = lNFavorDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNBetDTO copy$default(LNBetDTO lNBetDTO, List list, List list2, long j, LNFavorDTO lNFavorDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNBetDTO.selectionRefs;
        }
        if ((i & 2) != 0) {
            list2 = lNBetDTO.selectedSystems;
        }
        if ((i & 4) != 0) {
            j = lNBetDTO.stakeAmount;
        }
        if ((i & 8) != 0) {
            lNFavorDTO = lNBetDTO.favor;
        }
        LNFavorDTO lNFavorDTO2 = lNFavorDTO;
        return lNBetDTO.copy(list, list2, j, lNFavorDTO2);
    }

    public final List<LNSelectionRefDTO> component1() {
        return this.selectionRefs;
    }

    public final List<Integer> component2() {
        return this.selectedSystems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LNFavorDTO getFavor() {
        return this.favor;
    }

    public final LNBetDTO copy(List<LNSelectionRefDTO> selectionRefs, List<Integer> selectedSystems, long stakeAmount, LNFavorDTO favor) {
        selectionRefs.getClass();
        selectedSystems.getClass();
        favor.getClass();
        return new LNBetDTO(selectionRefs, selectedSystems, stakeAmount, favor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetDTO)) {
            return false;
        }
        LNBetDTO lNBetDTO = (LNBetDTO) other;
        return Intrinsics.g(this.selectionRefs, lNBetDTO.selectionRefs) && Intrinsics.g(this.selectedSystems, lNBetDTO.selectedSystems) && this.stakeAmount == lNBetDTO.stakeAmount && Intrinsics.g(this.favor, lNBetDTO.favor);
    }

    public final LNFavorDTO getFavor() {
        return this.favor;
    }

    public final List<Integer> getSelectedSystems() {
        return this.selectedSystems;
    }

    public final List<LNSelectionRefDTO> getSelectionRefs() {
        return this.selectionRefs;
    }

    public final long getStakeAmount() {
        return this.stakeAmount;
    }

    public int hashCode() {
        return this.favor.hashCode() + f87.a(ai50.a(this.selectionRefs.hashCode() * 31, 31, this.selectedSystems), this.stakeAmount, 31);
    }

    public String toString() {
        List<LNSelectionRefDTO> list = this.selectionRefs;
        List<Integer> list2 = this.selectedSystems;
        long j = this.stakeAmount;
        LNFavorDTO lNFavorDTO = this.favor;
        StringBuilder sbA = hfb0.a("LNBetDTO(selectionRefs=", ", selectedSystems=", ", stakeAmount=", list, list2);
        sbA.append(j);
        sbA.append(", favor=");
        sbA.append(lNFavorDTO);
        sbA.append(")");
        return sbA.toString();
    }
}
