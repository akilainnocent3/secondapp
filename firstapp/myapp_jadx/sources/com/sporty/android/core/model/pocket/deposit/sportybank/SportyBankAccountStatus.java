package com.sporty.android.core.model.pocket.deposit.sportybank;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankAccountStatus;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "POLLING_FAILED", "UNSUPPORTED", "WAITING", "ACTIVE", "INACTIVE", "DENIED", "NEED_BVN", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum SportyBankAccountStatus {
    POLLING_FAILED(-2),
    UNSUPPORTED(-1),
    WAITING(1),
    ACTIVE(2),
    INACTIVE(3),
    DENIED(4),
    NEED_BVN(5);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int intValue;

    SportyBankAccountStatus(int i) {
        this.intValue = i;
    }

    public static tag<SportyBankAccountStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
