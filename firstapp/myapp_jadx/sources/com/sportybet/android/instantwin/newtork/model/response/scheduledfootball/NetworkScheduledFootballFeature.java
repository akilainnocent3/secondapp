package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeature;", "", "flexibet", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureFlexibet;", "onecut", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureOnecut;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureFlexibet;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureOnecut;)V", "getFlexibet", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureFlexibet;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOnecut", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureOnecut;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballFeature {
    public static final int $stable = NetworkScheduledFootballFeatureOnecut.$stable | NetworkScheduledFootballFeatureFlexibet.$stable;

    @SerializedName("flexibet")
    private final NetworkScheduledFootballFeatureFlexibet flexibet;

    @SerializedName("onecut")
    private final NetworkScheduledFootballFeatureOnecut onecut;

    public NetworkScheduledFootballFeature(NetworkScheduledFootballFeatureFlexibet networkScheduledFootballFeatureFlexibet, NetworkScheduledFootballFeatureOnecut networkScheduledFootballFeatureOnecut) {
        this.flexibet = networkScheduledFootballFeatureFlexibet;
        this.onecut = networkScheduledFootballFeatureOnecut;
    }

    public static /* synthetic */ NetworkScheduledFootballFeature copy$default(NetworkScheduledFootballFeature networkScheduledFootballFeature, NetworkScheduledFootballFeatureFlexibet networkScheduledFootballFeatureFlexibet, NetworkScheduledFootballFeatureOnecut networkScheduledFootballFeatureOnecut, int i, Object obj) {
        if ((i & 1) != 0) {
            networkScheduledFootballFeatureFlexibet = networkScheduledFootballFeature.flexibet;
        }
        if ((i & 2) != 0) {
            networkScheduledFootballFeatureOnecut = networkScheduledFootballFeature.onecut;
        }
        return networkScheduledFootballFeature.copy(networkScheduledFootballFeatureFlexibet, networkScheduledFootballFeatureOnecut);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkScheduledFootballFeatureFlexibet getFlexibet() {
        return this.flexibet;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkScheduledFootballFeatureOnecut getOnecut() {
        return this.onecut;
    }

    public final NetworkScheduledFootballFeature copy(NetworkScheduledFootballFeatureFlexibet flexibet, NetworkScheduledFootballFeatureOnecut onecut) {
        return new NetworkScheduledFootballFeature(flexibet, onecut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballFeature)) {
            return false;
        }
        NetworkScheduledFootballFeature networkScheduledFootballFeature = (NetworkScheduledFootballFeature) other;
        return Intrinsics.g(this.flexibet, networkScheduledFootballFeature.flexibet) && Intrinsics.g(this.onecut, networkScheduledFootballFeature.onecut);
    }

    public final NetworkScheduledFootballFeatureFlexibet getFlexibet() {
        return this.flexibet;
    }

    public final NetworkScheduledFootballFeatureOnecut getOnecut() {
        return this.onecut;
    }

    public int hashCode() {
        NetworkScheduledFootballFeatureFlexibet networkScheduledFootballFeatureFlexibet = this.flexibet;
        int iHashCode = (networkScheduledFootballFeatureFlexibet == null ? 0 : networkScheduledFootballFeatureFlexibet.hashCode()) * 31;
        NetworkScheduledFootballFeatureOnecut networkScheduledFootballFeatureOnecut = this.onecut;
        return iHashCode + (networkScheduledFootballFeatureOnecut != null ? networkScheduledFootballFeatureOnecut.hashCode() : 0);
    }

    public String toString() {
        return "NetworkScheduledFootballFeature(flexibet=" + this.flexibet + ", onecut=" + this.onecut + ")";
    }
}
