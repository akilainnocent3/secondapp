package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOddsFilter;", "", AnalyticsParam.EVENT_STATUS, "", "presetRange", "", "", "shortcut", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOddsFilterShortcut;", "<init>", "(ILjava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOddsFilterShortcut;)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getPresetRange", "()Ljava/util/List;", "getShortcut", "()Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOddsFilterShortcut;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyOddsFilter {
    public static final int $stable = NetworkSportyPenaltyOddsFilterShortcut.$stable;

    @SerializedName("presetRange")
    private final List<Float> presetRange;

    @SerializedName("shortcut")
    private final NetworkSportyPenaltyOddsFilterShortcut shortcut;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkSportyPenaltyOddsFilter(int i, List<Float> list, NetworkSportyPenaltyOddsFilterShortcut networkSportyPenaltyOddsFilterShortcut) {
        this.status = i;
        this.presetRange = list;
        this.shortcut = networkSportyPenaltyOddsFilterShortcut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltyOddsFilter copy$default(NetworkSportyPenaltyOddsFilter networkSportyPenaltyOddsFilter, int i, List list, NetworkSportyPenaltyOddsFilterShortcut networkSportyPenaltyOddsFilterShortcut, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkSportyPenaltyOddsFilter.status;
        }
        if ((i2 & 2) != 0) {
            list = networkSportyPenaltyOddsFilter.presetRange;
        }
        if ((i2 & 4) != 0) {
            networkSportyPenaltyOddsFilterShortcut = networkSportyPenaltyOddsFilter.shortcut;
        }
        return networkSportyPenaltyOddsFilter.copy(i, list, networkSportyPenaltyOddsFilterShortcut);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final List<Float> component2() {
        return this.presetRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NetworkSportyPenaltyOddsFilterShortcut getShortcut() {
        return this.shortcut;
    }

    public final NetworkSportyPenaltyOddsFilter copy(int status, List<Float> presetRange, NetworkSportyPenaltyOddsFilterShortcut shortcut) {
        return new NetworkSportyPenaltyOddsFilter(status, presetRange, shortcut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyOddsFilter)) {
            return false;
        }
        NetworkSportyPenaltyOddsFilter networkSportyPenaltyOddsFilter = (NetworkSportyPenaltyOddsFilter) other;
        return this.status == networkSportyPenaltyOddsFilter.status && Intrinsics.g(this.presetRange, networkSportyPenaltyOddsFilter.presetRange) && Intrinsics.g(this.shortcut, networkSportyPenaltyOddsFilter.shortcut);
    }

    public final List<Float> getPresetRange() {
        return this.presetRange;
    }

    public final NetworkSportyPenaltyOddsFilterShortcut getShortcut() {
        return this.shortcut;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        List<Float> list = this.presetRange;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        NetworkSportyPenaltyOddsFilterShortcut networkSportyPenaltyOddsFilterShortcut = this.shortcut;
        return iHashCode2 + (networkSportyPenaltyOddsFilterShortcut != null ? networkSportyPenaltyOddsFilterShortcut.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSportyPenaltyOddsFilter(status=" + this.status + ", presetRange=" + this.presetRange + ", shortcut=" + this.shortcut + ")";
    }
}
