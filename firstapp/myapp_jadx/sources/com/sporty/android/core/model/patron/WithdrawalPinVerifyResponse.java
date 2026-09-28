package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes6.dex */
public class WithdrawalPinVerifyResponse {

    @SerializedName("pinToken")
    public String pinToken;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    public String result;
}
