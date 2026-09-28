package com.sportybet.plugin.jackpot.data;

/* JADX INFO: loaded from: classes4.dex */
public class RJackpotPeriodWinningsItem extends RBetDataBase {
    public String betType;
    public int index;
    public Winnings winnings;

    @Override // com.sportybet.plugin.jackpot.data.RBetDataBase
    public int getType() {
        return 13;
    }
}
