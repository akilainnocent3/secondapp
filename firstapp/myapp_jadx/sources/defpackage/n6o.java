package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n6o {
    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    public static final n7o a(Ticket ticket, Context context, final ji2 ji2Var) {
        List listA0;
        OutcomeInRound outcomeInRound;
        u7o u7oVar;
        ticket.getClass();
        context.getClass();
        ji2Var.getClass();
        if (ticket.bets.size() == 1) {
            List<Bet> list = ticket.bets;
            list.getClass();
            List<BetDetail> list2 = ((Bet) CollectionsKt.T(list)).betDetails;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (BetDetail betDetail : list2) {
                    EventInRound eventInRound = ticket.getLookupEventByEventIdMapping().get(betDetail.eventId);
                    if (eventInRound == null) {
                        u7oVar = null;
                    } else if (ji2Var.b(betDetail.marketId)) {
                        BetBuilderInRound betBuilderInRound = ticket.getLookupBetBuilderByBetBuilderIdMapping().get(betDetail.outcomeId);
                        if (betBuilderInRound == null) {
                            u7oVar = null;
                        } else {
                            String strB = sn5.b(context, R.string.page_instant_virtual__bet_builder, new Object[0]);
                            String str = betBuilderInRound.odds;
                            String str2 = str == null ? "" : str;
                            String str3 = eventInRound.homeTeamName;
                            String str4 = str3 == null ? "" : str3;
                            String str5 = eventInRound.awayTeamName;
                            u7oVar = new u7o(strB, "", str2, str4, str5 == null ? "" : str5, true);
                        }
                    } else {
                        MarketInRound marketInRound = ticket.getLookupMarketByMarketIdMapping().get(betDetail.marketId);
                        if (marketInRound == null || (outcomeInRound = ticket.getLookupOutcomeByOutcomeIdMapping().get(betDetail.outcomeId)) == null) {
                            u7oVar = null;
                        } else {
                            jrn.a aVar = jrn.b;
                            String str6 = betDetail.settleType;
                            aVar.getClass();
                            jrn jrnVarA = jrn.a.a(str6);
                            if (outcomeInRound.hit || jrnVarA != null) {
                                String str7 = marketInRound.title;
                                String str8 = str7 == null ? "" : str7;
                                String str9 = outcomeInRound.desc;
                                String str10 = str9 == null ? "" : str9;
                                String str11 = outcomeInRound.odds;
                                String str12 = str11 == null ? "" : str11;
                                String str13 = eventInRound.homeTeamName;
                                String str14 = str13 == null ? "" : str13;
                                String str15 = eventInRound.awayTeamName;
                                u7oVar = new u7o(str8, str10, str12, str14, str15 == null ? "" : str15, false);
                            } else {
                                u7oVar = null;
                            }
                        }
                    }
                    if (u7oVar != null) {
                        arrayList.add(u7oVar);
                    }
                }
                listA0 = CollectionsKt.A0(arrayList);
                if (listA0 == null) {
                    listA0 = m2g.a;
                }
            } else {
                listA0 = m2g.a;
            }
        } else {
            listA0 = m2g.a;
        }
        List list3 = listA0;
        BigDecimal totalOdds = ticket.getTotalOdds(context, new Ticket.TicketDelegate() { // from class: k6o
            @Override // com.sportybet.android.instantwin.newtork.model.response.Ticket.TicketDelegate
            public final boolean isBetBuilder(String str16) {
                ji2 ji2Var2 = ji2Var;
                ji2Var2.getClass();
                return ji2Var2.b(str16);
            }
        });
        BigDecimal totalBonus = ticket.getTotalBonus();
        String strL = Intrinsics.g(totalBonus, BigDecimal.ZERO) ? null : bjb0.L(totalBonus, Locale.US);
        String str16 = ticket.ticketId;
        str16.getClass();
        String strD = bwf0.a.d(ticket.createTime, false);
        BigDecimal totalReturn = ticket.getTotalReturn();
        Locale locale = Locale.US;
        return new n7o(str16, strD, bjb0.L(totalReturn, locale), gky.a.a(bjb0.L(totalOdds, locale), false), bjb0.L(ticket.getTotalStake(), locale), strL, list3);
    }
}
