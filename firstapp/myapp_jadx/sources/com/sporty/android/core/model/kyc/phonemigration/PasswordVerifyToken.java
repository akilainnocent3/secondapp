package com.sporty.android.core.model.kyc.phonemigration;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/PasswordVerifyToken;", "", "passwordVerifyToken", "", "<init>", "(Ljava/lang/String;)V", "getPasswordVerifyToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PasswordVerifyToken {
    private final String passwordVerifyToken;

    public PasswordVerifyToken(String str) {
        str.getClass();
        this.passwordVerifyToken = str;
    }

    public static /* synthetic */ PasswordVerifyToken copy$default(PasswordVerifyToken passwordVerifyToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passwordVerifyToken.passwordVerifyToken;
        }
        return passwordVerifyToken.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    public final PasswordVerifyToken copy(String passwordVerifyToken) {
        passwordVerifyToken.getClass();
        return new PasswordVerifyToken(passwordVerifyToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PasswordVerifyToken) && Intrinsics.g(this.passwordVerifyToken, ((PasswordVerifyToken) other).passwordVerifyToken);
    }

    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    public int hashCode() {
        return this.passwordVerifyToken.hashCode();
    }

    public String toString() {
        return tug.a("PasswordVerifyToken(passwordVerifyToken=", this.passwordVerifyToken, ")");
    }
}
