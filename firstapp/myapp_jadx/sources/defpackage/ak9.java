package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes.dex */
public final class ak9 {
    public static final op8 a = new op8(-1660925402, new zj9(), false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    public static final n5d0 a(Ticket ticket) {
        String str;
        String str2;
        BigDecimal bigDecimalG;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? arrayList3;
        BigDecimal bigDecimalG2;
        ?? arrayList4;
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
        List<Bet> list = ticket.bets;
        List list2 = null;
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
                boolean z3 = bet.hit;
                List<BetDetail> list3 = bet.betDetails;
                if (list3 != null) {
                    arrayList4 = new ArrayList(l48.r(list3, 10));
                    Iterator it3 = list3.iterator();
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
                        arrayList4.add(new p5d0(str20, str22, str23));
                        it3 = it4;
                        str8 = str21;
                    }
                } else {
                    arrayList4 = 0;
                }
                String str24 = str8;
                if (arrayList4 == 0) {
                    arrayList4 = m2g.a;
                }
                arrayList.add(new o5d0(str17, str19, bigDecimalValueOf5, bigDecimalValueOf6, bigDecimalValueOf7, bigDecimalValueOf8, arrayList4, z3));
                it = it2;
                str6 = str6;
                str8 = str24;
            }
        } else {
            arrayList = null;
        }
        String str25 = str6;
        String str26 = str8;
        List list4 = arrayList;
        if (arrayList == null) {
            list4 = m2g.a;
        }
        List<EventInRound> list5 = ticket.events;
        if (list5 != null) {
            arrayList2 = new ArrayList(l48.r(list5, 10));
            Iterator it5 = list5.iterator();
            list4 = list4;
            while (it5.hasNext()) {
                EventInRound eventInRound = (EventInRound) it5.next();
                eventInRound.getClass();
                String str27 = eventInRound.eventId;
                String str28 = str27 == null ? str15 : str27;
                String str29 = eventInRound.leagueId;
                String str30 = str29 == null ? str15 : str29;
                String str31 = eventInRound.leagueUrl;
                String str32 = str31 == null ? str15 : str31;
                String str33 = eventInRound.leagueName;
                String str34 = str33 == null ? str15 : str33;
                String str35 = eventInRound.homeTeamName;
                if (str35 == null) {
                    str35 = str15;
                }
                Iterator it6 = it5;
                String str36 = eventInRound.homeTeamLogo;
                if (str36 == null) {
                    str36 = str15;
                }
                h5d0 h5d0Var = new h5d0(str35, str36);
                String str37 = eventInRound.homeTeamScore;
                String str38 = str37 == null ? str15 : str37;
                String str39 = eventInRound.awayTeamName;
                if (str39 == null) {
                    str39 = str15;
                }
                List list6 = list4;
                String str40 = eventInRound.awayTeamLogo;
                if (str40 == null) {
                    str40 = str15;
                }
                h5d0 h5d0Var2 = new h5d0(str39, str40);
                String str41 = eventInRound.awayTeamScore;
                String str42 = str41 == null ? str15 : str41;
                String str43 = eventInRound.resultSequence;
                if (str43 == null) {
                    str43 = str15;
                }
                arrayList2.add(new x5d0(str28, str30, str32, str34, h5d0Var, str38, h5d0Var2, str42, y5d0.a(str43)));
                it5 = it6;
                list4 = list6;
            }
        } else {
            arrayList2 = null;
        }
        List list7 = list4;
        List list8 = arrayList2;
        if (arrayList2 == null) {
            list8 = m2g.a;
        }
        List<MarketInRound> list9 = ticket.markets;
        if (list9 != null) {
            arrayList3 = new ArrayList();
            for (MarketInRound marketInRound : list9) {
                marketInRound.getClass();
                String str44 = marketInRound.marketId;
                String str45 = str44 == null ? str15 : str44;
                String str46 = marketInRound.title;
                String str47 = str46 == null ? str15 : str46;
                String subTitle = marketInRound.getSubTitle();
                String str48 = subTitle == null ? str15 : subTitle;
                String bannerTitles = marketInRound.getBannerTitles();
                String str49 = bannerTitles == null ? str15 : bannerTitles;
                String oddTitles = marketInRound.getOddTitles();
                arrayList3.add(new z5d0(str45, str47, str48, str49, oddTitles == null ? str15 : oddTitles));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        List<OutcomeInRound> list10 = ticket.outcomes;
        if (list10 != null) {
            ArrayList arrayList5 = new ArrayList();
            for (OutcomeInRound outcomeInRound : list10) {
                outcomeInRound.getClass();
                String str50 = outcomeInRound.outcomeId;
                String str51 = str50 == null ? str15 : str50;
                String str52 = outcomeInRound.odds;
                if (str52 == null || (bigDecimalG2 = b.g(str52)) == null) {
                    bigDecimalG2 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal2 = bigDecimalG2;
                bigDecimal2.getClass();
                String str53 = outcomeInRound.desc;
                String str54 = str53 == null ? str15 : str53;
                String str55 = outcomeInRound.marketId;
                arrayList5.add(new a6d0(str51, bigDecimal2, str54, str55 == null ? str15 : str55, outcomeInRound.hit));
            }
            list2 = arrayList5;
        }
        if (list2 == null) {
            list2 = m2g.a;
        }
        return new n5d0(str4, str25, str26, str10, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, j, str12, str, bigDecimalValueOf4, i, i2, bigDecimal, z, z2, list7, list8, arrayList3, list2);
    }
}
