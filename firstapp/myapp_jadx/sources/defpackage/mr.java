package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketBet;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketBetDetail;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketEvent;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketMarket;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketOutcome;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class mr {
    public static final /* synthetic */ int a = 0;

    public static final lr a(MarketInRound marketInRound) {
        String str;
        String str2;
        String str3 = marketInRound.marketId;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = marketInRound.title;
        if (str4 == null) {
            str4 = "";
        }
        String subTitle = marketInRound.getSubTitle();
        if (subTitle == null) {
            subTitle = "";
        }
        String bannerTitles = marketInRound.getBannerTitles();
        if (bannerTitles == null) {
            bannerTitles = "";
        }
        String oddTitles = marketInRound.getOddTitles();
        if (oddTitles == null) {
            String str5 = bannerTitles;
            str2 = "";
            str = str5;
        } else {
            str = bannerTitles;
            str2 = oddTitles;
        }
        return new lr(str3, str4, subTitle, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [m2g] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    public static final ys90 b(NetworkSimulationTicketResult networkSimulationTicketResult) {
        ArrayList arrayList;
        List list;
        ?? arrayList2;
        ?? arrayList3;
        String str;
        ?? arrayList4;
        BigDecimal bigDecimalG;
        networkSimulationTicketResult.getClass();
        String ticketId = networkSimulationTicketResult.getTicketId();
        String str2 = "";
        String str3 = ticketId == null ? "" : ticketId;
        String ticketNumber = networkSimulationTicketResult.getTicketNumber();
        String str4 = ticketNumber == null ? "" : ticketNumber;
        String type = networkSimulationTicketResult.getType();
        String str5 = type == null ? "" : type;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkSimulationTicketResult.getTotalStake());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkSimulationTicketResult.getTotalReturn());
        bigDecimalValueOf2.getClass();
        long createTime = networkSimulationTicketResult.getCreateTime();
        Integer flexibleMinWinnings = networkSimulationTicketResult.getFlexibleMinWinnings();
        List<NetworkSimulationTicketEvent> events = networkSimulationTicketResult.getEvents();
        int i = 10;
        if (events != null) {
            arrayList = new ArrayList(l48.r(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                NetworkSimulationTicketEvent networkSimulationTicketEvent = (NetworkSimulationTicketEvent) it.next();
                networkSimulationTicketEvent.getClass();
                String eventId = networkSimulationTicketEvent.getEventId();
                String str6 = eventId == null ? str2 : eventId;
                String homeTeamName = networkSimulationTicketEvent.getHomeTeamName();
                String str7 = homeTeamName == null ? str2 : homeTeamName;
                String awayTeamName = networkSimulationTicketEvent.getAwayTeamName();
                String str8 = awayTeamName == null ? str2 : awayTeamName;
                String homeTeamScore = networkSimulationTicketEvent.getHomeTeamScore();
                String str9 = homeTeamScore == null ? str2 : homeTeamScore;
                String awayTeamScore = networkSimulationTicketEvent.getAwayTeamScore();
                String str10 = awayTeamScore == null ? str2 : awayTeamScore;
                String resultSequence = networkSimulationTicketEvent.getResultSequence();
                String str11 = resultSequence == null ? str2 : resultSequence;
                List<NetworkSimulationTicketMarket> markets = networkSimulationTicketEvent.getMarkets();
                if (markets != null) {
                    arrayList3 = new ArrayList(l48.r(markets, i));
                    for (NetworkSimulationTicketMarket networkSimulationTicketMarket : markets) {
                        networkSimulationTicketMarket.getClass();
                        String marketId = networkSimulationTicketMarket.getMarketId();
                        String str12 = marketId == null ? str2 : marketId;
                        String title = networkSimulationTicketMarket.getTitle();
                        String str13 = title == null ? str2 : title;
                        List<NetworkSimulationTicketOutcome> outcomes = networkSimulationTicketMarket.getOutcomes();
                        Iterator it2 = it;
                        if (outcomes != null) {
                            str = str2;
                            arrayList4 = new ArrayList(l48.r(outcomes, i));
                            Iterator it3 = outcomes.iterator();
                            while (it3.hasNext()) {
                                NetworkSimulationTicketOutcome networkSimulationTicketOutcome = (NetworkSimulationTicketOutcome) it3.next();
                                networkSimulationTicketOutcome.getClass();
                                String outcomeId = networkSimulationTicketOutcome.getOutcomeId();
                                Iterator it4 = it3;
                                String str14 = outcomeId == null ? str : outcomeId;
                                String odds = networkSimulationTicketOutcome.getOdds();
                                if (odds == null || (bigDecimalG = b.g(odds)) == null) {
                                    bigDecimalG = BigDecimal.ZERO;
                                }
                                BigDecimal bigDecimal = bigDecimalG;
                                bigDecimal.getClass();
                                String desc = networkSimulationTicketOutcome.getDesc();
                                String str15 = str3;
                                arrayList4.add(new xs90(str14, desc == null ? str : desc, bigDecimal, networkSimulationTicketOutcome.getHit()));
                                it3 = it4;
                                str3 = str15;
                                str4 = str4;
                            }
                        } else {
                            str = str2;
                            arrayList4 = 0;
                        }
                        String str16 = str3;
                        String str17 = str4;
                        if (arrayList4 == 0) {
                            arrayList4 = m2g.a;
                        }
                        arrayList3.add(new ws90(str12, str13, arrayList4));
                        it = it2;
                        str2 = str;
                        str3 = str16;
                        str4 = str17;
                        i = 10;
                    }
                } else {
                    arrayList3 = 0;
                }
                Iterator it5 = it;
                String str18 = str2;
                String str19 = str3;
                String str20 = str4;
                if (arrayList3 == 0) {
                    arrayList3 = m2g.a;
                }
                arrayList.add(new vs90(str6, str7, str8, str9, str10, str11, arrayList3));
                it = it5;
                str2 = str18;
                str3 = str19;
                str4 = str20;
                i = 10;
            }
        } else {
            arrayList = null;
        }
        String str21 = str2;
        String str22 = str3;
        String str23 = str4;
        List list2 = arrayList;
        if (arrayList == null) {
            list2 = m2g.a;
        }
        List list3 = list2;
        List<NetworkSimulationTicketBet> bets = networkSimulationTicketResult.getBets();
        if (bets != null) {
            ArrayList arrayList5 = new ArrayList(l48.r(bets, 10));
            for (NetworkSimulationTicketBet networkSimulationTicketBet : bets) {
                networkSimulationTicketBet.getClass();
                String betId = networkSimulationTicketBet.getBetId();
                String str24 = betId == null ? str21 : betId;
                String betGroupId = networkSimulationTicketBet.getBetGroupId();
                String str25 = betGroupId == null ? str21 : betGroupId;
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkSimulationTicketBet.getStake());
                bigDecimalValueOf3.getClass();
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkSimulationTicketBet.getPotWin());
                bigDecimalValueOf4.getClass();
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(networkSimulationTicketBet.getBonus());
                bigDecimalValueOf5.getClass();
                boolean hit = networkSimulationTicketBet.getHit();
                List<NetworkSimulationTicketBetDetail> betDetails = networkSimulationTicketBet.getBetDetails();
                if (betDetails != null) {
                    arrayList2 = new ArrayList(l48.r(betDetails, 10));
                    for (NetworkSimulationTicketBetDetail networkSimulationTicketBetDetail : betDetails) {
                        String eventId2 = networkSimulationTicketBetDetail.getEventId();
                        String str26 = eventId2 == null ? str21 : eventId2;
                        String marketId2 = networkSimulationTicketBetDetail.getMarketId();
                        String str27 = marketId2 == null ? str21 : marketId2;
                        String outcomeId2 = networkSimulationTicketBetDetail.getOutcomeId();
                        String str28 = outcomeId2 == null ? str21 : outcomeId2;
                        boolean hit2 = networkSimulationTicketBetDetail.getHit();
                        oq90.a aVar = oq90.b;
                        String settleType = networkSimulationTicketBetDetail.getSettleType();
                        aVar.getClass();
                        arrayList2.add(new tq90(str26, str27, str28, hit2, oq90.a.a(settleType)));
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = m2g.a;
                }
                arrayList5.add(new sq90(str24, str25, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf5, hit, arrayList2));
            }
            list = arrayList5;
        } else {
            list = null;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new ys90(str22, str23, str5, bigDecimalValueOf, bigDecimalValueOf2, createTime, flexibleMinWinnings, list3, list);
    }
}
