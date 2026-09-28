package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketSelection;", "", "selectionId", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "marketId", "outcomeId", AnalyticsParam.EVENT_STATUS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getSelectionId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEventId", "getMarketId", "getOutcomeId", "getStatus", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballTicketSelection {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("selectionId")
    private final String selectionId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkScheduledFootballTicketSelection(String str, String str2, String str3, String str4, int i) {
        this.selectionId = str;
        this.eventId = str2;
        this.marketId = str3;
        this.outcomeId = str4;
        this.status = i;
    }

    public static /* synthetic */ NetworkScheduledFootballTicketSelection copy$default(NetworkScheduledFootballTicketSelection networkScheduledFootballTicketSelection, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballTicketSelection.selectionId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkScheduledFootballTicketSelection.eventId;
        }
        if ((i2 & 4) != 0) {
            str3 = networkScheduledFootballTicketSelection.marketId;
        }
        if ((i2 & 8) != 0) {
            str4 = networkScheduledFootballTicketSelection.outcomeId;
        }
        if ((i2 & 16) != 0) {
            i = networkScheduledFootballTicketSelection.status;
        }
        int i3 = i;
        String str5 = str3;
        return networkScheduledFootballTicketSelection.copy(str, str2, str5, str4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final NetworkScheduledFootballTicketSelection copy(String selectionId, String eventId, String marketId, String outcomeId, int status) {
        return new NetworkScheduledFootballTicketSelection(selectionId, eventId, marketId, outcomeId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballTicketSelection)) {
            return false;
        }
        NetworkScheduledFootballTicketSelection networkScheduledFootballTicketSelection = (NetworkScheduledFootballTicketSelection) other;
        return Intrinsics.g(this.selectionId, networkScheduledFootballTicketSelection.selectionId) && Intrinsics.g(this.eventId, networkScheduledFootballTicketSelection.eventId) && Intrinsics.g(this.marketId, networkScheduledFootballTicketSelection.marketId) && Intrinsics.g(this.outcomeId, networkScheduledFootballTicketSelection.outcomeId) && this.status == networkScheduledFootballTicketSelection.status;
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

    public final String getSelectionId() {
        return this.selectionId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.selectionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.outcomeId;
        return Integer.hashCode(this.status) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.selectionId;
        String str2 = this.eventId;
        String str3 = this.marketId;
        String str4 = this.outcomeId;
        int i = this.status;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballTicketSelection(selectionId=", str, ", eventId=", str2, ", marketId=");
        hxa.c(sbA, str3, ", outcomeId=", str4, ", status=");
        return zk1.a(i, ")", sbA);
    }
}
