package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ibh0;
import defpackage.mtg0;
import defpackage.oxc;
import defpackage.qn4;
import defpackage.rrf;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u0010N\u001a\u00020\u0014HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0014HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003J»\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0014\u0010T\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010V\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010W\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010<\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bA\u0010\u001dÊ\u0001\f\bZ\u0012\b\b[\u0012\u0004\b\u0003\u0010\u0000¨\u0006Y"}, d2 = {"Lcom/sporty/android/book/domain/entity/Event;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "gameId", AnalyticsParam.EVENT_STATUS, "", "estimateStartTime", "", "matchStatus", "homeTeamName", "awayTeamName", "sportId", "sportName", "sportCategoryId", "sportCategoryName", "markets", "", "Lcom/sporty/android/book/domain/entity/Market;", "topTeam", "", "tournamentId", "tournamentName", "matchTrackerNotAllowed", "eventSource", "Lcom/sporty/android/book/domain/entity/EventSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLcom/sporty/android/book/domain/entity/EventSource;)V", "getEventId", "()Ljava/lang/String;", "getGameId", "getStatus", "()I", "getEstimateStartTime", "()J", "getMatchStatus", "getHomeTeamName", "getAwayTeamName", "getSportId", "getSportName", "getSportCategoryId", "getSportCategoryName", "getMarkets", "()Ljava/util/List;", "getTopTeam", "()Z", "getTournamentId", "getTournamentName", "getMatchTrackerNotAllowed", "getEventSource", "()Lcom/sporty/android/book/domain/entity/EventSource;", "eventName", "getEventName", "eventStatus", "Lcom/sporty/android/book/domain/entity/EventStatus;", "getEventStatus", "()Lcom/sporty/android/book/domain/entity/EventStatus;", "primaryMarket", "getPrimaryMarket", "()Lcom/sporty/android/book/domain/entity/Market;", "primaryOutcome", "Lcom/sporty/android/book/domain/entity/Outcome;", "getPrimaryOutcome", "()Lcom/sporty/android/book/domain/entity/Outcome;", "sportIconUrl", "getSportIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Event {
    private final String awayTeamName;
    private final long estimateStartTime;
    private final String eventId;
    private final EventSource eventSource;
    private final String gameId;
    private final String homeTeamName;
    private final List<Market> markets;
    private final String matchStatus;
    private final boolean matchTrackerNotAllowed;
    private final String sportCategoryId;
    private final String sportCategoryName;
    private final String sportId;
    private final String sportName;
    private final int status;
    private final boolean topTeam;
    private final String tournamentId;
    private final String tournamentName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = EventSource.$stable;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/book/domain/entity/Event$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/Event;", AnalyticsParam.EVENT_PARAM_ID, "", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/book/domain/entity/EventStatus;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Event mock$default(Companion companion, String str, EventStatus eventStatus, int i, Object obj) {
            if ((i & 2) != 0) {
                eventStatus = EventStatus.PRE_MATCH;
            }
            return companion.mock(str, eventStatus);
        }

        public final Event mock(String id, EventStatus status) {
            id.getClass();
            status.getClass();
            return new Event(id, "18866", status.getValue(), 1692471600000L, "Not start", "Angers", "AJ Auxerre", "sr:sport:1", "Football", "sr:category:7", "France", a.c(Market.INSTANCE.mock("1")), true, "sr:tournament:182", "Ligue 2", false, new EventSource(new EventSourceItem(SourceType.BET_RADAR, "1"), new EventSourceItem(SourceType.BET_GENIUS, "2")));
        }

        private Companion() {
        }
    }

    public Event(String str, String str2, int i, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Market> list, boolean z, String str10, String str11, boolean z2, EventSource eventSource) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        list.getClass();
        str10.getClass();
        str11.getClass();
        this.eventId = str;
        this.gameId = str2;
        this.status = i;
        this.estimateStartTime = j;
        this.matchStatus = str3;
        this.homeTeamName = str4;
        this.awayTeamName = str5;
        this.sportId = str6;
        this.sportName = str7;
        this.sportCategoryId = str8;
        this.sportCategoryName = str9;
        this.markets = list;
        this.topTeam = z;
        this.tournamentId = str10;
        this.tournamentName = str11;
        this.matchTrackerNotAllowed = z2;
        this.eventSource = eventSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Event copy$default(Event event, String str, String str2, int i, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, boolean z, String str10, String str11, boolean z2, EventSource eventSource, int i2, Object obj) {
        EventSource eventSource2;
        boolean z3;
        String str12 = (i2 & 1) != 0 ? event.eventId : str;
        String str13 = (i2 & 2) != 0 ? event.gameId : str2;
        int i3 = (i2 & 4) != 0 ? event.status : i;
        long j2 = (i2 & 8) != 0 ? event.estimateStartTime : j;
        String str14 = (i2 & 16) != 0 ? event.matchStatus : str3;
        String str15 = (i2 & 32) != 0 ? event.homeTeamName : str4;
        String str16 = (i2 & 64) != 0 ? event.awayTeamName : str5;
        String str17 = (i2 & 128) != 0 ? event.sportId : str6;
        String str18 = (i2 & 256) != 0 ? event.sportName : str7;
        String str19 = (i2 & 512) != 0 ? event.sportCategoryId : str8;
        String str20 = (i2 & 1024) != 0 ? event.sportCategoryName : str9;
        List list2 = (i2 & 2048) != 0 ? event.markets : list;
        boolean z4 = (i2 & 4096) != 0 ? event.topTeam : z;
        String str21 = str12;
        String str22 = (i2 & 8192) != 0 ? event.tournamentId : str10;
        String str23 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? event.tournamentName : str11;
        boolean z5 = (i2 & 32768) != 0 ? event.matchTrackerNotAllowed : z2;
        if ((i2 & 65536) != 0) {
            z3 = z5;
            eventSource2 = event.eventSource;
        } else {
            eventSource2 = eventSource;
            z3 = z5;
        }
        return event.copy(str21, str13, i3, j2, str14, str15, str16, str17, str18, str19, str20, list2, z4, str22, str23, z3, eventSource2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSportCategoryId() {
        return this.sportCategoryId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSportCategoryName() {
        return this.sportCategoryName;
    }

    public final List<Market> component12() {
        return this.markets;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getTopTeam() {
        return this.topTeam;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final EventSource getEventSource() {
        return this.eventSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMatchStatus() {
        return this.matchStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    public final Event copy(String eventId, String gameId, int status, long estimateStartTime, String matchStatus, String homeTeamName, String awayTeamName, String sportId, String sportName, String sportCategoryId, String sportCategoryName, List<Market> markets, boolean topTeam, String tournamentId, String tournamentName, boolean matchTrackerNotAllowed, EventSource eventSource) {
        qn4.b(eventId, gameId, matchStatus, homeTeamName, awayTeamName);
        sportId.getClass();
        sportName.getClass();
        sportCategoryId.getClass();
        sportCategoryName.getClass();
        markets.getClass();
        tournamentId.getClass();
        tournamentName.getClass();
        return new Event(eventId, gameId, status, estimateStartTime, matchStatus, homeTeamName, awayTeamName, sportId, sportName, sportCategoryId, sportCategoryName, markets, topTeam, tournamentId, tournamentName, matchTrackerNotAllowed, eventSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.g(this.eventId, event.eventId) && Intrinsics.g(this.gameId, event.gameId) && this.status == event.status && this.estimateStartTime == event.estimateStartTime && Intrinsics.g(this.matchStatus, event.matchStatus) && Intrinsics.g(this.homeTeamName, event.homeTeamName) && Intrinsics.g(this.awayTeamName, event.awayTeamName) && Intrinsics.g(this.sportId, event.sportId) && Intrinsics.g(this.sportName, event.sportName) && Intrinsics.g(this.sportCategoryId, event.sportCategoryId) && Intrinsics.g(this.sportCategoryName, event.sportCategoryName) && Intrinsics.g(this.markets, event.markets) && this.topTeam == event.topTeam && Intrinsics.g(this.tournamentId, event.tournamentId) && Intrinsics.g(this.tournamentName, event.tournamentName) && this.matchTrackerNotAllowed == event.matchTrackerNotAllowed && Intrinsics.g(this.eventSource, event.eventSource);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventName() {
        return oxc.a(this.homeTeamName, " vs ", this.awayTeamName);
    }

    public final EventSource getEventSource() {
        return this.eventSource;
    }

    public final EventStatus getEventStatus() {
        for (EventStatus eventStatus : EventStatus.getEntries()) {
            if (eventStatus.getValue() == this.status) {
                return eventStatus;
            }
        }
        ibh0.a("Collection contains no element matching the predicate.");
        return null;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final List<Market> getMarkets() {
        return this.markets;
    }

    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    public final Market getPrimaryMarket() {
        return (Market) CollectionsKt.firstOrNull(this.markets);
    }

    public final Outcome getPrimaryOutcome() {
        List<Outcome> outcomes;
        Market market = (Market) CollectionsKt.firstOrNull(this.markets);
        if (market == null || (outcomes = market.getOutcomes()) == null) {
            return null;
        }
        return (Outcome) CollectionsKt.firstOrNull(outcomes);
    }

    public final String getSportCategoryId() {
        return this.sportCategoryId;
    }

    public final String getSportCategoryName() {
        return this.sportCategoryName;
    }

    public final String getSportIconUrl() {
        return rrf.a(this.sportId);
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean getTopTeam() {
        return this.topTeam;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(gmf0.a(mtg0.a(ai50.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(f87.a(gpp.a(this.status, gmf0.a(this.eventId.hashCode() * 31, 31, this.gameId), 31), this.estimateStartTime, 31), 31, this.matchStatus), 31, this.homeTeamName), 31, this.awayTeamName), 31, this.sportId), 31, this.sportName), 31, this.sportCategoryId), 31, this.sportCategoryName), 31, this.markets), 31, this.topTeam), 31, this.tournamentId), 31, this.tournamentName), 31, this.matchTrackerNotAllowed);
        EventSource eventSource = this.eventSource;
        return iA + (eventSource == null ? 0 : eventSource.hashCode());
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.gameId;
        int i = this.status;
        long j = this.estimateStartTime;
        String str3 = this.matchStatus;
        String str4 = this.homeTeamName;
        String str5 = this.awayTeamName;
        String str6 = this.sportId;
        String str7 = this.sportName;
        String str8 = this.sportCategoryId;
        String str9 = this.sportCategoryName;
        List<Market> list = this.markets;
        boolean z = this.topTeam;
        String str10 = this.tournamentId;
        String str11 = this.tournamentName;
        boolean z2 = this.matchTrackerNotAllowed;
        EventSource eventSource = this.eventSource;
        StringBuilder sbA = ux5.a("Event(eventId=", str, ", gameId=", str2, ", status=");
        sbA.append(i);
        sbA.append(", estimateStartTime=");
        sbA.append(j);
        hxa.c(sbA, ", matchStatus=", str3, ", homeTeamName=", str4);
        hxa.c(sbA, ", awayTeamName=", str5, ", sportId=", str6);
        hxa.c(sbA, ", sportName=", str7, ", sportCategoryId=", str8);
        sbA.append(", sportCategoryName=");
        sbA.append(str9);
        sbA.append(", markets=");
        sbA.append(list);
        sbA.append(", topTeam=");
        sbA.append(z);
        sbA.append(", tournamentId=");
        sbA.append(str10);
        sbA.append(", tournamentName=");
        sbA.append(str11);
        sbA.append(", matchTrackerNotAllowed=");
        sbA.append(z2);
        sbA.append(", eventSource=");
        sbA.append(eventSource);
        sbA.append(")");
        return sbA.toString();
    }
}
