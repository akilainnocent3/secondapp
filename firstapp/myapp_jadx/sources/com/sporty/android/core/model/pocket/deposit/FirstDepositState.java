package com.sporty.android.core.model.pocket.deposit;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fj\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007j\u0010\b\b\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\tj\u0010\b\n\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/FirstDepositState;", "", "<init>", "(Ljava/lang/String;I)V", "NO_DEPOSIT", "Lcom/google/gson/annotations/SerializedName;", "value", "90", AnalyticsEvent.FIRST_DEPOSIT, "91", "AFTER_FIRST_DEPOSIT", "92", "afterFirstDeposit", "", "getAfterFirstDeposit", "()Z", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum FirstDepositState {
    NO_DEPOSIT,
    FIRST_DEPOSIT,
    AFTER_FIRST_DEPOSIT;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<FirstDepositState> getEntries() {
        return $ENTRIES;
    }

    public final boolean getAfterFirstDeposit() {
        return this == AFTER_FIRST_DEPOSIT;
    }
}
