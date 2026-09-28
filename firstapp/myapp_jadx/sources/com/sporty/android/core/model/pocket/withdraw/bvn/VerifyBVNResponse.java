package com.sporty.android.core.model.pocket.withdraw.bvn;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyBVNResponse {

    @SerializedName("bankAccName")
    public String bankAccName;

    @SerializedName("counterAuthority")
    public String counterAuthority;

    @SerializedName("counterIconUrl")
    public String counterIconUrl;

    @SerializedName("counterPart")
    public String counterPart;

    @SerializedName("feeAmount")
    public int feeAmount;

    @SerializedName("feeType")
    public int feeType;

    @SerializedName("gatewayResponse")
    public String gatewayResponse;

    @SerializedName("initAmount")
    public int initAmount;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    public int status;

    @SerializedName("tradeId")
    public String tradeId;
}
