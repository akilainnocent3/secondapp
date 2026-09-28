package com.sportybet.feature.luckynumber.lobby.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentLotteryDTO;", "", "drawSummary", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentDrawSummaryDTO;", "serverTime", "", "<init>", "(Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentDrawSummaryDTO;J)V", "getDrawSummary", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentDrawSummaryDTO;", "getServerTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNCurrentLotteryDTO {
    public static final int $stable = LNCurrentDrawSummaryDTO.$stable;
    private final LNCurrentDrawSummaryDTO drawSummary;
    private final long serverTime;

    public LNCurrentLotteryDTO(LNCurrentDrawSummaryDTO lNCurrentDrawSummaryDTO, long j) {
        lNCurrentDrawSummaryDTO.getClass();
        this.drawSummary = lNCurrentDrawSummaryDTO;
        this.serverTime = j;
    }

    public static /* synthetic */ LNCurrentLotteryDTO copy$default(LNCurrentLotteryDTO lNCurrentLotteryDTO, LNCurrentDrawSummaryDTO lNCurrentDrawSummaryDTO, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            lNCurrentDrawSummaryDTO = lNCurrentLotteryDTO.drawSummary;
        }
        if ((i & 2) != 0) {
            j = lNCurrentLotteryDTO.serverTime;
        }
        return lNCurrentLotteryDTO.copy(lNCurrentDrawSummaryDTO, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LNCurrentDrawSummaryDTO getDrawSummary() {
        return this.drawSummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    public final LNCurrentLotteryDTO copy(LNCurrentDrawSummaryDTO drawSummary, long serverTime) {
        drawSummary.getClass();
        return new LNCurrentLotteryDTO(drawSummary, serverTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNCurrentLotteryDTO)) {
            return false;
        }
        LNCurrentLotteryDTO lNCurrentLotteryDTO = (LNCurrentLotteryDTO) other;
        return Intrinsics.g(this.drawSummary, lNCurrentLotteryDTO.drawSummary) && this.serverTime == lNCurrentLotteryDTO.serverTime;
    }

    public final LNCurrentDrawSummaryDTO getDrawSummary() {
        return this.drawSummary;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return Long.hashCode(this.serverTime) + (this.drawSummary.hashCode() * 31);
    }

    public String toString() {
        return "LNCurrentLotteryDTO(drawSummary=" + this.drawSummary + ", serverTime=" + this.serverTime + ")";
    }
}
