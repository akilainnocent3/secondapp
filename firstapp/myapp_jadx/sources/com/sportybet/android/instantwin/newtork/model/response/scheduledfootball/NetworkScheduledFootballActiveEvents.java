package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.NetworkKeyMappedPayload;
import defpackage.f87;
import defpackage.q6a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballActiveEvents;", "", "receiveTime", "", "currentTime", "wrapLeagueMatchdayList", "Lcom/sportybet/android/instantwin/newtork/model/NetworkKeyMappedPayload;", "<init>", "(JJLcom/sportybet/android/instantwin/newtork/model/NetworkKeyMappedPayload;)V", "getReceiveTime", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "getCurrentTime", "getWrapLeagueMatchdayList", "()Lcom/sportybet/android/instantwin/newtork/model/NetworkKeyMappedPayload;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballActiveEvents {
    public static final int $stable = NetworkKeyMappedPayload.$stable;

    @SerializedName("currentTime")
    private final long currentTime;

    @SerializedName("receiveTime")
    private final long receiveTime;

    @SerializedName("wrapLeagueMatchdayList")
    private final NetworkKeyMappedPayload wrapLeagueMatchdayList;

    public NetworkScheduledFootballActiveEvents(long j, long j2, NetworkKeyMappedPayload networkKeyMappedPayload) {
        networkKeyMappedPayload.getClass();
        this.receiveTime = j;
        this.currentTime = j2;
        this.wrapLeagueMatchdayList = networkKeyMappedPayload;
    }

    public static /* synthetic */ NetworkScheduledFootballActiveEvents copy$default(NetworkScheduledFootballActiveEvents networkScheduledFootballActiveEvents, long j, long j2, NetworkKeyMappedPayload networkKeyMappedPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            j = networkScheduledFootballActiveEvents.receiveTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = networkScheduledFootballActiveEvents.currentTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            networkKeyMappedPayload = networkScheduledFootballActiveEvents.wrapLeagueMatchdayList;
        }
        return networkScheduledFootballActiveEvents.copy(j3, j4, networkKeyMappedPayload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReceiveTime() {
        return this.receiveTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NetworkKeyMappedPayload getWrapLeagueMatchdayList() {
        return this.wrapLeagueMatchdayList;
    }

    public final NetworkScheduledFootballActiveEvents copy(long receiveTime, long currentTime, NetworkKeyMappedPayload wrapLeagueMatchdayList) {
        wrapLeagueMatchdayList.getClass();
        return new NetworkScheduledFootballActiveEvents(receiveTime, currentTime, wrapLeagueMatchdayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballActiveEvents)) {
            return false;
        }
        NetworkScheduledFootballActiveEvents networkScheduledFootballActiveEvents = (NetworkScheduledFootballActiveEvents) other;
        return this.receiveTime == networkScheduledFootballActiveEvents.receiveTime && this.currentTime == networkScheduledFootballActiveEvents.currentTime && Intrinsics.g(this.wrapLeagueMatchdayList, networkScheduledFootballActiveEvents.wrapLeagueMatchdayList);
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final long getReceiveTime() {
        return this.receiveTime;
    }

    public final NetworkKeyMappedPayload getWrapLeagueMatchdayList() {
        return this.wrapLeagueMatchdayList;
    }

    public int hashCode() {
        return this.wrapLeagueMatchdayList.hashCode() + f87.a(Long.hashCode(this.receiveTime) * 31, this.currentTime, 31);
    }

    public String toString() {
        long j = this.receiveTime;
        long j2 = this.currentTime;
        NetworkKeyMappedPayload networkKeyMappedPayload = this.wrapLeagueMatchdayList;
        StringBuilder sbA = q6a0.a(j, "NetworkScheduledFootballActiveEvents(receiveTime=", ", currentTime=");
        sbA.append(j2);
        sbA.append(", wrapLeagueMatchdayList=");
        sbA.append(networkKeyMappedPayload);
        sbA.append(")");
        return sbA.toString();
    }
}
