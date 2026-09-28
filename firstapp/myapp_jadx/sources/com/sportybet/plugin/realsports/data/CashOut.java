package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.cashout.CashOutFallback;
import com.sporty.android.core.model.cashout.CashOutResponse;
import com.sporty.android.core.model.realsports.StakeConfig;
import defpackage.ird0;
import defpackage.uf80;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public class CashOut {
    public static final int BIG_NUMBER = 1000000;
    public String availableStake;
    public String coefficient;
    public String errorMsg;
    public CashOutFallback fallback;
    public boolean isFallbackCashOut;
    public boolean isSupportPartial;
    public String mMaxAutoCashOutAmount;
    private final BigDecimal mMaxCashout;
    private final BigDecimal mMinCashout;
    public String maxCashOutAmount;
    public int maxCount;
    public int remainCount;

    /* JADX INFO: loaded from: classes7.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CashOutStatus {
        public static final int CASH_OUT_FALLBACK = 5;
        public static final int CASH_OUT_HIGHER_THAN_MAX = 4;
        public static final int CASH_OUT_HIGHER_THAN_MIN = 3;
        public static final int CASH_OUT_LESS_THAN_MIN = 1;
        public static final int CASH_OUT_MIN = 2;
        public static final int CASH_OUT_NONE = 0;
    }

    public CashOut() {
        StakeConfig stakeConfigY = ird0.b().y();
        this.mMinCashout = stakeConfigY.getMinCashout();
        BigDecimal maxCashout = stakeConfigY.getMaxCashout();
        this.mMaxCashout = maxCashout;
        this.mMaxAutoCashOutAmount = String.valueOf(maxCashout.toPlainString());
    }

    private BigDecimal getAutoCashoutAmount(int i, int i2) {
        return this.mMinCashout.add(new BigDecimal(this.mMaxAutoCashOutAmount).subtract(this.mMinCashout).multiply(BigDecimal.valueOf(i)).divide(BigDecimal.valueOf(1000000L), i2, RoundingMode.HALF_UP));
    }

    public Boolean amountIsEmpty() {
        String str;
        String str2 = this.maxCashOutAmount;
        return Boolean.valueOf(str2 == null || str2.isEmpty() || (str = this.availableStake) == null || str.isEmpty());
    }

    public void clear(String str) {
        this.coefficient = null;
        this.errorMsg = str;
        this.availableStake = null;
        this.maxCashOutAmount = null;
    }

    public BigDecimal getAutoCashOutAmount(int i) {
        return getAutoCashoutAmount(i, 2);
    }

    public BigDecimal getAutoCashOutMaxAmount() {
        return new BigDecimal(this.mMaxAutoCashOutAmount).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getAutoCashoutUsedStake(int i) {
        return this.availableStake == null ? BigDecimal.ZERO : new BigDecimal(this.availableStake).multiply(getAutoCashoutAmount(i, 10)).divide(new BigDecimal(this.mMaxAutoCashOutAmount), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getInstantCashOutAmount(int i) {
        String str = this.maxCashOutAmount;
        return (str == null || str.trim().isEmpty()) ? BigDecimal.ZERO : this.mMinCashout.add(new BigDecimal(this.maxCashOutAmount).subtract(this.mMinCashout).multiply(BigDecimal.valueOf(i)).divide(BigDecimal.valueOf(1000000L), 2, RoundingMode.HALF_UP));
    }

    public BigDecimal getInstantCashoutUsedStake(int i) {
        String str = this.coefficient;
        if (str == null || str.trim().isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = new BigDecimal(this.coefficient);
        BigDecimal instantCashOutAmount = getInstantCashOutAmount(i);
        return instantCashOutAmount.compareTo(new BigDecimal(this.maxCashOutAmount)) == 0 ? new BigDecimal(this.availableStake) : instantCashOutAmount.divide(bigDecimal, 2, RoundingMode.HALF_UP).min(new BigDecimal(this.availableStake));
    }

    public BigDecimal getMaxCashOutAmount(BigDecimal bigDecimal) {
        try {
            return new BigDecimal(this.maxCashOutAmount).setScale(2);
        } catch (Exception unused) {
            return bigDecimal;
        }
    }

    public BigDecimal getRemainStake(int i) {
        BigDecimal bigDecimal = this.availableStake != null ? new BigDecimal(this.availableStake) : BigDecimal.ZERO;
        BigDecimal instantCashoutUsedStake = getInstantCashoutUsedStake(i);
        if (instantCashoutUsedStake == null) {
            instantCashoutUsedStake = BigDecimal.ZERO;
        }
        return bigDecimal.subtract(instantCashoutUsedStake);
    }

    public boolean isCashoutAvailable() {
        int iStatus = status();
        return iStatus == 2 || iStatus == 3;
    }

    public void setMaxAutoCashOutAmount(String str) {
        this.mMaxAutoCashOutAmount = str;
    }

    public int status() {
        if (this.maxCashOutAmount == null) {
            return 0;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(this.maxCashOutAmount);
            if (bigDecimal.compareTo(this.mMaxCashout) > 0) {
                return 4;
            }
            if (bigDecimal.compareTo(this.mMinCashout) > 0) {
                return 3;
            }
            if (new BigDecimal(this.maxCashOutAmount).compareTo(this.mMinCashout) == 0) {
                return 2;
            }
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                return 1;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CashOut{coefficient='");
        sb.append(this.coefficient);
        sb.append("', isSupportPartial=");
        sb.append(this.isSupportPartial);
        sb.append(", maxCashOutAmount='");
        sb.append(this.maxCashOutAmount);
        sb.append("', availableStake='");
        sb.append(this.availableStake);
        sb.append("', errorMsg='");
        sb.append(this.errorMsg);
        sb.append("', minCashout=");
        sb.append(this.mMinCashout);
        sb.append(", maxCashout=");
        sb.append(this.mMaxCashout);
        sb.append(", maxAutoCashOutAmount='");
        return uf80.a(sb, this.mMaxAutoCashOutAmount, "'}");
    }

    public void update(CashOut cashOut) {
        this.coefficient = cashOut.coefficient;
        this.isSupportPartial = cashOut.isSupportPartial;
        this.maxCashOutAmount = cashOut.maxCashOutAmount;
        this.availableStake = cashOut.availableStake;
        this.errorMsg = cashOut.errorMsg;
        this.remainCount = cashOut.remainCount;
        this.isFallbackCashOut = cashOut.isFallbackCashOut;
        this.fallback = cashOut.fallback;
        this.mMaxAutoCashOutAmount = cashOut.mMaxAutoCashOutAmount;
    }

    public void updateAvailableAndMaxCashOutAmount(String str, String str2) {
        this.availableStake = str;
        this.maxCashOutAmount = str2;
    }

    public void update(CashOutResponse cashOutResponse) {
        this.coefficient = cashOutResponse.coefficient;
        this.isSupportPartial = cashOutResponse.isSupportPartial;
        this.maxCashOutAmount = cashOutResponse.maxCashOutAmount;
        this.availableStake = cashOutResponse.availableStake;
    }
}
