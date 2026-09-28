package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsRecommendedMatch;", "", "homeTeam", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeam;", "awayTeam", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeam;Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeam;)V", "getHomeTeam", "()Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsTeam;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAwayTeam", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsRecommendedMatch {
    public static final int $stable = NetworkSportyLegendsTeam.$stable;

    @SerializedName("awayTeam")
    private final NetworkSportyLegendsTeam awayTeam;

    @SerializedName("homeTeam")
    private final NetworkSportyLegendsTeam homeTeam;

    public NetworkSportyLegendsRecommendedMatch(NetworkSportyLegendsTeam networkSportyLegendsTeam, NetworkSportyLegendsTeam networkSportyLegendsTeam2) {
        this.homeTeam = networkSportyLegendsTeam;
        this.awayTeam = networkSportyLegendsTeam2;
    }

    public static /* synthetic */ NetworkSportyLegendsRecommendedMatch copy$default(NetworkSportyLegendsRecommendedMatch networkSportyLegendsRecommendedMatch, NetworkSportyLegendsTeam networkSportyLegendsTeam, NetworkSportyLegendsTeam networkSportyLegendsTeam2, int i, Object obj) {
        if ((i & 1) != 0) {
            networkSportyLegendsTeam = networkSportyLegendsRecommendedMatch.homeTeam;
        }
        if ((i & 2) != 0) {
            networkSportyLegendsTeam2 = networkSportyLegendsRecommendedMatch.awayTeam;
        }
        return networkSportyLegendsRecommendedMatch.copy(networkSportyLegendsTeam, networkSportyLegendsTeam2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkSportyLegendsTeam getHomeTeam() {
        return this.homeTeam;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkSportyLegendsTeam getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkSportyLegendsRecommendedMatch copy(NetworkSportyLegendsTeam homeTeam, NetworkSportyLegendsTeam awayTeam) {
        return new NetworkSportyLegendsRecommendedMatch(homeTeam, awayTeam);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsRecommendedMatch)) {
            return false;
        }
        NetworkSportyLegendsRecommendedMatch networkSportyLegendsRecommendedMatch = (NetworkSportyLegendsRecommendedMatch) other;
        return Intrinsics.g(this.homeTeam, networkSportyLegendsRecommendedMatch.homeTeam) && Intrinsics.g(this.awayTeam, networkSportyLegendsRecommendedMatch.awayTeam);
    }

    public final NetworkSportyLegendsTeam getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkSportyLegendsTeam getHomeTeam() {
        return this.homeTeam;
    }

    public int hashCode() {
        NetworkSportyLegendsTeam networkSportyLegendsTeam = this.homeTeam;
        int iHashCode = (networkSportyLegendsTeam == null ? 0 : networkSportyLegendsTeam.hashCode()) * 31;
        NetworkSportyLegendsTeam networkSportyLegendsTeam2 = this.awayTeam;
        return iHashCode + (networkSportyLegendsTeam2 != null ? networkSportyLegendsTeam2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSportyLegendsRecommendedMatch(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ")";
    }
}
