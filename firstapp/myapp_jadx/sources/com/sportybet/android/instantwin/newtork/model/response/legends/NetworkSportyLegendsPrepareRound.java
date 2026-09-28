package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsPrepareRound;", "", "teamStatsVO", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStatsVO;", "userRoundVO", "Lcom/sportybet/android/instantwin/newtork/model/response/EventData;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStatsVO;Lcom/sportybet/android/instantwin/newtork/model/response/EventData;)V", "getTeamStatsVO", "()Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeamStatsVO;", "Lcom/google/gson/annotations/SerializedName;", "value", "getUserRoundVO", "()Lcom/sportybet/android/instantwin/newtork/model/response/EventData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsPrepareRound {
    public static final int $stable = 8;

    @SerializedName("teamStatsVO")
    private final NetworkSportyLegendsTeamStatsVO teamStatsVO;

    @SerializedName("userRoundVO")
    private final EventData userRoundVO;

    public NetworkSportyLegendsPrepareRound(NetworkSportyLegendsTeamStatsVO networkSportyLegendsTeamStatsVO, EventData eventData) {
        this.teamStatsVO = networkSportyLegendsTeamStatsVO;
        this.userRoundVO = eventData;
    }

    public static /* synthetic */ NetworkSportyLegendsPrepareRound copy$default(NetworkSportyLegendsPrepareRound networkSportyLegendsPrepareRound, NetworkSportyLegendsTeamStatsVO networkSportyLegendsTeamStatsVO, EventData eventData, int i, Object obj) {
        if ((i & 1) != 0) {
            networkSportyLegendsTeamStatsVO = networkSportyLegendsPrepareRound.teamStatsVO;
        }
        if ((i & 2) != 0) {
            eventData = networkSportyLegendsPrepareRound.userRoundVO;
        }
        return networkSportyLegendsPrepareRound.copy(networkSportyLegendsTeamStatsVO, eventData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkSportyLegendsTeamStatsVO getTeamStatsVO() {
        return this.teamStatsVO;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventData getUserRoundVO() {
        return this.userRoundVO;
    }

    public final NetworkSportyLegendsPrepareRound copy(NetworkSportyLegendsTeamStatsVO teamStatsVO, EventData userRoundVO) {
        return new NetworkSportyLegendsPrepareRound(teamStatsVO, userRoundVO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsPrepareRound)) {
            return false;
        }
        NetworkSportyLegendsPrepareRound networkSportyLegendsPrepareRound = (NetworkSportyLegendsPrepareRound) other;
        return Intrinsics.g(this.teamStatsVO, networkSportyLegendsPrepareRound.teamStatsVO) && Intrinsics.g(this.userRoundVO, networkSportyLegendsPrepareRound.userRoundVO);
    }

    public final NetworkSportyLegendsTeamStatsVO getTeamStatsVO() {
        return this.teamStatsVO;
    }

    public final EventData getUserRoundVO() {
        return this.userRoundVO;
    }

    public int hashCode() {
        NetworkSportyLegendsTeamStatsVO networkSportyLegendsTeamStatsVO = this.teamStatsVO;
        int iHashCode = (networkSportyLegendsTeamStatsVO == null ? 0 : networkSportyLegendsTeamStatsVO.hashCode()) * 31;
        EventData eventData = this.userRoundVO;
        return iHashCode + (eventData != null ? eventData.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSportyLegendsPrepareRound(teamStatsVO=" + this.teamStatsVO + ", userRoundVO=" + this.userRoundVO + ")";
    }
}
