package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0011"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNFavoritesListDTO;", "", "lotteryIds", "", "", "<init>", "(Ljava/util/List;)V", "getLotteryIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFavoritesListDTO {
    public static final int $stable = 8;
    private final List<String> lotteryIds;

    public LNFavoritesListDTO(List<String> list) {
        list.getClass();
        this.lotteryIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNFavoritesListDTO copy$default(LNFavoritesListDTO lNFavoritesListDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNFavoritesListDTO.lotteryIds;
        }
        return lNFavoritesListDTO.copy(list);
    }

    public final List<String> component1() {
        return this.lotteryIds;
    }

    public final LNFavoritesListDTO copy(List<String> lotteryIds) {
        lotteryIds.getClass();
        return new LNFavoritesListDTO(lotteryIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LNFavoritesListDTO) && Intrinsics.g(this.lotteryIds, ((LNFavoritesListDTO) other).lotteryIds);
    }

    public final List<String> getLotteryIds() {
        return this.lotteryIds;
    }

    public int hashCode() {
        return this.lotteryIds.hashCode();
    }

    public String toString() {
        return p.a("LNFavoritesListDTO(lotteryIds=", ")", this.lotteryIds);
    }
}
