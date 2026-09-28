package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CashOutResponse {
    public String availableStake;

    @SerializedName("selections")
    public List<CashoutSelectionSnapshot> cashOutBetSelections;

    @SerializedName(AnalyticsParam.DATA_FALLBACK)
    public CashOutFallback cashOutFallback = new CashOutFallback();
    public String coefficient;
    public boolean isFallbackCashOut;
    public boolean isSupportPartial;
    public String maxCashOutAmount;
    public int maxCount;
    public int remainCount;

    public String getAStake() {
        if (this.availableStake == null) {
            return null;
        }
        try {
            return new BigDecimal(this.availableStake).setScale(2, RoundingMode.HALF_UP).toPlainString();
        } catch (Exception unused) {
            return this.availableStake;
        }
    }

    public String toString() {
        return "CashOutResponse{coefficient='" + this.coefficient + "', isSupportPartial=" + this.isSupportPartial + ", maxCashOutAmount='" + this.maxCashOutAmount + "', availableStake='" + this.availableStake + "', maxCount=" + this.maxCount + ", remainCount=" + this.remainCount + ", isFallbackCashOut=" + this.isFallbackCashOut + ", cashOutFallback=" + this.cashOutFallback + '}';
    }
}
