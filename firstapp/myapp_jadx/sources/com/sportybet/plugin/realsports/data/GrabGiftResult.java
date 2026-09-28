package com.sportybet.plugin.realsports.data;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000ej\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GrabGiftResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "LOADING", "FAILED", "DUPLICATE", "UNKNOWN_ERROR", "amount", "", "getAmount", "()J", "setAmount", "(J)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum GrabGiftResult {
    SUCCESS,
    LOADING,
    FAILED,
    DUPLICATE,
    UNKNOWN_ERROR;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private long amount;

    public static tag<GrabGiftResult> getEntries() {
        return $ENTRIES;
    }

    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: setAmount, reason: collision with other method in class */
    public final void m49setAmount(long j) {
        this.amount = j;
    }

    public final GrabGiftResult setAmount(long amount) {
        this.amount = amount;
        return this;
    }
}
