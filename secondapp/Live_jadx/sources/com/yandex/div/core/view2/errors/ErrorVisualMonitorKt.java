package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorVisualMonitorKt {
    private static final int MIN_SIZE_FOR_DETAILS_DP = 150;
    private static final int SHOW_LIMIT = 25;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th2) {
        Throwable cause;
        return (th2 instanceof TransactionTooLargeException) || ((cause = th2.getCause()) != null && causedByTransactionTooLargeException(cause));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getMessage());
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append('\n');
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
