package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.ng1;
import defpackage.qpu;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006HÆ\u0003J{\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006HÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0002¨\u0006+"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSettleRound;", "", "sportId", "", "roundId", "markets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketMarket;", "tickets", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSettleRoundTicket;", "leagues", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSettleRoundLeague;", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketEvent;", "outcomes", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRoundId", "getMarkets", "()Ljava/util/List;", "getTickets", "getLeagues", "getEvents", "getOutcomes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingSettleRound {
    public static final int $stable = 0;

    @SerializedName("events")
    private final List<NetworkInstantRacingTicketEvent> events;

    @SerializedName("leagues")
    private final List<NetworkInstantRacingSettleRoundLeague> leagues;

    @SerializedName("markets")
    private final List<NetworkInstantRacingTicketMarket> markets;

    @SerializedName("outcomes")
    private final List<NetworkInstantRacingTicketOutcome> outcomes;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("tickets")
    private final List<NetworkInstantRacingSettleRoundTicket> tickets;

    public NetworkInstantRacingSettleRound(String str, String str2, List<NetworkInstantRacingTicketMarket> list, List<NetworkInstantRacingSettleRoundTicket> list2, List<NetworkInstantRacingSettleRoundLeague> list3, List<NetworkInstantRacingTicketEvent> list4, List<NetworkInstantRacingTicketOutcome> list5) {
        this.sportId = str;
        this.roundId = str2;
        this.markets = list;
        this.tickets = list2;
        this.leagues = list3;
        this.events = list4;
        this.outcomes = list5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingSettleRound copy$default(NetworkInstantRacingSettleRound networkInstantRacingSettleRound, String str, String str2, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingSettleRound.sportId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingSettleRound.roundId;
        }
        if ((i & 4) != 0) {
            list = networkInstantRacingSettleRound.markets;
        }
        if ((i & 8) != 0) {
            list2 = networkInstantRacingSettleRound.tickets;
        }
        if ((i & 16) != 0) {
            list3 = networkInstantRacingSettleRound.leagues;
        }
        if ((i & 32) != 0) {
            list4 = networkInstantRacingSettleRound.events;
        }
        if ((i & 64) != 0) {
            list5 = networkInstantRacingSettleRound.outcomes;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list3;
        List list9 = list;
        return networkInstantRacingSettleRound.copy(str, str2, list9, list2, list8, list6, list7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    public final List<NetworkInstantRacingTicketMarket> component3() {
        return this.markets;
    }

    public final List<NetworkInstantRacingSettleRoundTicket> component4() {
        return this.tickets;
    }

    public final List<NetworkInstantRacingSettleRoundLeague> component5() {
        return this.leagues;
    }

    public final List<NetworkInstantRacingTicketEvent> component6() {
        return this.events;
    }

    public final List<NetworkInstantRacingTicketOutcome> component7() {
        return this.outcomes;
    }

    public final NetworkInstantRacingSettleRound copy(String sportId, String roundId, List<NetworkInstantRacingTicketMarket> markets, List<NetworkInstantRacingSettleRoundTicket> tickets, List<NetworkInstantRacingSettleRoundLeague> leagues, List<NetworkInstantRacingTicketEvent> events, List<NetworkInstantRacingTicketOutcome> outcomes) {
        return new NetworkInstantRacingSettleRound(sportId, roundId, markets, tickets, leagues, events, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingSettleRound)) {
            return false;
        }
        NetworkInstantRacingSettleRound networkInstantRacingSettleRound = (NetworkInstantRacingSettleRound) other;
        return Intrinsics.g(this.sportId, networkInstantRacingSettleRound.sportId) && Intrinsics.g(this.roundId, networkInstantRacingSettleRound.roundId) && Intrinsics.g(this.markets, networkInstantRacingSettleRound.markets) && Intrinsics.g(this.tickets, networkInstantRacingSettleRound.tickets) && Intrinsics.g(this.leagues, networkInstantRacingSettleRound.leagues) && Intrinsics.g(this.events, networkInstantRacingSettleRound.events) && Intrinsics.g(this.outcomes, networkInstantRacingSettleRound.outcomes);
    }

    public final List<NetworkInstantRacingTicketEvent> getEvents() {
        return this.events;
    }

    public final List<NetworkInstantRacingSettleRoundLeague> getLeagues() {
        return this.leagues;
    }

    public final List<NetworkInstantRacingTicketMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkInstantRacingTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final List<NetworkInstantRacingSettleRoundTicket> getTickets() {
        return this.tickets;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roundId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NetworkInstantRacingTicketMarket> list = this.markets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkInstantRacingSettleRoundTicket> list2 = this.tickets;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkInstantRacingSettleRoundLeague> list3 = this.leagues;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NetworkInstantRacingTicketEvent> list4 = this.events;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<NetworkInstantRacingTicketOutcome> list5 = this.outcomes;
        return iHashCode6 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.roundId;
        List<NetworkInstantRacingTicketMarket> list = this.markets;
        List<NetworkInstantRacingSettleRoundTicket> list2 = this.tickets;
        List<NetworkInstantRacingSettleRoundLeague> list3 = this.leagues;
        List<NetworkInstantRacingTicketEvent> list4 = this.events;
        List<NetworkInstantRacingTicketOutcome> list5 = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkInstantRacingSettleRound(sportId=", str, ", roundId=", str2, ", markets=");
        qpu.a(", tickets=", ", leagues=", sbA, list, list2);
        qpu.a(", events=", ", outcomes=", sbA, list3, list4);
        return ng1.a(sbA, list5, ")");
    }
}
