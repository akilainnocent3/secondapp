package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class NameConfirmationStatus {

    @SerializedName("documentAudit")
    public DocumentAudit documentAudit;

    @SerializedName("rejectReasons")
    public List<RejectReason> rejectReasons;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    public int status;
}
