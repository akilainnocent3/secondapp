package com.sportybet.feature.luckynumber.lobby.data.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNResultResponseDTO;", "", "draws", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNResultDrawDTO;", "nextCursor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDraws", "()Ljava/util/List;", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNResultResponseDTO {
    public static final int $stable = 8;
    private final List<LNResultDrawDTO> draws;
    private final String nextCursor;

    public LNResultResponseDTO(List<LNResultDrawDTO> list, String str) {
        list.getClass();
        this.draws = list;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNResultResponseDTO copy$default(LNResultResponseDTO lNResultResponseDTO, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNResultResponseDTO.draws;
        }
        if ((i & 2) != 0) {
            str = lNResultResponseDTO.nextCursor;
        }
        return lNResultResponseDTO.copy(list, str);
    }

    public final List<LNResultDrawDTO> component1() {
        return this.draws;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final LNResultResponseDTO copy(List<LNResultDrawDTO> draws, String nextCursor) {
        draws.getClass();
        return new LNResultResponseDTO(draws, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNResultResponseDTO)) {
            return false;
        }
        LNResultResponseDTO lNResultResponseDTO = (LNResultResponseDTO) other;
        return Intrinsics.g(this.draws, lNResultResponseDTO.draws) && Intrinsics.g(this.nextCursor, lNResultResponseDTO.nextCursor);
    }

    public final List<LNResultDrawDTO> getDraws() {
        return this.draws;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        int iHashCode = this.draws.hashCode() * 31;
        String str = this.nextCursor;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LNResultResponseDTO(draws=" + this.draws + ", nextCursor=" + this.nextCursor + ")";
    }
}
