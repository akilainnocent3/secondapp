package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes5.dex */
public class TicketResult {

    @SerializedName("bizCode")
    public int bizCode = -1;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    public String result;

    @SerializedName("ticketId")
    public String ticketId;
}
