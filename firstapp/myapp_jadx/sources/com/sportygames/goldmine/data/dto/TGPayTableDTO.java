package com.sportygames.goldmine.data.dto;

import defpackage.ai50;
import defpackage.uvh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGPayTableDTO;", "", "multipliers", "", "", "probabilities", "", "selections", "Lcom/sportygames/goldmine/data/dto/TGSelectionsDTO;", "lastModifiedTimestamp", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/sportygames/goldmine/data/dto/TGSelectionsDTO;J)V", "getMultipliers", "()Ljava/util/List;", "getProbabilities", "getSelections", "()Lcom/sportygames/goldmine/data/dto/TGSelectionsDTO;", "getLastModifiedTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGPayTableDTO {
    public static final int $stable = 8;
    private final long lastModifiedTimestamp;
    private final List<List<Double>> multipliers;
    private final List<List<Integer>> probabilities;
    private final TGSelectionsDTO selections;

    /* JADX WARN: Multi-variable type inference failed */
    public TGPayTableDTO(List<? extends List<Double>> list, List<? extends List<Integer>> list2, TGSelectionsDTO tGSelectionsDTO, long j) {
        list.getClass();
        list2.getClass();
        tGSelectionsDTO.getClass();
        this.multipliers = list;
        this.probabilities = list2;
        this.selections = tGSelectionsDTO;
        this.lastModifiedTimestamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TGPayTableDTO copy$default(TGPayTableDTO tGPayTableDTO, List list, List list2, TGSelectionsDTO tGSelectionsDTO, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tGPayTableDTO.multipliers;
        }
        if ((i & 2) != 0) {
            list2 = tGPayTableDTO.probabilities;
        }
        if ((i & 4) != 0) {
            tGSelectionsDTO = tGPayTableDTO.selections;
        }
        if ((i & 8) != 0) {
            j = tGPayTableDTO.lastModifiedTimestamp;
        }
        TGSelectionsDTO tGSelectionsDTO2 = tGSelectionsDTO;
        return tGPayTableDTO.copy(list, list2, tGSelectionsDTO2, j);
    }

    public final List<List<Double>> component1() {
        return this.multipliers;
    }

    public final List<List<Integer>> component2() {
        return this.probabilities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TGSelectionsDTO getSelections() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final TGPayTableDTO copy(List<? extends List<Double>> multipliers, List<? extends List<Integer>> probabilities, TGSelectionsDTO selections, long lastModifiedTimestamp) {
        multipliers.getClass();
        probabilities.getClass();
        selections.getClass();
        return new TGPayTableDTO(multipliers, probabilities, selections, lastModifiedTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGPayTableDTO)) {
            return false;
        }
        TGPayTableDTO tGPayTableDTO = (TGPayTableDTO) other;
        return Intrinsics.g(this.multipliers, tGPayTableDTO.multipliers) && Intrinsics.g(this.probabilities, tGPayTableDTO.probabilities) && Intrinsics.g(this.selections, tGPayTableDTO.selections) && this.lastModifiedTimestamp == tGPayTableDTO.lastModifiedTimestamp;
    }

    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final List<List<Double>> getMultipliers() {
        return this.multipliers;
    }

    public final List<List<Integer>> getProbabilities() {
        return this.probabilities;
    }

    public final TGSelectionsDTO getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModifiedTimestamp) + ((this.selections.hashCode() + ai50.a(this.multipliers.hashCode() * 31, 31, this.probabilities)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGPayTableDTO(multipliers=");
        sb.append(this.multipliers);
        sb.append(", probabilities=");
        sb.append(this.probabilities);
        sb.append(", selections=");
        sb.append(this.selections);
        sb.append(", lastModifiedTimestamp=");
        return uvh.a(sb, this.lastModifiedTimestamp, ')');
    }
}
