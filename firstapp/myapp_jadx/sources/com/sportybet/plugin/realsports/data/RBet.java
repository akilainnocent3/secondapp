package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RBet {
    public long bonus;
    public List<CashOutHistory> cashOutHistorys;
    public List<Combination> combinations;
    public int comboNum;
    public int comboType;
    public long createTime;
    public long cutbetRemainingBonusAmount;
    public long cutbetWinningAmount;
    public String favorAmount;
    public int favorType;
    public List<Integer> featureTags;
    public String finalTotalOdds;
    public String id;
    public boolean isOneCutWin;
    public int isSettled;
    public int isSubscribe;
    public String operId;
    public String orderId;
    public long originalStake;
    public long potentialWinnings;
    public long remainPotentialWinnings;
    public long remainTaxAmount;
    public List<RSelection> selections;
    public long stake;
    public int status;
    public String taxAmount;
    public String totalOdds;
    public int type;
    public String userId;
    public long winnings;
    public int minToWin = -1;
    public int currentMinToWin = -1;
    public int selectionSize = -1;
    public int currentSelectionSize = -1;
    public String cutbetType = "1";

    public boolean hasTax() {
        try {
            return (TextUtils.isEmpty(this.taxAmount) || Double.parseDouble(this.taxAmount) == 0.0d) ? false : true;
        } catch (NumberFormatException unused) {
        }
    }

    public boolean isAllCashout() {
        List<CashOutHistory> list = this.cashOutHistorys;
        return list != null && !list.isEmpty() && this.stake == 0 && this.originalStake > 0;
    }

    public boolean isAnyWin() {
        List<Integer> list = this.featureTags;
        return list != null && !list.isEmpty() && this.featureTags.get(0).intValue() == 6 && this.type == 2;
    }

    public boolean isOneCutBet() {
        List<Integer> list = this.featureTags;
        return (list == null || list.isEmpty() || this.featureTags.get(0).intValue() != 5) ? false : true;
    }

    public boolean isPartialCashout() {
        List<CashOutHistory> list = this.cashOutHistorys;
        if (list == null || list.isEmpty()) {
            return false;
        }
        long j = this.stake;
        return j > 0 && j != this.originalStake;
    }

    public boolean isPartialPayout(int i) {
        if (i == 4) {
            try {
                int i2 = this.status;
                if ((i2 == 1 || i2 == 4) && this.winnings < this.originalStake) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean isSettled() {
        int i = this.status;
        return (i == 0 || i == 90 || this.isSettled != 1) ? false : true;
    }
}
