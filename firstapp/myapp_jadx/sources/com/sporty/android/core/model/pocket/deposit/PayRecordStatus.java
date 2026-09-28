package com.sporty.android.core.model.pocket.deposit;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007j\u0010\b\b\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\tj\u0010\b\n\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000fj\u0010\b\u0010\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011j\u0010\b\u0012\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013j\u0010\b\u0014\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015j\u0010\b\u0016\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/PayRecordStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "Lcom/google/gson/annotations/SerializedName;", "value", "0", "PROCESSING", "10", PBBetHistoryItemDTO.STATUS_PENDING, CashoutMetricsPayload.Metric.KeyValueMap.INACTIVE_OUTCOME, "PAY_SUCC", "20", "PAY_FAIL", "30", "PAY_AUDIT_FAIL", "31", "PAY_RISK_FAIL", "32", "PAY_MANUAL_FAIL", "33", "PAY_UNKNOWN", "90", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum PayRecordStatus {
    INIT,
    PROCESSING,
    PENDING,
    PAY_SUCC,
    PAY_FAIL,
    PAY_AUDIT_FAIL,
    PAY_RISK_FAIL,
    PAY_MANUAL_FAIL,
    PAY_UNKNOWN;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<PayRecordStatus> getEntries() {
        return $ENTRIES;
    }
}
