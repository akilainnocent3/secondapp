package com.sporty.android.core.model.account;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/account/PasswordResetStatusResponse;", "", "userId", "", "passwordResetForced", "", "<init>", "(Ljava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "getPasswordResetForced", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PasswordResetStatusResponse {
    private final boolean passwordResetForced;
    private final String userId;

    public PasswordResetStatusResponse(String str, boolean z) {
        str.getClass();
        this.userId = str;
        this.passwordResetForced = z;
    }

    public static /* synthetic */ PasswordResetStatusResponse copy$default(PasswordResetStatusResponse passwordResetStatusResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passwordResetStatusResponse.userId;
        }
        if ((i & 2) != 0) {
            z = passwordResetStatusResponse.passwordResetForced;
        }
        return passwordResetStatusResponse.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPasswordResetForced() {
        return this.passwordResetForced;
    }

    public final PasswordResetStatusResponse copy(String userId, boolean passwordResetForced) {
        userId.getClass();
        return new PasswordResetStatusResponse(userId, passwordResetForced);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordResetStatusResponse)) {
            return false;
        }
        PasswordResetStatusResponse passwordResetStatusResponse = (PasswordResetStatusResponse) other;
        return Intrinsics.g(this.userId, passwordResetStatusResponse.userId) && this.passwordResetForced == passwordResetStatusResponse.passwordResetForced;
    }

    public final boolean getPasswordResetForced() {
        return this.passwordResetForced;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.passwordResetForced) + (this.userId.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("PasswordResetStatusResponse(userId=", this.userId, ", passwordResetForced=", ")", this.passwordResetForced);
    }
}
