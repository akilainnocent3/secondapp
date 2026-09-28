package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventInfo;", "", "roundId", "", "events", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEvent;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getRoundId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEvents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingEventInfo {
    public static final int $stable = 8;

    @SerializedName("events")
    private final List<NetworkInstantRacingEvent> events;

    @SerializedName("roundId")
    private final String roundId;

    public NetworkInstantRacingEventInfo(String str, List<NetworkInstantRacingEvent> list) {
        this.roundId = str;
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingEventInfo copy$default(NetworkInstantRacingEventInfo networkInstantRacingEventInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingEventInfo.roundId;
        }
        if ((i & 2) != 0) {
            list = networkInstantRacingEventInfo.events;
        }
        return networkInstantRacingEventInfo.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    public final List<NetworkInstantRacingEvent> component2() {
        return this.events;
    }

    public final NetworkInstantRacingEventInfo copy(String roundId, List<NetworkInstantRacingEvent> events) {
        return new NetworkInstantRacingEventInfo(roundId, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingEventInfo)) {
            return false;
        }
        NetworkInstantRacingEventInfo networkInstantRacingEventInfo = (NetworkInstantRacingEventInfo) other;
        return Intrinsics.g(this.roundId, networkInstantRacingEventInfo.roundId) && Intrinsics.g(this.events, networkInstantRacingEventInfo.events);
    }

    public final List<NetworkInstantRacingEvent> getEvents() {
        return this.events;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        String str = this.roundId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkInstantRacingEvent> list = this.events;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("NetworkInstantRacingEventInfo(roundId=", this.roundId, ", events=", ")", this.events);
    }
}
