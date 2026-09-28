package com.sporty.android.core.model.realsports;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/realsports/TransactionStatus;", "", AnalyticsParam.EVENT_STATUS, "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", PBBetHistoryItemDTO.STATUS_PENDING, "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum TransactionStatus {
    PENDING(3);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int status;

    TransactionStatus(int i) {
        this.status = i;
    }

    public static tag<TransactionStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }
}
