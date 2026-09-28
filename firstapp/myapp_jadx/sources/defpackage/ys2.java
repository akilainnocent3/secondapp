package defpackage;

import com.sporty.android.core.model.orders.BetHistoryOrder;
import com.sporty.android.core.model.orders.BetHistoryOrderList;
import com.sporty.android.core.model.orders.BetSelection;
import com.sporty.android.core.model.orders.UserNoteDto;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.UserNote;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ys2 {
    public static List a(BetHistoryOrderList betHistoryOrderList) {
        List<BetHistoryOrder> entityList;
        ArrayList arrayList;
        String note;
        if (betHistoryOrderList == null || (entityList = betHistoryOrderList.getEntityList()) == null) {
            return m2g.a;
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(l48.r(entityList, 10));
        for (BetHistoryOrder betHistoryOrder : entityList) {
            String orderId = betHistoryOrder.getOrderId();
            Integer orderType = betHistoryOrder.getOrderType();
            String shareCode = betHistoryOrder.getShareCode();
            String totalStake = betHistoryOrder.getTotalStake();
            Integer winningStatus = betHistoryOrder.getWinningStatus();
            String totalWinnings = betHistoryOrder.getTotalWinnings();
            Long createTime = betHistoryOrder.getCreateTime();
            List<BetSelection> selections = betHistoryOrder.getSelections();
            UserNote userNote = null;
            if (selections != null) {
                ArrayList arrayList3 = new ArrayList(l48.r(selections, i));
                for (BetSelection betSelection : selections) {
                    RSelection rSelection = new RSelection();
                    String home = betSelection.getHome();
                    rSelection.home = home == null ? "" : home;
                    String away = betSelection.getAway();
                    if (away == null) {
                        away = "";
                    }
                    rSelection.away = away;
                    rSelection.eventId = betSelection.getEventId();
                    rSelection.marketId = betSelection.getMarketId();
                    rSelection.outcomeId = betSelection.getOutcomeId();
                    String outcomeName = betSelection.getOutcomeName();
                    if (outcomeName == null) {
                        outcomeName = "";
                    }
                    rSelection.outcomeDesc = outcomeName;
                    String odds = betSelection.getOdds();
                    if (odds == null) {
                        odds = "";
                    }
                    rSelection.odds = odds;
                    Integer result = betSelection.getResult();
                    rSelection.status = result != null ? result.intValue() : 0;
                    rSelection.eventPendingReason = betSelection.getEventPendingReason();
                    arrayList3.add(rSelection);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Integer combinationSize = betHistoryOrder.getCombinationSize();
            Integer minToWin = betHistoryOrder.getMinToWin();
            Integer selectionSize = betHistoryOrder.getSelectionSize();
            Boolean oddsBoosted = betHistoryOrder.getOddsBoosted();
            Boolean lfbOddsBoosted = betHistoryOrder.getLfbOddsBoosted();
            List<Integer> featureTags = betHistoryOrder.getFeatureTags();
            Boolean boolIsEditable = betHistoryOrder.isEditable();
            List<String> betIds = betHistoryOrder.getBetIds();
            Boolean boolIsOneCutWin = betHistoryOrder.isOneCutWin();
            Boolean boolIsPublished = betHistoryOrder.isPublished();
            UserNoteDto userNote2 = betHistoryOrder.getUserNote();
            if (userNote2 != null && (note = userNote2.getNote()) != null) {
                userNote = new UserNote(note);
            }
            arrayList2.add(new RealBetHistoryOrderDto(orderId, orderType, shareCode, null, totalStake, null, winningStatus, totalWinnings, createTime, arrayList, combinationSize, minToWin, selectionSize, oddsBoosted, lfbOddsBoosted, featureTags, boolIsEditable, betIds, boolIsOneCutWin, userNote, betHistoryOrder.isPaymentInProgress(), betHistoryOrder.getHasPendingEvent(), boolIsPublished));
            i = 10;
        }
        return arrayList2;
    }
}
