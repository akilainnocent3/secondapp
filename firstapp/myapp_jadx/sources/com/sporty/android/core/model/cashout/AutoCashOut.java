package com.sporty.android.core.model.cashout;

import android.text.TextUtils;
import defpackage.uf80;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class AutoCashOut {
    public String availableStake;
    public String betId;
    public String cashedOutAmount;
    public String fullTriggerAmount;
    public boolean isPartial;
    public String maxCashOutAmount;
    public int status;
    public String triggerAmount;
    public int triggerType;
    public String usedStake;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CASHED_OUT = 2;
        public static final int CASHING_OUT = 1;
        public static final int DELETED = 9;
        public static final int RUNNING = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TriggerType {
        public static final int STOP_LOSS = 0;
        public static final int TAKE_PROFIT = 1;
    }

    public boolean isAutoCashoutCreated() {
        int i = this.status;
        return i == 0 || 1 == i;
    }

    public boolean isAutoCashoutSuccessful() {
        return !TextUtils.isEmpty(this.cashedOutAmount) && 2 == this.status;
    }

    public boolean isFullCashout() {
        return TextUtils.equals(this.triggerAmount, this.fullTriggerAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AutoCashOut{betId='");
        sb.append(this.betId);
        sb.append("', isPartial=");
        sb.append(this.isPartial);
        sb.append(", usedStake='");
        sb.append(this.usedStake);
        sb.append("', triggerAmount='");
        sb.append(this.triggerAmount);
        sb.append("', fullTriggerAmount='");
        sb.append(this.fullTriggerAmount);
        sb.append("', triggerType=");
        sb.append(this.triggerType);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", cashedOutAmount='");
        return uf80.a(sb, this.cashedOutAmount, "'}");
    }
}
