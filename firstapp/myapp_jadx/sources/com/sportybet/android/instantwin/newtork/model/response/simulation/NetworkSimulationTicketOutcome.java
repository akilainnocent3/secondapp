package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketOutcome;", "", "outcomeId", "", "desc", "odds", "hit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getOutcomeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getDesc", "getOdds", "getHit", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketOutcome {
    public static final int $stable = 0;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("hit")
    private final boolean hit;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("outcomeId")
    private final String outcomeId;

    public NetworkSimulationTicketOutcome(String str, String str2, String str3, boolean z) {
        this.outcomeId = str;
        this.desc = str2;
        this.odds = str3;
        this.hit = z;
    }

    public static /* synthetic */ NetworkSimulationTicketOutcome copy$default(NetworkSimulationTicketOutcome networkSimulationTicketOutcome, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketOutcome.outcomeId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketOutcome.desc;
        }
        if ((i & 4) != 0) {
            str3 = networkSimulationTicketOutcome.odds;
        }
        if ((i & 8) != 0) {
            z = networkSimulationTicketOutcome.hit;
        }
        return networkSimulationTicketOutcome.copy(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    public final NetworkSimulationTicketOutcome copy(String outcomeId, String desc, String odds, boolean hit) {
        return new NetworkSimulationTicketOutcome(outcomeId, desc, odds, hit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketOutcome)) {
            return false;
        }
        NetworkSimulationTicketOutcome networkSimulationTicketOutcome = (NetworkSimulationTicketOutcome) other;
        return Intrinsics.g(this.outcomeId, networkSimulationTicketOutcome.outcomeId) && Intrinsics.g(this.desc, networkSimulationTicketOutcome.desc) && Intrinsics.g(this.odds, networkSimulationTicketOutcome.odds) && this.hit == networkSimulationTicketOutcome.hit;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getHit() {
        return this.hit;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public int hashCode() {
        String str = this.outcomeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.odds;
        return Boolean.hashCode(this.hit) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.outcomeId;
        String str2 = this.desc;
        return x9d.a(this.odds, ", hit=", ")", ux5.a("NetworkSimulationTicketOutcome(outcomeId=", str, ", desc=", str2, ", odds="), this.hit);
    }
}
