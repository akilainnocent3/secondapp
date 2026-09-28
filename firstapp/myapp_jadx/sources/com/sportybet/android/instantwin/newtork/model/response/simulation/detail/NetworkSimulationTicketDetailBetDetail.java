package com.sportybet.android.instantwin.newtork.model.response.simulation.detail;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailBetDetail;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "hit", "", "settleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketId", "getOutcomeId", "getHit", "()Z", "getSettleType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketDetailBetDetail {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("hit")
    private final boolean hit;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("settleType")
    private final String settleType;

    public NetworkSimulationTicketDetailBetDetail(String str, String str2, String str3, boolean z, String str4) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.hit = z;
        this.settleType = str4;
    }

    public static /* synthetic */ NetworkSimulationTicketDetailBetDetail copy$default(NetworkSimulationTicketDetailBetDetail networkSimulationTicketDetailBetDetail, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketDetailBetDetail.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketDetailBetDetail.marketId;
        }
        if ((i & 4) != 0) {
            str3 = networkSimulationTicketDetailBetDetail.outcomeId;
        }
        if ((i & 8) != 0) {
            z = networkSimulationTicketDetailBetDetail.hit;
        }
        if ((i & 16) != 0) {
            str4 = networkSimulationTicketDetailBetDetail.settleType;
        }
        String str5 = str4;
        String str6 = str3;
        return networkSimulationTicketDetailBetDetail.copy(str, str2, str6, z, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSettleType() {
        return this.settleType;
    }

    public final NetworkSimulationTicketDetailBetDetail copy(String eventId, String marketId, String outcomeId, boolean hit, String settleType) {
        return new NetworkSimulationTicketDetailBetDetail(eventId, marketId, outcomeId, hit, settleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketDetailBetDetail)) {
            return false;
        }
        NetworkSimulationTicketDetailBetDetail networkSimulationTicketDetailBetDetail = (NetworkSimulationTicketDetailBetDetail) other;
        return Intrinsics.g(this.eventId, networkSimulationTicketDetailBetDetail.eventId) && Intrinsics.g(this.marketId, networkSimulationTicketDetailBetDetail.marketId) && Intrinsics.g(this.outcomeId, networkSimulationTicketDetailBetDetail.outcomeId) && this.hit == networkSimulationTicketDetailBetDetail.hit && Intrinsics.g(this.settleType, networkSimulationTicketDetailBetDetail.settleType);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final boolean getHit() {
        return this.hit;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSettleType() {
        return this.settleType;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outcomeId;
        int iA = mtg0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.hit);
        String str4 = this.settleType;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.outcomeId;
        boolean z = this.hit;
        String str4 = this.settleType;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketDetailBetDetail(eventId=", str, ", marketId=", str2, ", outcomeId=");
        uts.b(str3, ", hit=", ", settleType=", sbA, z);
        return uf80.a(sbA, str4, ")");
    }
}
