package com.sportybet.feature.luckynumber.lobby.data.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\u0002\b/Ê\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0000¨\u0006."}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyConfigDTO;", "", "enable", "", "betting", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNBettingDTO;", "lobby", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyDTO;", "colors", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNColorDTO;", "betHistory", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNHistoryDTO;", "marketGroups", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/MarketGroupDTO;", "reward", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNRewardDTO;", "<init>", "(ZLcom/sportybet/feature/luckynumber/lobby/data/dto/LNBettingDTO;Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyDTO;Ljava/util/List;Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNHistoryDTO;Ljava/util/List;Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNRewardDTO;)V", "getEnable", "()Z", "getBetting", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNBettingDTO;", "getLobby", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyDTO;", "getColors", "()Ljava/util/List;", "getBetHistory", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNHistoryDTO;", "getMarketGroups", "getReward", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNRewardDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLobbyConfigDTO {
    public static final int $stable = ((LNRewardDTO.$stable | LNHistoryDTO.$stable) | LNLobbyDTO.$stable) | LNBettingDTO.$stable;
    private final LNHistoryDTO betHistory;
    private final LNBettingDTO betting;
    private final List<LNColorDTO> colors;
    private final boolean enable;
    private final LNLobbyDTO lobby;
    private final List<MarketGroupDTO> marketGroups;
    private final LNRewardDTO reward;

    public LNLobbyConfigDTO(boolean z, LNBettingDTO lNBettingDTO, LNLobbyDTO lNLobbyDTO, List<LNColorDTO> list, LNHistoryDTO lNHistoryDTO, List<MarketGroupDTO> list2, LNRewardDTO lNRewardDTO) {
        this.enable = z;
        this.betting = lNBettingDTO;
        this.lobby = lNLobbyDTO;
        this.colors = list;
        this.betHistory = lNHistoryDTO;
        this.marketGroups = list2;
        this.reward = lNRewardDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNLobbyConfigDTO copy$default(LNLobbyConfigDTO lNLobbyConfigDTO, boolean z, LNBettingDTO lNBettingDTO, LNLobbyDTO lNLobbyDTO, List list, LNHistoryDTO lNHistoryDTO, List list2, LNRewardDTO lNRewardDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            z = lNLobbyConfigDTO.enable;
        }
        if ((i & 2) != 0) {
            lNBettingDTO = lNLobbyConfigDTO.betting;
        }
        if ((i & 4) != 0) {
            lNLobbyDTO = lNLobbyConfigDTO.lobby;
        }
        if ((i & 8) != 0) {
            list = lNLobbyConfigDTO.colors;
        }
        if ((i & 16) != 0) {
            lNHistoryDTO = lNLobbyConfigDTO.betHistory;
        }
        if ((i & 32) != 0) {
            list2 = lNLobbyConfigDTO.marketGroups;
        }
        if ((i & 64) != 0) {
            lNRewardDTO = lNLobbyConfigDTO.reward;
        }
        List list3 = list2;
        LNRewardDTO lNRewardDTO2 = lNRewardDTO;
        LNHistoryDTO lNHistoryDTO2 = lNHistoryDTO;
        LNLobbyDTO lNLobbyDTO2 = lNLobbyDTO;
        return lNLobbyConfigDTO.copy(z, lNBettingDTO, lNLobbyDTO2, list, lNHistoryDTO2, list3, lNRewardDTO2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LNBettingDTO getBetting() {
        return this.betting;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LNLobbyDTO getLobby() {
        return this.lobby;
    }

    public final List<LNColorDTO> component4() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LNHistoryDTO getBetHistory() {
        return this.betHistory;
    }

    public final List<MarketGroupDTO> component6() {
        return this.marketGroups;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LNRewardDTO getReward() {
        return this.reward;
    }

    public final LNLobbyConfigDTO copy(boolean enable, LNBettingDTO betting, LNLobbyDTO lobby, List<LNColorDTO> colors, LNHistoryDTO betHistory, List<MarketGroupDTO> marketGroups, LNRewardDTO reward) {
        return new LNLobbyConfigDTO(enable, betting, lobby, colors, betHistory, marketGroups, reward);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLobbyConfigDTO)) {
            return false;
        }
        LNLobbyConfigDTO lNLobbyConfigDTO = (LNLobbyConfigDTO) other;
        return this.enable == lNLobbyConfigDTO.enable && Intrinsics.g(this.betting, lNLobbyConfigDTO.betting) && Intrinsics.g(this.lobby, lNLobbyConfigDTO.lobby) && Intrinsics.g(this.colors, lNLobbyConfigDTO.colors) && Intrinsics.g(this.betHistory, lNLobbyConfigDTO.betHistory) && Intrinsics.g(this.marketGroups, lNLobbyConfigDTO.marketGroups) && Intrinsics.g(this.reward, lNLobbyConfigDTO.reward);
    }

    public final LNHistoryDTO getBetHistory() {
        return this.betHistory;
    }

    public final LNBettingDTO getBetting() {
        return this.betting;
    }

    public final List<LNColorDTO> getColors() {
        return this.colors;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final LNLobbyDTO getLobby() {
        return this.lobby;
    }

    public final List<MarketGroupDTO> getMarketGroups() {
        return this.marketGroups;
    }

    public final LNRewardDTO getReward() {
        return this.reward;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enable) * 31;
        LNBettingDTO lNBettingDTO = this.betting;
        int iHashCode2 = (iHashCode + (lNBettingDTO == null ? 0 : lNBettingDTO.hashCode())) * 31;
        LNLobbyDTO lNLobbyDTO = this.lobby;
        int iHashCode3 = (iHashCode2 + (lNLobbyDTO == null ? 0 : lNLobbyDTO.hashCode())) * 31;
        List<LNColorDTO> list = this.colors;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        LNHistoryDTO lNHistoryDTO = this.betHistory;
        int iHashCode5 = (iHashCode4 + (lNHistoryDTO == null ? 0 : lNHistoryDTO.hashCode())) * 31;
        List<MarketGroupDTO> list2 = this.marketGroups;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        LNRewardDTO lNRewardDTO = this.reward;
        return iHashCode6 + (lNRewardDTO != null ? lNRewardDTO.hashCode() : 0);
    }

    public String toString() {
        return "LNLobbyConfigDTO(enable=" + this.enable + ", betting=" + this.betting + ", lobby=" + this.lobby + ", colors=" + this.colors + ", betHistory=" + this.betHistory + ", marketGroups=" + this.marketGroups + ", reward=" + this.reward + ")";
    }
}
