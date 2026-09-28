package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketBetDetail;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketId", "getOutcomeId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyTicketBetDetail {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("outcomeId")
    private final String outcomeId;

    public NetworkSportyPenaltyTicketBetDetail(String str, String str2, String str3) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
    }

    public static /* synthetic */ NetworkSportyPenaltyTicketBetDetail copy$default(NetworkSportyPenaltyTicketBetDetail networkSportyPenaltyTicketBetDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyPenaltyTicketBetDetail.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkSportyPenaltyTicketBetDetail.marketId;
        }
        if ((i & 4) != 0) {
            str3 = networkSportyPenaltyTicketBetDetail.outcomeId;
        }
        return networkSportyPenaltyTicketBetDetail.copy(str, str2, str3);
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

    public final NetworkSportyPenaltyTicketBetDetail copy(String eventId, String marketId, String outcomeId) {
        return new NetworkSportyPenaltyTicketBetDetail(eventId, marketId, outcomeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyTicketBetDetail)) {
            return false;
        }
        NetworkSportyPenaltyTicketBetDetail networkSportyPenaltyTicketBetDetail = (NetworkSportyPenaltyTicketBetDetail) other;
        return Intrinsics.g(this.eventId, networkSportyPenaltyTicketBetDetail.eventId) && Intrinsics.g(this.marketId, networkSportyPenaltyTicketBetDetail.marketId) && Intrinsics.g(this.outcomeId, networkSportyPenaltyTicketBetDetail.outcomeId);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outcomeId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        return uf80.a(ux5.a("NetworkSportyPenaltyTicketBetDetail(eventId=", str, ", marketId=", str2, ", outcomeId="), this.outcomeId, ")");
    }
}
