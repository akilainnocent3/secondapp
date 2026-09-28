package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSettleRound;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSettleRoundLeague;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSettleRoundTicket;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketBet;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketEvent;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketMarket;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketOutcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class jyd {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final u3o a(NetworkInstantRacingSettleRound networkInstantRacingSettleRound) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        BigDecimal bigDecimalG;
        ?? arrayList5;
        networkInstantRacingSettleRound.getClass();
        String sportId = networkInstantRacingSettleRound.getSportId();
        String str = sportId == null ? "" : sportId;
        String roundId = networkInstantRacingSettleRound.getRoundId();
        String str2 = roundId == null ? "" : roundId;
        List<NetworkInstantRacingSettleRoundTicket> tickets = networkInstantRacingSettleRound.getTickets();
        ?? arrayList6 = 0;
        if (tickets != null) {
            arrayList = new ArrayList(l48.r(tickets, 10));
            for (NetworkInstantRacingSettleRoundTicket networkInstantRacingSettleRoundTicket : tickets) {
                String ticketId = networkInstantRacingSettleRoundTicket.getTicketId();
                String str3 = ticketId == null ? "" : ticketId;
                String ticketNumber = networkInstantRacingSettleRoundTicket.getTicketNumber();
                String str4 = ticketNumber == null ? "" : ticketNumber;
                String type = networkInstantRacingSettleRoundTicket.getType();
                String str5 = type == null ? "" : type;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkInstantRacingSettleRoundTicket.getTotalStake());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkInstantRacingSettleRoundTicket.getTotalReturn());
                bigDecimalValueOf2.getClass();
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkInstantRacingSettleRoundTicket.getWht());
                bigDecimalValueOf3.getClass();
                long createTime = networkInstantRacingSettleRoundTicket.getCreateTime();
                String giftId = networkInstantRacingSettleRoundTicket.getGiftId();
                String str6 = giftId == null ? "" : giftId;
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkInstantRacingSettleRoundTicket.getGiftAmount());
                bigDecimalValueOf4.getClass();
                int giftKind = networkInstantRacingSettleRoundTicket.getGiftKind();
                int flexibleFitSize = networkInstantRacingSettleRoundTicket.getFlexibleFitSize();
                String totalOdds = networkInstantRacingSettleRoundTicket.getTotalOdds();
                if (totalOdds == null || (bigDecimalG = b.g(totalOdds)) == null) {
                    bigDecimalG = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal = bigDecimalG;
                bigDecimal.getClass();
                List<NetworkInstantRacingTicketBet> bets = networkInstantRacingSettleRoundTicket.getBets();
                if (bets != null) {
                    arrayList5 = new ArrayList(l48.r(bets, 10));
                    Iterator it = bets.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(xw9.a((NetworkInstantRacingTicketBet) it.next()));
                    }
                } else {
                    arrayList5 = 0;
                }
                if (arrayList5 == 0) {
                    arrayList5 = m2g.a;
                }
                arrayList.add(new w3o(str3, str4, str5, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, createTime, str6, bigDecimalValueOf4, giftKind, flexibleFitSize, bigDecimal, arrayList5));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<NetworkInstantRacingSettleRoundLeague> leagues = networkInstantRacingSettleRound.getLeagues();
        if (leagues != null) {
            arrayList2 = new ArrayList(l48.r(leagues, 10));
            for (NetworkInstantRacingSettleRoundLeague networkInstantRacingSettleRoundLeague : leagues) {
                String leagueId = networkInstantRacingSettleRoundLeague.getLeagueId();
                if (leagueId == null) {
                    leagueId = "";
                }
                String name = networkInstantRacingSettleRoundLeague.getName();
                if (name == null) {
                    name = "";
                }
                String sportId2 = networkInstantRacingSettleRoundLeague.getSportId();
                if (sportId2 == null) {
                    sportId2 = "";
                }
                arrayList2.add(new v3o(leagueId, name, sportId2));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        List<NetworkInstantRacingTicketEvent> events = networkInstantRacingSettleRound.getEvents();
        if (events != null) {
            arrayList3 = new ArrayList(l48.r(events, 10));
            Iterator it2 = events.iterator();
            while (it2.hasNext()) {
                arrayList3.add(zyd.a((NetworkInstantRacingTicketEvent) it2.next()));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        List<NetworkInstantRacingTicketMarket> markets = networkInstantRacingSettleRound.getMarkets();
        if (markets != null) {
            arrayList4 = new ArrayList();
            Iterator it3 = markets.iterator();
            while (it3.hasNext()) {
                w4o w4oVarA = fx9.a((NetworkInstantRacingTicketMarket) it3.next());
                if (w4oVarA != null) {
                    arrayList4.add(w4oVarA);
                }
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = m2g.a;
        }
        List<NetworkInstantRacingTicketOutcome> outcomes = networkInstantRacingSettleRound.getOutcomes();
        if (outcomes != null) {
            arrayList6 = new ArrayList(l48.r(outcomes, 10));
            Iterator it4 = outcomes.iterator();
            while (it4.hasNext()) {
                arrayList6.add(o70.b((NetworkInstantRacingTicketOutcome) it4.next()));
            }
        }
        if (arrayList6 == 0) {
            arrayList6 = m2g.a;
        }
        return new u3o(str, str2, arrayList, arrayList2, arrayList3, arrayList4, arrayList6);
    }
}
