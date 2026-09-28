package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySettleRound;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySettleRoundTicket;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyTicketBet;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyTicketBetDetail;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyTicketEvent;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyTicketMarket;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyTicketOutcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class s1d0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [m2g] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    public static final r1d0 a(NetworkSportyPenaltySettleRound networkSportyPenaltySettleRound) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        BigDecimal bigDecimalG;
        ?? arrayList5;
        ?? arrayList6;
        networkSportyPenaltySettleRound.getClass();
        String sportId = networkSportyPenaltySettleRound.getSportId();
        String str = sportId == null ? "" : sportId;
        List<NetworkSportyPenaltySettleRoundTicket> tickets = networkSportyPenaltySettleRound.getTickets();
        int i = 10;
        if (tickets != null) {
            arrayList = new ArrayList(l48.r(tickets, 10));
            Iterator it = tickets.iterator();
            while (it.hasNext()) {
                NetworkSportyPenaltySettleRoundTicket networkSportyPenaltySettleRoundTicket = (NetworkSportyPenaltySettleRoundTicket) it.next();
                String ticketId = networkSportyPenaltySettleRoundTicket.getTicketId();
                String str2 = ticketId == null ? "" : ticketId;
                String type = networkSportyPenaltySettleRoundTicket.getType();
                String str3 = type == null ? "" : type;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkSportyPenaltySettleRoundTicket.getTotalReturn());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkSportyPenaltySettleRoundTicket.getWht());
                bigDecimalValueOf2.getClass();
                List<NetworkSportyPenaltyTicketBet> bets = networkSportyPenaltySettleRoundTicket.getBets();
                if (bets != null) {
                    arrayList5 = new ArrayList(l48.r(bets, i));
                    for (NetworkSportyPenaltyTicketBet networkSportyPenaltyTicketBet : bets) {
                        networkSportyPenaltyTicketBet.getClass();
                        String betId = networkSportyPenaltyTicketBet.getBetId();
                        String str4 = betId == null ? "" : betId;
                        String betGroupId = networkSportyPenaltyTicketBet.getBetGroupId();
                        String str5 = betGroupId == null ? "" : betGroupId;
                        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkSportyPenaltyTicketBet.getStake());
                        bigDecimalValueOf3.getClass();
                        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkSportyPenaltyTicketBet.getPotWin());
                        bigDecimalValueOf4.getClass();
                        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(networkSportyPenaltyTicketBet.getWht());
                        bigDecimalValueOf5.getClass();
                        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(networkSportyPenaltyTicketBet.getBonus());
                        bigDecimalValueOf6.getClass();
                        boolean hit = networkSportyPenaltyTicketBet.getHit();
                        List<NetworkSportyPenaltyTicketBetDetail> betDetails = networkSportyPenaltyTicketBet.getBetDetails();
                        if (betDetails != null) {
                            arrayList6 = new ArrayList(l48.r(betDetails, i));
                            for (NetworkSportyPenaltyTicketBetDetail networkSportyPenaltyTicketBetDetail : betDetails) {
                                String eventId = networkSportyPenaltyTicketBetDetail.getEventId();
                                String str6 = eventId == null ? "" : eventId;
                                String marketId = networkSportyPenaltyTicketBetDetail.getMarketId();
                                Iterator it2 = it;
                                String str7 = marketId == null ? "" : marketId;
                                String outcomeId = networkSportyPenaltyTicketBetDetail.getOutcomeId();
                                if (outcomeId == null) {
                                    outcomeId = "";
                                }
                                arrayList6.add(new p5d0(str6, str7, outcomeId));
                                it = it2;
                            }
                        } else {
                            arrayList6 = 0;
                        }
                        Iterator it3 = it;
                        if (arrayList6 == 0) {
                            arrayList6 = m2g.a;
                        }
                        arrayList5.add(new o5d0(str4, str5, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf5, bigDecimalValueOf6, arrayList6, hit));
                        it = it3;
                        i = 10;
                    }
                } else {
                    arrayList5 = 0;
                }
                Iterator it4 = it;
                if (arrayList5 == 0) {
                    arrayList5 = m2g.a;
                }
                arrayList.add(new t1d0(str2, str3, bigDecimalValueOf, bigDecimalValueOf2, arrayList5));
                it = it4;
                i = 10;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        ?? r4 = arrayList;
        List<NetworkSportyPenaltyTicketEvent> events = networkSportyPenaltySettleRound.getEvents();
        if (events != null) {
            arrayList2 = new ArrayList(l48.r(events, 10));
            for (NetworkSportyPenaltyTicketEvent networkSportyPenaltyTicketEvent : events) {
                networkSportyPenaltyTicketEvent.getClass();
                String eventId2 = networkSportyPenaltyTicketEvent.getEventId();
                if (eventId2 == null) {
                    eventId2 = "";
                }
                String leagueId = networkSportyPenaltyTicketEvent.getLeagueId();
                if (leagueId == null) {
                    leagueId = "";
                }
                String leagueUrl = networkSportyPenaltyTicketEvent.getLeagueUrl();
                if (leagueUrl == null) {
                    leagueUrl = "";
                }
                String leagueName = networkSportyPenaltyTicketEvent.getLeagueName();
                if (leagueName == null) {
                    leagueName = "";
                }
                String homeTeamName = networkSportyPenaltyTicketEvent.getHomeTeamName();
                if (homeTeamName == null) {
                    homeTeamName = "";
                }
                String homeTeamLogo = networkSportyPenaltyTicketEvent.getHomeTeamLogo();
                if (homeTeamLogo == null) {
                    homeTeamLogo = "";
                }
                h5d0 h5d0Var = new h5d0(homeTeamName, homeTeamLogo);
                String homeTeamScore = networkSportyPenaltyTicketEvent.getHomeTeamScore();
                if (homeTeamScore == null) {
                    homeTeamScore = "";
                }
                String awayTeamName = networkSportyPenaltyTicketEvent.getAwayTeamName();
                if (awayTeamName == null) {
                    awayTeamName = "";
                }
                String awayTeamLogo = networkSportyPenaltyTicketEvent.getAwayTeamLogo();
                if (awayTeamLogo == null) {
                    awayTeamLogo = "";
                }
                h5d0 h5d0Var2 = new h5d0(awayTeamName, awayTeamLogo);
                String awayTeamScore = networkSportyPenaltyTicketEvent.getAwayTeamScore();
                if (awayTeamScore == null) {
                    awayTeamScore = "";
                }
                String resultSequence = networkSportyPenaltyTicketEvent.getResultSequence();
                if (resultSequence == null) {
                    resultSequence = "";
                }
                arrayList2.add(new x5d0(eventId2, leagueId, leagueUrl, leagueName, h5d0Var, homeTeamScore, h5d0Var2, awayTeamScore, y5d0.a(resultSequence)));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        ?? r5 = arrayList2;
        List<NetworkSportyPenaltyTicketMarket> markets = networkSportyPenaltySettleRound.getMarkets();
        if (markets != null) {
            arrayList3 = new ArrayList(l48.r(markets, 10));
            for (NetworkSportyPenaltyTicketMarket networkSportyPenaltyTicketMarket : markets) {
                networkSportyPenaltyTicketMarket.getClass();
                String marketId2 = networkSportyPenaltyTicketMarket.getMarketId();
                if (marketId2 == null) {
                    marketId2 = "";
                }
                String title = networkSportyPenaltyTicketMarket.getTitle();
                if (title == null) {
                    title = "";
                }
                String subtitle = networkSportyPenaltyTicketMarket.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                String bannerTitles = networkSportyPenaltyTicketMarket.getBannerTitles();
                if (bannerTitles == null) {
                    bannerTitles = "";
                }
                String oddTitles = networkSportyPenaltyTicketMarket.getOddTitles();
                arrayList3.add(new z5d0(marketId2, title, subtitle, bannerTitles, oddTitles == null ? "" : oddTitles));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        ?? r6 = arrayList3;
        List<NetworkSportyPenaltyTicketOutcome> outcomes = networkSportyPenaltySettleRound.getOutcomes();
        if (outcomes != null) {
            arrayList4 = new ArrayList(l48.r(outcomes, 10));
            for (NetworkSportyPenaltyTicketOutcome networkSportyPenaltyTicketOutcome : outcomes) {
                networkSportyPenaltyTicketOutcome.getClass();
                String outcomeId2 = networkSportyPenaltyTicketOutcome.getOutcomeId();
                if (outcomeId2 == null) {
                    outcomeId2 = "";
                }
                String odds = networkSportyPenaltyTicketOutcome.getOdds();
                if (odds == null || (bigDecimalG = b.g(odds)) == null) {
                    bigDecimalG = BigDecimal.ZERO;
                }
                bigDecimalG.getClass();
                String desc = networkSportyPenaltyTicketOutcome.getDesc();
                if (desc == null) {
                    desc = "";
                }
                String marketId3 = networkSportyPenaltyTicketOutcome.getMarketId();
                if (marketId3 == null) {
                    marketId3 = "";
                }
                arrayList4.add(new a6d0(outcomeId2, bigDecimalG, desc, marketId3, networkSportyPenaltyTicketOutcome.getHit()));
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = m2g.a;
        }
        return new r1d0(str, r4, r5, r6, arrayList4);
    }
}
