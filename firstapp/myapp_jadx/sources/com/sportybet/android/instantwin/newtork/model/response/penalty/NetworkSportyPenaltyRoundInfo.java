package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyRoundInfo;", "", "roundId", "", "openBetsCount", "", "events", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyEvent;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getRoundId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOpenBetsCount", "()I", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyRoundInfo {
    public static final int $stable = 8;

    @SerializedName("events")
    private final List<NetworkSportyPenaltyEvent> events;

    @SerializedName("openBetsCount")
    private final int openBetsCount;

    @SerializedName("roundId")
    private final String roundId;

    public NetworkSportyPenaltyRoundInfo(String str, int i, List<NetworkSportyPenaltyEvent> list) {
        this.roundId = str;
        this.openBetsCount = i;
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltyRoundInfo copy$default(NetworkSportyPenaltyRoundInfo networkSportyPenaltyRoundInfo, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkSportyPenaltyRoundInfo.roundId;
        }
        if ((i2 & 2) != 0) {
            i = networkSportyPenaltyRoundInfo.openBetsCount;
        }
        if ((i2 & 4) != 0) {
            list = networkSportyPenaltyRoundInfo.events;
        }
        return networkSportyPenaltyRoundInfo.copy(str, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOpenBetsCount() {
        return this.openBetsCount;
    }

    public final List<NetworkSportyPenaltyEvent> component3() {
        return this.events;
    }

    public final NetworkSportyPenaltyRoundInfo copy(String roundId, int openBetsCount, List<NetworkSportyPenaltyEvent> events) {
        return new NetworkSportyPenaltyRoundInfo(roundId, openBetsCount, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyRoundInfo)) {
            return false;
        }
        NetworkSportyPenaltyRoundInfo networkSportyPenaltyRoundInfo = (NetworkSportyPenaltyRoundInfo) other;
        return Intrinsics.g(this.roundId, networkSportyPenaltyRoundInfo.roundId) && this.openBetsCount == networkSportyPenaltyRoundInfo.openBetsCount && Intrinsics.g(this.events, networkSportyPenaltyRoundInfo.events);
    }

    public final List<NetworkSportyPenaltyEvent> getEvents() {
        return this.events;
    }

    public final int getOpenBetsCount() {
        return this.openBetsCount;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        String str = this.roundId;
        int iA = gpp.a(this.openBetsCount, (str == null ? 0 : str.hashCode()) * 31, 31);
        List<NetworkSportyPenaltyEvent> list = this.events;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.roundId;
        int i = this.openBetsCount;
        return ng1.a(ml5.a(i, "NetworkSportyPenaltyRoundInfo(roundId=", str, ", openBetsCount=", ", events="), this.events, ")");
    }
}
