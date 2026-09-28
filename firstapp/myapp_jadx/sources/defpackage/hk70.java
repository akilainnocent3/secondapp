package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketBet;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketSelection;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketSubBet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hk70 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [m2g] */
    public static final gk70 a(NetworkScheduledFootballTicketBet networkScheduledFootballTicketBet) {
        ?? arrayList;
        networkScheduledFootballTicketBet.getClass();
        String betId = networkScheduledFootballTicketBet.getBetId();
        if (betId == null) {
            betId = "";
        }
        sj70.a aVar = sj70.b;
        int status = networkScheduledFootballTicketBet.getStatus();
        aVar.getClass();
        sj70 sj70VarA = sj70.a.a(status);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkScheduledFootballTicketBet.getPotWin());
        bigDecimalValueOf.getClass();
        List<NetworkScheduledFootballTicketSubBet> subBets = networkScheduledFootballTicketBet.getSubBets();
        List list = null;
        if (subBets != null) {
            ArrayList arrayList2 = new ArrayList(l48.r(subBets, 10));
            for (NetworkScheduledFootballTicketSubBet networkScheduledFootballTicketSubBet : subBets) {
                String subBetId = networkScheduledFootballTicketSubBet.getSubBetId();
                String str = subBetId == null ? "" : subBetId;
                sj70.a aVar2 = sj70.b;
                int status2 = networkScheduledFootballTicketSubBet.getStatus();
                aVar2.getClass();
                sj70 sj70VarA2 = sj70.a.a(status2);
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkScheduledFootballTicketSubBet.getStake());
                bigDecimalValueOf2.getClass();
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkScheduledFootballTicketSubBet.getPotWin());
                bigDecimalValueOf3.getClass();
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkScheduledFootballTicketSubBet.getWht());
                bigDecimalValueOf4.getClass();
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(networkScheduledFootballTicketSubBet.getBonus());
                bigDecimalValueOf5.getClass();
                List<NetworkScheduledFootballTicketSelection> selections = networkScheduledFootballTicketSubBet.getSelections();
                if (selections != null) {
                    arrayList = new ArrayList(l48.r(selections, 10));
                    for (NetworkScheduledFootballTicketSelection networkScheduledFootballTicketSelection : selections) {
                        String selectionId = networkScheduledFootballTicketSelection.getSelectionId();
                        if (selectionId == null) {
                            selectionId = "";
                        }
                        sj70.a aVar3 = sj70.b;
                        int status3 = networkScheduledFootballTicketSelection.getStatus();
                        aVar3.getClass();
                        sj70 sj70VarA3 = sj70.a.a(status3);
                        String eventId = networkScheduledFootballTicketSelection.getEventId();
                        if (eventId == null) {
                            eventId = "";
                        }
                        String marketId = networkScheduledFootballTicketSelection.getMarketId();
                        if (marketId == null) {
                            marketId = "";
                        }
                        String outcomeId = networkScheduledFootballTicketSelection.getOutcomeId();
                        arrayList.add(new xk70(selectionId, sj70VarA3, eventId, marketId, outcomeId == null ? "" : outcomeId));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = m2g.a;
                }
                arrayList2.add(new yk70(str, sj70VarA2, bigDecimalValueOf2, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf5, arrayList));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new gk70(betId, sj70VarA, bigDecimalValueOf, list);
    }
}
