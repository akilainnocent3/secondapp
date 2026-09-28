package com.sportygames.speedybingo.data.dto;

import defpackage.uvh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBPayTableDTO;", "", "multipliers", "", "", "lastModifiedTimestamp", "", "<init>", "(Ljava/util/List;J)V", "getMultipliers", "()Ljava/util/List;", "getLastModifiedTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBPayTableDTO {
    public static final int $stable = 8;
    private final long lastModifiedTimestamp;
    private final List<Double> multipliers;

    public SBPayTableDTO(List<Double> list, long j) {
        list.getClass();
        this.multipliers = list;
        this.lastModifiedTimestamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SBPayTableDTO copy$default(SBPayTableDTO sBPayTableDTO, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sBPayTableDTO.multipliers;
        }
        if ((i & 2) != 0) {
            j = sBPayTableDTO.lastModifiedTimestamp;
        }
        return sBPayTableDTO.copy(list, j);
    }

    public final List<Double> component1() {
        return this.multipliers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final SBPayTableDTO copy(List<Double> multipliers, long lastModifiedTimestamp) {
        multipliers.getClass();
        return new SBPayTableDTO(multipliers, lastModifiedTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBPayTableDTO)) {
            return false;
        }
        SBPayTableDTO sBPayTableDTO = (SBPayTableDTO) other;
        return Intrinsics.g(this.multipliers, sBPayTableDTO.multipliers) && this.lastModifiedTimestamp == sBPayTableDTO.lastModifiedTimestamp;
    }

    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final List<Double> getMultipliers() {
        return this.multipliers;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModifiedTimestamp) + (this.multipliers.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBPayTableDTO(multipliers=");
        sb.append(this.multipliers);
        sb.append(", lastModifiedTimestamp=");
        return uvh.a(sb, this.lastModifiedTimestamp, ')');
    }
}
