package com.sportybet.plugin.jackpot.data;

/* JADX INFO: loaded from: classes4.dex */
public class RJackpotPWinTitleItem extends RBetDataBase {
    public String betType;
    public boolean hasPeriodWinnings;
    public boolean isBottom;
    public long maxWinnings;
    public String periodNumber;

    @Override // com.sportybet.plugin.jackpot.data.RBetDataBase
    public int getType() {
        return 16;
    }
}
