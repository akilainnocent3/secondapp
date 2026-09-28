package com.sportybet.android.instantwin.newtork.model.error;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/error/ErrorCode;", "", "<init>", "()V", "FAIL", "", "INVALID", "USER_IS_INACTIVE", "INSUFFICIENT_BALANCE", "ROUND_IS_SETTLED", "ACCOUNT_INVALID", "GAME_UNAVAILABLE", "ADVANCED_ERROR", "GIFT_UNAVAILABLE", "EVENT_NOT_FOUND", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ErrorCode {
    public static final int $stable = 0;
    public static final int ACCOUNT_INVALID = 19110;
    public static final int ADVANCED_ERROR = 19202;
    public static final int EVENT_NOT_FOUND = 19113;
    public static final int FAIL = 11000;
    public static final int GAME_UNAVAILABLE = 19201;
    public static final int GIFT_UNAVAILABLE = 19400;
    public static final ErrorCode INSTANCE = new ErrorCode();
    public static final int INSUFFICIENT_BALANCE = 19102;
    public static final int INVALID = 19000;
    public static final int ROUND_IS_SETTLED = 19106;
    public static final int USER_IS_INACTIVE = 19101;

    private ErrorCode() {
    }
}
