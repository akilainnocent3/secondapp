package com.sportybet.plugin.jackpot.data;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class JackpotBet {
    public String betType;
    public int correctEvents;
    public List<JackpotElement> elements;
    public String id;
    public long maxWinnings;
    public List<Winnings> orderWinnings;
    public String periodNumber;
    public List<Winnings> periodWinnings;
    public int status;
    public String taxAmount;
    public String totalStake;
    public String winnings;

    public boolean hasTax() {
        try {
            return (TextUtils.isEmpty(this.taxAmount) || Double.parseDouble(this.taxAmount) == 0.0d) ? false : true;
        } catch (NumberFormatException unused) {
        }
    }
}
