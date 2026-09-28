package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.kya0;
import defpackage.qpu;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003J\u007f\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR-\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR%\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\f\b/\u0012\b\b0\u0012\u0004\b\u0003\u0010\u0002¨\u0006."}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBets;", "", "sportId", "", "userId", "countryCode", "tickets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsTicket;", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsEvent;", "markets", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketMarket;", "outcomes", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketOutcome;", "reachQueryLimit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getUserId", "getCountryCode", "getTickets", "()Ljava/util/List;", "getEvents", "getMarkets", "getOutcomes", "getReachQueryLimit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballOpenBets {
    public static final int $stable = 0;

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("events")
    private final List<NetworkScheduledFootballOpenBetsEvent> events;

    @SerializedName("markets")
    private final List<NetworkScheduledFootballTicketMarket> markets;

    @SerializedName("outcomes")
    private final List<NetworkScheduledFootballTicketOutcome> outcomes;

    @SerializedName("reachQueryLimit")
    private final boolean reachQueryLimit;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("tickets")
    private final List<NetworkScheduledFootballOpenBetsTicket> tickets;

    @SerializedName("userId")
    private final String userId;

    public NetworkScheduledFootballOpenBets(String str, String str2, String str3, List<NetworkScheduledFootballOpenBetsTicket> list, List<NetworkScheduledFootballOpenBetsEvent> list2, List<NetworkScheduledFootballTicketMarket> list3, List<NetworkScheduledFootballTicketOutcome> list4, boolean z) {
        this.sportId = str;
        this.userId = str2;
        this.countryCode = str3;
        this.tickets = list;
        this.events = list2;
        this.markets = list3;
        this.outcomes = list4;
        this.reachQueryLimit = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballOpenBets copy$default(NetworkScheduledFootballOpenBets networkScheduledFootballOpenBets, String str, String str2, String str3, List list, List list2, List list3, List list4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballOpenBets.sportId;
        }
        if ((i & 2) != 0) {
            str2 = networkScheduledFootballOpenBets.userId;
        }
        if ((i & 4) != 0) {
            str3 = networkScheduledFootballOpenBets.countryCode;
        }
        if ((i & 8) != 0) {
            list = networkScheduledFootballOpenBets.tickets;
        }
        if ((i & 16) != 0) {
            list2 = networkScheduledFootballOpenBets.events;
        }
        if ((i & 32) != 0) {
            list3 = networkScheduledFootballOpenBets.markets;
        }
        if ((i & 64) != 0) {
            list4 = networkScheduledFootballOpenBets.outcomes;
        }
        if ((i & 128) != 0) {
            z = networkScheduledFootballOpenBets.reachQueryLimit;
        }
        List list5 = list4;
        boolean z2 = z;
        List list6 = list2;
        List list7 = list3;
        return networkScheduledFootballOpenBets.copy(str, str2, str3, list, list6, list7, list5, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<NetworkScheduledFootballOpenBetsTicket> component4() {
        return this.tickets;
    }

    public final List<NetworkScheduledFootballOpenBetsEvent> component5() {
        return this.events;
    }

    public final List<NetworkScheduledFootballTicketMarket> component6() {
        return this.markets;
    }

    public final List<NetworkScheduledFootballTicketOutcome> component7() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getReachQueryLimit() {
        return this.reachQueryLimit;
    }

    public final NetworkScheduledFootballOpenBets copy(String sportId, String userId, String countryCode, List<NetworkScheduledFootballOpenBetsTicket> tickets, List<NetworkScheduledFootballOpenBetsEvent> events, List<NetworkScheduledFootballTicketMarket> markets, List<NetworkScheduledFootballTicketOutcome> outcomes, boolean reachQueryLimit) {
        return new NetworkScheduledFootballOpenBets(sportId, userId, countryCode, tickets, events, markets, outcomes, reachQueryLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballOpenBets)) {
            return false;
        }
        NetworkScheduledFootballOpenBets networkScheduledFootballOpenBets = (NetworkScheduledFootballOpenBets) other;
        return Intrinsics.g(this.sportId, networkScheduledFootballOpenBets.sportId) && Intrinsics.g(this.userId, networkScheduledFootballOpenBets.userId) && Intrinsics.g(this.countryCode, networkScheduledFootballOpenBets.countryCode) && Intrinsics.g(this.tickets, networkScheduledFootballOpenBets.tickets) && Intrinsics.g(this.events, networkScheduledFootballOpenBets.events) && Intrinsics.g(this.markets, networkScheduledFootballOpenBets.markets) && Intrinsics.g(this.outcomes, networkScheduledFootballOpenBets.outcomes) && this.reachQueryLimit == networkScheduledFootballOpenBets.reachQueryLimit;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<NetworkScheduledFootballOpenBetsEvent> getEvents() {
        return this.events;
    }

    public final List<NetworkScheduledFootballTicketMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkScheduledFootballTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final boolean getReachQueryLimit() {
        return this.reachQueryLimit;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final List<NetworkScheduledFootballOpenBetsTicket> getTickets() {
        return this.tickets;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<NetworkScheduledFootballOpenBetsTicket> list = this.tickets;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkScheduledFootballOpenBetsEvent> list2 = this.events;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkScheduledFootballTicketMarket> list3 = this.markets;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NetworkScheduledFootballTicketOutcome> list4 = this.outcomes;
        return Boolean.hashCode(this.reachQueryLimit) + ((iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.userId;
        String str3 = this.countryCode;
        List<NetworkScheduledFootballOpenBetsTicket> list = this.tickets;
        List<NetworkScheduledFootballOpenBetsEvent> list2 = this.events;
        List<NetworkScheduledFootballTicketMarket> list3 = this.markets;
        List<NetworkScheduledFootballTicketOutcome> list4 = this.outcomes;
        boolean z = this.reachQueryLimit;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballOpenBets(sportId=", str, ", userId=", str2, ", countryCode=");
        kya0.b(str3, ", tickets=", ", events=", sbA, list);
        qpu.a(", markets=", ", outcomes=", sbA, list2, list3);
        sbA.append(list4);
        sbA.append(", reachQueryLimit=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }
}
