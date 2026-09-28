package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.gpp;
import defpackage.qpu;
import defpackage.ux5;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bHÆ\u0003J\u0085\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bHÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cÊ\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0002¨\u0006/"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySettleRound;", "", "sportId", "", "roundId", "roundNumber", "", "markets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketMarket;", "tickets", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySettleRoundTicket;", "leagues", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySettleRoundLeague;", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketEvent;", "outcomes", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRoundId", "getRoundNumber", "()I", "getMarkets", "()Ljava/util/List;", "getTickets", "getLeagues", "getEvents", "getOutcomes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltySettleRound {
    public static final int $stable = 0;

    @SerializedName("events")
    private final List<NetworkSportyPenaltyTicketEvent> events;

    @SerializedName("leagues")
    private final List<NetworkSportyPenaltySettleRoundLeague> leagues;

    @SerializedName("markets")
    private final List<NetworkSportyPenaltyTicketMarket> markets;

    @SerializedName("outcomes")
    private final List<NetworkSportyPenaltyTicketOutcome> outcomes;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("roundNumber")
    private final int roundNumber;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("tickets")
    private final List<NetworkSportyPenaltySettleRoundTicket> tickets;

    public NetworkSportyPenaltySettleRound(String str, String str2, int i, List<NetworkSportyPenaltyTicketMarket> list, List<NetworkSportyPenaltySettleRoundTicket> list2, List<NetworkSportyPenaltySettleRoundLeague> list3, List<NetworkSportyPenaltyTicketEvent> list4, List<NetworkSportyPenaltyTicketOutcome> list5) {
        this.sportId = str;
        this.roundId = str2;
        this.roundNumber = i;
        this.markets = list;
        this.tickets = list2;
        this.leagues = list3;
        this.events = list4;
        this.outcomes = list5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltySettleRound copy$default(NetworkSportyPenaltySettleRound networkSportyPenaltySettleRound, String str, String str2, int i, List list, List list2, List list3, List list4, List list5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkSportyPenaltySettleRound.sportId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkSportyPenaltySettleRound.roundId;
        }
        if ((i2 & 4) != 0) {
            i = networkSportyPenaltySettleRound.roundNumber;
        }
        if ((i2 & 8) != 0) {
            list = networkSportyPenaltySettleRound.markets;
        }
        if ((i2 & 16) != 0) {
            list2 = networkSportyPenaltySettleRound.tickets;
        }
        if ((i2 & 32) != 0) {
            list3 = networkSportyPenaltySettleRound.leagues;
        }
        if ((i2 & 64) != 0) {
            list4 = networkSportyPenaltySettleRound.events;
        }
        if ((i2 & 128) != 0) {
            list5 = networkSportyPenaltySettleRound.outcomes;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        return networkSportyPenaltySettleRound.copy(str, str2, i, list, list8, list9, list6, list7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public final List<NetworkSportyPenaltyTicketMarket> component4() {
        return this.markets;
    }

    public final List<NetworkSportyPenaltySettleRoundTicket> component5() {
        return this.tickets;
    }

    public final List<NetworkSportyPenaltySettleRoundLeague> component6() {
        return this.leagues;
    }

    public final List<NetworkSportyPenaltyTicketEvent> component7() {
        return this.events;
    }

    public final List<NetworkSportyPenaltyTicketOutcome> component8() {
        return this.outcomes;
    }

    public final NetworkSportyPenaltySettleRound copy(String sportId, String roundId, int roundNumber, List<NetworkSportyPenaltyTicketMarket> markets, List<NetworkSportyPenaltySettleRoundTicket> tickets, List<NetworkSportyPenaltySettleRoundLeague> leagues, List<NetworkSportyPenaltyTicketEvent> events, List<NetworkSportyPenaltyTicketOutcome> outcomes) {
        return new NetworkSportyPenaltySettleRound(sportId, roundId, roundNumber, markets, tickets, leagues, events, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltySettleRound)) {
            return false;
        }
        NetworkSportyPenaltySettleRound networkSportyPenaltySettleRound = (NetworkSportyPenaltySettleRound) other;
        return Intrinsics.g(this.sportId, networkSportyPenaltySettleRound.sportId) && Intrinsics.g(this.roundId, networkSportyPenaltySettleRound.roundId) && this.roundNumber == networkSportyPenaltySettleRound.roundNumber && Intrinsics.g(this.markets, networkSportyPenaltySettleRound.markets) && Intrinsics.g(this.tickets, networkSportyPenaltySettleRound.tickets) && Intrinsics.g(this.leagues, networkSportyPenaltySettleRound.leagues) && Intrinsics.g(this.events, networkSportyPenaltySettleRound.events) && Intrinsics.g(this.outcomes, networkSportyPenaltySettleRound.outcomes);
    }

    public final List<NetworkSportyPenaltyTicketEvent> getEvents() {
        return this.events;
    }

    public final List<NetworkSportyPenaltySettleRoundLeague> getLeagues() {
        return this.leagues;
    }

    public final List<NetworkSportyPenaltyTicketMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkSportyPenaltyTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final List<NetworkSportyPenaltySettleRoundTicket> getTickets() {
        return this.tickets;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roundId;
        int iA = gpp.a(this.roundNumber, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<NetworkSportyPenaltyTicketMarket> list = this.markets;
        int iHashCode2 = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkSportyPenaltySettleRoundTicket> list2 = this.tickets;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkSportyPenaltySettleRoundLeague> list3 = this.leagues;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NetworkSportyPenaltyTicketEvent> list4 = this.events;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<NetworkSportyPenaltyTicketOutcome> list5 = this.outcomes;
        return iHashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.roundId;
        int i = this.roundNumber;
        List<NetworkSportyPenaltyTicketMarket> list = this.markets;
        List<NetworkSportyPenaltySettleRoundTicket> list2 = this.tickets;
        List<NetworkSportyPenaltySettleRoundLeague> list3 = this.leagues;
        List<NetworkSportyPenaltyTicketEvent> list4 = this.events;
        List<NetworkSportyPenaltyTicketOutcome> list5 = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltySettleRound(sportId=", str, ", roundId=", str2, ", roundNumber=");
        sbA.append(i);
        sbA.append(", markets=");
        sbA.append(list);
        sbA.append(", tickets=");
        qpu.a(", leagues=", ", events=", sbA, list2, list3);
        return v9d.a(", outcomes=", ")", sbA, list4, list5);
    }
}
