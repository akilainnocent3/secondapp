package com.sporty.android.core.model.account.verifiedemailchange;

import defpackage.cwz;
import defpackage.mtg0;
import defpackage.nyf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePreCheckResponse;", "", "otpRequestEnabled", "", "passwordRequestEnabled", "sportyPinRequestEnabled", "token", "", "<init>", "(ZZZLjava/lang/String;)V", "getOtpRequestEnabled", "()Z", "getPasswordRequestEnabled", "getSportyPinRequestEnabled", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmailChangePreCheckResponse {
    private final boolean otpRequestEnabled;
    private final boolean passwordRequestEnabled;
    private final boolean sportyPinRequestEnabled;
    private final String token;

    public EmailChangePreCheckResponse(boolean z, boolean z2, boolean z3, String str) {
        str.getClass();
        this.otpRequestEnabled = z;
        this.passwordRequestEnabled = z2;
        this.sportyPinRequestEnabled = z3;
        this.token = str;
    }

    public static /* synthetic */ EmailChangePreCheckResponse copy$default(EmailChangePreCheckResponse emailChangePreCheckResponse, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailChangePreCheckResponse.otpRequestEnabled;
        }
        if ((i & 2) != 0) {
            z2 = emailChangePreCheckResponse.passwordRequestEnabled;
        }
        if ((i & 4) != 0) {
            z3 = emailChangePreCheckResponse.sportyPinRequestEnabled;
        }
        if ((i & 8) != 0) {
            str = emailChangePreCheckResponse.token;
        }
        return emailChangePreCheckResponse.copy(z, z2, z3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOtpRequestEnabled() {
        return this.otpRequestEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPasswordRequestEnabled() {
        return this.passwordRequestEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSportyPinRequestEnabled() {
        return this.sportyPinRequestEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final EmailChangePreCheckResponse copy(boolean otpRequestEnabled, boolean passwordRequestEnabled, boolean sportyPinRequestEnabled, String token) {
        token.getClass();
        return new EmailChangePreCheckResponse(otpRequestEnabled, passwordRequestEnabled, sportyPinRequestEnabled, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailChangePreCheckResponse)) {
            return false;
        }
        EmailChangePreCheckResponse emailChangePreCheckResponse = (EmailChangePreCheckResponse) other;
        return this.otpRequestEnabled == emailChangePreCheckResponse.otpRequestEnabled && this.passwordRequestEnabled == emailChangePreCheckResponse.passwordRequestEnabled && this.sportyPinRequestEnabled == emailChangePreCheckResponse.sportyPinRequestEnabled && Intrinsics.g(this.token, emailChangePreCheckResponse.token);
    }

    public final boolean getOtpRequestEnabled() {
        return this.otpRequestEnabled;
    }

    public final boolean getPasswordRequestEnabled() {
        return this.passwordRequestEnabled;
    }

    public final boolean getSportyPinRequestEnabled() {
        return this.sportyPinRequestEnabled;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + mtg0.a(mtg0.a(Boolean.hashCode(this.otpRequestEnabled) * 31, 31, this.passwordRequestEnabled), 31, this.sportyPinRequestEnabled);
    }

    public String toString() {
        boolean z = this.otpRequestEnabled;
        boolean z2 = this.passwordRequestEnabled;
        return nyf.a(", token=", this.token, ")", cwz.a("EmailChangePreCheckResponse(otpRequestEnabled=", ", passwordRequestEnabled=", ", sportyPinRequestEnabled=", z, z2), this.sportyPinRequestEnabled);
    }
}
