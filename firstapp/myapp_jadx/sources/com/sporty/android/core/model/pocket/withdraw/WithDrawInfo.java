package com.sporty.android.core.model.pocket.withdraw;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pocket.common.WhTaxData;

/* JADX INFO: loaded from: classes.dex */
public class WithDrawInfo {
    public boolean hasInfo;
    public String maxWithdrawAmount;
    public String message;

    @SerializedName("whtData")
    public WhTaxData whTaxData;

    public static WithDrawInfo getDefault() {
        WithDrawInfo withDrawInfo = new WithDrawInfo();
        withDrawInfo.hasInfo = false;
        withDrawInfo.maxWithdrawAmount = "0";
        withDrawInfo.message = "";
        withDrawInfo.whTaxData = null;
        return withDrawInfo;
    }
}
