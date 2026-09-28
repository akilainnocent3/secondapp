package com.sportybet.plugin.jackpot.data;

/* JADX INFO: loaded from: classes4.dex */
public class RJackpotDTitleItem extends RBetDataBase {
    public JackpotBet bet;
    public long createTime;
    public String favorAmount;
    public int favorType;
    public String refundAmount;
    public String shortId;
    public boolean showDividerLine;
    public int winningStatus;

    @Override // com.sportybet.plugin.jackpot.data.RBetDataBase
    public int getType() {
        return 12;
    }
}
