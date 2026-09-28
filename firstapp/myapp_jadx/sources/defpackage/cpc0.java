package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingDetail;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class cpc0 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r33v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final joc0 a(Ticket ticket) {
        String str;
        String str2;
        BigDecimal bigDecimalG;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ArrayList arrayList5;
        Object bVar;
        NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail;
        BigDecimal bigDecimalG2;
        ?? arrayList6;
        BigDecimal bigDecimalG3;
        ?? arrayList7;
        ticket.getClass();
        String str3 = ticket.ticketId;
        String str4 = str3 == null ? "" : str3;
        String str5 = ticket.ticketNumber;
        String str6 = str5 == null ? "" : str5;
        String str7 = ticket.type;
        String str8 = str7 == null ? "" : str7;
        String str9 = ticket.sportId;
        String str10 = str9 == null ? "" : str9;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(ticket.totalStake);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(ticket.totalReturn);
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(ticket.wht);
        bigDecimalValueOf3.getClass();
        long j = ticket.createTime;
        String str11 = ticket.roundId;
        String str12 = str11 == null ? "" : str11;
        String str13 = ticket.giftId;
        if (str13 == null) {
            str2 = "";
            str = str2;
        } else {
            str = str13;
            str2 = "";
        }
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(ticket.giftAmount);
        bigDecimalValueOf4.getClass();
        int i = ticket.giftKind;
        int i2 = ticket.flexibleFitSize;
        String str14 = ticket.totalOdds;
        if (str14 == null || (bigDecimalG = b.g(str14)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalG;
        bigDecimal.getClass();
        boolean z = ticket.isSettled;
        boolean z2 = ticket.isWin;
        boolean z3 = ticket.hasDon;
        List<Bet> list = ticket.bets;
        String str15 = str2;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bet bet = (Bet) it.next();
                bet.getClass();
                String str16 = bet.betId;
                String str17 = str16 == null ? str15 : str16;
                String str18 = bet.betGroupId;
                String str19 = str18 == null ? str15 : str18;
                Iterator it2 = it;
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(bet.stake);
                bigDecimalValueOf5.getClass();
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(bet.potWin);
                bigDecimalValueOf6.getClass();
                BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(bet.wht);
                bigDecimalValueOf7.getClass();
                BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(bet.bonus);
                bigDecimalValueOf8.getClass();
                boolean z4 = bet.hit;
                List<BetDetail> list2 = bet.betDetails;
                if (list2 != null) {
                    arrayList7 = new ArrayList(l48.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        BetDetail betDetail = (BetDetail) it3.next();
                        Iterator it4 = it3;
                        String str20 = betDetail.eventId;
                        if (str20 == null) {
                            str20 = str15;
                        }
                        String str21 = str8;
                        String str22 = betDetail.marketId;
                        if (str22 == null) {
                            str22 = str15;
                        }
                        String str23 = betDetail.outcomeId;
                        if (str23 == null) {
                            str23 = str15;
                        }
                        arrayList7.add(new noc0(str20, str22, str23));
                        it3 = it4;
                        str8 = str21;
                    }
                } else {
                    arrayList7 = 0;
                }
                String str24 = str8;
                if (arrayList7 == 0) {
                    arrayList7 = m2g.a;
                }
                arrayList.add(new koc0(str17, str19, bigDecimalValueOf5, bigDecimalValueOf6, bigDecimalValueOf7, bigDecimalValueOf8, arrayList7, z4));
                it = it2;
                str6 = str6;
                str8 = str24;
            }
        } else {
            arrayList = null;
        }
        String str25 = str6;
        String str26 = str8;
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = m2g.a;
        }
        List<EventInRound> list4 = ticket.events;
        if (list4 != null) {
            arrayList2 = new ArrayList(l48.r(list4, 10));
            Iterator it5 = list4.iterator();
            list3 = list3;
            while (it5.hasNext()) {
                EventInRound eventInRound = (EventInRound) it5.next();
                eventInRound.getClass();
                String str27 = eventInRound.eventId;
                String str28 = str27 == null ? str15 : str27;
                String str29 = eventInRound.leagueId;
                if (str29 == null) {
                    str29 = str15;
                }
                Iterator it6 = it5;
                String str30 = eventInRound.leagueName;
                if (str30 == null) {
                    str30 = str15;
                }
                ddc0 ddc0Var = new ddc0(str29, str30);
                String str31 = eventInRound.homeTeamName;
                if (str31 == null) {
                    str31 = str15;
                }
                List list5 = list3;
                String str32 = eventInRound.homeTeamLogo;
                if (str32 == null) {
                    str32 = str15;
                }
                knc0 knc0Var = new knc0(str31, str32);
                String str33 = eventInRound.homeTeamScore;
                String str34 = str33 == null ? str15 : str33;
                String str35 = eventInRound.awayTeamName;
                if (str35 == null) {
                    str35 = str15;
                }
                String str36 = eventInRound.awayTeamLogo;
                if (str36 == null) {
                    str36 = str15;
                }
                knc0 knc0Var2 = new knc0(str35, str36);
                String str37 = eventInRound.awayTeamScore;
                String str38 = str37 == null ? str15 : str37;
                String str39 = eventInRound.resultSequence;
                arrayList2.add(new bpc0(str28, ddc0Var, knc0Var, str34, knc0Var2, str38, str39 == null ? str15 : str39));
                it5 = it6;
                list3 = list5;
            }
        } else {
            arrayList2 = null;
        }
        List list6 = list3;
        List list7 = arrayList2;
        if (arrayList2 == null) {
            list7 = m2g.a;
        }
        List<MarketInRound> list8 = ticket.markets;
        if (list8 != null) {
            arrayList3 = new ArrayList(l48.r(list8, 10));
            for (MarketInRound marketInRound : list8) {
                marketInRound.getClass();
                String str40 = marketInRound.marketId;
                String str41 = str40 == null ? str15 : str40;
                String str42 = marketInRound.title;
                String str43 = str42 == null ? str15 : str42;
                String subTitle = marketInRound.getSubTitle();
                String str44 = subTitle == null ? str15 : subTitle;
                String bannerTitles = marketInRound.getBannerTitles();
                String str45 = bannerTitles == null ? str15 : bannerTitles;
                String oddTitles = marketInRound.getOddTitles();
                arrayList3.add(new dpc0(str41, str43, str44, str45, oddTitles == null ? str15 : oddTitles));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        List<OutcomeInRound> list9 = ticket.outcomes;
        if (list9 != null) {
            arrayList4 = new ArrayList(l48.r(list9, 10));
            for (OutcomeInRound outcomeInRound : list9) {
                outcomeInRound.getClass();
                String str46 = outcomeInRound.outcomeId;
                String str47 = str46 == null ? str15 : str46;
                String str48 = outcomeInRound.odds;
                if (str48 == null || (bigDecimalG3 = b.g(str48)) == null) {
                    bigDecimalG3 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal2 = bigDecimalG3;
                bigDecimal2.getClass();
                String str49 = outcomeInRound.desc;
                String str50 = str49 == null ? str15 : str49;
                String str51 = outcomeInRound.marketId;
                arrayList4.add(new epc0(str47, bigDecimal2, str50, str51 == null ? str15 : str51, outcomeInRound.hit));
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = m2g.a;
        }
        List<BetBuilderInRound> list10 = ticket.betBuilders;
        if (list10 != null) {
            arrayList5 = new ArrayList(l48.r(list10, 10));
            Iterator it7 = list10.iterator();
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
            while (it7.hasNext()) {
                BetBuilderInRound betBuilderInRound = (BetBuilderInRound) it7.next();
                betBuilderInRound.getClass();
                String str52 = betBuilderInRound.id;
                if (str52 == null) {
                    str52 = str15;
                }
                Iterator it8 = it7;
                String str53 = betBuilderInRound.odds;
                if (str53 == null || (bigDecimalG2 = b.g(str53)) == null) {
                    bigDecimalG2 = BigDecimal.ZERO;
                }
                bigDecimalG2.getClass();
                ?? r28 = arrayList3;
                boolean hit = betBuilderInRound.getHit();
                List<BetBuilderSelection> list11 = betBuilderInRound.selections;
                ?? r29 = arrayList4;
                if (list11 != null) {
                    arrayList6 = new ArrayList(l48.r(list11, 10));
                    Iterator it9 = list11.iterator();
                    while (it9.hasNext()) {
                        BetBuilderSelection betBuilderSelection = (BetBuilderSelection) it9.next();
                        Iterator it10 = it9;
                        String str54 = betBuilderSelection.marketId;
                        if (str54 == null) {
                            str54 = str15;
                        }
                        String str55 = betBuilderSelection.outcomeId;
                        if (str55 == null) {
                            str55 = str15;
                        }
                        arrayList6.add(new moc0(str54, str55));
                        it9 = it10;
                    }
                } else {
                    arrayList6 = 0;
                }
                if (arrayList6 == 0) {
                    arrayList6 = m2g.a;
                }
                arrayList5.add(new loc0(str52, bigDecimalG2, hit, arrayList6));
                bigDecimalValueOf = bigDecimalValueOf;
                it7 = it8;
                arrayList3 = r28;
                arrayList4 = r29;
                str10 = str10;
            }
        } else {
            arrayList5 = null;
        }
        ?? r210 = arrayList3;
        ?? r211 = arrayList4;
        String str56 = str10;
        BigDecimal bigDecimal3 = bigDecimalValueOf;
        List list12 = arrayList5;
        if (arrayList5 == null) {
            list12 = m2g.a;
        }
        try {
            zi50.a aVar = zi50.b;
            Iterable iterable = ticket.bets;
            if (iterable == null) {
                iterable = m2g.a;
            }
            Iterator it11 = iterable.iterator();
            do {
                if (!it11.hasNext()) {
                    networkDoubleOrNothingDetail = null;
                    break;
                }
                networkDoubleOrNothingDetail = ((Bet) it11.next()).donDetail;
            } while (networkDoubleOrNothingDetail == null);
            bVar = networkDoubleOrNothingDetail != null ? rkt.b(networkDoubleOrNothingDetail) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar3 = zi50.b;
        return new joc0(str4, str25, str26, str56, bigDecimal3, bigDecimalValueOf2, bigDecimalValueOf3, j, str12, str, bigDecimalValueOf4, i, i2, bigDecimal, z, z2, z3, list6, list7, r210, r211, list12, (z0f) (bVar instanceof zi50.b ? null : bVar));
    }
}
