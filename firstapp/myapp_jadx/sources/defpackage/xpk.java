package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBets;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBetsEvent;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBetsTicket;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketBet;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketMarket;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketOutcome;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGiftData;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xpk {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [m2g] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    public static final ga70 b(NetworkScheduledFootballOpenBets networkScheduledFootballOpenBets) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        networkScheduledFootballOpenBets.getClass();
        String countryCode = networkScheduledFootballOpenBets.getCountryCode();
        String str = countryCode == null ? "" : countryCode;
        String userId = networkScheduledFootballOpenBets.getUserId();
        String str2 = userId == null ? "" : userId;
        String sportId = networkScheduledFootballOpenBets.getSportId();
        String str3 = sportId == null ? "" : sportId;
        List<NetworkScheduledFootballOpenBetsTicket> tickets = networkScheduledFootballOpenBets.getTickets();
        ?? arrayList5 = 0;
        if (tickets != null) {
            arrayList = new ArrayList(l48.r(tickets, 10));
            for (NetworkScheduledFootballOpenBetsTicket networkScheduledFootballOpenBetsTicket : tickets) {
                String ticketId = networkScheduledFootballOpenBetsTicket.getTicketId();
                String str4 = ticketId == null ? "" : ticketId;
                String ticketNumber = networkScheduledFootballOpenBetsTicket.getTicketNumber();
                String str5 = ticketNumber == null ? "" : ticketNumber;
                String type = networkScheduledFootballOpenBetsTicket.getType();
                String str6 = type == null ? "" : type;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkScheduledFootballOpenBetsTicket.getTotalStake());
                bigDecimalValueOf.getClass();
                long createTime = networkScheduledFootballOpenBetsTicket.getCreateTime();
                List<NetworkScheduledFootballTicketBet> bets = networkScheduledFootballOpenBetsTicket.getBets();
                if (bets != null) {
                    arrayList4 = new ArrayList(l48.r(bets, 10));
                    Iterator it = bets.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(hk70.a((NetworkScheduledFootballTicketBet) it.next()));
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = m2g.a;
                }
                arrayList.add(new fa70(str4, str5, str6, bigDecimalValueOf, createTime, arrayList4));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<NetworkScheduledFootballOpenBetsEvent> events = networkScheduledFootballOpenBets.getEvents();
        if (events != null) {
            arrayList2 = new ArrayList(l48.r(events, 10));
            for (NetworkScheduledFootballOpenBetsEvent networkScheduledFootballOpenBetsEvent : events) {
                networkScheduledFootballOpenBetsEvent.getClass();
                String eventId = networkScheduledFootballOpenBetsEvent.getEventId();
                if (eventId == null) {
                    eventId = "";
                }
                String leagueId = networkScheduledFootballOpenBetsEvent.getLeagueId();
                if (leagueId == null) {
                    leagueId = "";
                }
                String leagueUrl = networkScheduledFootballOpenBetsEvent.getLeagueUrl();
                if (leagueUrl == null) {
                    leagueUrl = "";
                }
                String leagueName = networkScheduledFootballOpenBetsEvent.getLeagueName();
                if (leagueName == null) {
                    leagueName = "";
                }
                String homeTeamName = networkScheduledFootballOpenBetsEvent.getHomeTeamName();
                if (homeTeamName == null) {
                    homeTeamName = "";
                }
                String homeTeamLogo = networkScheduledFootballOpenBetsEvent.getHomeTeamLogo();
                if (homeTeamLogo == null) {
                    homeTeamLogo = "";
                }
                String awayTeamName = networkScheduledFootballOpenBetsEvent.getAwayTeamName();
                if (awayTeamName == null) {
                    awayTeamName = "";
                }
                String awayTeamLogo = networkScheduledFootballOpenBetsEvent.getAwayTeamLogo();
                if (awayTeamLogo == null) {
                    awayTeamLogo = "";
                }
                arrayList2.add(new ea70(eventId, leagueId, leagueUrl, leagueName, homeTeamName, homeTeamLogo, awayTeamName, awayTeamLogo, networkScheduledFootballOpenBetsEvent.getKickOffTime(), networkScheduledFootballOpenBetsEvent.getMatchday()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        List<NetworkScheduledFootballTicketMarket> markets = networkScheduledFootballOpenBets.getMarkets();
        if (markets != null) {
            arrayList3 = new ArrayList(l48.r(markets, 10));
            Iterator it2 = markets.iterator();
            while (it2.hasNext()) {
                arrayList3.add(rm2.i((NetworkScheduledFootballTicketMarket) it2.next()));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        List<NetworkScheduledFootballTicketOutcome> outcomes = networkScheduledFootballOpenBets.getOutcomes();
        if (outcomes != null) {
            arrayList5 = new ArrayList(l48.r(outcomes, 10));
            Iterator it3 = outcomes.iterator();
            while (it3.hasNext()) {
                arrayList5.add(i730.b((NetworkScheduledFootballTicketOutcome) it3.next()));
            }
        }
        if (arrayList5 == 0) {
            arrayList5 = m2g.a;
        }
        return new ga70(str, str2, str3, arrayList, arrayList2, arrayList3, arrayList5, networkScheduledFootballOpenBets.getReachQueryLimit());
    }

    public void a(Activity activity, ReceivedGiftData receivedGiftData) {
        int i = GiftReceivedActivity.e;
        Intent intent = new Intent(activity, (Class<?>) GiftReceivedActivity.class);
        intent.putExtra("gift_data", receivedGiftData);
        activity.startActivity(intent);
    }
}
