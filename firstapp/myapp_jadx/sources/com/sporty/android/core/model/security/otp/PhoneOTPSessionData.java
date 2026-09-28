package com.sporty.android.core.model.security.otp;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/security/otp/PhoneOTPSessionData;", "", "phoneCountryCode", "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoneCountryCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneOTPSessionData {

    @SerializedName("phone")
    private final String phone;

    @SerializedName("phoneCountryCode")
    private final String phoneCountryCode;

    public PhoneOTPSessionData(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.phoneCountryCode = str;
        this.phone = str2;
    }

    public static /* synthetic */ PhoneOTPSessionData copy$default(PhoneOTPSessionData phoneOTPSessionData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneOTPSessionData.phoneCountryCode;
        }
        if ((i & 2) != 0) {
            str2 = phoneOTPSessionData.phone;
        }
        return phoneOTPSessionData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final PhoneOTPSessionData copy(String phoneCountryCode, String phone) {
        phoneCountryCode.getClass();
        phone.getClass();
        return new PhoneOTPSessionData(phoneCountryCode, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneOTPSessionData)) {
            return false;
        }
        PhoneOTPSessionData phoneOTPSessionData = (PhoneOTPSessionData) other;
        return Intrinsics.g(this.phoneCountryCode, phoneOTPSessionData.phoneCountryCode) && Intrinsics.g(this.phone, phoneOTPSessionData.phone);
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public int hashCode() {
        return this.phone.hashCode() + (this.phoneCountryCode.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("PhoneOTPSessionData(phoneCountryCode=", this.phoneCountryCode, ", phone=", this.phone, ")");
    }
}
