package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class btu {
    public static final itu a = new itu();
    public static final float b = 30.0f;

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
    public static final p5k0 a(Ticket ticket) {
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
                arrayList.add(j8l.b(bet));
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
                arrayList2.add(k6k0.a(eventInRound));
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
                arrayList3.add(m6k0.a(marketInRound));
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
                arrayList4.add(o6k0.a(outcomeInRound));
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
                arrayList5.add(s5k0.a(betBuilderInRound));
            }
            list2 = arrayList5;
        }
        if (list2 == null) {
            list2 = m2g.a;
        }
        return new p5k0(str2, str4, str6, str8, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, j, str10, str12, bigDecimalValueOf4, i, i2, bigDecimal, z, z2, arrayList, arrayList2, arrayList3, arrayList4, list2);
    }
}
