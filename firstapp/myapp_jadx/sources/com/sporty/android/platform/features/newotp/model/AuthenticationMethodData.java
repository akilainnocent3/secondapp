package com.sporty.android.platform.features.newotp.model;

import defpackage.lk50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/platform/features/newotp/model/AuthenticationMethodData;", "", "Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;", "otpAuthenticationData", "Llk50;", "", "accountVerificationResult", "<init>", "(Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;Llk50;)V", "component1", "()Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;", "component2", "()Llk50;", "copy", "(Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;Llk50;)Lcom/sporty/android/platform/features/newotp/model/AuthenticationMethodData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;", "getOtpAuthenticationData", "Llk50;", "getAccountVerificationResult", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AuthenticationMethodData {
    public static final int $stable = 0;
    private final lk50<Unit> accountVerificationResult;
    private final OtpAuthenticationData otpAuthenticationData;

    public AuthenticationMethodData(OtpAuthenticationData otpAuthenticationData, lk50<Unit> lk50Var) {
        this.otpAuthenticationData = otpAuthenticationData;
        this.accountVerificationResult = lk50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthenticationMethodData copy$default(AuthenticationMethodData authenticationMethodData, OtpAuthenticationData otpAuthenticationData, lk50 lk50Var, int i, Object obj) {
        if ((i & 1) != 0) {
            otpAuthenticationData = authenticationMethodData.otpAuthenticationData;
        }
        if ((i & 2) != 0) {
            lk50Var = authenticationMethodData.accountVerificationResult;
        }
        return authenticationMethodData.copy(otpAuthenticationData, lk50Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OtpAuthenticationData getOtpAuthenticationData() {
        return this.otpAuthenticationData;
    }

    public final lk50<Unit> component2() {
        return this.accountVerificationResult;
    }

    public final AuthenticationMethodData copy(OtpAuthenticationData otpAuthenticationData, lk50<Unit> accountVerificationResult) {
        return new AuthenticationMethodData(otpAuthenticationData, accountVerificationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationMethodData)) {
            return false;
        }
        AuthenticationMethodData authenticationMethodData = (AuthenticationMethodData) other;
        return Intrinsics.g(this.otpAuthenticationData, authenticationMethodData.otpAuthenticationData) && Intrinsics.g(this.accountVerificationResult, authenticationMethodData.accountVerificationResult);
    }

    public final lk50<Unit> getAccountVerificationResult() {
        return this.accountVerificationResult;
    }

    public final OtpAuthenticationData getOtpAuthenticationData() {
        return this.otpAuthenticationData;
    }

    public int hashCode() {
        OtpAuthenticationData otpAuthenticationData = this.otpAuthenticationData;
        int iHashCode = (otpAuthenticationData == null ? 0 : otpAuthenticationData.hashCode()) * 31;
        lk50<Unit> lk50Var = this.accountVerificationResult;
        return iHashCode + (lk50Var != null ? lk50Var.hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationMethodData(otpAuthenticationData=" + this.otpAuthenticationData + ", accountVerificationResult=" + this.accountVerificationResult + ")";
    }
}
