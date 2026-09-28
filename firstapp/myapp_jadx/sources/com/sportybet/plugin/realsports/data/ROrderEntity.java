package com.sportybet.plugin.realsports.data;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ROrderEntity {
    public List<String> betIds;
    public int combinationSize;
    public long createTime;
    public List<Integer> featureTags;
    public boolean isEditable;
    public boolean isOneCutWin;
    public boolean oddsBoosted;
    public String orderId;
    public int orderType;
    public List<RSelection> selections;
    public String shortId;
    public String totalStake;
    public String totalWinnings;
    public int winningStatus;
    public int minToWin = -1;
    public int currentMinToWin = -1;
    public int selectionSize = -1;
    public int currentSelectionSize = -1;
    public String cutbetType = "1";

    public boolean isAnyWin() {
        List<Integer> list = this.featureTags;
        return list != null && !list.isEmpty() && this.featureTags.get(0).intValue() == 6 && this.orderType == 2;
    }

    public boolean isOneCutBet() {
        List<Integer> list = this.featureTags;
        return (list == null || list.isEmpty() || this.featureTags.get(0).intValue() != 5) ? false : true;
    }

    public boolean isPartialPayout() {
        try {
            return this.orderType == 4 && this.winningStatus == 20 && Double.parseDouble(this.totalWinnings) < Double.parseDouble(this.totalStake);
        } catch (NumberFormatException unused) {
        }
    }
}
