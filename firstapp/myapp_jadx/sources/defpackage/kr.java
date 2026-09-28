package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicket;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicketDetailBet;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicketDetailBetDetail;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicketDetailEvent;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicketDetailMarket;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicketDetailOutcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class kr {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [m2g] */
    public static final nq a(Ticket ticket) {
        BigDecimal bigDecimalG;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ticket.getClass();
        String str = ticket.ticketId;
        String str2 = str == null ? "" : str;
        String str3 = ticket.ticketNumber;
        String str4 = str3 == null ? "" : str3;
        String str5 = ticket.type;
        String str6 = str5 == null ? "" : str5;
        String str7 = ticket.sportId;
        String str8 = str7 == null ? "" : str7;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(ticket.totalStake);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(ticket.totalReturn);
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(ticket.wht);
        bigDecimalValueOf3.getClass();
        long j = ticket.createTime;
        String str9 = ticket.roundId;
        String str10 = str9 == null ? "" : str9;
        String str11 = ticket.giftId;
        String str12 = str11 == null ? "" : str11;
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(ticket.giftAmount);
        bigDecimalValueOf4.getClass();
        int i = ticket.giftKind;
        int i2 = ticket.flexibleFitSize;
        String str13 = ticket.totalOdds;
        if (str13 == null || (bigDecimalG = b.g(str13)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalG;
        bigDecimal.getClass();
        boolean z = ticket.isSettled;
        boolean z2 = ticket.isWin;
        List<Bet> list = ticket.bets;
        List list2 = null;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (Bet bet : list) {
                bet.getClass();
                arrayList.add(tq.a(bet));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<EventInRound> list3 = ticket.events;
        if (list3 != null) {
            arrayList2 = new ArrayList(l48.r(list3, 10));
            for (EventInRound eventInRound : list3) {
                eventInRound.getClass();
                arrayList2.add(jr.a(eventInRound));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        List<MarketInRound> list4 = ticket.markets;
        if (list4 != null) {
            arrayList3 = new ArrayList(l48.r(list4, 10));
            for (MarketInRound marketInRound : list4) {
                marketInRound.getClass();
                arrayList3.add(mr.a(marketInRound));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        List<OutcomeInRound> list5 = ticket.outcomes;
        if (list5 != null) {
            arrayList4 = new ArrayList(l48.r(list5, 10));
            for (OutcomeInRound outcomeInRound : list5) {
                outcomeInRound.getClass();
                arrayList4.add(or.a(outcomeInRound));
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = m2g.a;
        }
        List<BetBuilderInRound> list6 = ticket.betBuilders;
        if (list6 != null) {
            ArrayList arrayList5 = new ArrayList(l48.r(list6, 10));
            for (BetBuilderInRound betBuilderInRound : list6) {
                betBuilderInRound.getClass();
                arrayList5.add(qq.b(betBuilderInRound));
            }
            list2 = arrayList5;
        }
        if (list2 == null) {
            list2 = m2g.a;
        }
        return new nq(str2, str4, str6, str8, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, j, str10, str12, bigDecimalValueOf4, i, i2, bigDecimal, z, z2, arrayList, arrayList2, arrayList3, arrayList4, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v34, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    public static final rq90 b(NetworkSimulationTicket networkSimulationTicket) {
        String str;
        ArrayList arrayList;
        List list;
        ?? arrayList2;
        ?? arrayList3;
        BigDecimal bigDecimalG;
        ?? arrayList4;
        BigDecimal bigDecimalG2;
        networkSimulationTicket.getClass();
        String ticketId = networkSimulationTicket.getTicketId();
        String str2 = ticketId == null ? "" : ticketId;
        String ticketNumber = networkSimulationTicket.getTicketNumber();
        String str3 = ticketNumber == null ? "" : ticketNumber;
        String type = networkSimulationTicket.getType();
        String str4 = type == null ? "" : type;
        String sportId = networkSimulationTicket.getSportId();
        String str5 = sportId == null ? "" : sportId;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkSimulationTicket.getTotalStake());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkSimulationTicket.getTotalReturn());
        bigDecimalValueOf2.getClass();
        long createTime = networkSimulationTicket.getCreateTime();
        String roundId = networkSimulationTicket.getRoundId();
        String str6 = roundId == null ? "" : roundId;
        String giftId = networkSimulationTicket.getGiftId();
        String str7 = giftId == null ? "" : giftId;
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkSimulationTicket.getGiftAmount());
        bigDecimalValueOf3.getClass();
        int giftKind = networkSimulationTicket.getGiftKind();
        List<NetworkSimulationTicketDetailBet> bets = networkSimulationTicket.getBets();
        if (bets != null) {
            str = "";
            arrayList = new ArrayList(l48.r(bets, 10));
            Iterator it = bets.iterator();
            while (it.hasNext()) {
                NetworkSimulationTicketDetailBet networkSimulationTicketDetailBet = (NetworkSimulationTicketDetailBet) it.next();
                networkSimulationTicketDetailBet.getClass();
                String betId = networkSimulationTicketDetailBet.getBetId();
                String str8 = betId == null ? str : betId;
                String betGroupId = networkSimulationTicketDetailBet.getBetGroupId();
                String str9 = betGroupId == null ? str : betGroupId;
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkSimulationTicketDetailBet.getStake());
                bigDecimalValueOf4.getClass();
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(networkSimulationTicketDetailBet.getPotWin());
                bigDecimalValueOf5.getClass();
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(networkSimulationTicketDetailBet.getBonus());
                bigDecimalValueOf6.getClass();
                boolean hit = networkSimulationTicketDetailBet.getHit();
                List<NetworkSimulationTicketDetailBetDetail> betDetails = networkSimulationTicketDetailBet.getBetDetails();
                Iterator it2 = it;
                if (betDetails != null) {
                    arrayList4 = new ArrayList(l48.r(betDetails, 10));
                    for (NetworkSimulationTicketDetailBetDetail networkSimulationTicketDetailBetDetail : betDetails) {
                        String eventId = networkSimulationTicketDetailBetDetail.getEventId();
                        String str10 = eventId == null ? str : eventId;
                        String marketId = networkSimulationTicketDetailBetDetail.getMarketId();
                        String str11 = marketId == null ? str : marketId;
                        String outcomeId = networkSimulationTicketDetailBetDetail.getOutcomeId();
                        String str12 = outcomeId == null ? str : outcomeId;
                        boolean hit2 = networkSimulationTicketDetailBetDetail.getHit();
                        oq90.a aVar = oq90.b;
                        String settleType = networkSimulationTicketDetailBetDetail.getSettleType();
                        aVar.getClass();
                        arrayList4.add(new vq90(str10, str11, str12, hit2, oq90.a.a(settleType)));
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = m2g.a;
                }
                ?? r26 = arrayList4;
                String odds = networkSimulationTicketDetailBet.getOdds();
                if (odds == null || (bigDecimalG2 = b.g(odds)) == null) {
                    bigDecimalG2 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal = bigDecimalG2;
                bigDecimal.getClass();
                arrayList.add(new uq90(str8, str9, bigDecimalValueOf4, bigDecimalValueOf5, bigDecimalValueOf6, bigDecimal, r26, hit));
                it = it2;
                str2 = str2;
            }
        } else {
            str = "";
            arrayList = null;
        }
        String str13 = str2;
        List list2 = arrayList;
        if (arrayList == null) {
            list2 = m2g.a;
        }
        List list3 = list2;
        List<NetworkSimulationTicketDetailEvent> events = networkSimulationTicket.getEvents();
        if (events != null) {
            ArrayList arrayList5 = new ArrayList(l48.r(events, 10));
            Iterator it3 = events.iterator();
            while (it3.hasNext()) {
                NetworkSimulationTicketDetailEvent networkSimulationTicketDetailEvent = (NetworkSimulationTicketDetailEvent) it3.next();
                networkSimulationTicketDetailEvent.getClass();
                String leagueId = networkSimulationTicketDetailEvent.getLeagueId();
                String str14 = leagueId == null ? str : leagueId;
                String eventId2 = networkSimulationTicketDetailEvent.getEventId();
                String str15 = eventId2 == null ? str : eventId2;
                String homeTeamName = networkSimulationTicketDetailEvent.getHomeTeamName();
                String str16 = homeTeamName == null ? str : homeTeamName;
                String homeTeamLogo = networkSimulationTicketDetailEvent.getHomeTeamLogo();
                String str17 = homeTeamLogo == null ? str : homeTeamLogo;
                String homeTeamBaseColor = networkSimulationTicketDetailEvent.getHomeTeamBaseColor();
                String str18 = homeTeamBaseColor == null ? str : homeTeamBaseColor;
                String homeTeamSleeveColor = networkSimulationTicketDetailEvent.getHomeTeamSleeveColor();
                String str19 = homeTeamSleeveColor == null ? str : homeTeamSleeveColor;
                String awayTeamName = networkSimulationTicketDetailEvent.getAwayTeamName();
                String str20 = awayTeamName == null ? str : awayTeamName;
                String awayTeamLogo = networkSimulationTicketDetailEvent.getAwayTeamLogo();
                String str21 = awayTeamLogo == null ? str : awayTeamLogo;
                String awayTeamBaseColor = networkSimulationTicketDetailEvent.getAwayTeamBaseColor();
                String str22 = awayTeamBaseColor == null ? str : awayTeamBaseColor;
                String awayTeamSleeveColor = networkSimulationTicketDetailEvent.getAwayTeamSleeveColor();
                String str23 = awayTeamSleeveColor == null ? str : awayTeamSleeveColor;
                int homeTeamScore = networkSimulationTicketDetailEvent.getHomeTeamScore();
                int awayTeamScore = networkSimulationTicketDetailEvent.getAwayTeamScore();
                String resultSequence = networkSimulationTicketDetailEvent.getResultSequence();
                String str24 = resultSequence == null ? str : resultSequence;
                List<NetworkSimulationTicketDetailMarket> markets = networkSimulationTicketDetailEvent.getMarkets();
                if (markets != null) {
                    arrayList2 = new ArrayList(l48.r(markets, 10));
                    Iterator it4 = markets.iterator();
                    while (it4.hasNext()) {
                        NetworkSimulationTicketDetailMarket networkSimulationTicketDetailMarket = (NetworkSimulationTicketDetailMarket) it4.next();
                        networkSimulationTicketDetailMarket.getClass();
                        String marketId2 = networkSimulationTicketDetailMarket.getMarketId();
                        String str25 = marketId2 == null ? str : marketId2;
                        String title = networkSimulationTicketDetailMarket.getTitle();
                        String str26 = title == null ? str : title;
                        String subTitle = networkSimulationTicketDetailMarket.getSubTitle();
                        String str27 = subTitle == null ? str : subTitle;
                        String bannerTitles = networkSimulationTicketDetailMarket.getBannerTitles();
                        String str28 = bannerTitles == null ? str : bannerTitles;
                        String oddTitles = networkSimulationTicketDetailMarket.getOddTitles();
                        String str29 = oddTitles == null ? str : oddTitles;
                        List<NetworkSimulationTicketDetailOutcome> outcomes = networkSimulationTicketDetailMarket.getOutcomes();
                        if (outcomes != null) {
                            arrayList3 = new ArrayList(l48.r(outcomes, 10));
                            Iterator it5 = outcomes.iterator();
                            while (it5.hasNext()) {
                                NetworkSimulationTicketDetailOutcome networkSimulationTicketDetailOutcome = (NetworkSimulationTicketDetailOutcome) it5.next();
                                networkSimulationTicketDetailOutcome.getClass();
                                String outcomeId2 = networkSimulationTicketDetailOutcome.getOutcomeId();
                                Iterator it6 = it5;
                                String str30 = outcomeId2 == null ? str : outcomeId2;
                                String desc = networkSimulationTicketDetailOutcome.getDesc();
                                String str31 = desc == null ? str : desc;
                                String odds2 = networkSimulationTicketDetailOutcome.getOdds();
                                if (odds2 == null || (bigDecimalG = b.g(odds2)) == null) {
                                    bigDecimalG = BigDecimal.ZERO;
                                }
                                BigDecimal bigDecimal2 = bigDecimalG;
                                bigDecimal2.getClass();
                                arrayList3.add(new xr90(str30, str31, bigDecimal2, networkSimulationTicketDetailOutcome.getHit()));
                                it5 = it6;
                                str5 = str5;
                                bigDecimalValueOf = bigDecimalValueOf;
                            }
                        } else {
                            arrayList3 = 0;
                        }
                        String str32 = str5;
                        BigDecimal bigDecimal3 = bigDecimalValueOf;
                        if (arrayList3 == 0) {
                            arrayList3 = m2g.a;
                        }
                        arrayList2.add(new wr90(str25, str26, str27, str28, str29, arrayList3));
                        str4 = str4;
                        it4 = it4;
                        str5 = str32;
                        bigDecimalValueOf = bigDecimal3;
                    }
                } else {
                    arrayList2 = 0;
                }
                String str33 = str4;
                String str34 = str5;
                BigDecimal bigDecimal4 = bigDecimalValueOf;
                if (arrayList2 == 0) {
                    arrayList2 = m2g.a;
                }
                arrayList5.add(new fr90(str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, homeTeamScore, awayTeamScore, str24, arrayList2));
                str4 = str33;
                it3 = it3;
                str3 = str3;
                str5 = str34;
                bigDecimalValueOf = bigDecimal4;
            }
            list = arrayList5;
        } else {
            list = null;
        }
        String str35 = str3;
        String str36 = str4;
        String str37 = str5;
        BigDecimal bigDecimal5 = bigDecimalValueOf;
        if (list == null) {
            list = m2g.a;
        }
        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(networkSimulationTicket.getWht());
        bigDecimalValueOf7.getClass();
        return new rq90(str13, str35, str36, str37, bigDecimal5, bigDecimalValueOf2, createTime, str6, str7, bigDecimalValueOf3, giftKind, list3, list, bigDecimalValueOf7, networkSimulationTicket.getFlexibleMinWinnings());
    }
}
