package com.sportybet.feature.luckynumber.placebet.data.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0018Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorDTO;", "", "totalAmount", "", "favorInfo", "", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorInfoDTO;", "<init>", "(JLjava/util/List;)V", "getTotalAmount", "()J", "getFavorInfo", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFavorDTO {
    public static final int $stable = 8;
    private final List<LNFavorInfoDTO> favorInfo;
    private final long totalAmount;

    public LNFavorDTO(long j, List<LNFavorInfoDTO> list) {
        list.getClass();
        this.totalAmount = j;
        this.favorInfo = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNFavorDTO copy$default(LNFavorDTO lNFavorDTO, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lNFavorDTO.totalAmount;
        }
        if ((i & 2) != 0) {
            list = lNFavorDTO.favorInfo;
        }
        return lNFavorDTO.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final List<LNFavorInfoDTO> component2() {
        return this.favorInfo;
    }

    public final LNFavorDTO copy(long totalAmount, List<LNFavorInfoDTO> favorInfo) {
        favorInfo.getClass();
        return new LNFavorDTO(totalAmount, favorInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNFavorDTO)) {
            return false;
        }
        LNFavorDTO lNFavorDTO = (LNFavorDTO) other;
        return this.totalAmount == lNFavorDTO.totalAmount && Intrinsics.g(this.favorInfo, lNFavorDTO.favorInfo);
    }

    public final List<LNFavorInfoDTO> getFavorInfo() {
        return this.favorInfo;
    }

    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        return this.favorInfo.hashCode() + (Long.hashCode(this.totalAmount) * 31);
    }

    public String toString() {
        return "LNFavorDTO(totalAmount=" + this.totalAmount + ", favorInfo=" + this.favorInfo + ")";
    }
}
