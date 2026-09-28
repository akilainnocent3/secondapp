package com.sporty.android.core.model.security.otp;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/security/otp/OTPVerificationRequest;", "", "otpToken", "", "otpCode", "phoneCountryCode", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOtpToken", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOtpCode", "getPhoneCountryCode", "getPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OTPVerificationRequest {

    @SerializedName("otpCode")
    private final String otpCode;

    @SerializedName("otpToken")
    private final String otpToken;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("phoneCountryCode")
    private final String phoneCountryCode;

    public OTPVerificationRequest(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.otpToken = str;
        this.otpCode = str2;
        this.phoneCountryCode = str3;
        this.phone = str4;
    }

    public static /* synthetic */ OTPVerificationRequest copy$default(OTPVerificationRequest oTPVerificationRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oTPVerificationRequest.otpToken;
        }
        if ((i & 2) != 0) {
            str2 = oTPVerificationRequest.otpCode;
        }
        if ((i & 4) != 0) {
            str3 = oTPVerificationRequest.phoneCountryCode;
        }
        if ((i & 8) != 0) {
            str4 = oTPVerificationRequest.phone;
        }
        return oTPVerificationRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOtpToken() {
        return this.otpToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOtpCode() {
        return this.otpCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final OTPVerificationRequest copy(String otpToken, String otpCode, String phoneCountryCode, String phone) {
        otpToken.getClass();
        otpCode.getClass();
        phoneCountryCode.getClass();
        phone.getClass();
        return new OTPVerificationRequest(otpToken, otpCode, phoneCountryCode, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPVerificationRequest)) {
            return false;
        }
        OTPVerificationRequest oTPVerificationRequest = (OTPVerificationRequest) other;
        return Intrinsics.g(this.otpToken, oTPVerificationRequest.otpToken) && Intrinsics.g(this.otpCode, oTPVerificationRequest.otpCode) && Intrinsics.g(this.phoneCountryCode, oTPVerificationRequest.phoneCountryCode) && Intrinsics.g(this.phone, oTPVerificationRequest.phone);
    }

    public final String getOtpCode() {
        return this.otpCode;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public int hashCode() {
        return this.phone.hashCode() + gmf0.a(gmf0.a(this.otpToken.hashCode() * 31, 31, this.otpCode), 31, this.phoneCountryCode);
    }

    public String toString() {
        String str = this.otpToken;
        String str2 = this.otpCode;
        return kwi.a(ux5.a("OTPVerificationRequest(otpToken=", str, ", otpCode=", str2, ", phoneCountryCode="), this.phoneCountryCode, ", phone=", this.phone, ")");
    }
}
