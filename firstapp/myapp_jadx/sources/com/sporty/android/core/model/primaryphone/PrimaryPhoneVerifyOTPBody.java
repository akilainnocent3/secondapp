package com.sporty.android.core.model.primaryphone;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyOTPBody;", "", "otpCode", "", "otpToken", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOtpCode", "()Ljava/lang/String;", "getOtpToken", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PrimaryPhoneVerifyOTPBody {
    private final String otpCode;
    private final String otpToken;
    private final String token;

    public PrimaryPhoneVerifyOTPBody(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.otpCode = str;
        this.otpToken = str2;
        this.token = str3;
    }

    public static /* synthetic */ PrimaryPhoneVerifyOTPBody copy$default(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryPhoneVerifyOTPBody.otpCode;
        }
        if ((i & 2) != 0) {
            str2 = primaryPhoneVerifyOTPBody.otpToken;
        }
        if ((i & 4) != 0) {
            str3 = primaryPhoneVerifyOTPBody.token;
        }
        return primaryPhoneVerifyOTPBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOtpCode() {
        return this.otpCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOtpToken() {
        return this.otpToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final PrimaryPhoneVerifyOTPBody copy(String otpCode, String otpToken, String token) {
        otpCode.getClass();
        otpToken.getClass();
        token.getClass();
        return new PrimaryPhoneVerifyOTPBody(otpCode, otpToken, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryPhoneVerifyOTPBody)) {
            return false;
        }
        PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody = (PrimaryPhoneVerifyOTPBody) other;
        return Intrinsics.g(this.otpCode, primaryPhoneVerifyOTPBody.otpCode) && Intrinsics.g(this.otpToken, primaryPhoneVerifyOTPBody.otpToken) && Intrinsics.g(this.token, primaryPhoneVerifyOTPBody.token);
    }

    public final String getOtpCode() {
        return this.otpCode;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + gmf0.a(this.otpCode.hashCode() * 31, 31, this.otpToken);
    }

    public String toString() {
        String str = this.otpCode;
        String str2 = this.otpToken;
        return uf80.a(ux5.a("PrimaryPhoneVerifyOTPBody(otpCode=", str, ", otpToken=", str2, ", token="), this.token, ")");
    }
}
