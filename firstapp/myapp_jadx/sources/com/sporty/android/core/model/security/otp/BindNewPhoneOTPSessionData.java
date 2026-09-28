package com.sporty.android.core.model.security.otp;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/security/otp/BindNewPhoneOTPSessionData;", "", "phoneCountryCode", "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoneCountryCode", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BindNewPhoneOTPSessionData {
    private final String phone;
    private final String phoneCountryCode;

    public BindNewPhoneOTPSessionData(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.phoneCountryCode = str;
        this.phone = str2;
    }

    public static /* synthetic */ BindNewPhoneOTPSessionData copy$default(BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindNewPhoneOTPSessionData.phoneCountryCode;
        }
        if ((i & 2) != 0) {
            str2 = bindNewPhoneOTPSessionData.phone;
        }
        return bindNewPhoneOTPSessionData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final BindNewPhoneOTPSessionData copy(String phoneCountryCode, String phone) {
        phoneCountryCode.getClass();
        phone.getClass();
        return new BindNewPhoneOTPSessionData(phoneCountryCode, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindNewPhoneOTPSessionData)) {
            return false;
        }
        BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData = (BindNewPhoneOTPSessionData) other;
        return Intrinsics.g(this.phoneCountryCode, bindNewPhoneOTPSessionData.phoneCountryCode) && Intrinsics.g(this.phone, bindNewPhoneOTPSessionData.phone);
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
        return tx5.a("BindNewPhoneOTPSessionData(phoneCountryCode=", this.phoneCountryCode, ", phone=", this.phone, ")");
    }
}
