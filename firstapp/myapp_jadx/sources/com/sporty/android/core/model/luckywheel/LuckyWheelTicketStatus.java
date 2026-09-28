package com.sporty.android.core.model.luckywheel;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.radio.RadioProvider;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000fj\u0010\b\u0010\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011j\u0010\b\u0012\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013Ê\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketStatus;", "", AnalyticsParam.EVENT_STATUS, "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "ALL", "Lcom/google/gson/annotations/SerializedName;", "value", "0", "VALID", "1", "USED", "2", "EXPIRED", "3", RadioProvider.UNAVAILABLE, "4", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LuckyWheelTicketStatus {
    ALL(0),
    VALID(1),
    USED(2),
    EXPIRED(3),
    UNAVAILABLE(4);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int status;

    LuckyWheelTicketStatus(int i) {
        this.status = i;
    }

    public static tag<LuckyWheelTicketStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }
}
