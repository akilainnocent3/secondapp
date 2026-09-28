package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Jc\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0000¨\u0006'"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "homeTeamName", "awayTeamName", "homeTeamScore", "awayTeamScore", "resultSequence", "markets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketMarket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamName", "getAwayTeamName", "getHomeTeamScore", "getAwayTeamScore", "getResultSequence", "getMarkets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketEvent {
    public static final int $stable = 8;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("awayTeamScore")
    private final String awayTeamScore;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("homeTeamScore")
    private final String homeTeamScore;

    @SerializedName("markets")
    private final List<NetworkSimulationTicketMarket> markets;

    @SerializedName("resultSequence")
    private final String resultSequence;

    public NetworkSimulationTicketEvent(String str, String str2, String str3, String str4, String str5, String str6, List<NetworkSimulationTicketMarket> list) {
        this.eventId = str;
        this.homeTeamName = str2;
        this.awayTeamName = str3;
        this.homeTeamScore = str4;
        this.awayTeamScore = str5;
        this.resultSequence = str6;
        this.markets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationTicketEvent copy$default(NetworkSimulationTicketEvent networkSimulationTicketEvent, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketEvent.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketEvent.homeTeamName;
        }
        if ((i & 4) != 0) {
            str3 = networkSimulationTicketEvent.awayTeamName;
        }
        if ((i & 8) != 0) {
            str4 = networkSimulationTicketEvent.homeTeamScore;
        }
        if ((i & 16) != 0) {
            str5 = networkSimulationTicketEvent.awayTeamScore;
        }
        if ((i & 32) != 0) {
            str6 = networkSimulationTicketEvent.resultSequence;
        }
        if ((i & 64) != 0) {
            list = networkSimulationTicketEvent.markets;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return networkSimulationTicketEvent.copy(str, str2, str9, str4, str8, str7, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamScore() {
        return this.awayTeamScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    public final List<NetworkSimulationTicketMarket> component7() {
        return this.markets;
    }

    public final NetworkSimulationTicketEvent copy(String eventId, String homeTeamName, String awayTeamName, String homeTeamScore, String awayTeamScore, String resultSequence, List<NetworkSimulationTicketMarket> markets) {
        return new NetworkSimulationTicketEvent(eventId, homeTeamName, awayTeamName, homeTeamScore, awayTeamScore, resultSequence, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketEvent)) {
            return false;
        }
        NetworkSimulationTicketEvent networkSimulationTicketEvent = (NetworkSimulationTicketEvent) other;
        return Intrinsics.g(this.eventId, networkSimulationTicketEvent.eventId) && Intrinsics.g(this.homeTeamName, networkSimulationTicketEvent.homeTeamName) && Intrinsics.g(this.awayTeamName, networkSimulationTicketEvent.awayTeamName) && Intrinsics.g(this.homeTeamScore, networkSimulationTicketEvent.homeTeamScore) && Intrinsics.g(this.awayTeamScore, networkSimulationTicketEvent.awayTeamScore) && Intrinsics.g(this.resultSequence, networkSimulationTicketEvent.resultSequence) && Intrinsics.g(this.markets, networkSimulationTicketEvent.markets);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getAwayTeamScore() {
        return this.awayTeamScore;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public final List<NetworkSimulationTicketMarket> getMarkets() {
        return this.markets;
    }

    public final String getResultSequence() {
        return this.resultSequence;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awayTeamName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamScore;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamScore;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.resultSequence;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<NetworkSimulationTicketMarket> list = this.markets;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamName;
        String str4 = this.homeTeamScore;
        String str5 = this.awayTeamScore;
        String str6 = this.resultSequence;
        List<NetworkSimulationTicketMarket> list = this.markets;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketEvent(eventId=", str, ", homeTeamName=", str2, ", awayTeamName=");
        hxa.c(sbA, str3, ", homeTeamScore=", str4, ", awayTeamScore=");
        hxa.c(sbA, str5, ", resultSequence=", str6, ", markets=");
        return ng1.a(sbA, list, ")");
    }
}
