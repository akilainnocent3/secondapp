package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryResponseDTO;", "", "lotteries", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryDTO;", "serverTime", "", "<init>", "(Ljava/util/List;J)V", "getLotteries", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getServerTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLotteryResponseDTO {
    public static final int $stable = 8;

    @SerializedName("lotteries")
    private final List<LNLotteryDTO> lotteries;
    private final long serverTime;

    public LNLotteryResponseDTO(List<LNLotteryDTO> list, long j) {
        list.getClass();
        this.lotteries = list;
        this.serverTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNLotteryResponseDTO copy$default(LNLotteryResponseDTO lNLotteryResponseDTO, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNLotteryResponseDTO.lotteries;
        }
        if ((i & 2) != 0) {
            j = lNLotteryResponseDTO.serverTime;
        }
        return lNLotteryResponseDTO.copy(list, j);
    }

    public final List<LNLotteryDTO> component1() {
        return this.lotteries;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    public final LNLotteryResponseDTO copy(List<LNLotteryDTO> lotteries, long serverTime) {
        lotteries.getClass();
        return new LNLotteryResponseDTO(lotteries, serverTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLotteryResponseDTO)) {
            return false;
        }
        LNLotteryResponseDTO lNLotteryResponseDTO = (LNLotteryResponseDTO) other;
        return Intrinsics.g(this.lotteries, lNLotteryResponseDTO.lotteries) && this.serverTime == lNLotteryResponseDTO.serverTime;
    }

    public final List<LNLotteryDTO> getLotteries() {
        return this.lotteries;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return Long.hashCode(this.serverTime) + (this.lotteries.hashCode() * 31);
    }

    public String toString() {
        return "LNLotteryResponseDTO(lotteries=" + this.lotteries + ", serverTime=" + this.serverTime + ")";
    }
}
