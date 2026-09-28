package defpackage;

import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.EventSourceItem;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.orders.BetEventSource;
import com.sporty.android.core.model.orders.BetEventSourceItem;
import com.sporty.android.core.model.orders.BetEventSourceType;
import com.sporty.android.core.model.orders.BetTicketSelection;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yc3 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BetEventSourceType.values().length];
            try {
                iArr[BetEventSourceType.BET_RADAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetEventSourceType.BET_GENIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetEventSourceType.BETER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BetEventSourceType.SPORTING_RISK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static EventSourceItem a(BetEventSourceItem betEventSourceItem) {
        SourceType sourceType;
        BetEventSourceType sourceType2 = betEventSourceItem.getSourceType();
        int i = sourceType2 == null ? -1 : a.a[sourceType2.ordinal()];
        if (i == 1) {
            sourceType = SourceType.BET_RADAR;
        } else if (i == 2) {
            sourceType = SourceType.BET_GENIUS;
        } else if (i != 3) {
            sourceType = i != 4 ? null : SourceType.SPORTING_RISK;
        } else {
            sourceType = SourceType.BETER;
        }
        return new EventSourceItem(sourceType, betEventSourceItem.getSourceId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<com.sportybet.plugin.realsports.data.RSelection>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static RSelection b(BetTicketSelection betTicketSelection) {
        ?? arrayList;
        betTicketSelection.getClass();
        RSelection rSelection = new RSelection();
        rSelection.id = betTicketSelection.getId();
        String home = betTicketSelection.getHome();
        if (home == null) {
            home = "";
        }
        rSelection.home = home;
        String away = betTicketSelection.getAway();
        if (away == null) {
            away = "";
        }
        rSelection.away = away;
        rSelection.jointId = betTicketSelection.getJointId();
        rSelection.sportId = betTicketSelection.getSportId();
        rSelection.eventId = betTicketSelection.getEventId();
        rSelection.gameId = betTicketSelection.getGameId();
        rSelection.marketId = betTicketSelection.getMarketId();
        String marketDesc = betTicketSelection.getMarketDesc();
        if (marketDesc == null) {
            marketDesc = "";
        }
        rSelection.marketDesc = marketDesc;
        rSelection.specifier = betTicketSelection.getSpecifier();
        rSelection.outcomeId = betTicketSelection.getOutcomeId();
        String outcomeDesc = betTicketSelection.getOutcomeDesc();
        if (outcomeDesc == null && (outcomeDesc = betTicketSelection.getOutcomeName()) == null) {
            outcomeDesc = "";
        }
        rSelection.outcomeDesc = outcomeDesc;
        String categoryName = betTicketSelection.getCategoryName();
        if (categoryName == null) {
            categoryName = "";
        }
        rSelection.categoryName = categoryName;
        rSelection.tournamentId = betTicketSelection.getTournamentId();
        String tournamentName = betTicketSelection.getTournamentName();
        if (tournamentName == null) {
            tournamentName = "";
        }
        rSelection.tournamentName = tournamentName;
        String odds = betTicketSelection.getOdds();
        rSelection.odds = odds != null ? odds : "";
        Boolean oddsBoosted = betTicketSelection.getOddsBoosted();
        rSelection.oddsBoosted = oddsBoosted != null ? oddsBoosted.booleanValue() : false;
        Integer status = betTicketSelection.getStatus();
        rSelection.status = (status == null && (status = betTicketSelection.getResult()) == null) ? 0 : status.intValue();
        rSelection.matchStatus = betTicketSelection.getMatchStatus();
        Integer eventStatus = betTicketSelection.getEventStatus();
        rSelection.eventStatus = eventStatus != null ? eventStatus.intValue() : 0;
        Boolean banker = betTicketSelection.getBanker();
        rSelection.banker = banker != null ? banker.booleanValue() : false;
        Boolean haveLive = betTicketSelection.getHaveLive();
        rSelection.haveLive = haveLive != null ? haveLive.booleanValue() : false;
        String period = betTicketSelection.getPeriod();
        if (period == null) {
            period = "0";
        }
        rSelection.period = period;
        rSelection.playedSeconds = betTicketSelection.getPlayedSeconds();
        rSelection.remainingTimeInPeriod = betTicketSelection.getRemainingTimeInPeriod();
        rSelection.setScore = betTicketSelection.getSetScore();
        rSelection.pointScore = betTicketSelection.getPointScore();
        rSelection.gameScore = betTicketSelection.getGameScore();
        Long startTime = betTicketSelection.getStartTime();
        rSelection.startTime = startTime != null ? startTime.longValue() : 0L;
        Boolean matchTrackerNotAllowed = betTicketSelection.getMatchTrackerNotAllowed();
        rSelection.matchTrackerNotAllowed = matchTrackerNotAllowed != null ? matchTrackerNotAllowed.booleanValue() : false;
        Integer commentsNum = betTicketSelection.getCommentsNum();
        rSelection.commentsNum = commentsNum != null ? commentsNum.intValue() : 0;
        BetEventSource eventSource = betTicketSelection.getEventSource();
        EventSource eventSource2 = null;
        if (eventSource != null) {
            BetEventSourceItem preMatchSource = eventSource.getPreMatchSource();
            EventSourceItem eventSourceItemA = preMatchSource != null ? a(preMatchSource) : null;
            BetEventSourceItem liveSource = eventSource.getLiveSource();
            eventSource2 = new EventSource(eventSourceItemA, liveSource != null ? a(liveSource) : null);
        }
        rSelection.eventSource = eventSource2;
        Integer settleType = betTicketSelection.getSettleType();
        rSelection.settleType = settleType != null ? settleType.intValue() : 0;
        List<BetTicketSelection> betBuilderSelections = betTicketSelection.getBetBuilderSelections();
        if (betBuilderSelections != null) {
            arrayList = new ArrayList(l48.r(betBuilderSelections, 10));
            Iterator it = betBuilderSelections.iterator();
            while (it.hasNext()) {
                arrayList.add(b((BetTicketSelection) it.next()));
            }
        } else {
            arrayList = m2g.a;
        }
        rSelection.betBuilderSelections = arrayList;
        rSelection.joker = betTicketSelection.getJoker();
        rSelection.eventPendingReason = betTicketSelection.getEventPendingReason();
        return rSelection;
    }
}
