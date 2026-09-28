package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsCountInfo;", "", "count", "", EventKeys.TIMESTAMP, "", "<init>", "(IJ)V", "getCount", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballOpenBetsCountInfo {
    public static final int $stable = 0;

    @SerializedName("count")
    private final int count;

    @SerializedName(EventKeys.TIMESTAMP)
    private final long timestamp;

    public NetworkScheduledFootballOpenBetsCountInfo(int i, long j) {
        this.count = i;
        this.timestamp = j;
    }

    public static /* synthetic */ NetworkScheduledFootballOpenBetsCountInfo copy$default(NetworkScheduledFootballOpenBetsCountInfo networkScheduledFootballOpenBetsCountInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkScheduledFootballOpenBetsCountInfo.count;
        }
        if ((i2 & 2) != 0) {
            j = networkScheduledFootballOpenBetsCountInfo.timestamp;
        }
        return networkScheduledFootballOpenBetsCountInfo.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final NetworkScheduledFootballOpenBetsCountInfo copy(int count, long timestamp) {
        return new NetworkScheduledFootballOpenBetsCountInfo(count, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballOpenBetsCountInfo)) {
            return false;
        }
        NetworkScheduledFootballOpenBetsCountInfo networkScheduledFootballOpenBetsCountInfo = (NetworkScheduledFootballOpenBetsCountInfo) other;
        return this.count == networkScheduledFootballOpenBetsCountInfo.count && this.timestamp == networkScheduledFootballOpenBetsCountInfo.timestamp;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (Integer.hashCode(this.count) * 31);
    }

    public String toString() {
        StringBuilder sbA = a0.a("NetworkScheduledFootballOpenBetsCountInfo(count=", ", timestamp=", this.count, this.timestamp);
        sbA.append(")");
        return sbA.toString();
    }
}
