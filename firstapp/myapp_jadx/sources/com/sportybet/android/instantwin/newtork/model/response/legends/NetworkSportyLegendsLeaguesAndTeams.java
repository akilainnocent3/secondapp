package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.google.gson.annotations.SerializedName;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsLeaguesAndTeams;", "", "legendLeaguesVOS", "", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsLeague;", "recommendMatches", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsRecommendedMatch;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLegendLeaguesVOS", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRecommendMatches", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsLeaguesAndTeams {
    public static final int $stable = 0;

    @SerializedName("legendLeaguesVOS")
    private final List<NetworkSportyLegendsLeague> legendLeaguesVOS;

    @SerializedName("recommendMatches")
    private final List<NetworkSportyLegendsRecommendedMatch> recommendMatches;

    public NetworkSportyLegendsLeaguesAndTeams(List<NetworkSportyLegendsLeague> list, List<NetworkSportyLegendsRecommendedMatch> list2) {
        this.legendLeaguesVOS = list;
        this.recommendMatches = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyLegendsLeaguesAndTeams copy$default(NetworkSportyLegendsLeaguesAndTeams networkSportyLegendsLeaguesAndTeams, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkSportyLegendsLeaguesAndTeams.legendLeaguesVOS;
        }
        if ((i & 2) != 0) {
            list2 = networkSportyLegendsLeaguesAndTeams.recommendMatches;
        }
        return networkSportyLegendsLeaguesAndTeams.copy(list, list2);
    }

    public final List<NetworkSportyLegendsLeague> component1() {
        return this.legendLeaguesVOS;
    }

    public final List<NetworkSportyLegendsRecommendedMatch> component2() {
        return this.recommendMatches;
    }

    public final NetworkSportyLegendsLeaguesAndTeams copy(List<NetworkSportyLegendsLeague> legendLeaguesVOS, List<NetworkSportyLegendsRecommendedMatch> recommendMatches) {
        return new NetworkSportyLegendsLeaguesAndTeams(legendLeaguesVOS, recommendMatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsLeaguesAndTeams)) {
            return false;
        }
        NetworkSportyLegendsLeaguesAndTeams networkSportyLegendsLeaguesAndTeams = (NetworkSportyLegendsLeaguesAndTeams) other;
        return Intrinsics.g(this.legendLeaguesVOS, networkSportyLegendsLeaguesAndTeams.legendLeaguesVOS) && Intrinsics.g(this.recommendMatches, networkSportyLegendsLeaguesAndTeams.recommendMatches);
    }

    public final List<NetworkSportyLegendsLeague> getLegendLeaguesVOS() {
        return this.legendLeaguesVOS;
    }

    public final List<NetworkSportyLegendsRecommendedMatch> getRecommendMatches() {
        return this.recommendMatches;
    }

    public int hashCode() {
        List<NetworkSportyLegendsLeague> list = this.legendLeaguesVOS;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NetworkSportyLegendsRecommendedMatch> list2 = this.recommendMatches;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return w9d.a("NetworkSportyLegendsLeaguesAndTeams(legendLeaguesVOS=", dLRYz.spjiWcDnVDnbT, ")", this.legendLeaguesVOS, this.recommendMatches);
    }
}
